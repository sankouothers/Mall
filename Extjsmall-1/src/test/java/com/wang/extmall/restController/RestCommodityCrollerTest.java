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
        .andExpect(jsonPath("$[0].brand", is(equalTo("qqq"))))
        .andExpect(jsonPath("$[0].category", is(equalTo("www"))))
        .andExpect(jsonPath("$[0].createDate", is(equalTo(null))))
        .andExpect(jsonPath("$[0].createDateString", is(equalTo("2016-12-28"))))
        .andExpect(jsonPath("$[0].creator", is(equalTo(null))))
        .andExpect(jsonPath("$[0].creatorId", is(equalTo(1))))
        .andExpect(jsonPath("$[0].creatorName", is(equalTo("pin"))))
        .andExpect(jsonPath("$[0].effect", is(equalTo("eee"))))
        .andExpect(jsonPath("$[0].id", is(equalTo(1))))
        .andExpect(jsonPath("$[0].name", is(equalTo("xiezi"))))
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
