import Airport.Operations.Destination;
import Airport.Operations.Ticket;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {

    Ticket ticket1;
    Ticket ticket2;

    @Before
    public void before(){
        ticket1 = new Ticket(Destination.MAGALUF, 70.00);
        ticket2 = new Ticket(Destination.IBIZA,150.00);
    }

    @Test
    public void ticketHasDestination(){
        assertEquals("Ibiza", ticket2.whatIsDestination().getDestination());
    }

}
