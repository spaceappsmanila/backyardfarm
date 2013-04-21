package com.di.boke.core.json.serialize;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * This class serializes the Wrapper class Double into a String
 * 
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class DoubleSerializer implements JsonSerializer<Double>
{
  @Override
  public JsonElement serialize(Double src, Type typeOfSrc,
      JsonSerializationContext context)
  {
    return new JsonPrimitive(src.toString());
  }
}
