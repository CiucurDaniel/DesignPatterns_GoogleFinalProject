package FacadePattern;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Alarm alarm = new Alarm(100);

        Light ledLights1 = new Light(1);
        Light ledLights2 = new Light(2);
        Light ledLights3 = new Light(3);

        Refrigerator refrigerator1 = new Refrigerator(1);
        Refrigerator refrigerator2 = new Refrigerator(2);

        SecurityCamera securityCamera1 = new SecurityCamera(1);
        SecurityCamera securityCamera2 = new SecurityCamera(2);
        SecurityCamera securityCamera3 = new SecurityCamera(3);

        Product tomato = new Product("Tomato", 12, 23);
        Product SamsungSmartTV = new Product("SamsungSmartTV", 4000, 3);
        Product chips = new Product("Chips paprika", 4, 50);
        //and many others...

        ArrayList<Light> lightArrayList = new ArrayList<>();
        lightArrayList.add(ledLights1); lightArrayList.add(ledLights2); lightArrayList.add(ledLights3);

        ArrayList<Refrigerator> refrigeratorArrayList = new ArrayList<>();
        refrigeratorArrayList.add(refrigerator1); refrigeratorArrayList.add(refrigerator2);

        ArrayList<SecurityCamera> securityCameraArrayList = new ArrayList<>();
        securityCameraArrayList.add(securityCamera1); securityCameraArrayList.add(securityCamera2); securityCameraArrayList.add(securityCamera3);

        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(tomato); productArrayList.add(SamsungSmartTV); productArrayList.add(chips);

        ShopFacade shopFacade = new ShopFacade(lightArrayList, alarm, refrigeratorArrayList, productArrayList, securityCameraArrayList);


        shopFacade.openShop();

    }
}
