package park_management;

import java.util.ArrayList;

public class Park{

  private ArrayList<Enclosure> enclosures;
  private ArrayList<Guest> guests;
  private int entryFee;
  private int profit;

  public Park(int entryFee, int profit){
    this.enclosures = new ArrayList<Enclosure>();
    this.guests = new ArrayList<Guest>();
    this.entryFee = 25;
    this.profit = 0;
  }

  public int enclosureCount(){
    return this.enclosures.size();
  }

  public void addNewEnclosure(Enclosure enclosure) {
    this.enclosures.add(enclosure);
  }

  public void emptyEnclosure() {
    this.enclosures.clear();
  }

  public void addNewGuest(Guest guest, Park park) {
    if (guest.getFunds() >= this.entryFee) {
      guest.payEntryFee(entryFee);
      park.takeMoney(entryFee);
      this.guests.add(guest);
    } else {
      System.out.println("Sorry, " + guest.guestName() + " you don't have enough money for entry");
    }
  }

  public int guestsCount() {
    return this.guests.size();
  }

  public void removeGuest(int guest) {
    this.guests.remove(0);
  }

  public void evacuate() {
    this.guests.clear();
  }

  public int getEntryFee(){
    return this.entryFee;
  }

  public int getProfit(){
    return this.profit;
  }

  public int takeMoney(int newProfit) {
    return this.profit += newProfit;
  }





}