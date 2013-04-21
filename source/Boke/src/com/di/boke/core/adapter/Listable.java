package com.di.boke.core.adapter;

/**
 * An interface representing an object that can be listed in the UserAccount
 * Interface.
 * 
 * The getSystemId method must return a unique Integer that will be used
 * in the binding of the ID in the UserAccount Interface that will be used to render.
 * 
 * @since 2013-04-20
 * @author Dungeon Innovations
 */
public
  interface Listable
{
  public String getId();
  
  public String getHeader();
}
