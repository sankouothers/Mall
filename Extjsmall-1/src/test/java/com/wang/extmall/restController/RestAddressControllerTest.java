package com.wang.extmall.restController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wang.extmall.command.AddressCommand;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * Created by ozintel06 on 2017/1/11.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  01/11/2017 23:30
 */
public class RestAddressControllerTest extends BaseControllerTest {
 @Test
 public void createAddress() throws Exception {

 //J-
 mockMvc.perform(post("/address")
     .param("address","wwwwwwww")
     .param("defaultAddress","Y")
     .contentType(MediaType.APPLICATION_FORM_URLENCODED))
 .andExpect(status().isOk());
 //J+
 }
}
