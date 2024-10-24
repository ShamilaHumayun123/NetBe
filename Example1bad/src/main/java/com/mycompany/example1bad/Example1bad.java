/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.example1bad;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Example1bad {

    public static void main(String[] args) {
                DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Regular customer discount: " + calculator.calculateDiscount("regular", 500));
        System.out.println("VIP customer discount: " + calculator.calculateDiscount("vip", 500));

    }
}
