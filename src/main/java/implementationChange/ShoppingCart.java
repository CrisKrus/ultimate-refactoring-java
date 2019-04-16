package implementationChange;

public class ShoppingCart {
    private int price;

    public void add(int price) {
        this.price = price;
    }

    public Price calculateTotalPrice() {
        return new Price(price);
    }

    public boolean hasDiscount() {
        return price >= 100;
    }

    public int numberOfProducts() {
        return 1;
    }
}
