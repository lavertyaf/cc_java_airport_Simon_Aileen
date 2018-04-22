package Airport.Persons;

import java.util.ArrayList;

import Airport.Operations.Consumables.Coffee;
import Airport.Operations.Consumables.Consumable;
import Airport.Operations.Destination;
import Airport.Operations.Interfaces.IBuyable;
import Airport.Operations.Ticket;
import Airport.Operations.TicketDesk;

public class Passenger extends Person{

    private String name;
    private ArrayList<Ticket> travelWallet;
    private ArrayList<IBuyable> backPack;
    private double wallet;


    public Passenger(int drunkeness, String name){
        super(drunkeness);
        this.name = name;
        this.travelWallet = new ArrayList<>();
        this.backPack = new ArrayList<>();
        this.wallet = wallet;
    }

    public String whatIsName(){
        return this.name;
    }

    public int howManyTicketsInWallet(){
        return this.travelWallet.size();
    }

    public void addATicket(Ticket ticket){
        this.travelWallet.add(ticket);
    }

    public void buyTicket(Destination destination, TicketDesk ticketDesk){
        this.travelWallet.add(ticketDesk.sellATicket(destination));
    }

    public Ticket getPassengerTicket(){
        return travelWallet.get(0);
    }

    public Destination getPassengersTicketDestination(){
        return this.getPassengerTicket().whatIsDestination();
    }

    public int lookInBackpack(){
        return backPack.size();
    }

    public int getBreathalysed(){
        return this.drunkeness;
    }

    public void putThingsInBackPack(Consumable consumable){
        this.backPack.add((IBuyable) consumable);
    }


}

