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

  public int getFunds(){
    return this.funds;
  }

  public int payEntryFee(int newFunds){
    return this.funds -= newFunds;
  }


  
}