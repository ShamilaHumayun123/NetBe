/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractexample2;

/**
 *
 * @author SHAMILA HUMAYUN
 */
abstract class Vehicle {
    private String name;
    
    // Constructor
    public Vehicle(String name) {
        this.name = name;
    }

    // Common methods for all vehicles
    public void start() {
        System.out.println(name + " is starting...");
    }
    
    public void stop() {
        System.out.println(name + " is stopping...");
    }

    // Abstract method to be implemented by subclasses
    public abstract void drive();

    public String getName() {
        return name;
    }
}

