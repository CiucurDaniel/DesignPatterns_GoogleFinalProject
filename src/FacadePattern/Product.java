package FacadePattern;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void display(){
        System.out.println("Product: " + name + ", " + "price " + price + ", " + "quantity-" + quantity);
    }
}
