import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
    private List<CartObserver> observers = new ArrayList<>();

    public void addObserver(CartObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(String event, double total) {
        for (CartObserver observer : observers) {
            observer.update(event, total);
        }
    }

    public void addItem(Item item) {
        items.add(item);
        notifyObservers("Item added: " + item.getName(), calculateRawTotal());
    }

    public List<Item> getItems() {
        return items;
    }

    public double calculateRawTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public double calculateTotal(String discountType) {
        DiscountStrategy discount = DiscountFactory.getDiscount(discountType);
        double total = discount.apply(calculateRawTotal());
        notifyObservers("Discount applied: " + discountType, total);
        return total;
    }
}