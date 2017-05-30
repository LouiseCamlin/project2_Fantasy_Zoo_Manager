import park_management.*;
import org.junit.*;
import static org.junit.Assert.*;

public class GuestTest {

  Guest guest1;
  Guest guest2;
  Guest guest3;

  @Before
  public void before() {
    guest1 = new Guest("Irma", 50);
    guest2 = new Guest("Liam", 20);
    guest3 = new Guest("Paddy", 43);
  }

  @Test
  public void canGetGuestName(){
    assertEquals("Irma", guest1.guestName());
  }

  @Test 
  public void canGetfunds(){
    assertEquals(43, guest3.getFunds());
  }

  @Test
  public void canSetfunds(){
    guest1.payEntryFee(25);
    assertEquals(25, guest1.getFunds());
  }


}