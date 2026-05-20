
public class Over100Discount implements DiscountStrategy {
    @Override
    public double apply(double total) {
        if (total > 100) {
            return total - 20; // $20 flat discount
        }
        return total;
    }
}