package FacadePattern;

public class Refrigerator {
    private int temperature;

    public Refrigerator(int temperature){
        this.temperature = temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    public void turnOn(){
        System.out.println("Refrigerator is ON at " + temperature + " celsius degrees");
    }

    public void setNightMode(){
        System.out.println("Refrigerator is set on night mode at 5 celsius degrees");
    }

    public void turnOff(){
        System.out.println("Refrigerator is turned off");
    }
}
