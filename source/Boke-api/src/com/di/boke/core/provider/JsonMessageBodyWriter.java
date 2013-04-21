package com.di.boke.core.provider;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.di.boke.core.json.JsonProcessor;
import com.google.gson.Gson;

/**
 * This class marshalls the Object to Json
 * 
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JsonMessageBodyWriter implements MessageBodyWriter<Object>
{ 
  @Override
  public long getSize(Object object
                      , Class<?> type
                      , Type genericType
                      , Annotation[] annotations
                      , MediaType mediaType)
  {
    return -1;
  }

  @Override
  public boolean isWriteable( Class<?> type
                              , Type genericType
                              , Annotation[] annotations
                              , MediaType mediaType)
  {
    return true;
  }

  @Override
  public void writeTo(Object object
                      , Class<?> type
                      , Type genericType
                      , Annotation[] annotations
                      , MediaType mediaType
                      , MultivaluedMap<String, Object> headers
                      , OutputStream outputStream) 
                          throws IOException, WebApplicationException
  {
    OutputStreamWriter writer = null;

    try
    {
      Gson gson = JsonProcessor.getGson();
      writer = new OutputStreamWriter(outputStream);
      gson.toJson(object, writer);
      
      writer.flush();
    }
    finally
    {
      if (writer != null)
      {
        writer.close();
      }
    }
  }
}
