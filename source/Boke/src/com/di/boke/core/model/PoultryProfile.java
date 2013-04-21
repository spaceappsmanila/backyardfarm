package com.di.boke.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since  2013
 */
public class PoultryProfile implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = -1443938227811453062L;

  private String id;
  private String weight;
  private MeasurementUnit wUnit;
  private String height;
  private MeasurementUnit hUnit;
  private Date birthDate;

  public String getId()
  {
    return id;
  }

  public String getWeight()
  {
    return weight;
  }

  public MeasurementUnit getwUnit()
  {
    return wUnit;
  }

  public String getHeight()
  {
    return height;
  }

  public MeasurementUnit gethUnit()
  {
    return hUnit;
  }

  public Date getBirthDate()
  {
    return birthDate;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setWeight(String weight)
  {
    this.weight = weight;
  }

  public void setwUnit(MeasurementUnit wUnit)
  {
    this.wUnit = wUnit;
  }

  public void setHeight(String height)
  {
    this.height = height;
  }

  public void sethUnit(MeasurementUnit hUnit)
  {
    this.hUnit = hUnit;
  }

  public void setBirthDate(Date birthDate)
  {
    this.birthDate = birthDate;
  }
}
