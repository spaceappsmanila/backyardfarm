package com.di.boke.core.json;

import java.util.logging.Logger;

import com.di.boke.core.json.serialize.BooleanSerializer;
import com.di.boke.core.json.serialize.DoubleSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;

/**
 * This class is a utility to convert Objects to and from Json.
 * 
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class JsonProcessor
{
  public static final Logger logger 
    = Logger.getLogger(JsonProcessor.class.getCanonicalName());

  protected static Gson gson = null;

  static
  {
    /**
     * Set the default Gson configuration here
     */
    GsonBuilder gsonBuilder = new GsonBuilder();

    gsonBuilder.registerTypeAdapter(Boolean.class, new BooleanSerializer());
    gsonBuilder.registerTypeAdapter(Double.class, new DoubleSerializer());
    gsonBuilder.enableComplexMapKeySerialization();
    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
    gsonBuilder.serializeNulls();
    // gsonBuilder.setDateFormat(DateFormat.LONG)
    // gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
    gsonBuilder.setPrettyPrinting();
    gsonBuilder.setVersion(1.0);

    gson = gsonBuilder.create();
  }

  public static Gson getGson()
  {
    return gson;
  }
}
