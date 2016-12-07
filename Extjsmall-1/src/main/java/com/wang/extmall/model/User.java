package com.wang.extmall.model;

import java.io.Serializable;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


/**
 * Created by ozintel06 on 16/7/24.
 *
 * @author   <a href="mailto:chenglong.du@ozstrategy.com">Chenglong Du</a>
 * @version  07/27/2016 21:39
 */
@Entity public class User implements Serializable {
  //~ Static fields/initializers ---------------------------------------------------------------------------------------

  /** Use serialVersionUID for interoperability. */
  private static final long serialVersionUID = 917331463781881956L;

  //~ Instance fields --------------------------------------------------------------------------------------------------

// @OneToMany private Set<Address> addressSet;


  @Column(nullable = false)
  private Date createDate;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;

  @Column(
    length   = 12,
    nullable = false
  )
  private String name;

  @Column(
    length   = 16,
    nullable = false
  )
  private String passWord;

  @JoinTable(
    name               = "User_Role", // 中间表名
    joinColumns        = { @JoinColumn(name = "user_id") },
    inverseJoinColumns = { @JoinColumn(name = "role_id") }
  )
  @ManyToMany private Set<Role> roleSet;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new User object.
   */
  public User() { }

  /**
   * Creates a new User object.
   *
   * @param  user  User
   */
  public User(User user) {
    this.passWord = user.getPassWord();
    this.name     = user.getName();
    this.id       = user.getId();
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

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
   * getter method for id.
   *
   * @return  Long
   */
  public Long getId() {
    return id;
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
   * getter method for role set.
   *
   * @return  Set
   */
  public Set<Role> getRoleSet() {
    return roleSet;
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
   * setter method for id.
   *
   * @param  id  Long
   */
  public void setId(Long id) {
    this.id = id;
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
   * setter method for role set.
   *
   * @param  roleSet  Set
   */
  public void setRoleSet(Set<Role> roleSet) {
    this.roleSet = roleSet;

  }
} // end class User
