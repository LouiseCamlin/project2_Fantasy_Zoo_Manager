package park_management;

public class Velociraptor extends Dinosaur {

    
  public Velociraptor (String name, int threatLevel, int hunger){
    super(name, threatLevel, hunger);
    carnivore = true; 
  }

  // @Override
  // public boolean eat(Edible food){
  //   if (carnivore == true) {
  //     super.eat(food);
  //     return true;
  //   } else {
  //     return false;
  //   }
  // }

}