import java.util.ArrayList;

public class Passenger {

    private String name;
    private ArrayList<Ticket> travelWallet;

    public Passenger(String name){
        this.name = name;
        this.travelWallet = new ArrayList<>();
    }

    public String whatIsName(){
        return this.name;
    }

    public int howManyTicketsInWallet(){
        return this.travelWallet.size();
    }

    public void buyTicket(Destination destination, TicketDesk ticketDesk){
        this.travelWallet.add(ticketDesk.sellATicket(destination));
    }

    public Destination getPassengersTicketDestination(Ticket ticket){
        return Destination.values;
    }


}

