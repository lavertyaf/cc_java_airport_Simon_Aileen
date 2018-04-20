package Airport.Operations.Consumables;

public abstract class Consumable {

    private String name;
    private int drunkpoints;
    private double cost;
    private boolean ageResticted;

    public Consumable(String name, int drunkpoints, double cost, boolean ageResticted){
        this.name = name;
        this.drunkpoints = drunkpoints;
        this.cost = cost;
        this.ageResticted = ageResticted;
    }

    //TODO can be bought
    //TODO can be sold

}