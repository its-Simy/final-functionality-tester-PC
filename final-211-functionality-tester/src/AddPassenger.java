public class AddPassenger {
    protected String passengerType;
    protected int startingFloor;
    protected int destinationFloor;
    protected int passengerRequestPercentage;


    public AddPassenger(){
        passengerType = "Standard";
        startingFloor = 1;
        destinationFloor = 1;
        passengerRequestPercentage = 20;
    }

    AddPassenger(String _passengerType) {
        passengerType = _passengerType;
        startingFloor = 1;
        destinationFloor = 1;
        passengerRequestPercentage = 20;

    }

    AddPassenger(String _passengerType, int _startingFloor) {
        passengerType = _passengerType;
        startingFloor = _startingFloor;
        destinationFloor = 1;
        passengerRequestPercentage = 20;
    }

    AddPassenger(String _passengerType, int _startingFloor, int _destinationFloor) {
        passengerType = _passengerType;
        startingFloor = _startingFloor;
        destinationFloor = _destinationFloor;
        passengerRequestPercentage = 20;
    }

    AddPassenger(String _passengerType, int _startingFloor, int _destinationFloor, int _passengerRequestPercentage){
        passengerType = _passengerType;
        startingFloor = _startingFloor;
        destinationFloor = _destinationFloor;
        passengerRequestPercentage = _passengerRequestPercentage;
    }



}
