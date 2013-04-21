package com.di.boke.core.ws;

import java.util.List;

import org.apache.http.Header;
import org.apache.http.NameValuePair;

/**
 * A simple POJO that is used to contained the results for the Cloud
 * Service.
 * 
 * <ul>
 * <li><strong>jsonParameter</strong> - The JSON parameter that contains
 * the arguments that will be passed to the Web Service Endpoint</li>
 * <li><strong>urlString</strong> - The URL endpoint</li>
 * <li><strong>httpHeaders</strong> - Additional HTTP headers</li>
 * <li><strong>isArrayExpected</strong> - Determines if the result to be
 * expected from the Http method is to return a JSONArray or a JSONObject</li>
 * </ul>
 * 
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 *
 */
public
  class NuvolaParameter
{
  private final String              urlString;
  private final List<Header>        httpHeaders;
  private final String              contentString;
  private final List<NameValuePair> nameValuePairList;
  
  public NuvolaParameter( String urlString
                          , List<Header> httpHeaders
                          , String contentString
                          , List<NameValuePair> urlEncodedValuePairs)
  {
    this.urlString          = urlString;
    this.httpHeaders        = httpHeaders;
    this.contentString      = contentString;
    this.nameValuePairList  = urlEncodedValuePairs;
    
    if (urlString == null
        || urlString.isEmpty())
    {
      throw new IllegalArgumentException("URL String Cannot be empty");
    }
  }

  public String getContentString()
  {
    return contentString;
  }

  public String getUrlString()
  {
    return this.urlString;
  }
  
  public List<Header> getHttpHeaders()
  {
    return this.httpHeaders;
  }

  public List<NameValuePair> getNameValuePairList()
  {
    return nameValuePairList;
  }
}
