import java.io.IOException;
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
        //Read Information from file. Please use the FileManipulator provided in the previous class
        FileManipulator fileManipulator = new FileManipulator("/Users/simon/Desktop/final-functionality-tester-PC/final-211-functionality-tester/src/");
        _currentSettings =  fileManipulator.readSettingsInformation(fileName);
        return _currentSettings;
    }
    public boolean runSimulation(SimulationSettings _simulationSettings){
        Random rand = new Random();
        double percent = rand.nextDouble();
        if(percent <= 0.6){

        }
        else {
            
        }
for(int i =0; i< _simulationSettings.run_simulation; i++){

}

        return true;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
