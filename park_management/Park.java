package park_management;

import java.util.ArrayList;

public class Park{

  private ArrayList<Enclosure> enclosures;

  public Park(){
    this.enclosures = new ArrayList<Enclosure>();
  }

  public int enclosureCount(){
    return this.enclosures.size();
  }

  public void addNewEnclosure(Enclosure enclosure) {
    enclosures.add(enclosure);
  }



}