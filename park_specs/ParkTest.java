import park_management.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ParkTest {

  Park park;
  Enclosure enclosures;
  Guest guests;



  @Test
  public void canAddEnclosure(){
    Park park = new Park();
    Enclosure enclosure = new Enclosure();
    park.addNewEnclosure(enclosure);
    assertEquals(1, park.enclosureCount());
  }

  @Test
  public void canEmptyEnclosure(){
    Park park = new Park();
    Enclosure enclosure = new Enclosure();
    park.addNewEnclosure(enclosure);
    park.addNewEnclosure(enclosure);
    assertEquals(2, park.enclosureCount());
    park.emptyEnclosure();
    assertEquals(0, park.enclosureCount());
  }

  @Test
  public void canAddGuests() {
    Park park = new Park();
    Guest guest = new Guest();
    park.addNewGuest(guest);
    assertEquals(1, park.guestsCount());
  }



}