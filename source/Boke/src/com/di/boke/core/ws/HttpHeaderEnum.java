package com.di.boke.core.ws;

public enum HttpHeaderEnum
{
  ACCEPT("Accept")
  , ACCEPT_CHARSET("Accept-Charset")
  , ACCEPT_ENCODING("Accept-Encoding")
  , CONTENT_TYPE("Content-Type")
  , IF_MODIFIED_SINCE("If-Modified-Since")
  // custom...
  , USER_ID("userId")
  ;
  
  
  private final String fieldName;
  
  private HttpHeaderEnum(String fieldName)
  {
    this.fieldName = fieldName;
  }
  
  public String fieldName()
  {
    return this.fieldName;
  }
}
