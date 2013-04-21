package com.di.boke.core.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class Supplier implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = -2633192111701378370L;

  private String id;
  private SupplyType type;
  private List<Contact> contacts;

  public String getId()
  {
    return id;
  }

  public SupplyType getType()
  {
    return type;
  }

  public List<Contact> getContacts()
  {
    return contacts;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setType(SupplyType type)
  {
    this.type = type;
  }

  public void setContacts(List<Contact> contacts)
  {
    this.contacts = contacts;
  }
}
