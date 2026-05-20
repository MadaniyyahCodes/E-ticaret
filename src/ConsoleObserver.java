

public class ConsoleObserver implements CartObserver {
    @Override
    public void update(String event, double total) {
        System.out.println("[CART EVENT] " + event + " | Total: $" + total);
    }
}