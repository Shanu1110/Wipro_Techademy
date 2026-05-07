package Day8;

import java.util.*;

public class OnlineShoppingCart {

    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        Map<String, Double> productPrice = new HashMap<>();

        // Product catalog
        productPrice.put("Laptop", 75000.0);
        productPrice.put("Phone", 30000.0);
        productPrice.put("Headphones", 2000.0);

        // Add items to cart
        cart.add("Laptop");
        cart.add("Headphones");
        cart.add("Phone");

        // Calculate total
        double total = 0;
        for (String item : cart) {
            total += productPrice.get(item);
        }

        System.out.println("Cart Items: " + cart);
        System.out.println("Total Price: ₹" + total);
    }
}
