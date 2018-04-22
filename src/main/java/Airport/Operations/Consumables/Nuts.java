package Airport.Operations.Consumables;

import Airport.Operations.Interfaces.IBuyable;

public class Nuts extends Consumable implements IBuyable{

    public Nuts(String name, int drunkPoints, double cost, boolean ageRestricted){
        super(name, drunkPoints, cost, ageRestricted);
    }

    public double getCost() {
        return this.cost;
    }
}
