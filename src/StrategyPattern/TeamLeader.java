package StrategyPattern;

public class TeamLeader extends Employee {
    public TeamLeader(String name){
        super(name, new HalfPayment());
    }
}
