import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {
        // --- Facade Pattern Demo ---
        System.out.println("=== Facade Pattern ===");
        CheckoutFacade checkout = new CheckoutFacade();
        checkout.addItem("Wireless Mouse", 150.0, 1);
        checkout.addItem("Mechanical Keyboard", 350.0, 1);

        System.out.println("Total without discount: $" + checkout.checkout(null));
        System.out.println("WELCOME10 Applied: $" + checkout.checkout("WELCOME10"));
        System.out.println("BLACKFRIDAY Applied: $" + checkout.checkout("BLACKFRIDAY"));

        // --- Decorator Pattern Demo ---
        System.out.println("\n=== Decorator Pattern ===");
        CheckoutFacade checkout2 = new CheckoutFacade();
        checkout2.addItem("Wireless Mouse", 150.0, 1);
        checkout2.addItem("Mechanical Keyboard", 350.0, 1);

        // Apply Black Friday first, then Welcome on top
        DiscountStrategy combined = new WelcomeDecorator(new BlackFridayDecorator(total -> total));
        System.out.println("BlackFriday + Welcome Combined: $" + checkout2.checkoutWithCombinedDiscounts(combined));
    }
}