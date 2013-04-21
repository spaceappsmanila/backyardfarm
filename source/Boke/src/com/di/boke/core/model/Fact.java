package com.di.boke.core.model;

/**
 *
 * @since 2013-04-20
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 */
public class Fact
{
  private final String  id;
  private final String  messageBody;
  private final Boolean isTip;
  private final String  referenceUrl;
  private final String  imageUrl;
  
  public Fact(String id
              , String messageBody
              , Boolean isTip
              , String referenceUrl
              , String imageUrl)
  {
    this.id           = id;
    this.messageBody  = messageBody;
    this.isTip        = isTip;
    this.referenceUrl = referenceUrl;
    this.imageUrl     = imageUrl;
  }

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

  @Override
  public String toString()
  {
    StringBuilder builder = new StringBuilder();
    builder.append("{id : ");
    builder.append(id);
    builder.append(",messageBody : ");
    builder.append(messageBody);
    builder.append(",isTip : ");
    builder.append(isTip);
    builder.append(",referenceUrl : ");
    builder.append(referenceUrl);
    builder.append(",imageUrl : ");
    builder.append(imageUrl);
    builder.append("}");
    return builder.toString();
  }
  
  
  
}
