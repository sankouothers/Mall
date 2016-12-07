package com.wang.extmall.model;

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
 * Created by ozintel06 on 2016/12/6.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/06/2016 16:22
 */@Entity
public class Role {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column(nullable = false)
  private Date createDate;

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;

  @Column(
    length   = 12,
    nullable = false
  )
  private String name;

  @JoinTable(
    name               = "User_Role",                       // 中间表名
    joinColumns        = { @JoinColumn(name = "role_id") }, // 设置自己在中间表的对应外键
    inverseJoinColumns = { @JoinColumn(name = "user_id") }  // 设置对方在中间表的对应外键
  )
  @ManyToMany private Set<User> userSet;

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
   * getter method for user set.
   *
   * @return  Set
   */
  public Set<User> getUserSet() {
    return userSet;
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
   * setter method for user set.
   *
   * @param  userSet  Set
   */
  public void setUserSet(Set<User> userSet) {
    this.userSet = userSet;
  }
} // end class Role
