package com.wang.extmall.restController;

import com.wang.extmall.command.IndentCommand;
import com.wang.extmall.model.Indent;
import com.wang.extmall.service.CommodityService;
import com.wang.extmall.service.IndentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ozintel06 on 2016/12/28.
 */
@RestController
public class ResPaymentController {

  @Autowired
  private IndentService indentService;

  @Autowired
  private CommodityService commodityService;

  @RequestMapping(value = "payment/indent",method = RequestMethod.POST)
  public ResponseEntity createIndent(IndentCommand indentCommand) {

    Indent indent = indentCommand.toIndent();
    indent.setStatus("payment");
    indentService.save(indent);

    return new ResponseEntity(HttpStatus.OK);
  }
}
