package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class OwnerInfo implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = 2307981372789380522L;

  private String firstName;
  private String middleName;
  private String lastName;

  public String getFirstName()
  {
    return firstName;
  }

  public String getMiddleName()
  {
    return middleName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public void setMiddleName(String middleName)
  {
    this.middleName = middleName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }
}
