package park_management;

public class Diplodocus extends Dinosaur {

    
    public Diplodocus (String name, int threatLevel, int hunger){
        super(name, threatLevel, hunger);
        carnivore = false;

    }
}