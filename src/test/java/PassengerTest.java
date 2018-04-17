import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Ticket ticket1;
    Ticket ticket2;
    TicketDesk ticketDesk;


    @Before
    public void before(){
        passenger1 = new Passenger("Simon");
        passenger2 = new Passenger( "Aileen");
        ArrayList<Ticket> tickets = new ArrayList<>();
        ticket1 = new Ticket(Destination.MAGALUF);
        ticket2 = new Ticket(Destination.IBIZA);
        tickets.add(ticket1);
        tickets.add(ticket2);
        ticketDesk = new TicketDesk(tickets);

    }

    @Test
    public void passengerHasName(){
        assertEquals("Simon", passenger1.whatIsName());
    }

    @Test
    public void travelWalletIsEmpty(){
        assertEquals(0, passenger2.howManyTicketsInWallet());
    }


    @Test
    public void canBuyTicketFromTicketDesk(){
        passenger1.buyTicket(Destination.MAGALUF, ticketDesk);
        assertEquals(1, ticketDesk.howManyTicketsAreLeft());
        assertEquals(1, passenger1.howManyTicketsInWallet());
    }


}
