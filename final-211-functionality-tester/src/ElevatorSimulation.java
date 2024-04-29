import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ElevatorSimulation {
    SimulationSettings _simulationSettings = new SimulationSettings();
    public boolean initSimulation(String fileName) throws IOException {
        _simulationSettings =  readsettingsContent(fileName);
        runSimulation(_simulationSettings);
        return true;
    }
    public SimulationSettings readsettingsContent(String fileName) throws IOException {
        SimulationSettings _currentSettings = new SimulationSettings();
        ///Users/simon/Desktop/final-functionality-tester-PC/final-211-functionality-tester/src/
        FileManipulator fileManipulator = new FileManipulator("\\Users\\Owner\\Desktop\\final-functionality-tester\\final-211-functionality-tester\\src\\settings.txt");
        _currentSettings =  fileManipulator.readSettingsInformation(fileName);
        return _currentSettings;
    }
    public boolean runSimulation(SimulationSettings _simulationSettings){

        //This will add the elevators to the Building class arraylist BuildingElevators
        for (int i = 0; i < _simulationSettings.number_of_elevators; i++){
            if(i % 2 == 0){
                ExpressElevator EE = new ExpressElevator();
                Building.BuildingElevators.add(EE);
            }
            else{
                StandardElevator SE = new StandardElevator();
                Building.BuildingElevators.add(SE);
            }
        }

        for (int i = 0; i < _simulationSettings.floors; i++){
            //creates standard passenger and  express passenger
            StandardPassenger SP = new StandardPassenger();
            ExpressPassenger EP = new ExpressPassenger();

            //This will add each one into the waiting queue
            // passengers are still waiting for an elevator
            Floor.waitQueue.add(SP);
            Floor.waitQueue.add(EP);
        }

for(int i = 0; i < _simulationSettings.run_simulation; i++){

}

        return true;
    }

    //this decides if the person is able to request an elevator
    public boolean MoveDecider(Passenger passenger){
        Random rand = new Random();
        double percent = rand.nextInt(101);
        //Checks if a passenger request percentage is less that or equal to 60
        //this is used to see if it qualifies for standard elevator
        passenger.getPassangerType();
        if(percent <= 60){
            return false;
        }

        return true;
    }





    @Override
    public String toString() {
        return super.toString();
    }
}
