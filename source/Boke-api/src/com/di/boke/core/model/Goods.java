package com.di.boke.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class Goods implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = 2889779464667057546L;

  private String id;
  private GoodType goodType;
  private Long quantity;
  private GoodsQuality quality;
  private Date producedDate;

  public String getId()
  {
    return id;
  }

  public GoodType getGoodType()
  {
    return goodType;
  }

  public Long getQuantity()
  {
    return quantity;
  }

  public GoodsQuality getQuality()
  {
    return quality;
  }

  public Date getProducedDate()
  {
    return producedDate;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setGoodType(GoodType goodType)
  {
    this.goodType = goodType;
  }

  public void setQuantity(Long quantity)
  {
    this.quantity = quantity;
  }

  public void setQuality(GoodsQuality quality)
  {
    this.quality = quality;
  }

  public void setProducedDate(Date producedDate)
  {
    this.producedDate = producedDate;
  }
}
