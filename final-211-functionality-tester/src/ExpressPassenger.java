import java.util.ArrayList;

public class ExpressPassenger extends Passenger{

    /*
    public ExpressPassenger(){
        passangerType = "Express";
        passenger_percent_request = 30;
    }
    */


    @Override
    public boolean requestElevator(direction _direction, SimulationSettings _settings) {
        return false;
    }
}