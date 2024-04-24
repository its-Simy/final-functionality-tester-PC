import java.util.ArrayList;

public class Floor {
    ArrayList<Passenger> waitQueue;
    ArrayList<Passenger> completedQueue;
    private int floorID;
// this would be the index of the floor
    public void setFloorID(int floorID) {
        this.floorID = floorID;
    }

    public int getFloorID() {
        return floorID;
    }
}
