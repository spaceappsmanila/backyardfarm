package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class CurrencyHistory implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = -1042468167643393378L;

  private String id;
  private BokCurrency currency;
  private String changes;

  public String getId()
  {
    return id;
  }

  public BokCurrency getCurrency()
  {
    return currency;
  }

  public String getChanges()
  {
    return changes;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setCurrency(BokCurrency currency)
  {
    this.currency = currency;
  }

  public void setChanges(String changes)
  {
    this.changes = changes;
  }
}
