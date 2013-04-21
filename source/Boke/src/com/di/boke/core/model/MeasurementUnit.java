package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class MeasurementUnit implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = -8984077006668501259L;

  private String id;
  private String abbreviate;
  private MeasurementType type;
  private Restriction restriction;

  public String getId()
  {
    return id;
  }

  public String getAbbreviate()
  {
    return abbreviate;
  }

  public MeasurementType getType()
  {
    return type;
  }

  public Restriction getRestriction()
  {
    return restriction;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setAbbreviate(String abbreviate)
  {
    this.abbreviate = abbreviate;
  }

  public void setType(MeasurementType type)
  {
    this.type = type;
  }

  public void setRestriction(Restriction restriction)
  {
    this.restriction = restriction;
  }
}
