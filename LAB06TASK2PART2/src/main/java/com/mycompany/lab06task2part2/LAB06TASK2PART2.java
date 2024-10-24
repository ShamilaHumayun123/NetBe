/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab06task2part2;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class LAB06TASK2PART2 {

    public static void main(String[] args) {
        PizzaShop shop = new PizzaShop();
        
        // PizzaShop is responsible for creating the Pizza object
        Pizza pizza1 = shop.orderPizza("Pepperoni", "Large");
        Pizza pizza2 = shop.orderPizza("Veggie", "Medium");

        pizza1.displayInfo();
        pizza2.displayInfo();
    }
}
