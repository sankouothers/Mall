package com.wang.extmall.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wang.extmall.command.LoginCommand;
import com.wang.extmall.service.UserService;


/**
 * Created by ozintel06 on 2016/11/30.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/02/2016 10:17
 */
@Controller public class LoginController {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Autowired private UserService userService;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * login.
   *
   * @param   request  HttpServletRequest
   * @param   command  LoginCommand
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/login",
    method = RequestMethod.POST
  )
  public String login(HttpServletRequest request, LoginCommand command) {
    return "redirect:/extmall";
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * login.
   *
   * @return  String
   */
  @RequestMapping(
    value  = "/login",
    method = RequestMethod.GET
  )
  public String toLoginView() {

    return "login";
  }

  @RequestMapping(
    value  = "/extmall",
    method = RequestMethod.GET
  )
  public String toExtmallView() {
    return "extmall";
  }
} // end class LoginController
