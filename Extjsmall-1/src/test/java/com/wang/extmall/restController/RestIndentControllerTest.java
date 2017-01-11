package com.wang.extmall.restController;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * Created by ozintel06 on 2017/1/11.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  01/11/2017 23:30
 */
public class RestIndentControllerTest extends BaseControllerTest {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for indent info.
   *
   * @throws  Exception  exception
   */
  @Test public void getIndentInfo() throws Exception {
    //J-
    mockMvc.perform(get("/indent/{id}",1))
        .andExpect(jsonPath("$.address", is(equalTo(null))))
        .andExpect(jsonPath("$.commodity", is(equalTo(null))))
        .andExpect(jsonPath("$.commodityId", is(equalTo(1))))
        .andExpect(jsonPath("$.commodityName", is(equalTo("xiezi"))))
        .andExpect(jsonPath("$.consumer", is(equalTo(null))))
        .andExpect(jsonPath("$.consumerId", is(equalTo(1))))
        .andExpect(jsonPath("$.consumerName", is(equalTo("pin"))))
        .andExpect(jsonPath("$.createDate", is(equalTo(null))))
        .andExpect(jsonPath("$.createDateString", is(equalTo("2016-12-28"))))
        .andExpect(jsonPath("$.id", is(equalTo(1))))
        .andExpect(jsonPath("$.merchant", is(equalTo(null))))
        .andExpect(jsonPath("$.merchantId", is(equalTo(null))))
        .andExpect(jsonPath("$.merchantName", is(equalTo(null))))
        .andExpect(jsonPath("$.phoneNumber", is(equalTo("19199817161"))))
        .andExpect(jsonPath("$.price", is(equalTo(12))))
        .andExpect(jsonPath("$.status", is(equalTo("create"))))
        .andExpect(jsonPath("$.totalNumber", is(equalTo(2))))
        .andExpect(jsonPath("$.totalPrice", is(equalTo(24))))
        .andExpect(status().isOk());
    //J+
  }

// @Test
// public void createIndent() throws Exception {
//
// ObjectMapper objectMapper = new ObjectMapper();
//
// IndentCommand indentCommand = new IndentCommand();
//
// //J-
// byte[] requestJson =  objectMapper.writeValueAsBytes(indentCommand);
//
// mockMvc.perform(post("/indent")
// .contentType(MediaType.APPLICATION_JSON)
// .content(requestJson))
// .andDo(print())
// .andExpect(status().isOk())
// .andReturn();
// //J+
// }
} // end class RestIndentControllerTest
