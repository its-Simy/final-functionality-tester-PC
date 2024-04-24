public abstract class Passenger {


    protected String passangerType;
    protected int passenger_percent_request;
    private int startFloor;
    private int destinationFloor;

    public void setStartFloor(int startFloor) {
        this.startFloor = startFloor;
    }

    public int getStartFloor() {
        return startFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }
}

//i should make an arraylist of passenger objects, that has one standard and one express person on each floor
//then the elevator is going to contain its own arraylist

