package StrategyPattern;

public class HalfPayment implements paymentStrategy {
    @Override
    public String calculatePriceWithDiscount(Food food) {
        return Integer.toString(food.getPrice()/2);
    }
}
