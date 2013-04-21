package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class GoodsQuality implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = 5023318277258456637L;
  
  private String id;
  private String name;
  private MeasurementUnit unit;

  public String getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public MeasurementUnit getUnit()
  {
    return unit;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setUnit(MeasurementUnit unit)
  {
    this.unit = unit;
  }
}
