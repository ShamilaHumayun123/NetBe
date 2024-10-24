/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interfaceexample2;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class InterfaceExample2 {

    public static void main(String[] args) {
        Vehicle car = new Car("Car");
        Vehicle plane = new Plane("Plane");
        Vehicle boat = new Boat("Boat");
        
        // For Car
        car.start();
        car.drive();
        car.stop();
        
        // For Plane
        plane.start();
        plane.drive();
        ((Flyable) plane).fly(); // Downcasting to call the fly method
        plane.stop();
        
        // For Boat
        boat.start();
        boat.drive();
        ((Sailable) boat).sail(); // Downcasting to call the sail method
        boat.stop();
    }
}
