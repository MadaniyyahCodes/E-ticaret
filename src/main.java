import java.util.ArrayList;
import java.util.List;


class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getName() { return name; }
}


class ShoppingCart {
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

        if (discountType != null) {
            if (discountType.equalsIgnoreCase("WELCOME10")) {
                total = total * 0.90; // 10% welcome discount
            } 
            else if (discountType.equalsIgnoreCase("BLACKFRIDAY")) {
                total = total * 0.50; // 50% Black Friday discount
            } 
            else if (discountType.equalsIgnoreCase("OVER100_LIMIT")) {
                // Flat $20 discount for purchases over $100
                if (total > 100) {
                    total = total - 20;
                }
            } 
            else if (discountType.equalsIgnoreCase("BUY_2_GET_1")) {
               
                if (items.size() >= 2) {
                    total -= 10;
                }
            }
            
        }

        return total;
    }
}

public class main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Wireless Mouse", 150.0, 1));
        cart.addItem(new Item("Mechanical Keyboard", 350.0, 1));

        // Raw total: 150 + 350 = 500
        System.out.println("Total without discount: $" + cart.calculateTotal(null));

        // WELCOME10 Applied (10% Off -> 450)
        System.out.println("WELCOME10 Applied: $" + cart.calculateTotal("WELCOME10"));

        // BLACKFRIDAY Applied (50% Off -> 250)
        System.out.println("BLACKFRIDAY Applied: $" + cart.calculateTotal("BLACKFRIDAY"));

        // OVER100_LIMIT Applied ($20 flat discount -> 480)
        System.out.println("OVER100_LIMIT Applied: $" + cart.calculateTotal("OVER100_LIMIT"));
    }
}
