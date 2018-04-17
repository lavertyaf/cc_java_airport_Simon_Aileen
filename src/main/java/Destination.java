public enum Destination {

    TENERIFE("Tenerife"),
    IBIZA("Ibiza"),
    BENIDORM("Benedorm"),
    MAGALUF("Magaluf");

    private final String destination;


    Destination(String destination) {
        this.destination = destination;
    }

    public String getDestination(){
        return destination;
    }
}
