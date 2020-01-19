package FacadePattern;

import java.util.ArrayList;

public class ShopFacade {
    //attributes
    private ArrayList<Light> lights;
    private Alarm alarm;
    private ArrayList<Refrigerator> refrigerators;
    private ArrayList<Product> products;
    private ArrayList<SecurityCamera> securityCameras;

    //constructor
    public ShopFacade(ArrayList<Light> lights, Alarm alarm, ArrayList<Refrigerator> refrigerators, ArrayList<Product> products, ArrayList<SecurityCamera> securityCameras){
        this.lights = lights;
        this.alarm = alarm;
        this.refrigerators = refrigerators;
        this.products = products;
        this.securityCameras = securityCameras;
    }
    //FACADE CONTROLS    ->>>>INTERFACE

    public void openShop(){
        /*
        * Opening a shop implies a sequence of steps which implies many classes
        * this method is helping us simplify that process with  simple method call
        *
        */
        System.out.println("We are openning the shop: ");

        //set off the alarm
        alarm.turnOFF();

        //turn on the lights
        for(Light l : lights) { l.turnOn(); }

        //set the optimal temperature for the refrigerators
        for( Refrigerator r : refrigerators) { r.setTemperature(1); r.turnOn();}

        System.out.println("Products available today: ");
        //display the products
        for(Product p : products) { p.display(); }

    }

    public void closeShop(){
        System.out.println("We are closing the shop: ");

        //set alarm on
        alarm.turnOn();

        //turn on the lights
        for(Light l : lights) { l.turnOff(); }

        //set the night mode with optimized temperature for the refrigerators
        for( Refrigerator r : refrigerators) { r.setNightMode(); r.turnOff();}

    }

}
