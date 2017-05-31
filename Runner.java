import park_management.*;

public class Runner {

  public static void main(String[] args) {

    Park park = new Park(25, 0);
    Enclosure tRexEnclosure = new Enclosure();
    Enclosure raptorEnclosure = new Enclosure();
    Enclosure dipEnclosure = new Enclosure();
    Dinosaur velo1 = new Velociraptor("Blue", 10, 10);
    Dinosaur velo2 = new Velociraptor("Delta", 9, 9);
    Dinosaur trex = new TRex("Rexxy", 12, 10);
    Dinosaur dipp = new Diplodocus("Dippy", 2, 5);
    Edible goat1 = new Goat();
    Edible goat2 = new Goat();
    Edible leaves = new Plant();
    Guest guest1 = new Guest("Matthew", 50);
    Guest guest2 = new Guest("Harrison", 30);
    Guest guest3 = new Guest("Sian", 43);
    Guest guest5 = new Guest("Paul", 5);


    park.addNewEnclosure(tRexEnclosure);
    park.addNewEnclosure(raptorEnclosure);
    park.addNewEnclosure(dipEnclosure);

    tRexEnclosure.addDinosaur(trex);
    raptorEnclosure.addDinosaur(velo2);
    raptorEnclosure.addDinosaur(velo1);
    dipEnclosure.addDinosaur(dipp);

    System.out.println("");
    System.out.println("Welcome to 'Miss Louise's Non Copyright Infringing Park for Jurrassic Type Creatures!'");
    System.out.println("");
    System.out.println("Entry fee is " + park.getEntryFee() + " pounds");

    park.addNewGuest(guest1, park);
    park.addNewGuest(guest2, park);
    park.addNewGuest(guest3, park);
    park.addNewGuest(guest5, park);

    System.out.println("There are " + park.guestsCount() + " guests in the park");
    System.out.println("Park profit: " + park.getProfit() + " pounds");
  
    System.out.println("");
    System.out.println("There are " + park.getEnclosures().size() + " dinosaur enclosures and they contain:");
    System.out.println(tRexEnclosure.getNumberOfDinos() + " Tyrannosaurus Rex - " + trex.getName());
    System.out.println(raptorEnclosure.getNumberOfDinos() +" Velociraptor - " + velo1.getName() + ", " + velo2.getName());
    System.out.println(dipEnclosure.getNumberOfDinos() + " Diplodocus -  " + dipp.getName());


    System.out.println("");
    trex.rampage(guest1, park);
    System.out.println("EVACUATE!");
    park.evacuate();
    System.out.println("There are " + park.guestsCount() + " guests left in the park");








  }






}