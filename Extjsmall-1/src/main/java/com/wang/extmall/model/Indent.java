package com.wang.extmall.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * Created by ozintel06 on 2016/12/16.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/20/2016 15:51
 */
@Entity public class Indent {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @JoinColumn(name = "addressId")
  @ManyToOne private Address address;

  @JoinColumn(name = "commodityId")
  @ManyToOne private Commodity commodity;

  @JoinColumn(name = "consumerId")
  @ManyToOne private User consumer;
  @Column(
    nullable  = false,
    updatable = false
  )
  private Date            createDate;
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long        id;

  @JoinColumn(name = "merchantId")
  @ManyToOne private User merchant;

  @Column(nullable = false)
  private String phoneNumber;

  @Column(nullable = false)
  private String status;

  /** TODO: DOCUMENT ME! */
  @Column(nullable = false)
  private Integer totalNumber;

  /** TODO: DOCUMENT ME! */
  @Column(nullable = false)
  private Integer totalPrice;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for address.
   *
   * @return  Address
   */
  public Address getAddress() {
    return address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for commodity.
   *
   * @return  Commodity
   */
  public Commodity getCommodity() {
    return commodity;
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
   * getter method for merchant.
   *
   * @return  User
   */
  public User getMerchant() {
    return merchant;
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
   * getter method for status.
   *
   * @return  String
   */
  public String getStatus() {
    return status;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for total number.
   *
   * @return  Integer
   */
  public Integer getTotalNumber() {
    return totalNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for total price.
   *
   * @return  Integer
   */
  public Integer getTotalPrice() {
    return totalPrice;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for address.
   *
   * @param  address  Address
   */
  public void setAddress(Address address) {
    this.address = address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for commodity.
   *
   * @param  commodity  Commodity
   */
  public void setCommodity(Commodity commodity) {
    this.commodity = commodity;
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
   * setter method for merchant.
   *
   * @param  merchant  User
   */
  public void setMerchant(User merchant) {
    this.merchant = merchant;
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
   * setter method for status.
   *
   * @param  status  String
   */
  public void setStatus(String status) {
    this.status = status;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for total number.
   *
   * @param  totalNumber  Integer
   */
  public void setTotalNumber(Integer totalNumber) {
    this.totalNumber = totalNumber;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for total price.
   *
   * @param  totalPrice  Integer
   */
  public void setTotalPrice(Integer totalPrice) {
    this.totalPrice = totalPrice;
  }


} // end class Indent
