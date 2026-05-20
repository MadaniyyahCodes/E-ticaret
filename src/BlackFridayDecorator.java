
public class BlackFridayDecorator extends DiscountDecorator {
    public BlackFridayDecorator(DiscountStrategy wrapped) {
        super(wrapped);
    }

    @Override
    public double apply(double total) {
        double afterWrapped = wrapped.apply(total);
        return afterWrapped * 0.50; // 50% off on top
    }
}