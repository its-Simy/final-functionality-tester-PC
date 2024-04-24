import java.lang.reflect.Array;
import java.util.ArrayList;

public class AddElevator extends Elevator{



    AddElevator(){
        elevatorType = "";
        maximumCapacity = 8;
        elevatorRequestPercentage =  0;

    }


    @Override
    public boolean move(direction _direction) {
        return false;
    }



}
