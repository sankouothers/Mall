package com.wang.extmall.restController;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.wang.extmall.command.AddressCommand;
import com.wang.extmall.model.Address;
import com.wang.extmall.service.AddressService;


/**
 * Created by ozintel06 on 2017/1/11.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  01/11/2017 23:30
 */
public class RestAddressControllerTest extends BaseControllerTest {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  /** TODO: DOCUMENT ME! */
  Address address = null;

  /** TODO: DOCUMENT ME! */
  @Autowired AddressService addressService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * createAddress.
   *
   * @throws  Exception  exception
   */
  @Test public void createAddress() throws Exception {
    //J-
  mockMvc.perform(post("/address")
      .param("address", "幕和南道")
      .param("defaultAddress", "N")
      .contentType(MediaType.APPLICATION_FORM_URLENCODED))
      .andExpect(jsonPath("$.address", is(equalTo("幕和南道"))))
      .andExpect(jsonPath("$.defaultAddress", is(equalTo("Y"))))
      .andExpect(status().isCreated());
    //J+
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * deleteAddress.
   *
   * @throws  Exception  exception
   */
  @Test public void deleteAddress() throws Exception {
    //J-
  mockMvc.perform(delete("/address/{id}",4))
      .andExpect(status().isOk());
    //J+
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * searchAddress.
   *
   * @throws  Exception  exception
   */
  @Test public void searchAddress() throws Exception {
    //J-
  mockMvc.perform(get("/address/{id}",4))
      .andExpect(jsonPath("$.address", is(equalTo("幕和南道"))))
      .andExpect(jsonPath("$.defaultAddress", is(equalTo("N"))))
      .andExpect(status().isFound());
    //J+
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * updateAddress.
   *
   * @throws  Exception  exception
   */
  @Test public void updateAddress() throws Exception {
    address = addressService.findOne(4);
    address.setAddress("罗田县");
    //J-
  mockMvc.perform(patch("/address")
      .param("address", "罗田县")
      .param("defaultAddress", address.getDefaultAddress())
      .param("id", address.getId().toString()))
      .andExpect(jsonPath("$.address", is(equalTo("罗田县"))))
      .andExpect(jsonPath("$.defaultAddress", is(equalTo("N"))))
      .andExpect(status().isOk());
    //J+
  }


} // end class RestAddressControllerTest
