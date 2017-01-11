package com.wang.extmall.command;

import java.util.Date;
import java.util.Set;

import com.wang.extmall.model.Address;
import com.wang.extmall.model.Commodity;
import com.wang.extmall.model.Role;
import com.wang.extmall.model.User;
import com.wang.extmall.util.Util;


/**
 * Created by ozintel06 on 2016/12/27.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/27/2016 17:50
 */
public class UserCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Set<Address>   addressSet;
  private String         answer;
  private Set<Commodity> commoditySet;
  private Date           createDate;
  private String         createDateString;
  private Long           id;
  private String         iDCardNumber;
  private String         name;
  private String         passWord;
  private String         phoneNumber;
  private String         question;
  private Set<Role>      roleSet;

  private String userName;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for address set.
   *
   * @return  Set
   */
  public Set<Address> getAddressSet() {
    return addressSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for answer.
   *
   * @return  String
   */
  public String getAnswer() {
    return answer;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for commodity set.
   *
   * @return  Set
   */
  public Set<Commodity> getCommoditySet() {
    return commoditySet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for create date.
   *
   * @return  Date
   */
  public Date getCreateDate() {
    return createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for create date string.
   *
   * @return  String
   */
  public String getCreateDateString() {
    return createDateString;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for id.
   *
   * @return  Long
   */
  public Long getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getiDCardNumber.
   *
   * @return  String
   */
  public String getiDCardNumber() {
    return iDCardNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

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
   * getter method for pass word.
   *
   * @return  String
   */
  public String getPassWord() {
    return passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for phone number.
   *
   * @return  String
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for question.
   *
   * @return  String
   */
  public String getQuestion() {
    return question;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for role set.
   *
   * @return  Set
   */
  public Set<Role> getRoleSet() {
    return roleSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for user name.
   *
   * @return  String
   */
  public String getUserName() {
    return userName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for address set.
   *
   * @param  addressSet  Set
   */
  public void setAddressSet(Set<Address> addressSet) {
    this.addressSet = addressSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for answer.
   *
   * @param  answer  String
   */
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for commodity set.
   *
   * @param  commoditySet  Set
   */
  public void setCommoditySet(Set<Commodity> commoditySet) {
    this.commoditySet = commoditySet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create date.
   *
   * @param  createDate  Date
   */
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create date string.
   *
   * @param  createDateString  String
   */
  public void setCreateDateString(String createDateString) {
    this.createDateString = createDateString;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for id.
   *
   * @param  id  Long
   */
  public void setId(Long id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setiDCardNumber.
   *
   * @param  iDCardNumber  String
   */
  public void setiDCardNumber(String iDCardNumber) {
    this.iDCardNumber = iDCardNumber;
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
   * setter method for pass word.
   *
   * @param  passWord  String
   */
  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for phone number.
   *
   * @param  phoneNumber  String
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for question.
   *
   * @param  question  String
   */
  public void setQuestion(String question) {
    this.question = question;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for role set.
   *
   * @param  roleSet  Set
   */
  public void setRoleSet(Set<Role> roleSet) {
    this.roleSet = roleSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for user name.
   *
   * @param  userName  String
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toUser.
   *
   * @return  User
   */
  public User toUser() {
    User user = new User();
    user.setId(this.getId());
    user.setName(this.getName());
    user.setAnswer(this.getAnswer());
    user.setiDCardNumber(this.getiDCardNumber());
    user.setUserName(this.getUserName());
    user.setQuestion(this.getQuestion());
    user.setPassWord(this.getPassWord());
    user.setPhoneNumber(this.getPhoneNumber());

    return user;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toUserInfo.
   *
   * @param  user  User
   */
  public void toUserInfo(User user) {
    this.setCreateDateString(Util.sdf.format(user.getCreateDate()));
    this.setUserName(user.getUserName());
    this.setId(user.getId());
    this.setQuestion(user.getQuestion());
    this.setPhoneNumber(user.getPhoneNumber());
    this.setName(user.getName());
  }
} // end class UserCommand
