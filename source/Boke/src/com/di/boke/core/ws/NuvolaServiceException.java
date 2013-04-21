package com.di.boke.core.ws;

/**
 * This exceptions is thrown by the NuvolaService. This is an exception
 * concerning connections with the Cloud.
 * 
 * @since 2013-03-13
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 *
 */
public
  class   NuvolaServiceException
  extends Exception
{

  /**
   * 
   */
  private static final long serialVersionUID = -6721641909645278329L;
  
  public NuvolaServiceException()
  {
    super();
  }
  
  public NuvolaServiceException(String message)
  {
    super(message);
  }
  
  public NuvolaServiceException(String message, Throwable throwable)
  {
    super(message, throwable);
  }

}
