package FacadePattern;

public class Alarm {
    private final String alarmSound = "bipBIPbipBIP";
    private int volume;

    public Alarm(int volume){
        this.volume = volume;
    }

    public void turnOn(){
        System.out.println("Alarm is ON");
    }

    public void turnOFF(){
        System.out.println("Alarm is OFF");
    }
}
