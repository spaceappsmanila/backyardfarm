package com.di.boke.core.util;

import java.util.UUID;
import java.util.logging.Logger;

/**
 * This class generates a random id
 * May edit for future preferences.
 * 
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class RandomUUIDGenerator
{
  public static final Logger logger 
    = Logger.getLogger(RandomUUIDGenerator.class.getCanonicalName());
  
  public static String generateUUID(String date, String code)
  {
    StringBuilder strBuilder = new StringBuilder();
    strBuilder.append(date);
    strBuilder.append(code);

    byte uuidBytes[] = strBuilder.toString().getBytes();
    UUID uuidFromString = UUID.nameUUIDFromBytes(uuidBytes);

    logger.info("Generated id : " + uuidFromString);
    
    return uuidFromString.toString();
  }

  public static String generateRandomUUID()
  {
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();
    
    logger.info("Generated id : " + randomUUIDString);

    return randomUUIDString;
  }
}
