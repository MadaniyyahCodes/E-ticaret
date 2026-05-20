
public class WelcomeDiscount implements DiscountStrategy {
    @Override
    public double apply(double total) {
        return total * 0.90; // 10% off
    }
}