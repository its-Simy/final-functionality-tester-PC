public abstract class Passenger {


    protected String passangerType;
    protected int passenger_percent_request;
    private int startFloor;
    private int destinationFloor;
    public abstract boolean requestElevator(direction _direction, SimulationSettings _settings);

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

    public String getPassangerType() {
        return passangerType;
    }
}



