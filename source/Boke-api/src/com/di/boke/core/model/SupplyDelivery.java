package com.di.boke.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Dungeon Innovations
 * @since 2013-04-21
 */
public class SupplyDelivery implements Serializable
{
  /**
   * Auto-generated serialVersionUID In case of using serializable objects for
   * future preferences
   */
  private static final long serialVersionUID = 7378884850150289445L;

  private String id;
  private String name;
  private SupplyType supplyType;
  private Long quantity;
  private MeasurementUnit unit;
  private Double cost;
  private BokCurrency currency;

  public String getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public SupplyType getSupplyType()
  {
    return supplyType;
  }

  public Long getQuantity()
  {
    return quantity;
  }

  public MeasurementUnit getUnit()
  {
    return unit;
  }

  public Double getCost()
  {
    return cost;
  }

  public BokCurrency getCurrency()
  {
    return currency;
  }

  public Date getDeliveryDate()
  {
    return deliveryDate;
  }

  public Supplier getSupplier()
  {
    return supplier;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setSupplyType(SupplyType supplyType)
  {
    this.supplyType = supplyType;
  }

  public void setQuantity(Long quantity)
  {
    this.quantity = quantity;
  }

  public void setUnit(MeasurementUnit unit)
  {
    this.unit = unit;
  }

  public void setCost(Double cost)
  {
    this.cost = cost;
  }

  public void setCurrency(BokCurrency currency)
  {
    this.currency = currency;
  }

  public void setDeliveryDate(Date deliveryDate)
  {
    this.deliveryDate = deliveryDate;
  }

  public void setSupplier(Supplier supplier)
  {
    this.supplier = supplier;
  }

  private Date deliveryDate;
  private Supplier supplier;
}
