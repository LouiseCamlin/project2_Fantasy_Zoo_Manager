import park_management.*;
import org.junit.*;
import static org.junit.Assert.*;

public class EnclosureTest {

  Enclosure enclosure;
  Dinosaur dinosaur;
  Dinosaur blue;
  Dinosaur delta;
  Dinosaur rex;
  Edible edible;
  Goat goat;
  Plant plant;

  @Before
  public void before() {
    blue = new Velociraptor ("Blue", 10, 10);
    delta = new Velociraptor("Delta", 9, 9);
    rex = new TRex("Rexxy", 12, 10);
    enclosure = new Enclosure();
  }


  @Test
  public void canAddDinos(){
    enclosure.addDinosaur(blue);
    assertEquals(1, enclosure.getNumberOfDinos());
  }

  @Test
  public void canRemoveDinos(){
    enclosure.addDinosaur(blue);
    enclosure.removeDinosaur(blue);
    assertEquals(0, enclosure.getNumberOfDinos());
  }

  @Test
  public void canAddDinosAfterFirst() {
    enclosure.addDinosaur(blue);
    enclosure.addDinosaur(delta);
    assertEquals(2, enclosure.getNumberOfDinos());
  }

  @Test
  public void canNotAddTrex() {
    enclosure.addDinosaur(blue);
    enclosure.addDinosaur(rex);
    assertEquals(1, enclosure.getNumberOfDinos());
  }

  @Test
  public void enclosureCanAddFood(){
    enclosure.getFood(edible);
    assertEquals(1, enclosure.foodLevel());
  }

  @Test
  public void canFeedDinosaur() {
    enclosure.getFood(goat);
    enclosure.getFood(plant);
    enclosure.feedDinosaur(goat, plant, blue);
    assertEquals(1, enclosure.foodLevel());
  }


}