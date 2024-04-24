import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExpressElevator extends Elevator{
    private static int floorLocation;
    protected static ArrayList<ExpressElevator> ee;

    //this is the array list that acts as the express elevator, it will hold passengers
    protected static ArrayList<Passenger> expressElevator = new ArrayList<>();

    public ExpressElevator(){
        floorLocation = 0;
        elevatorType = "VIP";
        maximumCapacity = 8;
        elevatorRequestPercentage = 20;
        floornum = 6;
        ee = new ArrayList<>(floornum);


    }


    @Override
    public boolean move(direction _direction) {
        //holds the value of the elevator
        ExpressElevator holder;
        int floor = ExpressElevator.floorLocation;
        holder = ExpressElevator.ee.get(floor);

        if(_direction == direction.UP ){
                ExpressElevator.ee.set(floor + 1, holder);
                ExpressElevator.ee.set(floor, null);
                setFloorLocation(floorLocation + 1);
            }


        else if(_direction == direction.DOWN)
        {
            ExpressElevator.ee.set(floor, null);
            ExpressElevator.ee.set(floor - 1, holder);
            setFloorLocation(floorLocation - 1);
        }
        else{
            System.out.println("Incorrect Input");
            return false;
        }
        return true;

    }

    public static void addeElevator(){

           ExpressElevator elevator1 = new ExpressElevator();
            ee.add(elevator1);
            System.out.println(ee.size());

    }


    public void addPassenger(Passenger passenger) {

    }


    public void removePassenger(Passenger passenger) {

    }

    public static void setFloorLocation(int floorLocation) {
        ExpressElevator.floorLocation = floorLocation;
    }
}
