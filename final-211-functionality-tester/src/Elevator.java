import java.net.PasswordAuthentication;
import java.util.ArrayList;

enum direction{
    UP,
    IDLE,
    DOWN
}
public abstract class Elevator {

    protected String elevatorType;
    protected int maximumCapacity;
    protected int elevatorRequestPercentage;
    protected int floornum;
    ArrayList<Passenger> inprogressPassengers;
    //this holds the people inside the elevators


    public abstract boolean move(direction _direction);



}
