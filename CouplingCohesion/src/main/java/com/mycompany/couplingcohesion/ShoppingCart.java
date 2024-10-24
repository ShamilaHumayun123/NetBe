/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.couplingcohesion;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class ShoppingCart {
 private Product product1;
    private Product product2;
    private int productCount = 0;

    // Add a product to the cart (up to 2 products for simplicity)
    public void addProduct(Product product) {
        if (productCount == 0) {
            product1 = product;
            productCount++;
            System.out.println(product.getName() + " has been added to the cart.");
        } else if (productCount == 1) {
            product2 = product;
            productCount++;
            System.out.println(product.getName() + " has been added to the cart.");
        } else {
            System.out.println("Cart is full! Cannot add more products.");
        }
    }

    // Calculate total price of products in the cart
    public double calculateTotal() {
        double total = 0;
        if (product1 != null) {
            total += product1.getPrice();
        }
        if (product2 != null) {
            total += product2.getPrice();
        }
        return total;
    }

    // Remove a product from the cart
    public void removeProduct(String productName) {
        if (product1 != null && product1.getName().equals(productName)) {
            System.out.println(product1.getName() + " has been removed from the cart.");
            product1 = null;
            productCount--;
        } else if (product2 != null && product2.getName().equals(productName)) {
            System.out.println(product2.getName() + " has been removed from the cart.");
            product2 = null;
            productCount--;
        } else {
            System.out.println(productName + " is not in the cart.");
        }
    }
}
