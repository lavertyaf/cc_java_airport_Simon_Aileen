package Airport.Operations;

import Airport.Airport;
import Airport.Operations.Destination;

public class Ticket {

    private Destination destination;

    public Ticket(Destination destination){
        this.destination = destination;
    }

    public Destination whatIsDestination(){
        return this.destination;
    }
}
