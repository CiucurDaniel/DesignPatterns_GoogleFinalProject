package StrategyPattern;

public abstract class Employee {

    //atributes
    paymentStrategy payment;
    private String name;

    //constructor
    public Employee(String name, paymentStrategy payment){
        this.name = name;
        this.payment = payment;
    }

    //change the payment STRATEGY at runtime if we want
    public void set_paymentMethod(paymentStrategy payment){
        this.payment = payment;
    }

    //perform the payment with the current strategy
    public String performPayment(Food food){
        //try open the file
        //write in the file
        return this.name + ", " + this.getClass().getSimpleName().toUpperCase() + ", " + food.getName() + ", " + food.getPrice() + ", " + payment.calculatePriceWithDiscount(food);
    }

}
