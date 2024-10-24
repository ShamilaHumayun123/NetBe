/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.abstractexample2;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class AbstractExample2 {

    public static void main(String[] args) {
       // Creating instances of different vehicles
        Vehicle car = new Car("Car");
        Vehicle bike = new Bike("Bike");
        Vehicle truck = new Truck("Truck");

        // Invoking methods
        car.start();
        car.drive();
        car.stop();
        
        bike.start();
        bike.drive();
        bike.stop();
        
        truck.start();
        truck.drive();
        truck.stop();
        
    }
}
