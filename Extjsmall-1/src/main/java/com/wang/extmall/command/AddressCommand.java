package com.wang.extmall.command;

import com.wang.extmall.model.Address;
import com.wang.extmall.model.User;


/**
 * Created by ozintel06 on 2016/12/26.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/28/2016 11:53
 */
public class AddressCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String address;

  private User   consumer;
  private String defaultAddress;
  private String consumerName;
  private Long   id;
  private Integer   consumerId;

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
    return defaultAddress;
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
    this.defaultAddress = defaultAddress;
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
   * toAddress.
   *
   * @return  Address
   */
  public Address toAddress() {
    Address address = new Address();
    address.setAddress(this.address);
    address.setId(this.id);
    address.setConsumer(this.consumer);
    address.setDefaultAddress(this.defaultAddress);

    return address;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * toAddressInfo.
   *
   * @param  address  Address
   */
  public void toAddressInfo(Address address) {
    this.setDefaultAddress(address.getDefaultAddress());
    if(address.getConsumer()!= null){
      this.setConsumerName(address.getConsumer().getName());
      this.setConsumerId(address.getConsumer().getId().intValue());
    }

    this.setId(address.getId());
    this.setAddress(address.getAddress());
  }

  public Integer getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(Integer consumerId) {
    this.consumerId = consumerId;
  }

  public String getConsumerName() {
    return consumerName;
  }

  public void setConsumerName(String consumerName) {
    this.consumerName = consumerName;
  }
} // end class AddressCommand
