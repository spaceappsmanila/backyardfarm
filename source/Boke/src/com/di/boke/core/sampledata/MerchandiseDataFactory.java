package com.di.boke.core.sampledata;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.di.boke.core.model.GoodType;
import com.di.boke.core.model.MeasurementUnit;
import com.di.boke.core.model.Merchandise;

/**
 * 
 * @since  2013-04-22
 * @author Dungeon Innovations
 */
public 
  class MerchandiseDataFactory
{
  private static final List<Merchandise> merchandise;
  
  static
  {
    merchandise = initializeMerchandise();
  }
  
  public static List<Merchandise> getMerchandise()
  {
    return merchandise;
  }
  
  private static List<Merchandise> initializeMerchandise()
  {    
    GoodType typeA = new GoodType();
    typeA.setId("A");
    typeA.setName("Egg(s)");
    
    GoodType typeB = new GoodType();
    typeB.setId("B");
    typeB.setName("Chicken(s)");
    
    MeasurementUnit unitA = new MeasurementUnit();
    unitA.setId("U1");
    unitA.setAbbreviate("piece(s)");
    
    Merchandise merchandiseA = new Merchandise();
    merchandiseA.setId("M1");
    merchandiseA.setGoodType(typeA);
    merchandiseA.setQuantity(300L);
    merchandiseA.setSellPricePerQuantity(5D);
    merchandiseA.setSoldDate(new Date());
    merchandiseA.setUnit(unitA);
    
    Merchandise merchandiseB = new Merchandise();
    merchandiseB.setId("M2");
    merchandiseB.setGoodType(typeB);
    merchandiseB.setQuantity(100L);
    merchandiseB.setSellPricePerQuantity(100D);
    merchandiseB.setSoldDate(new Date());
    merchandiseB.setUnit(unitA);
    
    List<Merchandise> merchandiseList = new LinkedList<Merchandise>();
    merchandiseList.add(merchandiseA);
    merchandiseList.add(merchandiseB);
    
    return merchandiseList;
  }
}
