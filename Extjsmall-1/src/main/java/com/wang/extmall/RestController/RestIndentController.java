package com.wang.extmall.restController;


import com.wang.extmall.command.IndentCommand;
import com.wang.extmall.model.Commodity;
import com.wang.extmall.model.Indent;
import com.wang.extmall.service.CommodityService;
import com.wang.extmall.service.IndentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ozintel06 on 2016/11/30.
 */
@RestController
public class RestIndentController {

  @Autowired
  private IndentService indentService;
  @Autowired
  private CommodityService commodityService;


  @RequestMapping(value = "/indent/create/{id}",method = RequestMethod.GET)
  public ResponseEntity createIndent(@PathVariable("id") long id) {

    Indent indent = new Indent();
    Commodity commodity = commodityService.findOne(id);
    indent.setCommodity(commodity);
    indent.setPhoneNumber("12121212");
    indent.setStatus("create");
    indent.setCreateDate(new Date());
    indent.setPrice(Integer.parseInt(commodity.getPrice().toString()));
    indent.setTotalNumber(1);
    indent.setTotalPrice(Integer.parseInt(commodity.getPrice().toString()));
    indentService.save(indent);
    return new ResponseEntity(HttpStatus.OK);
  }


  @RequestMapping(value = "/indent/{id}",method = RequestMethod.GET)
  public ResponseEntity<IndentCommand> IndentInfo(@PathVariable("id") long id) {

    Indent indent = indentService.findOne(id);

    IndentCommand indentCommand = new IndentCommand();

    indentCommand.toIndentInfo(indent);

    return new ResponseEntity<IndentCommand>(indentCommand,HttpStatus.OK);
  }

  @RequestMapping(value = "/indent",method = RequestMethod.GET)
  public ResponseEntity<List<IndentCommand>> IndentList() {
    List<Indent> commodityList = indentService.findByOrderByCreateDateDesc();
    List<IndentCommand> indentCommandList = new ArrayList<IndentCommand>();
    for (Indent commodity:commodityList) {
      IndentCommand indentCommand = new IndentCommand();
      indentCommand.toIndentInfo(commodity);
      indentCommandList.add(indentCommand);
    }
    return new ResponseEntity<List<IndentCommand>>(indentCommandList,HttpStatus.OK);
  }
}
