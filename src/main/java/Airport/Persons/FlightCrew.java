package Airport.Persons;

import Airport.Operations.Interfaces.IBuyable;

import java.util.ArrayList;

public class FlightCrew extends StaffMember{

    private ArrayList<IBuyable> trolley;

    public FlightCrew (int drunkeness, ArrayList<IBuyable> trolley){
        super(drunkeness);
        this.trolley = trolley;

    }
// to do - can sell items
//    can check ticket matches destination
}
