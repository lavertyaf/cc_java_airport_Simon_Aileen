import Airport.Operations.Destination;
import Airport.Operations.Plane;
import Airport.Operations.Ticket;
import Airport.Operations.TicketDesk;
import Airport.Persons.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;
    Plane plane3;
    Plane plane4;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    TicketDesk ticketDesk;
    Ticket ticket1;
    Ticket ticket2;

    @Before
    public void before(){
        plane1 = new Plane(3, Destination.TENERIFE);
        plane2 = new Plane(4, Destination.IBIZA);
        plane3 = new Plane(3, Destination.MAGALUF);
        plane4 = new Plane(5, Destination.BENIDORM);
        passenger1 = new Passenger(2,"Jean Jaques");
        passenger2 = new Passenger(4,"Saddam");
        passenger3 = new Passenger(7,"Osama");
        passenger4 = new Passenger(1,"Stalin");
        ticket1 = new Ticket(Destination.TENERIFE, 85.00);
        ticket2 = new Ticket(Destination.IBIZA, 90.00);

    }

    @Test
    public void canReceivePassenger(){
        plane1.addAPassenger(passenger1);
        assertEquals(1, plane1.getPassengerList().size());
    }

    @Test
    public void capacityCannotBeExceeded(){
        plane1.addAPassenger(passenger1);
        plane1.addAPassenger(passenger2);
        plane1.addAPassenger(passenger3);
        plane1.addAPassenger(passenger4);
        assertEquals(3, plane1.getPassengerList().size());
    }

    @Test
    public void canRemoveAPassenger(){
        plane1.addAPassenger(passenger1);
        plane1.addAPassenger(passenger2);
        plane1.removeAPassenger(passenger1);
        assertEquals(1, plane1.getPassengerList().size());
    }

    @Test
    public void getCapacity() {
        assertEquals(3, plane1.getCapacity());
    }

    @Test
    public void getDestination() {
        assertEquals(Destination.TENERIFE, plane1.getDestination());
    }

    @Test
    public void getPassengerList() {
        assertEquals(0, plane1.getPassengerList().size());
    }

    @Test
    public void checkPassengerHasTicketForThisPlane__True(){
        passenger1.addATicket(ticket1);
        assertEquals(true, plane1.checkPassengerHasTicket(passenger1));
    }

    @Test
    public void checkPassengerHasTicketForThisPlane__False(){
        passenger1.addATicket(ticket2);
        assertEquals(false, plane1.checkPassengerHasTicket(passenger1));
    }


}
