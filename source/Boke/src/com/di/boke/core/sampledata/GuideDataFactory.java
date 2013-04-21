package com.di.boke.core.sampledata;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.di.boke.core.model.Fact;
import com.di.boke.core.model.Guide;
import com.di.boke.core.model.Topic;

/**
 *
 * @since Apr 21, 2013
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 */
public class GuideDataFactory
{
  private static final List<Guide> guides;
  
  static
  {
    guides = initializeGuides();
  }
  
  public static List<Guide> getGuides()
  {
    return guides;
  }
  
  private static List<Guide> initializeGuides()
  {
    Fact factA1 = new Fact("20001", "Chickens are very eager to fly", false, null, null);
    Fact factA2 = new Fact("20002", "Chickens are very eager to fly again", false, null, null);
    List<Fact> factsA = new LinkedList<Fact>();
    factsA.add(factA1);
    factsA.add(factA2);
    
    Topic topicA = new Topic("3001", "All about chickens", factsA);
    
    Fact factB1 = new Fact("20001", "Chickens love to eat worms", false, null, null);
    Fact factB2 = new Fact("20002", "There are different types of feeds chicken eat", false, null, null);
    Fact factB3 = new Fact("20002", "Chickens are not very picky when eating feeds", true, "www.mychickens.com", null);
    List<Fact> factsB = new LinkedList<Fact>();
    
    factsB.add(factB1);
    factsB.add(factB2);
    factsB.add(factB3);
    
    Topic topicB = new Topic("3001", "Chicken Food", factsB);
    
    List<Topic> topics = new LinkedList<Topic>();
    topics.add(topicA);
    topics.add(topicB);
    
    Guide manageChickenGuide = new Guide("4001", "Managing Chickens", "A simple guidelines on what are chickens", topics);
    
    List<Guide> guides = new LinkedList<Guide>(Collections.singletonList(manageChickenGuide));
    
    return guides;
  }
}
