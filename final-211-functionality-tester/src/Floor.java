import java.util.ArrayList;

public class Floor {

    public static ArrayList<Passenger> waitQueue;
   public static ArrayList<Passenger> completedQueue;
    private int floorID;
    // this would be the index of the floor

    public void setFloorID(int floorID) {
        this.floorID = floorID;
    }

    public int getFloorID() {
        return floorID;
    }
/*
    public void addPassengerToWaitQueue(Passenger passenger) {
        waitQueue.add(passenger);
    }
 */

}
