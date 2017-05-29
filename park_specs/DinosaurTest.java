import park_management.*;
import org.junit.*;
import static org.junit.Assert.*;

public class DinosaurTest {

  Dinosaur dinosaur;
  TRex tRex;
  Diplodocus diplodocus;
  Plant plant;
  Guest guest;

  @Before
  public void before(){
    diplodocus = new Diplodocus("Lippy", 2, 5);
    tRex = new TRex("Rexy", 10, 10);
  }


  @Test
  public void canGetName(){
    assertEquals("Lippy", diplodocus.getName());
  }

  @Test
  public void canGetThreatLevel(){
    assertEquals(2, diplodocus.getThreatLevel());
  }

  @Test
  public void canGetHunger(){
    assertEquals(10, tRex.getHunger());
  }

  @Test
  public void canEatGuest(){
    tRex.eatGuest(guest);
    assertEquals(1, tRex.foodCount());

  }

  @Test
  public void canNotEatGuest(){
    diplodocus.eatGuest(guest);
    assertEquals(0, diplodocus.foodCount());
  }

 

}