/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example1bad;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("regular")) {
            return amount * 0.1; // 10% discount for regular customers
        } else if (customerType.equals("vip")) {
            return 50; // $50 discount for VIP customers
        }
        return 0;
    }
}
