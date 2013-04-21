package com.di.boke.core.model;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.di.boke.guide.activity.ViewGuideViewsActivity;

import android.app.Activity;

/**
 * This Enumeration contains the possible and maximum list of menus
 * that the system can render. 
 * 
 * @author Dungeon Innovations
 *
 */
public
  enum MenuEnum
{
  
  NOTICES
  (
    1000L
    , 1009
    , "Guides"
    , null
    , null
    , null
    , ViewGuideViewsActivity.class
  )
  ;
  
  MenuEnum( Long id
            , Integer systemId
            , String header
            , String description
            , Integer imageId
            , MenuEnum parent
            , Class<? extends Activity> activity)
  {
    this.id           = id;
    this.systemId     = systemId;
    this.header       = header;
    this.description  = description;
    this.imageId      = imageId;
    this.parent       = parent;
    this.activity     = activity;
  }
  
  private final Long                      id; // used to map the system functions, temporarily here... must be retrieved from the Cloud
  private final Integer                   systemId; // application-specific ID
  private final String                    header; // a title or header for the menu
  private final String                    description; // a short description for the menu
  private final Integer                   imageId; // corresponds to the Android R.id for images.
  private final MenuEnum                  parent; // the parent menu of the current menu item
  private final Class<? extends Activity> activity; // the activity assigned for the menu to be executed
  
  public Long id() 
  {
    return this.id;
  }
  
  public Integer systemId()
  {
    return this.systemId;
  }
  
  public String header()
  {
    return this.header;
  }
  
  public String description()
  {
    return this.description;
  }
  
  public Integer imageId()
  {
    return this.imageId;
  }
  
  public MenuEnum parent()
  {
    return this.parent;
  }
  
  public Class<? extends Activity> activity()
  {
    return this.activity;
  }
  
  /**
   * Retrieves the associated activity for the system ID selected.
   * @param selectedId an Integer representing the ID to retrieve the
   * associated activity.
   * @return a Class that extends Activity object.
   */
  public static Class<? extends Activity> getActivity(Integer selectedId)
  {
    final MenuEnum[] menus = values();
    List<MenuEnum> menuEnums = Arrays.asList(menus);
    Iterator<MenuEnum> menuIterator = menuEnums.iterator();
    
    Class<? extends Activity> queriedActivity = null;
    
    while (menuIterator.hasNext())
    {
      MenuEnum menuEnum = menuIterator.next();
      
      if (menuEnum.systemId.equals(selectedId))
      {
        queriedActivity = menuEnum.activity;
        break;
      }
    }
    
    return queriedActivity;
  }
  
  /**
   * Retrieves the selected MenuEnum given the system ID.
   * @param selectedId the system ID to cross-check with the existing 
   * MenuEnum
   * @return a MenuEnum that has the same value for the system ID. NULL
   * value if the ID cannot be found.
   */
  public static MenuEnum getMenuEnum (Integer selectedId)
  {
    final MenuEnum[] menus = values();
    List<MenuEnum> menuEnums = Arrays.asList(menus);
    Iterator<MenuEnum> menuIterator = menuEnums.iterator();
    
    MenuEnum filteredMenuEnum = null;
    
    while (menuIterator.hasNext())
    {
      MenuEnum menuEnum = menuIterator.next();
      
      if (menuEnum.systemId.equals(selectedId))
      {
        filteredMenuEnum = menuEnum;
        break;
      }
    }
    
    return filteredMenuEnum;
  }
}