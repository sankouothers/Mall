package com.wang.extmall.restController;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.core.Is.is;

import com.wang.extmall.model.Commodity;
import com.wang.extmall.service.CommodityService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
  @Autowired
  CommodityService commodityService;
  Commodity commodity = null;
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
        .andExpect(jsonPath("$.brand", is(equalTo("李宁"))))
        .andExpect(jsonPath("$.category", is(equalTo("运动服"))))
        .andExpect(jsonPath("$.createDate", is(equalTo(null))))
        .andExpect(jsonPath("$.createDateString", is(equalTo("2016-12-28"))))
        .andExpect(jsonPath("$.creator", is(equalTo(null))))
        .andExpect(jsonPath("$.creatorId", is(equalTo(1))))
        .andExpect(jsonPath("$.creatorName", is(equalTo("pin"))))
        .andExpect(jsonPath("$.effect", is(equalTo("男装"))))
        .andExpect(jsonPath("$.id", is(equalTo(1))))
        .andExpect(jsonPath("$.name", is(equalTo("李宁男款黑色运动服"))))
        .andExpect(status().isOk());
    //J+
  }

  @Test public void createCommodity() throws Exception {
    //J-
    mockMvc.perform(post("/commodity")
        .param("brand","李宁")
        .param("category","运动服")
        .param("creatorId","")
        .param("effect","男装")
        .param("name","李宁男款黑色运动服")
        .param("price","20")
        .contentType(MediaType.APPLICATION_FORM_URLENCODED))
        .andExpect(jsonPath("$.brand", is(equalTo("李宁"))))
        .andExpect(jsonPath("$.category", is(equalTo("运动服"))))
        .andExpect(jsonPath("$.createDate", is(equalTo(null))))
        .andExpect(jsonPath("$.createDateString", is(equalTo("2016-12-28"))))
        .andExpect(jsonPath("$.creator", is(equalTo(null))))
        .andExpect(jsonPath("$.creatorId", is(equalTo(1))))
        .andExpect(jsonPath("$.creatorName", is(equalTo("pin"))))
        .andExpect(jsonPath("$.effect", is(equalTo("男装"))))
        .andExpect(jsonPath("$.id", is(equalTo(1))))
        .andExpect(jsonPath("$.name", is(equalTo("李宁男款黑色运动服"))))
        .andExpect(status().isOk());
    //J+
  }

  @Test public void updateCommodity() throws Exception {
     commodity = commodityService.findOne(1);
    commodity.setBrand("li");
    commodity.setCategory("休闲服");
    commodity.setPrice(100L);
    //J-
    mockMvc.perform(patch("/commodity")
        .param("brand",commodity.getBrand())
        .param("category",commodity.getCategory())
        .param("price",commodity.getPrice().toString())
        .param("id",commodity.getId().toString())
        .contentType(MediaType.APPLICATION_FORM_URLENCODED))
        .andExpect(jsonPath("$.brand", is(equalTo(commodity.getBrand()))))
        .andExpect(jsonPath("$.category", is(equalTo(commodity.getCategory()))))
        .andExpect(jsonPath("$.createDate", is(equalTo(null))))
        .andExpect(jsonPath("$.creatorId", is(equalTo(commodity.getId()))))
        .andExpect(jsonPath("$.creatorName", is(equalTo("pin"))))
        .andExpect(jsonPath("$.effect", is(equalTo("男装"))))
        .andExpect(jsonPath("$.id", is(equalTo(1))))
        .andExpect(jsonPath("$.name", is(equalTo("李宁男款黑色运动服"))))
        .andExpect(jsonPath("$.price", is(equalTo("李宁男款黑色运动服"))))
        .andExpect(status().isCreated());
    //J+
  }
} // end class RestCommodityCrollerTest
