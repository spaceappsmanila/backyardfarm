package com.di.boke.core.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class Guide implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = 3923822416729804000L;
  
  private String id;
  private String name;
  private String description;
  private List<Topic> topics;

  public String getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public String getDescription()
  {
    return description;
  }

  public List<Topic> getTopics()
  {
    return topics;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public void setTopics(List<Topic> topics)
  {
    this.topics = topics;
  }
}
