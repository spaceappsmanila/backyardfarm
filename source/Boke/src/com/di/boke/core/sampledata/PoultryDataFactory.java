package com.di.boke.core.sampledata;

import java.util.LinkedList;
import java.util.List;

import com.di.boke.core.model.Poultry;

/**
 *
 * @since 2013-04-22
 * @author Dungeon Innovations
 */
public class PoultryDataFactory
{
  private static List<Poultry> poultryList;
  
  static
  {
    poultryList = initializePoultryList();
  }
  
  public static List<Poultry> getPoultryList()
  {
    return poultryList;
  }
  
  private static List<Poultry> initializePoultryList()
  {
    List<Poultry> poultryList = new LinkedList<Poultry>();
    
    return poultryList;
  }
}
