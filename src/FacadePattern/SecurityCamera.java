package FacadePattern;

public class SecurityCamera {
    private int aisle;

    public SecurityCamera(int aisle){
        this.aisle = aisle;
    }

    public void turnOn(){
        System.out.println("Security camera on aisle: " + aisle +  " turned on");
    }

    public void turnedOff(){
        System.out.println("Security camera on aisle: " + aisle + " turned on");
    }
}
