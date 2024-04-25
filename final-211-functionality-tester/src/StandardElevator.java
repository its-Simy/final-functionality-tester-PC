import java.util.ArrayList;
public class StandardElevator extends Elevator{

    private static int floorLocation;
    //array list of passengers that acts as the standard elevator
    protected static ArrayList<StandardElevator> se;

    //this is the array list of the standard elevator that will be able to hold passengers
    protected static ArrayList<Passenger> standardElevator = new ArrayList<>();


    public StandardElevator(){
        floorLocation = 0;
        elevatorType = "Standard";
        maximumCapacity = 10;
        elevatorRequestPercentage = 70;
        floornum = 6;
        se = new ArrayList<>(floornum);


    }

    // this adds an elevator to the
    public void addStandardElevator(Passenger p1){

    }

    @Override
    public boolean move(direction _direction ){

        if(_direction == direction.UP){

            return true;
        }

        else if(_direction == direction.DOWN)
        {

            return true;
        }
        else{
            System.out.println("Incorrect Input");
            return false;
        }


    }

    public void addPassenger(ArrayList<Passenger> passengers, int floorLocation) {

    }

    public void removePassenger(ArrayList<Passenger> passengers, int floorLocation) {

    }

    public static void setFloorLocation(int floorLocation) {
        StandardElevator.floorLocation = floorLocation;
    }
}