package StrategyPattern;

public class ZeroPayment implements paymentStrategy {
    @Override
    public String calculatePriceWithDiscount(Food food) {
        return "0";
    }
}
