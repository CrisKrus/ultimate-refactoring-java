package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Integer> prices = new ArrayList<>();

    public void add(Price price) {
        this.prices.add(price.getPrice());
    }

    public int calculateTotalPrice() {
        Integer total = 0;
        for (Integer price : this.prices) {
            total += price;
        }
        return total;
    }

    public boolean hasDiscount() {
        return calculateTotalPrice() >= 100;
    }

    public int numberOfProducts() {
        return this.prices.size();
    }
}
