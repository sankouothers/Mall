package com.wang.extmall.restController;

import java.util.Date;
import java.util.List;
import com.wang.extmall.command.AddressCommand;
import com.wang.extmall.command.IndentCommand;
import com.wang.extmall.command.UserCommand;
import com.wang.extmall.model.Address;
import com.wang.extmall.model.Indent;
import com.wang.extmall.model.User;
import com.wang.extmall.service.AddressService;
import com.wang.extmall.service.IndentService;
import com.wang.extmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by ozintel06 on 2016/11/30.
 */
@RestController
public class RestUserController {


  @Autowired
  private IndentService indentService;
  @Autowired
  private UserService userService;

  @Autowired
  private AddressService addressService;

  @RequestMapping(value = "/user/{id}/address",method = RequestMethod.GET)
  public ResponseEntity<ArrayList<AddressCommand>> getAllAddress(@PathVariable("id") long id) {

    User user = userService.findOne(id);
    List<Address> addressList =  addressService.findByConsumer(user);
    ArrayList<AddressCommand> addressCommandList = new ArrayList<AddressCommand>();
    for (Address address : addressList) {
      AddressCommand addressCommand = new AddressCommand();
      addressCommand.toAddressInfo(address);
      addressCommandList.add(addressCommand);
    }

    return new ResponseEntity<ArrayList<AddressCommand>>(addressCommandList,HttpStatus.OK);
  }


  @RequestMapping(value = "/user/{id}/indent",method = RequestMethod.GET)
  public ResponseEntity<ArrayList<IndentCommand>> getAllIndent(HttpServletRequest request ,@PathVariable("id") Long id) {

    User user = userService.findOne(id);
    List<Indent> indentList =  indentService.findByConsumer(user);
    ArrayList<IndentCommand> indentCommandList = new ArrayList<IndentCommand>();
    for (Indent indent : indentList) {
      IndentCommand addressCommand = new IndentCommand();
      addressCommand.toIndentInfo(indent);
      indentCommandList.add(addressCommand);
    }

    return new ResponseEntity<ArrayList<IndentCommand>>(indentCommandList,HttpStatus.OK);
  }

  @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
  public ResponseEntity<UserCommand> userInfo(HttpServletRequest request,@PathVariable("id") Long id) {

    User user = userService.findOne(id);
    UserCommand userCommand = new UserCommand();
    userCommand.toUserInfo(user);

    return new ResponseEntity<UserCommand>(userCommand,HttpStatus.OK);
  }


  @RequestMapping(value = "/user",method = RequestMethod.POST)
  public ResponseEntity createUser(UserCommand command) {

    User user = command.toUser();
    user.setCreateDate(new Date());
    userService.save(user);
    return new ResponseEntity(HttpStatus.OK);
  }


}
