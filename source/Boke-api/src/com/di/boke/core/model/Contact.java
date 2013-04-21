package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class Contact implements Serializable
{/**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = -6435706639700118802L;

  private String id;
  private ContactType type;
  private String value;
  private Boolean isPrimary;

  public String getId()
  {
    return id;
  }

  public ContactType getType()
  {
    return type;
  }

  public String getValue()
  {
    return value;
  }

  public Boolean getIsPrimary()
  {
    return isPrimary;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setType(ContactType type)
  {
    this.type = type;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public void setIsPrimary(Boolean isPrimary)
  {
    this.isPrimary = isPrimary;
  }
}
