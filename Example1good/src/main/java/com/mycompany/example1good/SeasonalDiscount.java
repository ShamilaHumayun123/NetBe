/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example1good;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class SeasonalDiscount implements Discount {
    private double seasonalAmount;

    public SeasonalDiscount(double seasonalAmount) {
        this.seasonalAmount = seasonalAmount;
    }

    @Override
    public double applyDiscount(double amount) {
        return seasonalAmount;
    }

}