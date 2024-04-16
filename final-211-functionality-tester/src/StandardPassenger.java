import java.util.ArrayList;

public class StandardPassenger extends Passenger{

    protected static ArrayList<StandardPassenger> sPassenger = new ArrayList<>();

    public StandardPassenger(){
        passangerType = "Standard";
        passenger_percent_request = 70;

    }

    public static void addsPassengers(){
        for(int i = 0; i < 6; i++){
            StandardPassenger passenger = new StandardPassenger();
            sPassenger.add(passenger);
            System.out.println(sPassenger.size());
        }

    }

}