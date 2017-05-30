import park_management.*;
import org.junit.*;
import static org.junit.Assert.*;

public class EnclosureTest {

  Enclosure enclosure;
  Dinosaur dinosaur;


  @Test
  public void canAddDinos(){
    Dinosaur blue = new Velociraptor ("Blue", 10, 10);
    Enclosure enclosure = new Enclosure();
    enclosure.addDinosaur(blue);
    assertEquals(1, enclosure.getNumberOfDinos());
  }

  @Test
  public void canRemoveDinos(){
    Dinosaur blue = new Velociraptor ("Blue", 10, 10);
    Enclosure enclosure = new Enclosure();
    enclosure.addDinosaur(blue);
    enclosure.removeDinosaur(blue);
    assertEquals(0, enclosure.getNumberOfDinos());
  }

  @Test
  public void canAddDinosAfterFirst() {
    Enclosure enclosure = new Enclosure();
    Dinosaur blue = new Velociraptor ("Blue", 10, 10);
    Dinosaur alpha = new Velociraptor ("Alpha", 10, 10);
    enclosure.addDinosaur(blue);
    enclosure.addDinosaur(alpha);
    assertEquals(2, enclosure.getNumberOfDinos());
  }

  @Test
  public void canNotAddTrex() {
    Enclosure enclosure = new Enclosure();
    Dinosaur blue = new Velociraptor ("Blue", 10, 10);
    Dinosaur rex = new TRex ("Alex", 5, 20);
    enclosure.addDinosaur(blue);
    enclosure.addDinosaur(rex);
    assertEquals(1, enclosure.getNumberOfDinos());
  }


}