package com.di.boke.core.constants;

public enum IntentKeysEnum
{
  GUIDE_SELECTED_ID("GUIDE_SELECTED_ID")
  ;
  
  private final String keyName;
  
  IntentKeysEnum(String keyName)
  {
    this.keyName = keyName;
  }
  
  public String keyName()
  {
    return this.keyName;
  }
}
