package com.wang.extmall.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * Created by ozintel06 on 2016/12/20.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/20/2016 16:00
 */
@Entity public class Address {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column(
    length   = 50,
    nullable = false
  )
  private String address;

  @JoinColumn(name = "consumerId")
  @ManyToOne private User consumer;

  @Column(nullable = false)
  private String   DefaultAddress;
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for address.
   *
   * @return  String
   */
  public String getAddress() {
    return address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for consumer.
   *
   * @return  User
   */
  public User getConsumer() {
    return consumer;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for default address.
   *
   * @return  String
   */
  public String getDefaultAddress() {
    return DefaultAddress;
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
   * setter method for address.
   *
   * @param  address  String
   */
  public void setAddress(String address) {
    this.address = address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for consumer.
   *
   * @param  consumer  User
   */
  public void setConsumer(User consumer) {
    this.consumer = consumer;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for default address.
   *
   * @param  defaultAddress  String
   */
  public void setDefaultAddress(String defaultAddress) {
    DefaultAddress = defaultAddress;
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
} // end class Address
