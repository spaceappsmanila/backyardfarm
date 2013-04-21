package com.di.boke.util.file.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.di.boke.core.json.JsonProcessor;

/**
 * This utility class is used to write the json objects to a file.
 * 
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since 2013-04-21
 */
public class GenerateJsonSchema
{
  public static final String EXTENSION = ".json";
  public static final String PATH = "schema/";
  
  public static void createJson(Object model)
  {
    File jsonFile = new File(PATH + model.getClass().getSimpleName() + EXTENSION);
    FileOutputStream fileOutStream = null;
    ObjectOutputStream objOutStream = null;
    
    try
    {
      String valueToWrite = JsonProcessor.getGson().toJson(model);
      fileOutStream = new FileOutputStream(jsonFile, false);
//      objOutStream = new ObjectOutputStream(fileOutStream);
      fileOutStream.write(valueToWrite.getBytes());
//      objOutStream.writeObject(model);  // Serialize Object
      
      fileOutStream.flush();
//      objOutStream.flush();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        if (fileOutStream != null)
        {
          fileOutStream.close();
        }
        
        if (objOutStream != null)
        {
          objOutStream.close();
        }
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }
}
