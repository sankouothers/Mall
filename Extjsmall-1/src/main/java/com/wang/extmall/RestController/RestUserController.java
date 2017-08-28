package com.wang.extmall.restController;

import java.util.Date;
import java.util.List;
import com.wang.extmall.command.AddressCommand;
import com.wang.extmall.command.IndentCommand;
import com.wang.extmall.command.UserCommand;
import com.wang.extmall.data.Wang;
import com.wang.extmall.model.Address;
import com.wang.extmall.model.Indent;
import com.wang.extmall.model.User;
import com.wang.extmall.service.AddressService;
import com.wang.extmall.service.IndentService;
import com.wang.extmall.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Created by ozintel06 on 2016/11/30.
 */
@RestController
@Api(value = "/user", description = "用户相关的接口")
public class RestUserController {


  @Autowired
  private IndentService indentService;
  @Autowired
  private UserService userService;

  @Autowired
  private AddressService addressService;

  @RequestMapping(value = "/user/{id}/address",method = RequestMethod.GET)
  @ApiOperation(
      value="获取用户地址",
      notes="根据用户 Id 获取单个用户地址信息",
      consumes       = "application/xml, application/json",
      produces       = "application/xml, application/json"
  )
  @ApiResponses(
      {
      @ApiResponse(code=400,message="请求参数没填好"),
      @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
  })
  public ResponseEntity<ArrayList<AddressCommand>> getAllAddress(@PathVariable("id") long id, HttpServletResponse response) {

    User user = userService.findOne(id);
    List<Address> addressList =  addressService.findByConsumer(user);
    ArrayList<AddressCommand> addressCommandList = new ArrayList<AddressCommand>();
    for (Address address : addressList) {
      AddressCommand addressCommand = new AddressCommand();
      addressCommand.toAddressInfo(address);
      addressCommandList.add(addressCommand);
    }
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
    return new ResponseEntity<ArrayList<AddressCommand>>(addressCommandList,HttpStatus.OK);
  }


  @RequestMapping(value = "/user/{id}/indent",method = RequestMethod.GET)
  @ApiOperation(value="获取用户订单信息",notes="根据用户 Id 获取单个用户的所有订单信息")
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
  @ApiOperation(value="获取用户信息",notes="根据用户 Id 获取单个用户信息")
  public ResponseEntity<UserCommand> userInfo(HttpServletRequest request,@PathVariable("id") Long id) {

    User user = userService.findOne(id);
    UserCommand userCommand = new UserCommand();
    userCommand.toUserInfo(user);

    return new ResponseEntity<UserCommand>(userCommand,HttpStatus.OK);
  }


  @RequestMapping(value = "/user",method = RequestMethod.POST)
  @ApiResponses(
      value = {
          @ApiResponse(
              code = 200,
              message = "Success"
          )
      }
  )
  @ApiOperation(
      value="创建用户",
      notes="根据表单信息创建用户",
      consumes       = "application/xml, application/json",
      produces       = "application/xml, application/json"
  )
//  @ApiOperation(
//      value="创建用户",
//      notes="根据表单信息创建用户"
//  )
//  @ApiImplicitParams({
////      定义 API 前端的提交的内容
////      @ApiImplicitParam(
////          name = "name",   字段的名称
////          value = "姓名",   字段的描述
////          required = true, 是否为必须字段
////          paramType = "query"
////      ),
//
//      @ApiImplicitParam(name = "name", value = "姓名", required = true, paramType = "query"),
//      @ApiImplicitParam(name = "passWord", value = "passWord", required = true, paramType = "query"),
//      @ApiImplicitParam(name = "userName", value = "userName", required = true, paramType = "query"),
//      @ApiImplicitParam(name = "phoneNumber", value = "phoneNumber", required = true, paramType = "query"),
//      @ApiImplicitParam(name = "iDCardNumber", value = "iDCardNumber", required = true, paramType = "query"),
//      @ApiImplicitParam(name = "question", value = "question", required = true, paramType = "query"),
//      @ApiImplicitParam(name = "answer", value = "answer", required = true, paramType = "query")
//  })
//  @ApiIgnore
  @ResponseBody public ResponseEntity createUser(
      @ApiParam(
          name     = "wang",
          value    = "The person with to be greeted.",
          required = true
      )
      @RequestBody Wang wang) {

//    User user = command.toUser();
//    user.setCreateDate(new Date());
//    userService.save(user);
    return new ResponseEntity(HttpStatus.OK);
  }
}
