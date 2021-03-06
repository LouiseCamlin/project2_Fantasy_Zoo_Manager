package park_management;
import java.util.ArrayList;
import java.util.HashMap;

public class Enclosure {

    private HashMap<String, Dinosaur> dinosaurs;
    private String enclosureType;
    private ArrayList<Edible> food;

    public Enclosure() {
        this.dinosaurs = new HashMap<String, Dinosaur>();
        this.food = new ArrayList<Edible>();
    }


    public HashMap<String, Dinosaur> getDinosaurs(){
        return this.dinosaurs;
    }

    public int getNumberOfDinos() {
        return this.dinosaurs.size();
    }

    public void removeDinosaur(Dinosaur dinosaur){
        this.dinosaurs.remove(dinosaur.getName(), dinosaur);
    }

    public void addDinosaur(Dinosaur newDinosaur){
        if(this.dinosaurs.size() == 0) {
            dinosaurs.put(newDinosaur.getName(), newDinosaur);
            enclosureType = newDinosaur.getClass().getName();
            return;
        }
        if (newDinosaur.getClass().getName() == enclosureType) {
            dinosaurs.put(newDinosaur.getName(), newDinosaur);
        } else {
            System.out.println("Only dinosaurs of a similar type can be added to an enclosure");
        }
    }

    public void getFood(Edible edible ) {
        this.food.add(edible);
    }

    public int foodLevel() {
        return this.food.size();
    }

    public void feedDinosaur(Edible goat, Edible plant, Dinosaur dinosaur) {
        if (food.size() == 0) {
            System.out.println("There is no food available");
            return;
        }
        if (dinosaur.getStatus() == true) {
            this.food.remove(goat);
        } else {
            this.food.remove(plant);
        }
        
    }

    


}

