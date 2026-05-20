
public abstract class DiscountDecorator implements DiscountStrategy {
    protected DiscountStrategy wrapped;

    public DiscountDecorator(DiscountStrategy wrapped) {
        this.wrapped = wrapped;
    }
}
