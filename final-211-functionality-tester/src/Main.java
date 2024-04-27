import java.io.IOException;

public class Main {
 public static void main(String[] args) throws IOException {
  ElevatorSimulation simulation = new ElevatorSimulation();
  SimulationSettings simulationSettings = simulation.readsettingsContent("settings.txt");
  simulation.runSimulation(simulationSettings)
 }
}