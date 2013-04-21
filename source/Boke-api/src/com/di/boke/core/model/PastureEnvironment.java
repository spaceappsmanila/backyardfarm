package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class PastureEnvironment implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = 6221924380899127497L;

  private String id;
  private AreaType areaType;
  private ForageType forageType;

  public String getId()
  {
    return id;
  }

  public AreaType getAreaType()
  {
    return areaType;
  }

  public ForageType getForageType()
  {
    return forageType;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setAreaType(AreaType areaType)
  {
    this.areaType = areaType;
  }

  public void setForageType(ForageType forageType)
  {
    this.forageType = forageType;
  }
}
