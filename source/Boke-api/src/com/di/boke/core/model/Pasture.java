package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class Pasture implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = 9059116042565572103L;

  private String id;
  private Double landArea;
  private MeasurementUnit unit;
  private String name;
  private String imageUrl;
  private PastureEnvironment environment;

  public String getId()
  {
    return id;
  }

  public Double getLandArea()
  {
    return landArea;
  }

  public MeasurementUnit getUnit()
  {
    return unit;
  }

  public String getName()
  {
    return name;
  }

  public String getImageUrl()
  {
    return imageUrl;
  }

  public PastureEnvironment getEnvironment()
  {
    return environment;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setLandArea(Double landArea)
  {
    this.landArea = landArea;
  }

  public void setUnit(MeasurementUnit unit)
  {
    this.unit = unit;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setImageUrl(String imageUrl)
  {
    this.imageUrl = imageUrl;
  }

  public void setEnvironment(PastureEnvironment environment)
  {
    this.environment = environment;
  }
}
