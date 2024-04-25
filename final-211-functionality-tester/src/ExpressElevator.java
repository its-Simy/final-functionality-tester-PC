import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExpressElevator extends Elevator{
    private static int floorLocation;

    //this is the array list that acts as the express elevator, it will hold passengers
    //the passengers it is holding will be the passengers actually inside of the elevator
    protected static ArrayList<Passenger> expressElevator = new ArrayList<>();

    public ExpressElevator(){
        floorLocation = 0;
        elevatorType = "VIP";
        maximumCapacity = 8;
        elevatorRequestPercentage = 20;


    }


    @Override
    public boolean move(direction _direction) {

    //first checks if the direction is up
        if(_direction == direction.UP ){
            //next it is going to check if the elevator has reached the max floor
            }


        else if(_direction == direction.DOWN)
        {

        }
        else{
            System.out.println("Incorrect Input");
            return false;
        }
        return true;

    }

    //this will put the passenger into the elevator
    public void addPassenger(Passenger passenger) {

    }

     //this will take the passenger out of the elevator
    public void removePassenger(Passenger passenger) {

    }

    //sets the floor of the elevator
    public static void setFloorLocation(int floorLocation) {
        ExpressElevator.floorLocation = floorLocation;
    }
}
