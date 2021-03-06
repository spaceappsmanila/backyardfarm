package com.di.boke.guide.so;

import java.util.List;

import com.di.boke.core.model.Guide;
import com.di.boke.core.sampledata.GuideDataFactory;

/**
 *
 * @since 2013-04-21
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 */
public
  class GuideSo
{
  /**
   * Retrieves all the available guides.
   * @return
   */
  public List<Guide> getAllGuides()
  {
    /*
     * TODO
     * 
     * Temporary retrieve from sample data.
     * 
     * Future: Retrieve from the Cloud via Web Service. 
     * Using the NuvolaService utility.
     */
    List<Guide> guides = GuideDataFactory.getGuides();
    
    return guides;
  }
  
  public Guide getGuide(String guideId)
  {
    /*
     * TODO
     * 
     * Temporary retrieve from sample data.
     * 
     * Future: Retrieve from the Cloud via Web Service. 
     * Using the NuvolaService utility.
     */
    List<Guide> guides = GuideDataFactory.getGuides();
    
    Guide selectedGuide = null;
    
    for (Guide guide : guides)
    {
      if (guide.getId().equals(guideId))
      {
        selectedGuide = guide;
        break;
      }
    }
    
    return selectedGuide;
  }
}
