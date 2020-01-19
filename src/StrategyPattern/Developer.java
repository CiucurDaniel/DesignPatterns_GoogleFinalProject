package StrategyPattern;

public class Developer extends Employee {

    public Developer(String name){
        super(name, new FullPayment());
    }
}


