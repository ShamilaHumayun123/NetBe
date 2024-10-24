/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceexample2;

/**
 *
 * @author SHAMILA HUMAYUN
 */
class Car implements Vehicle {
    private String name;
    
    public Car(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(name + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping...");
    }

    @Override
    public void drive() {
        System.out.println(name + " is driving on 4 wheels.");
    }
}
