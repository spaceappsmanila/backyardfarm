package com.di.boke.core.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class Coop implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = -7683068420644017572L;

  private String id;
  private String name;
  private Integer maxOccupant;
  private Double area;
  private MeasurementUnit unit;
  private List<Poultry> brood;
  private String imageUrl;

  public String getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public Integer getMaxOccupant()
  {
    return maxOccupant;
  }

  public Double getArea()
  {
    return area;
  }

  public MeasurementUnit getUnit()
  {
    return unit;
  }

  public List<Poultry> getBrood()
  {
    return brood;
  }

  public String getImageUrl()
  {
    return imageUrl;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setMaxOccupant(Integer maxOccupant)
  {
    this.maxOccupant = maxOccupant;
  }

  public void setArea(Double area)
  {
    this.area = area;
  }

  public void setUnit(MeasurementUnit unit)
  {
    this.unit = unit;
  }

  public void setBrood(List<Poultry> brood)
  {
    this.brood = brood;
  }

  public void setImageUrl(String imageUrl)
  {
    this.imageUrl = imageUrl;
  }
}
