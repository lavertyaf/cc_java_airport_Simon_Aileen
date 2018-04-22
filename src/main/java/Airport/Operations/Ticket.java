package Airport.Operations;

import Airport.Airport;
import Airport.Operations.Destination;
import Airport.Operations.Interfaces.IBuyable;

public class Ticket implements IBuyable{

    private Destination destination;
    private double cost;

    public Ticket(Destination destination, double cost){
        this.destination = destination;
        this.cost = cost;
    }

    public Destination whatIsDestination(){
        return this.destination;
    }

    public double getCost() {
        return this.cost;
    }
}
