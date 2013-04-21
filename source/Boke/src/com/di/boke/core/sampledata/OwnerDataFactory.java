package com.di.boke.core.sampledata;

import java.util.Collections;

import com.di.boke.core.model.Contact;
import com.di.boke.core.model.ContactType;
import com.di.boke.core.model.Coop;
import com.di.boke.core.model.Owner;
import com.di.boke.core.model.OwnerInfo;
import com.di.boke.core.model.Pasture;

/**
 *
 * @since 2013-04-22
 * @author Dungeon Innovations
 */
public class OwnerDataFactory
{
  private static Owner owner;
  
  static
  {
    owner = initializeOwner();
  }
  
  public static Owner getOwner()
  {
    return owner;
  }
  
  private static Owner initializeOwner()
  {
    OwnerInfo ownerInfo = new OwnerInfo();
    ownerInfo.setLastName("Innovations");
    ownerInfo.setFirstName("Dungeon");
    
    ContactType mobileType = new ContactType();
    mobileType.setName("Mobile");
    
    Contact mobileContact = new Contact();
    mobileContact.setType(mobileType);
    mobileContact.setValue("999999999999");
    
    Pasture pasture = PastureDataFactory.getPastureList().get(0);
    
    Coop singleCoop = new Coop();
    singleCoop.setArea(300.00);
    singleCoop.setMaxOccupant(20);
    
    Owner owner = new Owner(null, ownerInfo, Collections.singletonList(mobileContact), pasture, null);
    
    return owner;
  }
}
