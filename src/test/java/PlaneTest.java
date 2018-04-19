import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
        passenger1 = new Passenger("Jean Jaques");
        passenger2 = new Passenger("Saddam");
        passenger3 = new Passenger("Osama");
        passenger4 = new Passenger("Stalin");
        ticket1 = new Ticket(Destination.TENERIFE);
        ticket2 = new Ticket(Destination.IBIZA);

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
