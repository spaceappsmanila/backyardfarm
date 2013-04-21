package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Dungeon Innovations
 * @since 2013-04-21
 */
public class BokCurrency implements Serializable
{
  /**
   * Auto-generated serialVersionUID In case of using serializable objects for
   * future preferences
   */
  private static final long serialVersionUID = -1424979833085981392L;

  private String id;
  private String name;
  private String symbol;
  private Double valueToDollar;

  public String getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public String getSymbol()
  {
    return symbol;
  }

  public Double getValueToDollar()
  {
    return valueToDollar;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setSymbol(String symbol)
  {
    this.symbol = symbol;
  }

  public void setValueToDollar(Double valueToDollar)
  {
    this.valueToDollar = valueToDollar;
  }
}
