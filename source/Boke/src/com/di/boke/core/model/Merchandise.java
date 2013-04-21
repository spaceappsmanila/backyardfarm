package com.di.boke.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class Merchandise implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = 3490695196313792248L;

  private String id;
  private GoodType goodType;
  private Long quantity;
  private MeasurementUnit unit;
  private Double sellPricePerQuantity;
  private Date soldDate;

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

  public MeasurementUnit getUnit()
  {
    return unit;
  }

  public Double getSellPricePerQuantity()
  {
    return sellPricePerQuantity;
  }

  public Date getSoldDate()
  {
    return soldDate;
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

  public void setUnit(MeasurementUnit unit)
  {
    this.unit = unit;
  }

  public void setSellPricePerQuantity(Double sellPricePerQuantity)
  {
    this.sellPricePerQuantity = sellPricePerQuantity;
  }

  public void setSoldDate(Date soldDate)
  {
    this.soldDate = soldDate;
  }
}
