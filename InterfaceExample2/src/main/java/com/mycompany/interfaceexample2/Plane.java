/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceexample2;

/**
 *
 * @author SHAMILA HUMAYUN
 */
class Plane implements Vehicle, Flyable {
    private String name;
    
    public Plane(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(name + " is starting its engines...");
    }

    @Override
    public void stop() {
        System.out.println(name + " is landing and stopping...");
    }

    @Override
    public void drive() {
        System.out.println(name + " is taxiing on the runway.");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying in the sky.");
    }
}

