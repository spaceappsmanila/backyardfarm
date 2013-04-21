package com.di.boke.core.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.NoHttpResponseException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/**
 * Class used for connecting to the Cloud. All accepted parameters are
 * <code>JSONObject</code>. Returned parameters by the methods are either
 * <code>JSONObject</code> or <code>JSONArray</code>.
 * 
 * @author Dungeon Innovations
 *
 */
public final
  class NuvolaService
{
//  private static final String UTF_8_ENCODING = "UTF-8";
  
  private static final String UNREACHABLE_CLOUD_MESSAGE_READ
    = "Unable to reach the backing Cloud. Reading from the Local storage...";
  
  private static final String UNREACHABLE_CLOUD_MESSAGE_UPDATE
    = "Unable to reach the backing Cloud. Saving records in Local storage ...";
  
  /*
   * TODO
   * must be saved in the preferences
   */
  private static final int DEFAULT_CONNECTION_TIMEOUT = 30000;
  private static final int DEFAULT_SOCKET_TIMEOUT     = 30000;
  
  private final int connectionTimeout;
  private final int socketTimeout;
  
  public NuvolaService()
  {
    this.connectionTimeout  = DEFAULT_CONNECTION_TIMEOUT;
    this.socketTimeout      = DEFAULT_SOCKET_TIMEOUT;
  }
  
//  /**
//   * Submits a HTTP POST request given a URI string and a JSONObject
//   * as a parameter.
//   * 
//   * @param url
//   * @param parameter
//   * @return the resulting <code>JSONObject</code>
//   */
//  public NuvolaResult doPostUrlEncoded(NuvolaParameter nuvolaParameter
//                                              , List<NameValuePair> valuePairs)
//                                              throws NuvolaServiceException
//  {
//    NuvolaResult nuvolaResult = null;
//    
//    HttpClient httpClient = generateDefaultClient();
//    
//    String url              = nuvolaParameter.getUrlString();
//    String contentString    = nuvolaParameter.getContentString();
//    
//    HttpPost httpPost       = new HttpPost(url);
//    try
//    {
//      if (contentString != null)
//      {
//        StringEntity parameterEntity = new StringEntity(contentString);
////        parameterEntity.setContentEncoding(UTF_8_ENCODING);
//        String contentType = getHeaderValue(nuvolaParameter
//                                            , HttpHeaderEnum.CONTENT_TYPE);
//        parameterEntity.setContentType(contentType);
//        
//        httpPost.setEntity(parameterEntity);
//      }
//      
//      if (valuePairs != null)
//      {
//        UrlEncodedFormEntity urlEncodedEntity = new UrlEncodedFormEntity(valuePairs);
//        
//        httpPost.setEntity(urlEncodedEntity);
//      }
//      
////      httpPost.addHeader("Accept"         , JSON_MIME_TYPE);
////      httpPost.addHeader("Content-Type"   , APPLICATION_URL_ENCODED);
//      
//      List<Header> additionalHttpHeaders = nuvolaParameter.getHttpHeaders();
//      addHttpHeaders(httpPost, additionalHttpHeaders);
//      
//      HttpResponse httpResponse = httpClient.execute(httpPost);
//      StatusLine statusLine     = httpResponse.getStatusLine();
//      int statusCode            = statusLine.getStatusCode();
//      
//      nuvolaResult = new NuvolaResult(null
//                                      , statusCode);
//      
//    }
//    catch (UnsupportedEncodingException e)
//    {
//      e.printStackTrace();
//    }
//    catch (NoHttpResponseException e)
//    {
//      e.printStackTrace();
//      throw new NuvolaServiceException(UNREACHABLE_CLOUD_MESSAGE_UPDATE, e);
//    }
//    catch (ClientProtocolException e)
//    {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//    catch (IOException e)
//    {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//    
//    return nuvolaResult;
//  }
  
  
  /**
   * Submits a HTTP POST request given a URI string and a JSONObject
   * as a parameter.
   * 
   * @param url
   * @param parameter
   * @return the resulting <code>JSONObject</code>
   */
  public NuvolaResult doPost(NuvolaParameter nuvolaParameter)
                                    throws NuvolaServiceException
  {
    NuvolaResult nuvolaResult = null;
    
    HttpClient httpClient = generateDefaultClient();
    
    String url              = nuvolaParameter.getUrlString();
    String contentString    = nuvolaParameter.getContentString();
    
    HttpPost httpPost       = new HttpPost(url);
    try
    {
      if (contentString != null)
      {
        StringEntity parameterEntity = new StringEntity(contentString);
//        parameterEntity.setContentEncoding(UTF_8_ENCODING);
        String contentType = getHeaderValue(nuvolaParameter
                                            , HttpHeaderEnum.CONTENT_TYPE);
        parameterEntity.setContentType(contentType);
        
        httpPost.setEntity(parameterEntity);
      }
      
      List<NameValuePair> valuePairs = nuvolaParameter.getNameValuePairList();
      if (valuePairs != null)
      {
        UrlEncodedFormEntity urlEncodedEntity
          = new UrlEncodedFormEntity(valuePairs);
        
        httpPost.setEntity(urlEncodedEntity);
      }
      
//      httpPost.addHeader("Accept"         , JSON_MIME_TYPE);
//      httpPost.addHeader("Content-Type"   , JSON_MIME_TYPE);
      
      List<Header> additionalHttpHeaders = nuvolaParameter.getHttpHeaders();
      addHttpHeaders(httpPost, additionalHttpHeaders);
      
      HttpResponse httpResponse = httpClient.execute(httpPost);
      StatusLine statusLine     = httpResponse.getStatusLine();
      int statusCode            = statusLine.getStatusCode();
      
      nuvolaResult = new NuvolaResult(null
                                      , statusCode);
      
    }
    catch (UnsupportedEncodingException e)
    {
      e.printStackTrace();
    }
    catch (NoHttpResponseException e)
    {
      e.printStackTrace();
      throw new NuvolaServiceException(UNREACHABLE_CLOUD_MESSAGE_UPDATE, e);
    }
    catch (ClientProtocolException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    catch (IOException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    return nuvolaResult;
  }
  
  
  /**
   * Submits a HTTP GET request given a URI string and a JSONObject
   * as a parameter.
   * 
   * @param url
   * @return the resulting <code>JSONObject</code>
   */
  public NuvolaResult doGet( NuvolaParameter doGetParameter) 
                                    throws NuvolaServiceException
  {
    NuvolaResult nuvolaResult = null;
    
    String url                = doGetParameter.getUrlString();
    List<Header> httpHeaders  = doGetParameter.getHttpHeaders();
    
    HttpGet httpGet = new HttpGet(url);
//    httpGet.addHeader("accept", JSON_MIME_TYPE);
    addHttpHeaders(httpGet, httpHeaders);
    
    HttpClient httpClient = generateDefaultClient();
    try
    { 
      HttpResponse httpResponse = httpClient.execute(httpGet);
      StatusLine statusLine     = httpResponse.getStatusLine();
      int statusCode            = statusLine.getStatusCode();
      
      String responseString = null;
      
      if (statusCode == HttpStatus.SC_OK)
      {
        responseString = retrieveStringResponse(httpResponse);
      }
      
      nuvolaResult = new NuvolaResult(responseString
                                      , statusCode);
    }
    catch(ClientProtocolException e)
    {
      e.printStackTrace();
    }
    catch (NoHttpResponseException e)
    {
      e.printStackTrace();
      throw new NuvolaServiceException(UNREACHABLE_CLOUD_MESSAGE_READ, e);
    }
    catch (IOException ioe)
    {
      ioe.printStackTrace();
    }
    
    return nuvolaResult;
  }
  
  /**
   * Submits a HTTP PUT request given a URI string and a JSONObject
   * as a parameter.
   * 
   * @param url
   * @param parameter
   * @return the resulting <code>JSONObject</code>
   */
  public NuvolaResult doPut(NuvolaParameter doPutParameter)
                                  throws NuvolaServiceException
  {
    NuvolaResult nuvolaResult = null;
    
    String urlString            = doPutParameter.getUrlString();
    String contentString        = doPutParameter.getContentString();
    List<Header> httpHeaders    = doPutParameter.getHttpHeaders();
    
    HttpPut httpPut = new HttpPut(urlString);
    addHttpHeaders(httpPut, httpHeaders);
    
    HttpClient httpClient = generateDefaultClient();
    try
    {
      if (contentString != null)
      {
        StringEntity parameterEntity = new StringEntity(contentString);
//        parameterEntity.setContentEncoding(UTF_8_ENCODING);
        String contentType = getHeaderValue(doPutParameter
                                            , HttpHeaderEnum.CONTENT_TYPE);
        parameterEntity.setContentType(contentType);
        httpPut.setEntity(parameterEntity);
      }
//      httpPut.addHeader("Accept"        , JSON_MIME_TYPE);
//      httpPut.addHeader("Content-type"  , JSON_MIME_TYPE);
      List<Header> additionalHttpHeaders = doPutParameter.getHttpHeaders();
      addHttpHeaders(httpPut, additionalHttpHeaders);
      
      HttpResponse httpResponse = httpClient.execute(httpPut);
      StatusLine statusLine     = httpResponse.getStatusLine();
      int statusCode            = statusLine.getStatusCode();
      
      nuvolaResult = new NuvolaResult(null, statusCode);
      
    }
    catch (UnsupportedEncodingException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    catch (NoHttpResponseException e)
    {
      e.printStackTrace();
      throw new NuvolaServiceException(UNREACHABLE_CLOUD_MESSAGE_UPDATE, e);
    }
    catch (ClientProtocolException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    catch (IOException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    return nuvolaResult;
  }
  
  
  
  /**
   * Submits a HTTP DELETE request given a URI string and a JSONObject
   * as a parameter.
   * 
   * @param url
   * @return the resulting <code>JSONObject</code> object
   */
  public NuvolaResult doDelete( NuvolaParameter doDeleteParameter)
                                throws NuvolaServiceException
  {
    NuvolaResult doDeleteResult = null;
    
    String urlString            = doDeleteParameter.getUrlString();
    List<Header> httpHeaders    = doDeleteParameter.getHttpHeaders();
    
    HttpDelete httpDelete = new HttpDelete(urlString);
    addHttpHeaders(httpDelete, httpHeaders);
    
    HttpClient httpClient = generateDefaultClient();
    try
    {
      HttpResponse httpResponse = httpClient.execute(httpDelete);
      StatusLine statusLine     = httpResponse.getStatusLine();
      int statusCode            = statusLine.getStatusCode();
      
      doDeleteResult = new NuvolaResult(null, statusCode);
      
    }
    catch (UnsupportedEncodingException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    catch (NoHttpResponseException e)
    {
      e.printStackTrace();
      throw new NuvolaServiceException(UNREACHABLE_CLOUD_MESSAGE_UPDATE, e);
    }
    catch (ClientProtocolException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    catch (IOException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    return doDeleteResult;
  }
  
  private static String retrieveStringResponse( HttpResponse httpResponse) 
                                                throws  IllegalStateException
                                                        , IOException
  {
    String result = null;
    
    HttpEntity entity = httpResponse.getEntity();
    
    if (entity != null)
    {
      InputStream inputStream = entity.getContent();
      result = convertStreamToString(inputStream);
    }
    
    return result;
  }
  
  /**
   * Reads the content of the InputStream and convert it into a String object. 
   * @param inputStream
   * @return
   * @throws IOException
   */
  private static String convertStreamToString(InputStream inputStream) 
                                              throws IOException
  {
    StringBuilder stringValue = new StringBuilder();
    
    BufferedReader reader =
        new BufferedReader(new InputStreamReader(inputStream));
    
    String line = null;
     
    while ((line = reader.readLine()) != null)
    {
      stringValue.append(line);
    }
    
    
    return stringValue.toString();
  }
  
  /**
   * Adds additional Headers to the HttpMessage object. If the list
   * passed is null, there is no effect to the HttpMessage.
   * @param httpMessage
   * @param httpHeaders
   */
  private static void addHttpHeaders(HttpMessage httpMessage
                              , List<Header> httpHeaders)
  {
    if (httpHeaders != null
        && httpHeaders.isEmpty() == false)
    {
      Iterator<Header> headerIterator = httpHeaders.iterator();
      while (headerIterator.hasNext())
      {
        Header httpHeader = headerIterator.next();
        httpMessage.addHeader(httpHeader);
      }
    }
  }
  
  /**
   * Method for creating a default configured HttpClient.
   * 
   * @return
   */
  private HttpClient generateDefaultClient()
  {
    HttpParams httpParameters = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(httpParameters
                                              , connectionTimeout);
    HttpConnectionParams.setSoTimeout(httpParameters
                                      , socketTimeout);
    HttpClient httpClient = new DefaultHttpClient(httpParameters);
    
    return httpClient;
  }
  
  /*
   * TODO - temporary
   */
  public static Header constructHeader(String key, String value)
  {
    Header header = new BasicHeader(key, value);
    
    return header;
  }
  
  /**
   * Retrieves the corresponding header from the NuvolaParameter headers.
   * If there are multiple headers that qualifies for the header being searched,
   * only the first will be returned.
   * 
   * @param parameter
   * @param headerEnum
   * @return
   */
  private String getHeaderValue(NuvolaParameter parameter, HttpHeaderEnum headerEnum)
  {
    String headerValue = null;
    
    List<Header> httpHeaders = parameter.getHttpHeaders();
    
    if (httpHeaders != null && !httpHeaders.isEmpty())
    {
      Iterator<Header> httpHeaderIter = httpHeaders.iterator();
      
      while(httpHeaderIter.hasNext())
      {
        Header httpHeader = httpHeaderIter.next();
        String headerName = httpHeader.getName();
        
        if (headerName.equals(headerEnum.fieldName()))
        {
          headerValue = httpHeader.getValue();
          break;
        }
      }
    }
    
    return headerValue;
  }
}
