package com.di.boke.core.json.serialize;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * This class serializes the Wrapper class Boolean into a String
 * 
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class BooleanSerializer implements JsonSerializer<Boolean>
{
  @Override
  public JsonElement serialize(Boolean src, Type tyepeOfSrc,
      JsonSerializationContext context)
  {
    return new JsonPrimitive(src.toString());
  }
}
