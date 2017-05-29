package park_management;

import java.util.ArrayList;

public class Park{

  private ArrayList<Enclosure> enclosures;
  private ArrayList<Guest> guests;
  private int entryFee;

  public Park(int entryFee){
    this.enclosures = new ArrayList<Enclosure>();
    this.guests = new ArrayList<Guest>();
    this.entryFee = 25;
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

  public void addNewGuest(Guest guest) {
    this.guests.add(guest);
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



}