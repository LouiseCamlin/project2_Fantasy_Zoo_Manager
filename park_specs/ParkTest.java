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
  Guest guest5;

  @Before
  public void before(){
    guest1 = new Guest("Irma", 50);
    guest2 = new Guest("Liam", 30);
    guest3 = new Guest("Paddy", 43);
    guest4 = new Guest("Louise", 25);
    guest5 = new Guest("Paul", 5);
    park = new Park(25, 0);
  }


  @Test
  public void canAddEnclosure(){
    Enclosure enclosure = new Enclosure();
    park.addNewEnclosure(enclosure);
    assertEquals(1, park.enclosureCount());
  }

  @Test
  public void canEmptyEnclosure(){
    Enclosure enclosure = new Enclosure();
    park.addNewEnclosure(enclosure);
    park.addNewEnclosure(enclosure);
    assertEquals(2, park.enclosureCount());
    park.emptyEnclosure();
    assertEquals(0, park.enclosureCount());
  }

  @Test
  public void canAddGuests() {
    park.addNewGuest(guest1);
    assertEquals(1, park.guestsCount());
  }

  @Test
  public void canHaveMoreThanOneGuest() {
    park.addNewGuest(guest1);
    park.addNewGuest(guest2);
    park.addNewGuest(guest3);
    park.addNewGuest(guest4);
    assertEquals(4, park.guestsCount());
  }

  @Test
  public void canRemoveGuestByIndex() {
    park.addNewGuest(guest1);
    park.addNewGuest(guest2);
    park.removeGuest(1);
  }

  @Test 
  public void canEvacuatePark() {
    park.addNewGuest(guest1);
    park.addNewGuest(guest2);
    park.addNewGuest(guest3);
    park.addNewGuest(guest4);
    assertEquals(4, park.guestsCount());
    park.evacuate();
    assertEquals(0, park.guestsCount());
  }

  @Test
  public void canGetEntryFee() {
    assertEquals(25, park.getEntryFee());
  }

  @Test
  public void poorPeopleCannotEnter() {
    park.addNewGuest(guest5);
    assertEquals(0, park.guestsCount());
  }

  @Test
  public void canTakeMoneyFromCustomers() {
    park.takeMoney(25);
    assertEquals(25, park.getProfit());
  }





}