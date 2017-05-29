package park_management;
import java.util.ArrayList;
import java.util.HashMap;

public class Enclosure {

   private HashMap<String, Dinosaur> dinosaurs;

   public Enclosure(){
    dinosaurs = new HashMap<String, Dinosaur>();
   }

   public HashMap<String, Dinosaur> getDinosaurs(){
    return dinosaurs;
   }

   public void addDinosaur(Dinosaur dinosaur){
    dinosaurs.put(dinosaur.getName(), dinosaur);
   }

   public void removeDinosaur(Dinosaur dinosaur){
    dinosaurs.remove(dinosaur.getName(), dinosaur);
   }
} 