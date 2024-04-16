import java.util.ArrayList;
public class StandardElevator extends Elevator{

    private static int floorLocation;
    //array list of passengers that acts as the standard elevator
    protected static ArrayList<StandardElevator> se;
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
    public boolean move(direction _direction) {

        //holds the value of the elevator
        StandardElevator holder;
        int floor = StandardElevator.floorLocation;
        holder = StandardElevator.se.get(floor);

        if(_direction == direction.UP && holder !=null){
            StandardElevator.se.set(floor + 1, holder);
            StandardElevator.se.set(floor, null);
            setFloorLocation(floorLocation + 1);
            return true;
        }

        else if(_direction == direction.DOWN && holder !=null)
        {
            StandardElevator.se.set(floor, null);
            StandardElevator.se.set(floor - 1, holder);
            setFloorLocation(floorLocation - 1);
            return true;
        }
        else{
            System.out.println("Incorrect Input");
            return false;
        }


    }
//this is where the problem is
    public static void addsElevator(){

            StandardElevator elevator = new StandardElevator();
            se.add(elevator);
            System.out.println(se.size());


    }

    public void addPassenger(ArrayList<Passenger> passengers, int floorLocation) {

    }

    public void removePassenger(ArrayList<Passenger> passengers, int floorLocation) {

    }

    public static void setFloorLocation(int floorLocation) {
        StandardElevator.floorLocation = floorLocation;
    }
}