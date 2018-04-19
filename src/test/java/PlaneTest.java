import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    TicketDesk ticketDesk;
    Ticket ticket1;
    Ticket ticket2;

    @Before
    public void before(){
        plane = new Plane(3, Destination.TENERIFE);
        passenger1 = new Passenger("Jean Jaques");
        passenger2 = new Passenger("Saddam");
        passenger3 = new Passenger("Osama");
        passenger4 = new Passenger("Stalin");
        ticket1 = new Ticket(Destination.TENERIFE);
        ticket2 = new Ticket(Destination.IBIZA);

    }

    @Test
    public void canReceivePassenger(){
        plane.addAPassenger(passenger1);
        assertEquals(1, plane.getPassengerList().size());
    }

    @Test
    public void capacityCannotBeExceeded(){
        plane.addAPassenger(passenger1);
        plane.addAPassenger(passenger2);
        plane.addAPassenger(passenger3);
        plane.addAPassenger(passenger4);
        assertEquals(3, plane.getPassengerList().size());
    }

    @Test
    public void canRemoveAPassenger(){
        plane.addAPassenger(passenger1);
        plane.addAPassenger(passenger2);
        plane.removeAPassenger(passenger1);
        assertEquals(1, plane.getPassengerList().size());
    }

    @Test
    public void getCapacity() {
        assertEquals(3, plane.getCapacity());
    }

    @Test
    public void getDestination() {
        assertEquals(Destination.TENERIFE, plane.getDestination());
    }

    @Test
    public void getPassengerList() {
        assertEquals(0, plane.getPassengerList().size());
    }

    @Test
    public void checkPassengerHasTicketForThisPlane__True(){
        passenger1.addATicket(ticket1);
        assertEquals(true, plane.checkPassengerHasTicket(passenger1));
    }

    @Test
    public void checkPassengerHasTicketForThisPlane__False(){
        passenger1.addATicket(ticket2);
        assertEquals(false, plane.checkPassengerHasTicket(passenger1));
    }
}
