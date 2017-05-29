import park_management.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ParkTest {

  Park park;
  Enclosure enclosures;
  Guest guest1;
  Guest guest2;
  Guest guest3;
  Guest guest4;

  @Before
  public void before(){
    guest1 = new Guest("Irma", 50);
    guest2 = new Guest("Liam", 20);
    guest3 = new Guest("Paddy", 43);
    guest4 = new Guest("Louise", 25);
  }


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
    park.addNewGuest(guest1);
    assertEquals(1, park.guestsCount());
  }

  @Test
  public void canHaveMoreThanOneGuest() {
    Park park = new Park();
    park.addNewGuest(guest1);
    park.addNewGuest(guest2);
    park.addNewGuest(guest3);
    park.addNewGuest(guest4);
    assertEquals(4, park.guestsCount());
  }

  @Test
  public void canRemoveGuestByIndex() {
    Park park = new Park();
    park.addNewGuest(guest1);
    park.addNewGuest(guest2);
    park.removeGuest(1);
  }

  @Test 
  public void canEvacuatePark() {
    Park park = new Park();
    park.addNewGuest(guest1);
    park.addNewGuest(guest2);
    park.addNewGuest(guest3);
    park.addNewGuest(guest4);
    assertEquals(4, park.guestsCount());
    park.evacuate();
    assertEquals(0, park.guestsCount());
  }



}