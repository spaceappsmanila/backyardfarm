package com.di.boke.core.provider;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import com.di.boke.core.json.JsonProcessor;
import com.google.gson.Gson;

/**
 * This class unmarshalls the Json into an Object
 *  
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
@Consumes(MediaType.APPLICATION_JSON)
@Provider
public class JsonMessageBodyReader implements MessageBodyReader<Object>
{
  @Override
  public boolean isReadable(Class<?> type
                            , Type genericType
                            , Annotation[] annotations
                            , MediaType mediaType)
  {
    return true;
  }

  @Override
  public Object readFrom( Class<Object> object
                          , Type type
                          , Annotation[] annotations
                          , MediaType mediaType
                          , MultivaluedMap<String, String> headers
                          , InputStream streamContent)
                              throws IOException, WebApplicationException
  {
    InputStreamReader inputStreamReader 
      = new InputStreamReader(streamContent,"UTF-8");
    
    Object obj = null;
    try
    {
      Gson gson = JsonProcessor.getGson();
      object = gson.fromJson(inputStreamReader, type);
    }
    
    finally
    {
      if (inputStreamReader != null)
      {
        inputStreamReader.close();
      }
    }
    
    return obj;
  }

}
