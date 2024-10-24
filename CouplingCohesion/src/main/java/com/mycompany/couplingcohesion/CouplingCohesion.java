/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.couplingcohesion;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class CouplingCohesion {

    public static void main(String[] args) {
        // Create some products
        Product apple = new Product("Apple", 1.0);
        Product banana = new Product("Banana", 0.5);

        // Create shopping cart and add products
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(apple);
        cart.addProduct(banana);

        // Calculate total and process payment
        double total = cart.calculateTotal();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(total);

        // Remove a product from the cart
        cart.removeProduct("Apple");
        total = cart.calculateTotal();
        paymentProcessor.processPayment(total);
    }
}
