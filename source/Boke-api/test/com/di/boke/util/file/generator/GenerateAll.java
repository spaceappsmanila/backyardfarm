package com.di.boke.util.file.generator;

import java.util.LinkedList;
import java.util.List;

import com.di.boke.core.model.AreaType;
import com.di.boke.core.model.BokCurrency;
import com.di.boke.core.model.Breed;
import com.di.boke.core.model.Contact;
import com.di.boke.core.model.ContactType;
import com.di.boke.core.model.Coop;
import com.di.boke.core.model.CurrencyHistory;
import com.di.boke.core.model.Fact;
import com.di.boke.core.model.ForageType;
import com.di.boke.core.model.GoodType;
import com.di.boke.core.model.Goods;
import com.di.boke.core.model.GoodsQuality;
import com.di.boke.core.model.Guide;
import com.di.boke.core.model.Health;
import com.di.boke.core.model.MeasurementUnit;
import com.di.boke.core.model.Merchandise;
import com.di.boke.core.model.Owner;
import com.di.boke.core.model.OwnerInfo;
import com.di.boke.core.model.Pasture;
import com.di.boke.core.model.PastureEnvironment;
import com.di.boke.core.model.Poultry;
import com.di.boke.core.model.PoultryHealth;
import com.di.boke.core.model.PoultryProfile;
import com.di.boke.core.model.Restriction;
import com.di.boke.core.model.Supplier;
import com.di.boke.core.model.SupplyCategory;
import com.di.boke.core.model.SupplyDelivery;
import com.di.boke.core.model.SupplyType;
import com.di.boke.core.model.Topic;
import com.di.boke.core.util.RandomUUIDGenerator;

/**
 * This class generates the json equivalent of the models and write it to a file.
 * 
 * @author Andrew Ray Abad
 * @author Dungeon Innovations
 * @since  2013-04-21
 */
public class GenerateAll
{
  private List<Object> objModels = null;
  
  /**
   * @param args
   */
  public static void main(String[] args)
  {
    GenerateAll modelGen = new GenerateAll();
    
    modelGen.generateAll(modelGen.getObjectModels());
  }
  
  public List<Object> getObjectModels()
  {
    this.objModels = new LinkedList<>();
    
    /**
     * TODO : Instantiate all Models
     */
    AreaType areaType = new AreaType();
    this.objModels.add(areaType);
    
    BokCurrency currency = new BokCurrency();
    this.objModels.add(currency);
    
    Breed breed = new Breed();
    this.objModels.add(breed);
    
    Contact contact = new Contact();
    this.objModels.add(contact);
    
    ContactType contactType = new ContactType();
    this.objModels.add(contactType);
    
    Coop coop = new Coop();
    this.objModels.add(coop);
    
    CurrencyHistory currHistory = new CurrencyHistory();
    this.objModels.add(currHistory);
    
    Fact fact = new Fact();
    fact.setId(RandomUUIDGenerator.generateRandomUUID());
    this.objModels.add(fact);
    
    ForageType forageType = new ForageType();
    this.objModels.add(forageType);
    
    Goods goods = new Goods();
    this.objModels.add(goods);
    
    GoodsQuality goodsQuality = new GoodsQuality();
    this.objModels.add(goodsQuality);
    
    GoodType goodType = new GoodType();
    this.objModels.add(goodType);
    
    Guide guide = new Guide();
    guide.setId(RandomUUIDGenerator.generateRandomUUID());
    guide.setTopics(new LinkedList<Topic>());
    this.objModels.add(guide);
    
    Health health = new Health();
    this.objModels.add(health);
    
    MeasurementUnit measurementUnit = new MeasurementUnit();
    this.objModels.add(measurementUnit);
    
    Merchandise merchandise = new Merchandise();
    this.objModels.add(merchandise);
    
    Owner owner = new Owner();
    this.objModels.add(owner);
    
    OwnerInfo ownerInfo = new OwnerInfo();
    this.objModels.add(ownerInfo);
    
    Pasture pasture = new Pasture();
    this.objModels.add(pasture);
    
    PastureEnvironment environment = new PastureEnvironment();
    this.objModels.add(environment);
    
    Poultry poultry = new Poultry();
    this.objModels.add(poultry);
    
    PoultryHealth poultryHealth = new PoultryHealth();
    this.objModels.add(poultryHealth);
    
    PoultryProfile poultryProfile = new PoultryProfile();
    this.objModels.add(poultryProfile);
    
    Restriction restriction = new Restriction();
    this.objModels.add(restriction);
    
    Supplier supplier = new Supplier();
    this.objModels.add(supplier);
    
    SupplyCategory supplyCategory = new SupplyCategory();
    this.objModels.add(supplyCategory);
    
    SupplyDelivery delivery = new SupplyDelivery();
    this.objModels.add(delivery);
    
    SupplyType supplyType = new SupplyType();
    this.objModels.add(supplyType);
    
    Topic topic = new Topic();
    topic.setId(RandomUUIDGenerator.generateRandomUUID());
    topic.setFacts(new LinkedList<Fact>());
    this.objModels.add(topic);
    
    return this.objModels;
  }
  
  public void generateAll(List<Object> objModels)
  {
    for (Object model : objModels)
    {
      GenerateJsonSchema.createJson(model);
    }
  }
}
