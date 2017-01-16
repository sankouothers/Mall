package com.wang.extmall.restController;

import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
import org.junit.Before;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.thoughtworks.xstream.XStream;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.springframework.web.context.WebApplicationContext;

import com.wang.extmall.Application;

import java.io.Writer;


/**
 * Created by ozintel06 on 2017/1/10.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  01/10/2017 18:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration public class BaseControllerTest {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  protected MockMvc mockMvc;
  protected XStream xmlConverter;
  protected XStream jsonConverter = null;

  /** TODO: DOCUMENT ME! */
  @Autowired WebApplicationContext webApplicationContext;

  //~ Methods ----------------------------------------------------------------------------------------------------------

// @Autowired private FilterChainProxy springSecurityFilterChain;

  /**
   * setter method for up.
   *
   * @throws  Exception  exception
   */
  @Before public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }
}
