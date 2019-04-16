package unit;

import implementationChange.ShoppingCart;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartShould {
    @Test
    public void count_number_of_products() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);
        shoppingCart.add(10);

        Assert.assertEquals(2, shoppingCart.numberOfProducts());
    }

    @Test
    public void calculate_total_price() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);
        shoppingCart.add(10);

        Assert.assertEquals(20, shoppingCart.calculateTotalPrice());
    }

    @Test
    public void know_when_is_discount_applicable() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);

        Assert.assertTrue(shoppingCart.hasDiscount());
    }

    @Test
    public void know_when_is_not_possible_to_apply_discount() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(99);

        Assert.assertFalse(shoppingCart.hasDiscount());
    }

}
