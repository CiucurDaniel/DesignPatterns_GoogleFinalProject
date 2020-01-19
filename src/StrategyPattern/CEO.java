package StrategyPattern;

public class CEO extends Employee{
    public CEO(String name){
        super(name, new ZeroPayment());
    }
}
