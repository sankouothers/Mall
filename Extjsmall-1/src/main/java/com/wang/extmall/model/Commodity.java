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
 * @version  12/16/2016 13:55 商品表
 */
@Entity public class Commodity {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Column(length = 50)
  private String brand;
  @Column(length = 50)
  private String category;

  @Column(
    nullable  = false,
    updatable = false
  )
  private Date     createDate;

  @Column(
    nullable  = false,
    updatable = false
  )
  private Long     price;

  @Column(length = 50)
  private String   effect;
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id private Long id;
  @Column(
    length   = 12,
    nullable = false
  )
  private String   name;

  @JoinColumn(name = "merchantId")
  @ManyToOne
  private User   creator;

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

  public User getCreator() {
    return creator;
  }

  public void setCreator(User creator) {
    this.creator = creator;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }
} // end class Commodity
