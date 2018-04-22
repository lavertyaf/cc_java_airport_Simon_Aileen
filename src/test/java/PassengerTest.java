import Airport.Operations.Consumables.Coffee;
import Airport.Operations.Consumables.Sandwich;
import Airport.Operations.Destination;
import Airport.Operations.Ticket;
import Airport.Operations.TicketDesk;
import Airport.Persons.Passenger;
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
    Coffee coffee1;
    Sandwich sandwich1;


    @Before
    public void before(){
        passenger1 = new Passenger(2,"Simon");
        passenger2 = new Passenger( 2, "Aileen");
        ArrayList<Ticket> tickets = new ArrayList<>();
        ticket1 = new Ticket(Destination.MAGALUF, 160.00);
        ticket2 = new Ticket(Destination.IBIZA, 140.00);
        tickets.add(ticket1);
        tickets.add(ticket2);
        ticketDesk = new TicketDesk(tickets);
        coffee1 = new Coffee("latte", -5, 3.00, false);
        sandwich1 = new Sandwich("BLT", -3, 3.50, false);

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

    @Test
    public void getPassengerTicket(){
        passenger1.buyTicket(Destination.MAGALUF,ticketDesk);
        assertEquals(ticket1, passenger1.getPassengerTicket());
    }

    @Test
    public void getPassengersTicketDestination(){
        passenger1.buyTicket(Destination.IBIZA, ticketDesk);
        assertEquals("Ibiza", passenger1.getPassengersTicketDestination().getDestination());
    }

    @Test
    public void backpackStartsEmpty(){
        assertEquals(0, passenger1.lookInBackpack());
    }

    @Test
    public void checkPassengerDrunkeness(){
        assertEquals(2, passenger1.getBreathalysed());
    }

    @Test
    public void backPackCanTakeConsumables(){
        passenger1.putThingsInBackPack(coffee1);
        passenger1.putThingsInBackPack(sandwich1);
        assertEquals(2, passenger1.lookInBackpack());
    }

    @Test
    public void canBuyConsumables(){

    }

}
