package park_management;

import java.util.ArrayList;

public class Park{

  private ArrayList<Enclosure> enclosures;
  private ArrayList<Guest> guests;

  public Park(){
    this.enclosures = new ArrayList<Enclosure>();
    this.guests = new ArrayList<Guest>();
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



}