package com.wang.extmall.data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * TODO: DOCUMENT ME!
 *
 * @author   <a href="mailto:yang.wang@ozstrategy.com">Yang Wang</a>
 * @version  06/13/2016 15:34
 */

@XStreamAlias("Wang")
public class Wang {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  @ApiModelProperty(
      value    = "The name to greet",
      required = true
  )
  protected String name;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new Person object.
   */
  public Wang() { }

  /**
   * Creates a new Person object.
   *
   * @param  name  String
   */
  public Wang(String name) {
    this.name = name;
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for name.
   *
   * @return  String
   */
  public String getName() {
    return name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for name.
   *
   * @param  name  String
   */
  public void setName(String name) {
    this.name = name;
  }
} // end class Person
