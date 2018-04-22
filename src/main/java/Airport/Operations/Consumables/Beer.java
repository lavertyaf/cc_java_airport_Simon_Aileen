package Airport.Operations.Consumables;

import Airport.Operations.Interfaces.IBuyable;

public class Beer extends Consumable implements IBuyable {

    public Beer(String name, int drunkpoints, double cost, boolean ageRestricted) {
        super(name, drunkpoints, cost, ageRestricted);
    }

    public double getCost() {
        return this.cost;
    }
}
