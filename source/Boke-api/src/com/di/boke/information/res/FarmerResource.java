package com.di.boke.information.res;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * This class is the exposed resource for the backyard farming.
 * 
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
@Path("/{userId}")
public 
  class FarmerResource
{
  public static final Logger logger 
    = Logger.getLogger(FarmerResource.class.getCanonicalName());

  public FarmerResource()
  {
    logger.info("Initialize resource : " + FarmerResource.class.getSimpleName());
  }
  
  @GET
  @Path("/guides")
  public Response getBackyardFarmingData()
  {
    
    return null;
  }
}
