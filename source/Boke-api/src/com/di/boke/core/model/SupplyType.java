package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class SupplyType implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = -1403917357530191351L;

  private String id;
  private String name;
  private SupplyCategory category;

  public String getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public SupplyCategory getCategory()
  {
    return category;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setCategory(SupplyCategory category)
  {
    this.category = category;
  }
}
