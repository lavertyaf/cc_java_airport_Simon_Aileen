import Airport.Operations.Destination;
import Airport.Operations.Ticket;
import Airport.Operations.TicketDesk;
import Airport.Persons.Passenger;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TicketDeskTest {

    Ticket ticket1;
    Ticket ticket2;
    Passenger passenger1;
    TicketDesk ticketDesk;

    @Before
    public void before(){
    ticket1 = new Ticket(Destination.IBIZA);
    ticket2 = new Ticket(Destination.TENERIFE);
    ArrayList<Ticket> tickets = new ArrayList<>();
    tickets.add(ticket1);
    tickets.add(ticket2);
    ticketDesk = new TicketDesk(tickets);
    passenger1 = new Passenger("Paul");
    }

    @Test
    public void canSellATicket() {
        ticketDesk.sellATicket(Destination.IBIZA);
        assertEquals(1, ticketDesk.howManyTicketsAreLeft());
    }
}
