/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example1good;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class FixedDiscount implements Discount{
    private double fixedAmount;

    public FixedDiscount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public double applyDiscount(double amount) {
        return fixedAmount;
    }

}
