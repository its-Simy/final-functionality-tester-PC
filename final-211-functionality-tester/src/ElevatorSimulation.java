
public class ElevatorSimulation {
    SimulationSettings _simulationSettings = new SimulationSettings();
    public boolean initSimulation(String fileName){
        _simulationSettings =  readsettingsContent(fileName);
        runSimulation(_simulationSettings);
        return true;
    }
    private SimulationSettings readsettingsContent(String fileName){
        SimulationSettings _currentSettings = new SimulationSettings();
        //Read Information from file. Please use the FileManipulator provided in the previous class
        FileManipulator fileManipulator = new FileManipulator("SimulationSettings");

        return _currentSettings;
    }
    private boolean runSimulation(SimulationSettings _simulationSettings){
        //this is where all the traversing through the arraylists is going to happen






        return true;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
