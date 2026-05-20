public class main {
    public static void main(String[] args) {

        // --- Observer Pattern Demo ---
        System.out.println("=== Observer Pattern ===");
        ShoppingCart cart = new ShoppingCart();
        cart.addObserver(new ConsoleObserver());

        cart.addItem(new Item("Wireless Mouse", 150.0, 1));
        cart.addItem(new Item("Mechanical Keyboard", 350.0, 1));

        System.out.println("WELCOME10 Applied: $" + cart.calculateTotal("WELCOME10"));
        System.out.println("BLACKFRIDAY Applied: $" + cart.calculateTotal("BLACKFRIDAY"));

        // --- Strategy + Decorator Pattern Demo ---
        System.out.println("\n=== Strategy + Decorator Pattern ===");
        CheckoutFacade checkout = new CheckoutFacade();
        checkout.addItem("Wireless Mouse", 150.0, 1);
        checkout.addItem("Mechanical Keyboard", 350.0, 1);

        DiscountStrategy combined = new WelcomeDecorator(
            new BlackFridayDecorator(total -> total)
        );
        System.out.println("BlackFriday + Welcome Combined: $" + 
            checkout.checkoutWithCombinedDiscounts(combined));
    }
}