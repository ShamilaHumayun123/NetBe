/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab06task1;

/**
 *
 * @author SHAMILA HUMAYUN
 */
class CompactSpace extends ParkingSpace {
    public CompactSpace() {
        ratePerHour = 5.00; // Rate per hour for Compact space
    }

    @Override
    public double calculateParkingFee(int noOfHours, boolean addPackage) {
        double parkingFee = ratePerHour * noOfHours; // Calculate base fee

        if (addPackage) {
            parkingFee += 300; // Add package fee if selected
        }

        return parkingFee; // Return total fee
    }
}
