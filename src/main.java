import java.util.ArrayList;
import java.util.List;



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
