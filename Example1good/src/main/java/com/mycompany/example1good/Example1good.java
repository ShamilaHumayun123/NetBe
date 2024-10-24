/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.example1good;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Example1good {

    public static void main(String[] args) {
        Discount regularDiscount = new PercentageDiscount(0.1); // 10% discount for regular customers
        Discount vipDiscount = new FixedDiscount(50); // $50 discount for VIP customers

        double amount = 500;

        System.out.println("Regular customer discount: " + regularDiscount.applyDiscount(amount));
        System.out.println("VIP customer discount: " + vipDiscount.applyDiscount(amount));
        
        Discount seasonalDiscount = new SeasonalDiscount(30); // $30 seasonal discount
        System.out.println("Seasonal discount: " + seasonalDiscount.applyDiscount(amount));

    }
}
