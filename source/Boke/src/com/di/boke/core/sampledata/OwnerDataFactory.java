package com.di.boke.core.sampledata;

import java.util.LinkedList;
import java.util.List;

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
    ownerInfo.setLastName("Dungeon");
    ownerInfo.setFirstName("Innovations");
    
    ContactType mobileType = new ContactType();
    mobileType.setName("Wireless");
    
    ContactType wired = new ContactType();
    wired.setName("Wired");
    
    Contact mobileContact = new Contact();
    mobileContact.setType(mobileType);
    mobileContact.setValue("+63-999-999-999");
    
    Contact mobileContact2 = new Contact();
    mobileContact2.setType(mobileType);
    mobileContact2.setValue("+63-999-999-888");
    
    Contact wiredContact = new Contact();
    wiredContact.setType(wired);
    wiredContact.setValue("63-400-0000");
    
    Pasture pasture = PastureDataFactory.getPastureList().get(0);
    
    Coop singleCoop = new Coop();
    singleCoop.setArea(300.00);
    singleCoop.setMaxOccupant(20);
    
    List<Contact> contactList = new LinkedList<Contact>();
    contactList.add(mobileContact);
    contactList.add(mobileContact2);
    contactList.add(wiredContact);
    
    Owner owner = new Owner(null
                            , ownerInfo
                            , contactList
                            , pasture
                            , null);
    
    return owner;
  }
}
