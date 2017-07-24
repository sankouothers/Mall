package com.wang.extmall.restController;

import com.wang.extmall.command.CommodityCommand;
import com.wang.extmall.model.Commodity;
import com.wang.extmall.service.AddressService;
import com.wang.extmall.service.CommodityService;
import com.wang.extmall.service.IndentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ozintel06 on 2016/11/30.
 */
@RestController
public class RestCommodityController {

  @Autowired private IndentService indentService;
  @Autowired private AddressService addressService;
  @Autowired private CommodityService commodityService;

  @RequestMapping(value = "/commodity",method = RequestMethod.GET)
  public ResponseEntity<List<CommodityCommand>> commodityList(HttpServletRequest request) {

    List<Commodity> commodityList = commodityService.findByOrderByCreateDateDesc();
    List<CommodityCommand> commodityCommandList = new ArrayList<CommodityCommand>();
    for (Commodity commodity:commodityList) {
      CommodityCommand commodityCommand = new CommodityCommand();
      commodityCommand.toCommodityInfo(commodity);
      commodityCommandList.add(commodityCommand);
    }

    return new ResponseEntity<List<CommodityCommand>>(commodityCommandList,HttpStatus.OK);
  }


  @RequestMapping(value = "/commodity/{id}",method = RequestMethod.GET)
  public ResponseEntity<CommodityCommand> commodityInfo(@PathVariable("id") long id) {

    Commodity commodity = commodityService.findOne(id);
    CommodityCommand commodityCommand = new CommodityCommand();
    commodityCommand.toCommodityInfo(commodity);

    return new ResponseEntity<CommodityCommand>(commodityCommand,HttpStatus.OK);
  }

  @RequestMapping(value = "/commodity",method = RequestMethod.POST)
  public ResponseEntity<Commodity> createCommodity(CommodityCommand commodityCommand) {
    Commodity commodity = commodityCommand.toCommodityInfo();
    commodity.setCreateDate(new Date());
    return new ResponseEntity<Commodity>(commodityService.save(commodity),HttpStatus.CREATED);
  }


  @RequestMapping(value = "/commodity",method = RequestMethod.PATCH)
  public ResponseEntity<CommodityCommand> updateCommodity(CommodityCommand commodityCommand) {

    return new ResponseEntity<CommodityCommand>(commodityCommand,HttpStatus.CREATED);
  }

}
