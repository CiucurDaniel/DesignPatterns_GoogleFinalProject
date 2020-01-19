package StrategyPattern;

public class FullPayment implements paymentStrategy {
    @Override
    public String calculatePriceWithDiscount(Food food) {
        return Integer.toString(food.getPrice());
    }
}
