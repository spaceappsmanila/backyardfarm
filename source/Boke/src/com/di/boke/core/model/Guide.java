package com.di.boke.core.model;

import java.util.List;

/**
 *
 * @since 2013-04-20
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 */
public class Guide
{
  private final String      id;
  private final String      name;
  private final String      description;
  private final List<Topic> articles;
  
  public Guide( String id
                , String name
                , String description
                , List<Topic> articles)
  {
    this.id           = id;
    this.name         = name;
    this.description  = description;
    this.articles     = articles;
  }

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

  public List<Topic> getArticles()
  {
    return articles;
  }

  @Override
  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("{id : ");
    builder.append(id);
    builder.append(",name : ");
    builder.append(name);
    builder.append(",description : ");
    builder.append(description);
    builder.append(",articles : ");
    builder.append(articles);
    builder.append("}");
    return builder.toString();
  }
}
