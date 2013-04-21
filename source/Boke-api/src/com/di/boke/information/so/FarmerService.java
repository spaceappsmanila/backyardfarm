package com.di.boke.information.so;

import java.util.logging.Logger;

import com.di.boke.core.json.JsonProcessor;

/**
 * This is the service object that process the reading and writing of Json
 * 
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since 2013-04-21
 */
public class FarmerService
{
  private JsonProcessor processor = new JsonProcessor();
  
  public static final Logger logger 
    = Logger.getLogger(FarmerService.class.getCanonicalName());

  public FarmerService()
  {
    logger.info("Initialize service : " + FarmerService.class.getSimpleName());
  }
  
  public Object getObjectFromFile()
  {
    
    return null;
  }
}
