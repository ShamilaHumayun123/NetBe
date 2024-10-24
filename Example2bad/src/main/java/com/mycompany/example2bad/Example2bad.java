/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.example2bad;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Example2bad {

    public static void main(String[] args) {
        University university = new University();
        
        // Existing routes
        System.out.println("Fee for Faizabad: " + university.getRouteFee("Faizabad"));
        System.out.println("Fee for Girja Road: " + university.getRouteFee("Girja Road"));
        System.out.println("Fee for Kacheri Chock: " + university.getRouteFee("Kacheri Chock"));
        
        // Adding a new route requires modifying the method
        System.out.println("Fee for Murree Road: " + university.getRouteFee("Murree Road"));

    }
}
