package com.di.boke.core.model;

public 
  class SystemFunction
{
  private final Long    id;
  private final String  name;
  private final String  description;
  
  public SystemFunction(Long id
                        , String name
                        , String description) 
  {
    this.id           = id;
    this.name         = name;
    this.description  = description;
  }
  
  public Long getId()
  {
    return this.id;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getDescription()
  {
    return this.description;
  }
}
