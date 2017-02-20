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
public class RestCommodityCrollerTest extends BaseControllerTest {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for all commodity.
   *
   * @throws  Exception  exception
   */
  @Test public void getAllCommodity() throws Exception {
    //J-
    mockMvc.perform(get("/commodity"))
        .andExpect(jsonPath("$[2].brand", is(equalTo("李宁"))))
        .andExpect(jsonPath("$[2].category", is(equalTo("运动服"))))
        .andExpect(jsonPath("$[2].createDate", is(equalTo(null))))
        .andExpect(jsonPath("$[2].createDateString", is(equalTo("2016-12-28"))))
        .andExpect(jsonPath("$[2].creator", is(equalTo(null))))
        .andExpect(jsonPath("$[2].creatorId", is(equalTo(1))))
        .andExpect(jsonPath("$[2].creatorName", is(equalTo("pin"))))
        .andExpect(jsonPath("$[2].effect", is(equalTo("男装"))))
        .andExpect(jsonPath("$[2].id", is(equalTo(1))))
        .andExpect(jsonPath("$[2].name", is(equalTo("李宁男款黑色运动服"))))
        .andExpect(status().isOk());
    //J+
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for commodity info.
   *
   * @throws  Exception  exception
   */
  @Test public void getCommodityInfo() throws Exception {
    //J-
    mockMvc.perform(get("/commodity/{id}",1))
        .andExpect(jsonPath("$.brand", is(equalTo("qqq"))))
        .andExpect(jsonPath("$.category", is(equalTo("www"))))
        .andExpect(jsonPath("$.createDate", is(equalTo(null))))
        .andExpect(jsonPath("$.createDateString", is(equalTo("2016-12-28"))))
        .andExpect(jsonPath("$.creator", is(equalTo(null))))
        .andExpect(jsonPath("$.creatorId", is(equalTo(1))))
        .andExpect(jsonPath("$.creatorName", is(equalTo("pin"))))
        .andExpect(jsonPath("$.effect", is(equalTo("eee"))))
        .andExpect(jsonPath("$.id", is(equalTo(1))))
        .andExpect(jsonPath("$.name", is(equalTo("xiezi"))))
        .andExpect(status().isOk());
    //J+
  }
} // end class RestCommodityCrollerTest
