

public class DiscountFactory {
    public static DiscountStrategy getDiscount(String discountType) {
        if (discountType == null) return total -> total;

        switch (discountType.toUpperCase()) {
            case "WELCOME10":     return new WelcomeDiscount();
            case "BLACKFRIDAY":   return new BlackFridayDiscount();
            case "OVER100_LIMIT": return new Over100Discount();
            case "BUY_2_GET_1":   return new Buy2Get1Discount();
            default:              return total -> total; // no discount
        }
    }
}
