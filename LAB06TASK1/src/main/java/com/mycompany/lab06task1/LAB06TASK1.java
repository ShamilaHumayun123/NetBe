/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab06task1;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class LAB06TASK1 {

    public static void main(String[] args) {
        // Create objects of different parking space types
        ParkingSpace compact = new CompactSpace();
        ParkingSpace standard = new StandardSpace();
        ParkingSpace oversized = new OversizedSpace();

        // Calculate and display the parking fees
        System.out.println("Compact Space Total Fee: " + compact.calculateParkingFee(5, true));
        System.out.println("Standard Space Total Fee: " + standard.calculateParkingFee(8, false));
        System.out.println("Oversized Space Total Fee: " + oversized.calculateParkingFee(7, true));
    }
}
