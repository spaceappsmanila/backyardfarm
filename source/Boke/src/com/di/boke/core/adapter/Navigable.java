package com.di.boke.core.adapter;

/**
 * An interface representing a Navigable object in the system.
 * 
 * A navigable object has an ID, title or header, description
 * and an Icon.
 * 
 * The Icon represents an Integer that is mapped with the applications
 * Android.R generated class.
 * 
 * @since 2013-04-20
 * @author Dungeon Innovations
 *
 */
public 
  interface Navigable
{
  public Integer getNavId();
  
  public String getNavHeader();
  
  public String getNavDescription();
  
  public Integer getNavIconId();
}
