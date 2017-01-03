package com.wang.extmall.command;

import java.util.Date;

import com.wang.extmall.model.Commodity;
import com.wang.extmall.model.User;
import com.wang.extmall.util.Util;


/**
 * Created by ozintel06 on 2016/12/27.
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  12/28/2016 11:51
 */
public class CommodityCommand {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private String brand;
  private String category;
  private Date   createDate;
  private String createDateString;

  private User    creator;
  private Integer creatorId;
  private String  creatorName;
  private String  effect;
  private Long    id;
  private String  name;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * getter method for brand.
   *
   * @return  String
   */
  public String getBrand() {
    return brand;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for category.
   *
   * @return  String
   */
  public String getCategory() {
    return category;
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
   * getter method for creator.
   *
   * @return  User
   */
  public User getCreator() {
    return creator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for creator id.
   *
   * @return  Integer
   */
  public Integer getCreatorId() {
    return creatorId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for creator name.
   *
   * @return  String
   */
  public String getCreatorName() {
    return creatorName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * getter method for effect.
   *
   * @return  String
   */
  public String getEffect() {
    return effect;
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
   * setter method for brand.
   *
   * @param  brand  String
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for category.
   *
   * @param  category  String
   */
  public void setCategory(String category) {
    this.category = category;
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
   * setter method for creator.
   *
   * @param  creator  User
   */
  public void setCreator(User creator) {
    this.creator = creator;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for creator id.
   *
   * @param  creatorId  Integer
   */
  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for creator name.
   *
   * @param  creatorName  String
   */
  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * setter method for effect.
   *
   * @param  effect  String
   */
  public void setEffect(String effect) {
    this.effect = effect;
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
   * toCommodityInfo.
   *
   * @param  commodity  Commodity
   */
  public void toCommodityInfo(Commodity commodity) {
    this.setId(commodity.getId());
    this.setBrand(commodity.getBrand());
    this.setCategory(commodity.getCategory());
    this.setEffect(commodity.getEffect());
    this.setName(commodity.getName());

    if (commodity.getCreateDate() != null) {
      this.setCreateDateString(Util.sdf.format(commodity.getCreateDate()));
    }

    if (commodity.getCreator() != null) {
      this.setCreatorId(commodity.getCreator().getId().intValue());
      this.setCreatorName(commodity.getCreator().getName());
    }
  }
} // end class CommodityCommand
