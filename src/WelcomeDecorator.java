
public class WelcomeDecorator extends DiscountDecorator {
    public WelcomeDecorator(DiscountStrategy wrapped) {
        super(wrapped);
    }

    @Override
    public double apply(double total) {
        double afterWrapped = wrapped.apply(total);
        return afterWrapped * 0.90; // 10% off on top
    }
}