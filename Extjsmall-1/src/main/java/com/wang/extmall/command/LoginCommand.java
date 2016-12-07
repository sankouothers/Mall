package com.wang.extmall.command;

/**
 * Created by ozintel06 on 16/8/3.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/22/2016 14:38
 */
public class LoginCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String name;
  private String password;

  private String role;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for name.
   *
   * @return  String
   */
  public String getName() {
    return name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for password.
   *
   * @return  String
   */
  public String getPassword() {
    return password;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for role.
   *
   * @return  String
   */
  public String getRole() {
    return role;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for name.
   *
   * @param  name  String
   */
  public void setName(String name) {
    this.name = name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for password.
   *
   * @param  password  String
   */
  public void setPassword(String password) {
    this.password = password;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for role.
   *
   * @param  role  String
   */
  public void setRole(String role) {
    this.role = role;
  }
} // end class LoginCommand
