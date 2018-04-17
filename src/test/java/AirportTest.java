import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void before() {
        plane1 = new Plane(5, Destination.IBIZA);
        plane2 = new Plane(4, Destination.TENERIFE);
        plane3 = new Plane(3, Destination.MAGALUF);
        ArrayList<Plane> fleet = new ArrayList<>();
        fleet.add(plane1);
        fleet.add(plane2);
        fleet.add(plane3);
        airport = new Airport("JFK", fleet, 5);
    }

    @Test
    public void doesAirportHaveName(){
        assertEquals("JFK", airport.getName());
    }

    @Test
    public void howManyPlanesInFleet(){
        assertEquals(3, airport.getNumberOfPlanesInFleet());
    }

}



