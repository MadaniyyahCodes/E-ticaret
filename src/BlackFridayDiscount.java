

public class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public double apply(double total) {
        return total * 0.50; // 50% off
    }
}