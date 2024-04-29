import java.util.ArrayList;

public class StandardPassenger extends Passenger{


/*
    public StandardPassenger(){
        passangerType = "Standard";
        passenger_percent_request = 70;

    }
*/
    @Override
    public boolean requestElevator(direction _direction, SimulationSettings _settings) {

        return false;
    }
}