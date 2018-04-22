package Airport.Operations.Consumables;

import Airport.Operations.Interfaces.IBuyable;

public class Coffee extends Consumable implements IBuyable{

    public Coffee(String name, int drunkPoints, double cost, boolean ageRestricted){
        super(name, drunkPoints, cost, ageRestricted);
    }

    public double getCost() {
        return this.cost;
    }

}
