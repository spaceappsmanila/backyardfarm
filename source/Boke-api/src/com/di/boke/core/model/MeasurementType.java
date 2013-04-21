package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class MeasurementType implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = 3253455986722072549L;

  private String id;
  private String name;

  public String getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}
