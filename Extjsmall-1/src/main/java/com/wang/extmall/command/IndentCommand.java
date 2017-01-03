package com.wang.extmall.command;

import java.util.Date;

import com.wang.extmall.model.Address;
import com.wang.extmall.model.Commodity;
import com.wang.extmall.model.Indent;
import com.wang.extmall.model.User;
import com.wang.extmall.util.Util;


/**
 * Created by ozintel06 on 2016/12/27.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/27/2016 17:52
 */
public class IndentCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private Address   address;
  private String    addressString;
  private Commodity commodity;
  private Integer   commodityId;
  private String    commodityName;
  private User      consumer;
  private Integer   consumerId;
  private String    consumerName;
  private Date      createDate;
  private String    createDateString;
  private Long      id;
  private User      merchant;
  private Integer   merchantId;
  private String    merchantName;
  private String    phoneNumber;
  private Integer   price;
  private String    status;
  private Integer   totalNumber;
  private Integer   totalPrice;

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
   * getter method for address string.
   *
   * @return  String
   */
  public String getAddressString() {
    return addressString;
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
   * getter method for commodity id.
   *
   * @return  Integer
   */
  public Integer getCommodityId() {
    return commodityId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for commodity name.
   *
   * @return  String
   */
  public String getCommodityName() {
    return commodityName;
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
   * getter method for consumer id.
   *
   * @return  Integer
   */
  public Integer getConsumerId() {
    return consumerId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for consumer name.
   *
   * @return  String
   */
  public String getConsumerName() {
    return consumerName;
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
   * getter method for merchant.
   *
   * @return  User
   */
  public User getMerchant() {
    return merchant;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for merchant id.
   *
   * @return  Integer
   */
  public Integer getMerchantId() {
    return merchantId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for merchant name.
   *
   * @return  String
   */
  public String getMerchantName() {
    return merchantName;
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
   * getter method for price.
   *
   * @return  Integer
   */
  public Integer getPrice() {
    return price;
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
   * setter method for address string.
   *
   * @param  addressString  String
   */
  public void setAddressString(String addressString) {
    this.addressString = addressString;
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
   * setter method for commodity id.
   *
   * @param  commodityId  Integer
   */
  public void setCommodityId(Integer commodityId) {
    this.commodityId = commodityId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for commodity name.
   *
   * @param  commodityName  String
   */
  public void setCommodityName(String commodityName) {
    this.commodityName = commodityName;
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
   * setter method for consumer id.
   *
   * @param  consumerId  Integer
   */
  public void setConsumerId(Integer consumerId) {
    this.consumerId = consumerId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for consumer name.
   *
   * @param  consumerName  String
   */
  public void setConsumerName(String consumerName) {
    this.consumerName = consumerName;
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
   * setter method for merchant.
   *
   * @param  merchant  User
   */
  public void setMerchant(User merchant) {
    this.merchant = merchant;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for merchant id.
   *
   * @param  merchantId  Integer
   */
  public void setMerchantId(Integer merchantId) {
    this.merchantId = merchantId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for merchant name.
   *
   * @param  merchantName  String
   */
  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
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
   * setter method for price.
   *
   * @param  price  Integer
   */
  public void setPrice(Integer price) {
    this.price = price;
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

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toAddress.
   *
   * @return  Indent
   */
  public Indent toAddress() {
    Indent indent = new Indent();
    this.setId(this.getId());
    this.setConsumer(this.getConsumer());
    this.setAddress(this.getAddress());
    this.setCommodity(this.getCommodity());
    this.setCreateDate(this.getCreateDate());
    this.setMerchant(this.getMerchant());
    this.setPhoneNumber(this.getPhoneNumber());
    this.setStatus(this.getStatus());
    this.setTotalNumber(this.getTotalNumber());
    this.setTotalPrice(this.getTotalPrice());
    this.setPrice(this.getPrice());

    return indent;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toIndentInfo.
   *
   * @param  indent  Indent
   */
  public void toIndentInfo(Indent indent) {
    this.setPrice(indent.getPrice());
    this.setTotalPrice(indent.getTotalPrice());
    this.setTotalNumber(indent.getTotalNumber());
    this.setStatus(indent.getStatus());
    this.setPhoneNumber(indent.getPhoneNumber());
    this.setId(indent.getId());

    if (indent.getAddress() != null) {
      this.setAddressString(indent.getAddress().getAddress());
    }

    if (indent.getCommodity() != null) {
      this.setCommodityId(indent.getCommodity().getId().intValue());
      this.setCommodityName(indent.getCommodity().getName());
    }


    if (indent.getConsumer() != null) {
      this.setConsumerId(indent.getConsumer().getId().intValue());
      this.setConsumerName(indent.getConsumer().getName());
    }

    if (indent.getMerchant() != null) {
      this.setMerchantId(indent.getMerchant().getId().intValue());
      this.setMerchantName(indent.getMerchant().getName());
    }


    if (indent.getCreateDate() != null) {
      this.setCreateDateString(Util.sdf.format(indent.getCreateDate()));
    }

  } // end method toIndentInfo

  public Indent toIndent() {
    Indent indent = new Indent();
    indent.setStatus(this.getStatus());
    indent.setPrice(this.getPrice());
    indent.setTotalNumber(this.getTotalNumber());
    indent.setTotalPrice(this.getTotalPrice());
    indent.setId(this.getId());
    indent.setPhoneNumber(this.getPhoneNumber());
    if (this.getCommodityId() != null){
      Commodity commodity = new Commodity();
      commodity.setId(Long.valueOf(this.getCommodityId()));
      indent.setCommodity(commodity);
    }
    if (this.getMerchantId() != null){
      User user = new  User();
      user.setId(Long.valueOf(this.getMerchantId()));
      indent.setMerchant(user);
    }
    if (this.getConsumerId() !=null){
      User user = new User();
      user.setId(Long.valueOf(this.getConsumerId()));
      indent.setConsumer(user);
    }
    return indent;
  }
} // end class IndentCommand
