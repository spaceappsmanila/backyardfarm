package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class PoultryHealth implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = -5216390662715433452L;
  
  private Health health;

  public Health getHealth()
  {
    return health;
  }

  public void setHealth(Health health)
  {
    this.health = health;
  }
}
