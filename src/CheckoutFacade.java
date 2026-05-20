
public class CheckoutFacade {
    private ShoppingCart cart;

    public CheckoutFacade() {
        this.cart = new ShoppingCart();
    }

    public void addItem(String name, double price, int quantity) {
        cart.addItem(new Item(name, price, quantity));
    }

    public double checkout(String discountType) {
        return cart.calculateTotal(discountType);
    }

    public double checkoutWithCombinedDiscounts(DiscountStrategy discount) {
        double total = 0;
        for (Item item : cart.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        return discount.apply(total);
    }
}
