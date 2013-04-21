package com.di.boke.home.so;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.di.boke.core.adapter.Navigable;
import com.di.boke.core.model.MenuEnum;
import com.di.boke.core.model.NavigationMenu;
import com.di.boke.core.model.SystemFunction;

public
  class MenuRetrievalSo
{
  
  // TODO - possible argument is the SystemFunctions
  public List<Navigable> getRootMenu()
  {
    List<Navigable> navigableMenus = null;
    
    /*
     * TODO 
     * Retrieve all navigation menu from the resources. 
     */
    navigableMenus = getAllRootMenu();
    
    /* 
     * TODO
     * Filter the accessible menu by checking the accessible menus
     * from the UserProfile
     */
    
    return navigableMenus;
  }
  
  // TODO - possible argument is the SystemFunctions
  public List<Navigable> getSubMenu(Integer menuId)
  {
    List<Navigable> navigableSubMenus = null;
    
    /*
     * TODO 
     * Retrieve all navigation menu from the resources. 
     */
    MenuEnum parentMenu = MenuEnum.getMenuEnum(menuId);
    navigableSubMenus = getSubMenus(parentMenu);
    
    /* 
     * TODO
     * Filter the accessible menu by checking the accessible menus
     * from the UserProfile
     */
    
    return navigableSubMenus;
  }
  
  private Navigable createNavigableMenu(MenuEnum menuEnum)
  {
    Integer menuSystemId    = menuEnum.systemId();
    String header           = menuEnum.header();
    String description      = menuEnum.description();
    Integer imageResourceId = menuEnum.imageId();
    
    /*
     *  TODO ID is null, will come from the cloud
     */
    SystemFunction systemFunction = new SystemFunction( null
                                                        , header
                                                        , description);
    
    Navigable navigableMenu = new NavigationMenu( systemFunction
                                                  , menuSystemId
                                                  , imageResourceId);
    
    return navigableMenu;
  }
  
  /*
   * TODO
   * Sample
   */
  private List<Navigable> getAllRootMenu()
  {
    List<Navigable> navigationMenus = new ArrayList<Navigable>();
    
    List<MenuEnum> menuEnumerations = Arrays.asList(MenuEnum.values());
    Iterator<MenuEnum> menuEnumIterator = menuEnumerations.iterator();
    
    while (menuEnumIterator.hasNext())
    {
      MenuEnum menuEnum = menuEnumIterator.next();
      
      if (menuEnum.parent() == null)
      {
        Navigable navigableMenu = createNavigableMenu(menuEnum);
        
        navigationMenus.add(navigableMenu);
      }
    }
    
    return navigationMenus;
  }
  
  private List<Navigable> getSubMenus(MenuEnum parentMenu)
  {
    List<Navigable> subMenus = new ArrayList<Navigable>();
    
    List<MenuEnum> menuEnumerations = Arrays.asList(MenuEnum.values());
    Iterator<MenuEnum> menuEnumIterator = menuEnumerations.iterator();
    
    Long parentMenuId = parentMenu.id();
    
    while (menuEnumIterator.hasNext())
    {
      MenuEnum menuEnum = menuEnumIterator.next();
      
      /*
       * Check if the menu being iterated has a parent
       */
      if (menuEnum.parent() != null)
      {
        Long menuParentId = menuEnum.parent().id();
        
        /*
         * Compare the IDs of the Main Menu and the 
         * parent Menus of the Menus being iterated.
         */
        if (parentMenuId.equals(menuParentId))
        {
          Navigable navigableMenu = createNavigableMenu(menuEnum);
          
          subMenus.add(navigableMenu);
        }
      }
    }
    
    return subMenus;
  }
}
