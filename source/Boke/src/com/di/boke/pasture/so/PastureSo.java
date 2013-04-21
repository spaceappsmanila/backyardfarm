package com.di.boke.pasture.so;

import java.util.List;

import com.di.boke.core.model.Pasture;
import com.di.boke.core.sampledata.PastureDataFactory;

/**
 *
 * @since 2013-04-21
 * @author Dungeon Innovations
 */
public class PastureSo
{
  public List<Pasture> getAllPastures()
  {
    /*
     * TODO
     * 
     * Temporary retrieve from sample data.
     * 
     * Future: Retrieve from the Cloud via Web Service. 
     * Using the NuvolaService utility.
     */
    List<Pasture> pastureList = PastureDataFactory.getPastureList();
    
    return pastureList;
  }
  
  public Pasture getPasture(String pastureId)
  {
    /*
     * TODO
     * 
     * Temporary retrieve from sample data.
     * 
     * Future: Retrieve from the Cloud via Web Service. 
     * Using the NuvolaService utility.
     */
    List<Pasture> pastureList = PastureDataFactory.getPastureList();
    
    Pasture selectedPasture = null;
    
    if (pastureList != null)
    {
      for (Pasture pasture : pastureList)
      {
        if (pasture.getId().equals(pastureId))
        {
          selectedPasture = pasture;
          break;
        }
      }
    }
    
    return selectedPasture;
  }
}
