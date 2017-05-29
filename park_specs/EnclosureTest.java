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
  assertEquals(1, enclosure.getDinosaurs().size());
  }

  @Test
  public void canRemoveDinos(){
  Dinosaur blue = new Velociraptor ("Blue", 10, 10);
  Enclosure enclosure = new Enclosure();
  enclosure.addDinosaur(blue);
  enclosure.removeDinosaur(blue);
  assertEquals(0, enclosure.getDinosaurs().size());
  }


}