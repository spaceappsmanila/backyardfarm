package com.di.boke.core.model;

import java.io.Serializable;

/**
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class Fact implements Serializable
{
  /**
   * Auto-generated serialVersionUID
   * In case of using serializable objects
   * for future preferences
   */
  private static final long serialVersionUID = 6601177278321250362L;
  
  private String id;
  private String messageBody;
  private Boolean isTip;
  private String referenceUrl;
  private String imageUrl;
  private Integer sequence;

  public String getId()
  {
    return id;
  }

  public String getMessageBody()
  {
    return messageBody;
  }

  public Boolean getIsTip()
  {
    return isTip;
  }

  public String getReferenceUrl()
  {
    return referenceUrl;
  }

  public String getImageUrl()
  {
    return imageUrl;
  }

  public Integer getSequence()
  {
    return sequence;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setMessageBody(String messageBody)
  {
    this.messageBody = messageBody;
  }

  public void setIsTip(Boolean isTip)
  {
    this.isTip = isTip;
  }

  public void setReferenceUrl(String referenceUrl)
  {
    this.referenceUrl = referenceUrl;
  }

  public void setImageUrl(String imageUrl)
  {
    this.imageUrl = imageUrl;
  }

  public void setSequence(Integer sequence)
  {
    this.sequence = sequence;
  }
}
