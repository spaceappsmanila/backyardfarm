package com.di.boke.core.model;

import java.util.List;

/**
 *
 * @since 2013-04-20
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 */
public class Topic
{
  private final String      id;
  private final String      header;
  private final List<Fact>  facts;
  
  public Topic(String id, String header, List<Fact> facts)
  {
    this.id     = id;
    this.header = header;
    this.facts  = facts;
  }

  public String getHeader()
  {
    return header;
  }

  public List<Fact> getFacts()
  {
    return facts;
  }

  public String getId()
  {
    return id;
  }

  @Override
  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("{id : ");
    builder.append(id);
    builder.append(",header : ");
    builder.append(header);
    builder.append(",facts : ");
    builder.append(facts);
    builder.append("}");
    return builder.toString();
  }
}
