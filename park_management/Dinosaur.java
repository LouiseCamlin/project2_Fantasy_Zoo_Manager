package park_management;

import java.util.ArrayList;


public abstract class Dinosaur{

  private String name;
  private int threatLevel;
  private int hunger;
  private ArrayList<Edible> belly;
  public boolean carnivore;


  public Dinosaur (String name, int threatLevel, int hunger){
      this.name = name;
      this.threatLevel = threatLevel;
      this.hunger = hunger;
      this.belly = new ArrayList<Edible>();
  }

  public String getName(){
      return this.name;
  }

  public int getThreatLevel(){
      return this.threatLevel;
  }

  public int getHunger(){
      return this.hunger;
  }

  public void eatPlant(Plant plant){
    if(carnivore == false){
      belly.add(plant);
    } else {
      System.out.println("this Dinosaur doesn't eat plants!");
    }
  }

  public void eatGoat(Goat goat){
    if(carnivore == true){
      belly.add(goat);
    } else {
      System.out.println("this Dinosaur is a vegetarian");
    }
  }

  public void eatGuest(Guest guest){
    if(carnivore == true){
      belly.add(guest);
    } else {
      System.out.println("this Dinosaur is a vegetarian");
    }
  }

  public int foodCount(){
    return this.belly.size();
  }

  public void poop() {
    this.belly.clear();
  }



  




}