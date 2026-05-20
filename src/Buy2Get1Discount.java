

public class Buy2Get1Discount implements DiscountStrategy {
    @Override
    public double apply(double total) {
        return total - 10; // dummy rule (as in original)
    }
}
