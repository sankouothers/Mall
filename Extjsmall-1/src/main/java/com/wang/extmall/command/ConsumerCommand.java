package com.wang.extmall.command;

import com.wang.extmall.model.User;
import com.wang.extmall.util.Util;

import java.util.Date;


/**
 * Created by ozintel06 on 16/8/7.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  08/07/2016 22:40
 */
public class ConsumerCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String answer;

  private String create     = "F";
  private String createDate;

  private Long id;

  private String IDcard;

  private String name;

  private String passWord;

  private String passWordValidator;

  private String phoneNumber;

  private String question;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new ConsumerCommand object.
   */
  public ConsumerCommand() { }

  /**
   * Creates a new ConsumerCommand object.
   *
   * @param  user  User
   */
  public ConsumerCommand(User user) {
    this.id          = user.getId();
    this.IDcard      = user.getIDcard();
    this.name        = user.getName();
    this.phoneNumber = user.getPhoneNumber();
    this.createDate  = Util.sdf.format(user.getCreateDate());
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * edit.
   *
   * @param   user  User
   * @param   command   ConsumerCommand
   *
   * @return  User
   */
  public User edit(User user, ConsumerCommand command) {
    if (!user.getPhoneNumber().equals(command.getPhoneNumber())) {
      user.setPhoneNumber(command.getPhoneNumber());
    }

    if (!user.getName().equals(command.getName())) {
      user.setName(command.getName());
    }

    return user;
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
   * getter method for create.
   *
   * @return  String
   */
  public String getCreate() {
    return create;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for create date.
   *
   * @return  String
   */
  public String getCreateDate() {
    return createDate;
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
   * getter method for IDcard.
   *
   * @return  String
   */
  public String getIDcard() {
    return IDcard;
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
   * getter method for pass word validator.
   *
   * @return  String
   */
  public String getPassWordValidator() {
    return passWordValidator;
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
   * setter method for answer.
   *
   * @param  answer  String
   */
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create.
   *
   * @param  create  String
   */
  public void setCreate(String create) {
    this.create = create;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for create date.
   *
   * @param  createDate  String
   */
  public void setCreateDate(String createDate) {
    this.createDate = createDate;
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
   * setter method for IDcard.
   *
   * @param  IDcard  String
   */
  public void setIDcard(String IDcard) {
    this.IDcard = IDcard;
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
   * setter method for pass word validator.
   *
   * @param  passWordValidator  String
   */
  public void setPassWordValidator(String passWordValidator) {
    this.passWordValidator = passWordValidator;
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
   * toConsumer.
   *
   * @param   command  ConsumerCommand
   *
   * @return  User
   */
  public User toConsumer(ConsumerCommand command) {
    User user = new User();
    user.setAnswer(command.getAnswer());
    user.setIDcard(command.getIDcard());
    user.setName(command.getName());
    user.setPassWord(command.getPassWord());
    user.setPhoneNumber(command.getPhoneNumber());
    user.setQuestion(command.getQuestion());
    user.setCreateDate(new Date());

    return user;
  }
} // end class ConsumerCommand
