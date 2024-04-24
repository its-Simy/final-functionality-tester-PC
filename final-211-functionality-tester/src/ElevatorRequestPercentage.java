public class ElevatorRequestPercentage {
    protected String elevatorType;
    protected int percentage;


    public ElevatorRequestPercentage(){
        elevatorType = "";
        percentage = 10;
    }

    public ElevatorRequestPercentage(String _elevatorType, int _percentage){
        this.elevatorType = _elevatorType;
        this.percentage = _percentage;
    }


}
