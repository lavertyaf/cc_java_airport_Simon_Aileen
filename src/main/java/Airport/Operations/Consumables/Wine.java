package Airport.Operations.Consumables;

import Airport.Operations.Interfaces.IBuyable;

public class Wine extends Consumable implements IBuyable{

    Wine (String name, int drunkpoints, double cost, boolean ageRestricted){
        super(name, drunkpoints, cost, ageRestricted);
    }

    public double getCost() {
        return this.cost;
    }
}
