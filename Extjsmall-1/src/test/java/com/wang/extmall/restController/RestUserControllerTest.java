package com.wang.extmall.restController;


import java.io.IOException;
import java.io.Writer;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.core.Is.is;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.wang.extmall.command.UserCommand;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * Created by ozintel06 on 2017/1/10.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  01/10/2017 18:11
 */
public class RestUserControllerTest extends BaseControllerTest {
  //~ Methods ----------------------------------------------------------------------------------------------------------

// private HttpMessageConverter mappingJackson2HttpMessageConverter;


  /**
   * getter method for all address.
   *
   * @throws  Exception  exception
   */
  @Test public void getAllAddress() throws Exception {
    //J-
    mockMvc.perform(get("/user/{id}/address",1))
        .andExpect(jsonPath("$[0].address", is(equalTo("qweqweqwe"))))
        .andExpect(jsonPath("$[0].consumer", is(equalTo(null))))
        .andExpect(jsonPath("$[0].defaultAddress", is(equalTo("Y"))))
        .andExpect(jsonPath("$[0].consumerName", is(equalTo("pin"))))
        .andExpect(jsonPath("$[0].id", is(equalTo(1))))
        .andExpect(jsonPath("$[0].consumerId", is(equalTo(1))))
        .andExpect(status().isOk());
    //J+
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for all indent.
   *
   * @throws  Exception  exception
   */
  @Test public void getAllIndent() throws Exception {
    //J-
    mockMvc.perform(get("/user/{id}/indent",1))
        .andExpect(jsonPath("$[0].address", is(equalTo(null))))
        .andExpect(jsonPath("$[0].commodity", is(equalTo(null))))
        .andExpect(jsonPath("$[0].commodityId", is(equalTo(1))))
        .andExpect(jsonPath("$[0].commodityName", is(equalTo("xiezi"))))
        .andExpect(jsonPath("$[0].consumer", is(equalTo(null))))
        .andExpect(jsonPath("$[0].consumerId", is(equalTo(1))))
        .andExpect(jsonPath("$[0].consumerName", is(equalTo("pin"))))
        .andExpect(jsonPath("$[0].createDate", is(equalTo(null))))
        .andExpect(jsonPath("$[0].createDateString", is(equalTo("2016-12-28"))))
        .andExpect(jsonPath("$[0].id", is(equalTo(1))))
        .andExpect(jsonPath("$[0].merchant", is(equalTo(null))))
        .andExpect(jsonPath("$[0].merchantId", is(equalTo(null))))
        .andExpect(jsonPath("$[0].merchantName", is(equalTo(null))))
        .andExpect(jsonPath("$[0].phoneNumber", is(equalTo("19199817161"))))
        .andExpect(jsonPath("$[0].price", is(equalTo(12))))
        .andExpect(jsonPath("$[0].status", is(equalTo("create"))))
        .andExpect(jsonPath("$[0].totalNumber", is(equalTo(2))))
        .andExpect(jsonPath("$[0].totalPrice", is(equalTo(24))))
        .andExpect(status().isOk());
    //J+
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * readBookmarks.
   *
   * @throws  Exception  exception
   */
  @Test public void getUserInfo() throws Exception {
    //J-
    mockMvc.perform(get("/user/{id}",1))
        .andExpect(jsonPath("$.name", is(equalTo("pin"))))
        .andExpect(jsonPath("$.question", is(equalTo("who are you ?"))))
        .andExpect(jsonPath("$.userName", is(equalTo("san"))))
        .andExpect(jsonPath("$.id", is(equalTo(1))))
        .andExpect(jsonPath("$.createDateString", is(equalTo("2016-12-28"))))
        .andExpect(jsonPath("$.phoneNumber", is(equalTo("18111678350"))))
        .andExpect(status().isOk());
    //J+
  }

 @Test public void createUser() throws Exception {

 ObjectMapper objectMapper = new ObjectMapper();

 UserCommand userCommand = new UserCommand();
 userCommand.setName("qqq");
 userCommand.setiDCardNumber("4211231994081210011");
 userCommand.setAnswer("yes");
 userCommand.setUserName("zhangSan");
 userCommand.setQuestion("ta shi?");
 userCommand.setPassWord("wang123");
 userCommand.setPhoneNumber("19911919191");
 //J-
//   xmlConverter = new XStream(new XppDriver() {
//     @Override public HierarchicalStreamWriter createWriter(Writer writer) {
//       return new PrettyPrintWriter(writer);
//     }
//   });
//   String string = xmlConverter.toXML(userCommand);
// byte[] requestJson =  objectMapper.writeValueAsBytes(userCommand);

 mockMvc.perform(post("/user")
     .param("answer","yes")
     .param("iDCardNumber","421123199408210011")
     .param("name","qqq")
     .param("userName","zhangSan")
     .param("question","ta shi?")
     .param("passWord","wang123")
     .param("phoneNumber","19911919191")
     .contentType(MediaType.APPLICATION_FORM_URLENCODED))
     .andExpect(status().isOk());
 //J+
 }

// @Autowired
// void setConverters(HttpMessageConverter<?>[] converters) {
//
// this.mappingJackson2HttpMessageConverter = Arrays.asList(converters).stream()
// .filter(hmc -> hmc instanceof MappingJackson2HttpMessageConverter)
// .findAny()
// .orElse(null);
//
// assertNotNull("the JSON message converter must not be null",
// this.mappingJackson2HttpMessageConverter);
// }

  /**
   * setup.
   *
   * @throws  Exception  exception
   */

  /**
   * json.
   *
   * @param   o  Object
   *
   * @return  String
   *
   * @throws  IOException  exception
   */
// protected String json(Object o) throws IOException {
// MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
// this.mappingJackson2HttpMessageConverter.write(
// o, MediaType.APPLICATION_JSON, mockHttpOutputMessage);
//
// return mockHttpOutputMessage.getBodyAsString();
// }
} // end class RestUserControllerTest
