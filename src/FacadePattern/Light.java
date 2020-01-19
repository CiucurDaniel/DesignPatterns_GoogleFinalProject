package FacadePattern;

public class Light {
    private int aisle;

    public Light(int aisle){
        this.aisle = aisle;
    }

    public void turnOn(){
        System.out.println("Light on aisle: " + aisle + " turned on");
    }

    public void turnOff(){
        System.out.println("Light on aisle: " + aisle + " turned off");
    }

}
