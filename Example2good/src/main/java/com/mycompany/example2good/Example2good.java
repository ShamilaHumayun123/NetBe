/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.example2good;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Example2good {

    public static void main(String[] args) {
                // Existing routes
        University u1 = new University(new FaizabadRoute());
        u1.showFee();  // Outputs: The fee for the route is: 7000

        University u2 = new University(new GirjaRoadRoute());
        u2.showFee();  // Outputs: The fee for the route is: 10000

        University u3 = new University(new KacheriChockRoute());
        u3.showFee();  // Outputs: The fee for the route is: 6000

        // New route added without modifying existing classes
        University u4 = new University(new MurreeRoadRoute());
        u4.showFee();  // Outputs: The fee for the route is: 7500
        
        
    }

    }

