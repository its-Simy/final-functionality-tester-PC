import java.util.ArrayList;

public class ExpressPassenger extends Passenger{

    protected static ArrayList<ExpressPassenger> expressPassenger = new ArrayList<>();

    public ExpressPassenger(){
        passangerType = "Express";
        passenger_percent_request = 30;
    }

    public boolean requestElevator(direction _direction) {
        return false;
    }


    public static void addePassengers(){
        for(int i = 0; i < 6; i++){
            ExpressPassenger passenger1 = new ExpressPassenger();
            expressPassenger.add(passenger1);
            System.out.println(expressPassenger.size());
        }

    }
}