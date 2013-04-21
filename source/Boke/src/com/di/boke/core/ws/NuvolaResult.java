package com.di.boke.core.ws;


public final
  class NuvolaResult
{
  private final String  responseString;
  private final int     httpStatusCode;
  
  public NuvolaResult(String responseString
                      , int httpStatusCode)
  {
    this.responseString = responseString;
    this.httpStatusCode = httpStatusCode;
  }

  public String getResponseString()
  {
    return responseString;
  }
  
  public int getHttpStatusCode()
  {
    return httpStatusCode;
  }
  
  
}
