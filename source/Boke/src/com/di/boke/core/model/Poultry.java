package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public
  class       Poultry
  implements  Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = 4356026692822949523L;
  
  private String          id;
  private Breed           breed;
  private PoultryProfile  profile;
  private PoultryHealth   health;
  private Pasture         pasture;
  private Coop            coop;
  private String          imageUrl;

  public String getId()
  {
    return id;
  }

  public Breed getBreed()
  {
    return breed;
  }

  public PoultryProfile getProfile()
  {
    return profile;
  }

  public PoultryHealth getHealth()
  {
    return health;
  }

  public Pasture getPasture()
  {
    return pasture;
  }

  public Coop getCoop()
  {
    return coop;
  }

  public String getImageUrl()
  {
    return imageUrl;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setBreed(Breed breed)
  {
    this.breed = breed;
  }

  public void setProfile(PoultryProfile profile)
  {
    this.profile = profile;
  }

  public void setHealth(PoultryHealth health)
  {
    this.health = health;
  }

  public void setPasture(Pasture pasture)
  {
    this.pasture = pasture;
  }

  public void setCoop(Coop coop)
  {
    this.coop = coop;
  }

  public void setImageUrl(String imageUrl)
  {
    this.imageUrl = imageUrl;
  }
}
