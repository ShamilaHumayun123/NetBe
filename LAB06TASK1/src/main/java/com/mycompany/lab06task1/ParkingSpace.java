/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab06task1;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public abstract class ParkingSpace {
    protected double ratePerHour;

    // Abstract method to calculate parking fee
    public abstract double calculateParkingFee(int noOfHours, boolean addPackage);
}
