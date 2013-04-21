package com.di.boke.core.model;

import com.di.boke.core.adapter.Navigable;


/**
 * This class represents a navigation menu item. 
 * 
 * @author Dungeon Innovations
 *
 */
public
  class       NavigationMenu 
  implements  Navigable
{
  
  private final SystemFunction  systemFunction;
  private final Integer         systemId;
  private final Integer         imageResourceId;

  public NavigationMenu(SystemFunction systemFunction
                        , Integer systemId
                        , Integer imageResourceId)
  {
    this.systemFunction   = systemFunction;
    this.systemId         = systemId;
    this.imageResourceId  = imageResourceId;
  }

  @Override
  public Integer getNavId()
  {
    return this.systemId;
  }

  @Override
  public String getNavHeader()
  {
    return this.systemFunction.getName();
  }

  @Override
  public String getNavDescription()
  {
    return this.systemFunction.getDescription();
  }

  @Override
  public Integer getNavIconId()
  {
    return this.imageResourceId;
  }

  
}
