package com.di.boke.core.sampledata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.di.boke.core.model.Fact;
import com.di.boke.core.model.Guide;
import com.di.boke.core.model.Topic;

/**
 * 
 * @since 2013-04-21
 * @author Dungeon Innovations
 */
public class GuideDataFactory
{
  private static final List<Guide> guides;

  static
  {
    guides = initializeGuides();
  }

  public static List<Guide> getGuides()
  {
    return guides;
  }

  private static List<Guide> initializeGuides()
  {
    Fact factA1 = new Fact("20001", "Chickens are very eager to fly", false,
        null, null, null);
    Fact factA2 = new Fact("20002", "Chickens are very eager to fly again",
        false, null, null, null);
    List<Fact> factsA = new LinkedList<Fact>();
    factsA.add(factA1);
    factsA.add(factA2);

    Topic topicA = new Topic("3001", "All about chickens", null, factsA);

    Fact factB1 = new Fact("20001", "Chickens love to eat worms", false, null,
        null, null);
    Fact factB2 = new Fact("20002",
        "There are different types of feeds chicken eat", false, null, null,
        null);
    Fact factB3 = new Fact("20003",
        "Chickens are not very picky when eating feeds", true,
        "www.mychickens.com", null, null);
    Fact factB4 = new Fact("20004",
        "The cry of a rooster is fatal for a basilisk", true, null, null, null);
    Fact factB5 = new Fact(
        "20005",
        "Chickens are great for keeping pesks away. This includes bugs, and other nasty insects.",
        true, null, null, null);
    List<Fact> factsB = new LinkedList<Fact>();

    factsB.add(factB1);
    factsB.add(factB2);
    factsB.add(factB3);
    factsB.add(factB4);
    factsB.add(factB5);

    Topic topicB = new Topic("3001", "Chicken Food", null, factsB);

    List<Topic> topics = new LinkedList<Topic>();
    topics.add(topicA);
    topics.add(topicB);

    Guide manageChickenGuide = new Guide("4001", "Managing Chickens",
        "A simple guidelines on what are chickens", topics);

    List<Guide> guides = new LinkedList<Guide>(
        Collections.singletonList(manageChickenGuide));


    
    topics = new LinkedList<Topic>();
    List<Fact> poultryFacts = new LinkedList<Fact>();
    poultryFacts
      .add(new Fact(
        "20006",
        "Chickens in small flocks live several years if conditions are correct. A life span of 6-8 years may not be unreasonable.   Most commercial layers are kept for 2-3 years.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3002", "How long do chickens live?", null,
        poultryFacts));
    // Clear
    poultryFacts.clear();
    poultryFacts
      .add(new Fact(
        "20007",
        "Under optimum conditions; good nutrition, ideal day length, adequate housing and good management practices, most layers should begin egg production at about 20-22 weeks of age.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3003", "How old are chickens when they begin to lay eggs?", null,
        poultryFacts));
    
    // Clear
    poultryFacts.clear();
    poultryFacts
      .add(new Fact(
        "20008",
        "Commercial rations will usually produce the best results from all types of poultry.  A ration designed specifically for a particular type of bird should always be used (ie. layer ration for layers, broiler ration for broilers, etc.).  The commercial ration should not be supplemented with scratch, corn or table scraps because the birds will not be eating a balanced diet.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3004", "What should chickens be fed?", null,
        poultryFacts));

    // Clear
    poultryFacts.clear();
    poultryFacts
      .add(new Fact(
        "20009",
        "Vent sexing by an experienced chick sexer can be done at one day of age.  This technique is difficult and requires a great deal of experience.  If a fast feathering gene has been introduced into the breeding flock, chicks can be sexed by observing the differences in the appearance of the primary wing feathers.  The feathers on the wings of the female will be a little longer and in a different pattern than those on the males.  Most chickens can not be sexed in this manner.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3005", "How can the sex of baby chicks be determined?", null,
        poultryFacts));
    
    // Clear
    poultryFacts.clear();
    poultryFacts
      .add(new Fact(
        "20010",
        "Yes, most eggs produced for human consumption are produced this way and are non-fertile.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3006", "Can eggs be produced without a male being present?", null,
        poultryFacts));
    
    // Clear
    poultryFacts.clear();
    poultryFacts
      .add(new Fact(
        "20011",
        "Chickens reproduce in a manner similar to some other animals.  The female produces an egg which if fertilized can result in a baby chick.  The true egg, the part that develops into the embryo, is located on the egg yolk.  The yolk begins to develop in the ovary and after 10-12 days of development, ovulation occurs.  If the female has been mating with a male, sperm will be present and fertilization can occur.  The male chicken does not have a penis and therefore there is no penetration of the female reproductive tract at the time of mating.  Instead the female inverts the cloaca (site of the common junction of the reproductive and digestive systems) which comes in contact with the male’s inverted cloaca and receives the sperm.  The cloaca is then drawn back into the hen’s body and the sperm are captured. They then begin the journey up the length of the reproductive system.  The sperm live inside the female reproductive system and each time an ovulation occurs (every 24-26 hours in good egg producers) the egg can become fertile.  This process continues and matings at 7 - 10 day intervals are necessary to maintain fertility.  After fertilization occurs the egg albumen, shell membranes, and shell are added to complete the egg formation process.  The chicken usually lays the egg about 24 hours after ovulation.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3007", "How do chickens reproduce?", null,
        poultryFacts));
    
    // Clear
    poultryFacts.clear();
    poultryFacts
      .add(new Fact(
        "20012",
        "Certified egg production flocks are those flocks that comply with the guidelines established by the United Egg Producers organization.  To be certified, flocks must meet requirements in housing and cage space allowance, beak trimming, molting, transportation and handling.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3008", "What are certified egg production flocks?", null,
        poultryFacts));
    
    // Clear
    poultryFacts.clear();
    poultryFacts
      .add(new Fact(
        "20013",
        "Housing chickens in cages does not abuse them.  The egg producer does not intentionally abuse chickens because the birds will not be healthy and happy and good egg producers.  A certification program is designed to increase cage space and modify other production practices that may be in question.  Research has shown that keeping hens in cages actually may be less stressful since there is less competition and interaction with other more aggressive birds.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3009", "Are chickens in cages being abused?", null,
        poultryFacts));
    
    Guide poultryFaq = new Guide("4002",
        "Poultry FAQ",
        "Frequently Asked Question about Poultry",
        topics);
    guides.add(poultryFaq);
    
    topics = new LinkedList<Topic>();
    List<Fact> poultryMeatFacts = new LinkedList<Fact>();

    // Clear
    poultryMeatFacts.clear();
    poultryMeatFacts
      .add(new Fact(
        "20014",
        "Different muscles in the body of the bird are used at various rates.  Since chickens and turkeys do not fly, the breast muscles (which are used in flight) are not used as much as the leg and thigh muscles and do not require as much oxygen.  The oxygen transport mechanism is myoglobin and is present in dissimilar amounts in the muscles which results in the color contrast.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3010", "Why do chickens and turkeys have light and dark meat?", null,
        poultryMeatFacts));

    // Clear
    poultryMeatFacts.clear();
    poultryMeatFacts
      .add(new Fact(
        "20015",
        "Frozen chickens and turkeys should be thawed in the refrigerator.  This prevents all parts of the bird from getting warm enough to encourage the growth of spoilage bacteria before the entire birds is thawed completely.  Depending on the size of the bird, two or three days may be required to complete the thawing process.  If faster thawing is necessary birds can be immersed in cold water.  Directions on the label concerning thawing should be followed.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3011", "How should frozen poultry be thawed?", null,
        poultryMeatFacts));

    // Clear
    poultryMeatFacts.clear();
    poultryMeatFacts
      .add(new Fact(
        "20016",
        "If the chicken is fresh and is properly cooked (to an end point temperature of at least 165 degrees F.) there should be minimal danger.  The bacteria that may be of concern is Salmonella.   There is a possibility that Salmonella could be present on some raw chickens, but as stated earlier, proper cooking eliminates any potential problems.   In addition to proper cooking, another safeguard that should be remembered when preparing all meat items is to carefully wash hands, utensils, and countertops after preparing the meat to avoid cross-contamination to other foods.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3012", "Is there any danger from eating poultry?", null,
        poultryMeatFacts));

    // Clear
    poultryMeatFacts.clear();
    poultryMeatFacts
      .add(new Fact(
        "20017",
        "Salmonella bacteria are spread in fecal material from all kinds of animals.  Animals may also pick up bacteria from the soil or perhaps from contaminated processed feed.  The organisms then live in the intestinal tract of the host and may or may not have an effect on the animal.  As food animals are slaughtered and processed, there are times when some of the bacteria from the intestines have the opportunity to contaminate uncooked meat products.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3013", "Where does Salmonella originate?", null,
        poultryMeatFacts));

    
    Guide poultryMeatFaq = new Guide("4003",
        "Poultry Meat FAQ",
        "Frequently Asked Question about Poultry Meat",
        topics);
    guides.add(poultryMeatFaq);

    topics = new LinkedList<Topic>();
    List<Fact> incubationFacts = new LinkedList<Fact>();

    // Clear
    incubationFacts.clear();
    incubationFacts
      .add(new Fact(
        "20018",
        "The chicks develop from the true egg, seen as a small white spot (germinal disc) on the yolk.  If the egg is fertile and incubated at the correct temperature, cell division will continue.  The egg white protects the developing embryo and offers some nutrition, however, the yolk is the primary nutrition source.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3014", "What part of the egg develops into the baby chicken?", null,
        incubationFacts));

    // Clear
    incubationFacts.clear();
    incubationFacts
      .add(new Fact(
        "20019",
        "No, all eggs have the white spot called the germinal disc. It is almost impossible to determine if an egg is fertile without first incubating it for several hours.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3015", "Does the small white spot on the egg yolk indicate that the egg is fertile?", null,
        incubationFacts));

    // Clear
    incubationFacts.clear();
    incubationFacts
      .add(new Fact(
        "20020",
        "A double yolked egg is not likely to hatch.  An embryo may begin to develop from the germinal disc on both egg yolks, but usually there is not enough room for two chicks or the conditions are not adequate for two embryos and the chicks do not hatch.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3016", "Will twin chicks hatch from a double yolked egg?", null,
        incubationFacts));

    Guide incubationFaq = new Guide("4004",
        "Incubation FAQ",
        "Frequently Asked Question about Incubation",
        topics);
    guides.add(incubationFaq);    

    topics = new LinkedList<Topic>();
    List<Fact> eggFacts = new LinkedList<Fact>();    
    
    // Clear
    eggFacts.clear();
    eggFacts
      .add(new Fact(
        "20021",
        "There is essentially no nutritional difference due to shell color.  White, brown or blue-green eggs from birds being fed similar rations are very similar.  Research has shown that the cholesterol content of eggs is about the same regardless of color and whether or not the egg is fertile.  In simple terms an egg is an egg regardless of the color or whether it is fertile.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3017", "Is there a nutritional difference in eggs with different colors of shells?", null,
        eggFacts));

    // Clear
    eggFacts.clear();
    eggFacts
      .add(new Fact(
        "20022",
        "According to research results, moderate egg consumption will not increase a person’s serum cholesterol and the American Heart Association is now reporting  that there is no evidence to suggest that eating eggs will increase the risk of heart disease in healthy individuals.    In fact, scientists now know that eggs provide several much needed nutrients such as lutein and zeaxanthin which may decrease the possibility of macular degeneration.  Eggs are also an excellent source of folic acid and choline.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3018", "Does eating eggs increase my cholesterol?", null,
        eggFacts));

    
    // Clear
    eggFacts.clear();
    eggFacts
      .add(new Fact(
        "20023",
        "If eggs are properly refrigerated they should remain usable for several weeks.  Most eggs have a 4 week expiration date on the carton.  That means they may be sold up to four weeks after they are placed in the carton and the consumer will still have plenty of time to use them.  Keeping eggs in the carton in the refrigerator will extend the shelf life.  Keeping eggs at a temperature below 40° F, but above freezing and at a high humidity is the ideal way to maximize the shelf life.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3019", "How long will eggs keep?", null,
        eggFacts));

    // Clear
    eggFacts.clear();
    eggFacts
      .add(new Fact(
        "20024",
        "To determine if an egg is fertile, incubate it for a few days and then candle it to see if cell division has begun.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3020", "How can I tell if an egg is fertile?", null,
        eggFacts));

    // Clear
    eggFacts.clear();
    eggFacts
      .add(new Fact(
        "20025",
        "The recent introduction of in-shell pasteurized eggs now provides an extra margin of safety when using raw or undercooked eggs in foods.  To be absolutely safe, only pasteurized eggs should be used when preparing foods that may be undercooked.   Even clean, sound shelled eggs have the possibility of bacterial contamination and should be fully cooked.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3021", "Should I eat foods that may contain uncooked eggs?", null,
        eggFacts));

    // Clear
    eggFacts.clear();
    eggFacts
      .add(new Fact(
        "20026",
        "Eggs can be satisfactorily frozen after mixing the yolk and the albumen.  It may be desirable to freeze the egg mixture in ice trays or muffin tins and then store the frozen eggs in plastic bags.  The frozen eggs can be thawed in the refrigerator and used any where a whole egg is needed.  Three tablespoons of liquid whole egg should be used in place of one large egg.  Egg whites can be frozen satisfactorily and can also be frozen in ice trays or muffin tins.  Yolks on the other hand become very gelatinous when frozen unless they are mixed with salt or sugar.  To help retard the gelation, mix 1/8 teaspoon salt or 1 ½ teaspoons sugar or corn syrup per ¼ cup eggs yolks (4 large yolks).  Freezing in ice trays or muffin tins may also be desirable.  When the egg yolks are used, the recipe should be adjusted to the salt or sugar already in the egg yolks.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3022", "Can eggs be frozen?", null,
        eggFacts));

    // Clear
    eggFacts.clear();
    eggFacts
      .add(new Fact(
        "20027",
        "Blood spots are the result of broken capillaries in the reproductive system.  When the capillary ruptures, a drop of blood leaks out and becomes part of the egg.  The presence of a blood spot does not mean the egg is fertile or that an embryo is  beginning to form.  Egg processors attempt to identify and remove all eggs containing blood spots before eggs go into the carton.  Occasionally one is missed, but if the blood spot is small, it can be removed and the egg used.  For large blood spots the egg should be discarded.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3023", "What causes blood spots in eggs?", null,
        eggFacts));

    // Clear
    eggFacts.clear();
    eggFacts
      .add(new Fact(
        "20028",
        "The stringy white portion of the egg is called the chalazae.  It is there to anchor the yolk in the center of the egg.  The presence of a prominent chalazae is actually an indication that the egg is fresh because as the egg ages the chalazae becomes less noticeable.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3024", "What are the stringy white things in eggs?", null,
        eggFacts));

    // Clear
    eggFacts.clear();
    eggFacts
      .add(new Fact(
        "20029",
        "Eggs that are very fresh are usually more difficult to peal.  As the egg ages the pH changes and the shell is more easily removed.  To improve peelability, start with an egg that is a few days old, hard-cook the egg, then immerse the egg in cold water and peel immediately.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3025", "Why are some hard-cooked eggs difficult to peel?", null,
        eggFacts));

    // Clear
    eggFacts.clear();
    eggFacts
      .add(new Fact(
        "20030",
        "Most recipes are written for large eggs.  Because of that, better results will be obtained by using large eggs in baked products.  If the end use of the eggs is scrambled, fried, poached, hard cooked or a method where volume is not critical, then the size with the least expensive cost per ounce might be the best choice.",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3026", "What size eggs should I purchase?", null,
        eggFacts));

    // Clear
    eggFacts.clear();
    eggFacts
      .add(new Fact(
        "20030",
        "Designer eggs are those eggs produced by flocks of chickens which have been fed special diets in an attempt to modify the nutrition of the eggs they produce.  Consumers should be well informed about the differences in these eggs and all other eggs when making purchasing decisions.  Free range eggs are produced by flocks of chickens which are not confined in cages.  The chickens may be raised on the floor of a poultry house or they may be allowed to roam around outside.  Yolks of free range eggs may be darker because of the chicken’s eating foods that contain more carotenoid pigments (green grass, yellow corn, etc.).",
        true,
        "http://www.ansi.okstate.edu/outreach-extension/poultry/poultry-faqs",
        null, 
        null));
    topics.add(new Topic("3027", "What are designer eggs, free range eggs, etc?", null,
        eggFacts));


    Guide eggFaq = new Guide("4005",
        "All about Eggs",
        "Frequently Asked Question about Eggs",
        topics);
    guides.add(eggFaq);  
    
    return guides;
  }
}
