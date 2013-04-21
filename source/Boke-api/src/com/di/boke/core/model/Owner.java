package com.di.boke.core.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class Owner implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = 6789734274720581807L;

  private String id;
  private OwnerInfo info;
  private List<Contact> contacts;
  private Pasture pasture;
  private List<Coop> coops;

  public String getId()
  {
    return id;
  }

  public OwnerInfo getInfo()
  {
    return info;
  }

  public List<Contact> getContacts()
  {
    return contacts;
  }

  public Pasture getPasture()
  {
    return pasture;
  }

  public List<Coop> getCoops()
  {
    return coops;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setInfo(OwnerInfo info)
  {
    this.info = info;
  }

  public void setContacts(List<Contact> contacts)
  {
    this.contacts = contacts;
  }

  public void setPasture(Pasture pasture)
  {
    this.pasture = pasture;
  }

  public void setCoops(List<Coop> coops)
  {
    this.coops = coops;
  }
}
