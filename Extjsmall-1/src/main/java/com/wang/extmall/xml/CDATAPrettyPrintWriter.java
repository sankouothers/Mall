package com.wang.extmall.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.wang.extmall.annotation.XStreamCDATA;

import java.io.Writer;
import java.lang.reflect.Field;
import java.util.Stack;


/**
 * Created by rojer on 14/12/13.
 *
 * @author   <a href="mailto:rojer@ozstrategy.com">Rojer Luo</a>
 * @version  12/13/2014 22:25
 */
public class CDATAPrettyPrintWriter extends PrettyPrintWriter {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** Flag for CDATA. */
  boolean cdata = false;

  /** Last class. */
  Class<?> lastClass = null;

  /** TODO: DOCUMENT ME! */
  Stack<Class> stack = new Stack<Class>();

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new CDATAPrettyPrintWriter object.
   *
   * @param  writer  Writer
   */
  public CDATAPrettyPrintWriter(Writer writer) {
    super(writer, 1, "\t");
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for custom class.
   *
   * @param   clz  Class
   *
   * @return  boolean
   */
  public static boolean isCustomClass(Class<?> clz) {
    return (clz != null) && (clz.getClassLoader() != null);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  PrettyPrintWriter#startNode(String, Class)
   */
  @Override public void startNode(String name, Class clazz) {
    if (isCustomClass(clazz)) {
      stack.push(clazz);
    }

    super.startNode(name, clazz);

    if ((lastClass != null) && clazz.equals(String.class)) {
      // CDATA would be annotation on a string class within a container
      if (!stack.empty()) {
        lastClass = stack.pop();
      }

      cdata = existsCDATA(lastClass, name);
    } else {
      lastClass = clazz;
    }
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * @see  PrettyPrintWriter#writeText(QuickWriter,
   *       String)
   */
  @Override protected void writeText(QuickWriter writer, String text) {
    if (cdata) {
      writer.write("<![CDATA[");
      writer.write(text);
      writer.write("]]>");
    } else {
      writer.write(text);
    }
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  private boolean existsCDATA(Class<?> clazz, String fieldAlias) {
    // scan fields
    Field[] fields = clazz.getDeclaredFields();

    for (Field field : fields) {
      // 1. exists XStreamCDATA
      if (field.getAnnotation(XStreamCDATA.class) != null) {
        XStreamAlias xStreamAlias = field.getAnnotation(XStreamAlias.class);

        // 2. exists XStreamAlias
        if (null != xStreamAlias) {
          if (fieldAlias.equals(xStreamAlias.value())) { // matched
            return true;
          }
        } else {                                         // not exists XStreamAlias

          if (fieldAlias.equals(field.getName())) {
            return true;
          }
        }
      }
    }

    return false;
  } // end method existsCDATA
} // end class CDATAPrettyPrintWriter
