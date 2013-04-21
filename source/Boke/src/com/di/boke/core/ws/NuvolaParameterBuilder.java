package com.di.boke.core.ws;

import java.util.LinkedList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;


public class NuvolaParameterBuilder
{
  private String              urlString;
  private List<Header>        headers;
  private List<NameValuePair> nameValuePairs;
  private String              contentString;
  private Boolean             contentTypeSet;
  
  public NuvolaParameterBuilder(String url)
  {
    this.urlString = url;
  }
  
  /**
   * Flags that the expected and accepted response should be in 
   * JSON format.
   */
  public NuvolaParameterBuilder resultIsJson()
  {
    addHttpHeader(HttpHeaderEnum.ACCEPT, "application/json");
    return this;
  }
  
  public NuvolaParameterBuilder addHttpHeader(HttpHeaderEnum header, String value)
  {
    Header httpHeader = new BasicHeader(header.fieldName(), value);
    
    if (headers == null)
    {
      headers = new LinkedList<Header>();
    }
    
    headers.add(httpHeader);
    return this;
  }
  
  public NuvolaParameterBuilder addJsonContent(String jsonString)
  {
    this.contentString = jsonString;
    
    this.contentTypeSet = Boolean.valueOf(true);
    return this;
  }
  
  public NuvolaParameterBuilder addUrlEncodedValue(String name, String value)
  {
    NameValuePair valuePair = new BasicNameValuePair(name, value);
    
    if (nameValuePairs == null)
    {
      nameValuePairs = new LinkedList<NameValuePair>();
    }
    
    if (this.contentTypeSet == null)
    {
      addHttpHeader(HttpHeaderEnum.CONTENT_TYPE
                    , "application/x-www-form-urlencoded");
      this.contentTypeSet = Boolean.valueOf(true);
    }
    
    nameValuePairs.add(valuePair);
    return this;
  }
  
  public NuvolaParameter build()
  {
    if (this.contentString != null && this.nameValuePairs != null)
    {
      throw new IllegalStateException("Content type has been set twice. Via JSON and URL Encoded");
    }
    
    /*
     * TODO
     * check if there are duplicate content-types or headers for that
     * matter that exists in the HTTP Headers.
     */
    
    NuvolaParameter nuvolaParameter
      = new NuvolaParameter(urlString
                            , headers
                            , contentString
                            , nameValuePairs);
    
    return nuvolaParameter;
  }
}
