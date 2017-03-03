package com.wang.extmall.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wang.extmall.command.AddressCommand;
import com.wang.extmall.model.Address;
import com.wang.extmall.model.Commodity;
import com.wang.extmall.service.AddressService;


/**
 * Created by ozintel06 on 2016/11/30.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  03/02/2017 15:27
 */
@RestController public class RestAddressController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private AddressService addressService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * createAddresss.
   *
   * @param   addressCommand  AddressCommand
   *
   * @return  ResponseEntity
   */
  @RequestMapping(
    value  = "/address",
    method = RequestMethod.POST
  )
  public ResponseEntity<AddressCommand> createAddresss(AddressCommand addressCommand) {
    Address address = addressService.save(addressCommand.toAddress());

    return new ResponseEntity<AddressCommand>(new AddressCommand(address), HttpStatus.CREATED);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * deleteAddress.
   *
   * @param   id  long
   *
   * @return  ResponseEntity
   */
  @RequestMapping(
    value  = "/address/{id}",
    method = RequestMethod.DELETE
  )
  public ResponseEntity deleteAddress(@PathVariable("id") long id) {
    addressService.delete(id);

    return new ResponseEntity<AddressCommand>(HttpStatus.OK);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * patchAddress.
   *
   * @param   addressCommand  AddressCommand
   *
   * @return  ResponseEntity
   */
  @RequestMapping(
    value  = "/address",
    method = RequestMethod.PATCH
  )
  public ResponseEntity<AddressCommand> patchAddress(AddressCommand addressCommand) {
    Address address = addressCommand.toAddress();
    addressService.saveOrUpdate(address);

    return new ResponseEntity<AddressCommand>(new AddressCommand(address), HttpStatus.OK);
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * searchAddress.
   *
   * @param   id  long
   *
   * @return  ResponseEntity
   */
  @RequestMapping(
    value  = "/address/{id}",
    method = RequestMethod.GET
  )
  public ResponseEntity<AddressCommand> searchAddress(@PathVariable("id") long id) {
    Address address = addressService.findOne(id);

    return new ResponseEntity<AddressCommand>(new AddressCommand(address), HttpStatus.FOUND);
  }

} // end class RestAddressController
