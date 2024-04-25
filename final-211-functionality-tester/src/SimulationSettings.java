import java.util.ArrayList;

public class SimulationSettings {
    public ArrayList<AddPassenger> add_passenger = new ArrayList<>();
    public ArrayList<PassengerRequestPercentage> passenger_request_percentage = new ArrayList<>();
    public ArrayList<AddElevator> add_elevator = new ArrayList<>();
    public ArrayList<ElevatorRequestPercentage> elevator_request_percentage = new ArrayList<>();

    public static int floors;
    public int number_of_elevators;
    public int run_simulation;

    //this is going to be there in case there is no parameteres set
    SimulationSettings() {
        floors = 4;
        number_of_elevators = 2;
        run_simulation = 5;
    }

    SimulationSettings(int _floors){
        floors = _floors;
        number_of_elevators = 2;
        run_simulation = 5;
    }

    SimulationSettings(int _floors, int _number_of_elevators){
        floors = _floors;
        number_of_elevators = _number_of_elevators;
        run_simulation = 5;
    }

    SimulationSettings(int _floors, int _number_of_elevators, int _run_simulation) {
        floors = _floors;
        number_of_elevators = _number_of_elevators;
        run_simulation = _run_simulation;
    }


    @Override
    public String toString() {
        return "Number of floors: "  + getFloors() +"\n" +
                "Number of elevators" + getNumber_of_elevators() + "\n" +
                "Number of times the program will run" + getRun_simulation();
    }


    public static int getFloors() {
        return floors;
    }

    public int getNumber_of_elevators() {return number_of_elevators;}

    public int getRun_simulation() {return run_simulation;}
}
