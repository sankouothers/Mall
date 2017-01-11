package com.wang.extmall.restController;

import com.wang.extmall.command.AddressCommand;
import com.wang.extmall.model.Address;
import com.wang.extmall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ozintel06 on 2016/11/30.
 */
@RestController
public class RestAddressController {

  @Autowired private AddressService addressService;

  @RequestMapping(value = "/address",method = RequestMethod.POST)
  public ResponseEntity<List<AddressCommand>> createAddresss(AddressCommand addressCommand) {

    Address address = addressCommand.toAddress();
    addressService.save(address);

    return new ResponseEntity<List<AddressCommand>>(HttpStatus.OK);
  }

}
