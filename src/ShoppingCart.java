import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public double calculateTotal(String discountType) {
        double total = 0;

        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }

        DiscountStrategy discount = DiscountFactory.getDiscount(discountType);
        return discount.apply(total);
    }
}