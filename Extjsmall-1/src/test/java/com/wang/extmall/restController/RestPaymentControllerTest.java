package com.wang.extmall.restController;

import com.wang.extmall.command.IndentCommand;
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
public class RestPaymentControllerTest extends BaseControllerTest {
 @Test
 public void createIndent() throws Exception {
 //J-
 mockMvc.perform(post("/payment")
     .param("consumerId","1")
     .param("commodityId","1")
     .param("totalNumber","2")
     .contentType(MediaType.APPLICATION_FORM_URLENCODED))
 .andExpect(status().isOk());
 //J+
 }
}
