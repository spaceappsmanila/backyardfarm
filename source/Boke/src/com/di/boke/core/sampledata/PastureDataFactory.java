package com.di.boke.core.sampledata;

import java.util.LinkedList;
import java.util.List;

import com.di.boke.core.model.Pasture;

/**
 *
 * @since 2013-04-21
 * @author Dungeon Innovations
 */
public class PastureDataFactory
{
  private static List<Pasture> pastureList;
  
  static
  {
    pastureList = initializePasture();
  }
  
  public static List<Pasture> getPastureList()
  {
    return pastureList;
  }
  
  private static List<Pasture> initializePasture()
  {
    Pasture pastureA = new Pasture();
    pastureA.setName("My Pasture A");
    pastureA.setId("A");
    
    Pasture pastureB = new Pasture();
    pastureB.setName("My Pasture B");
    pastureB.setId("B");
    
    List<Pasture> pastureList = new LinkedList<Pasture>();
    pastureList.add(pastureA);
    pastureList.add(pastureB);
    
    return pastureList;
  }
}
