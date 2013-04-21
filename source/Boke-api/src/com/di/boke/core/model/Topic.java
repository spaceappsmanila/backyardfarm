package com.di.boke.core.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class Topic implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = -4404331295222471771L;
  
  private String id;
  private String header;
  private Integer sequence;
  private List<Fact> facts;

  public String getId()
  {
    return id;
  }

  public String getHeader()
  {
    return header;
  }

  public Integer getSequence()
  {
    return sequence;
  }

  public List<Fact> getFacts()
  {
    return facts;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setHeader(String header)
  {
    this.header = header;
  }

  public void setSequence(Integer sequence)
  {
    this.sequence = sequence;
  }

  public void setFacts(List<Fact> facts)
  {
    this.facts = facts;
  }
}
