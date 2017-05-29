package park_management;

public class Guest implements Edible {

  private String name;
  private int funds;

  public Guest(String name, int funds) {
    this.name = name;
    this.funds = funds;
  }

  public String guestName(){
    return this.name;
  }


  
}