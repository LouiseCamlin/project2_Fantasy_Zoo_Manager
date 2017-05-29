package park_management;

public class TRex extends Dinosaur {

    
    public TRex (String name, int threatLevel, int hunger){
        super(name, threatLevel, hunger);
        this.carnivore = true;

    }
}