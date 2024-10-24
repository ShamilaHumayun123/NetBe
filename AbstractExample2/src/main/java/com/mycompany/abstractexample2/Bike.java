/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractexample2;

/**
 *
 * @author SHAMILA HUMAYUN
 */
class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }
    
    @Override
    public void drive() {
        System.out.println(getName() + " is driving on 2 wheels.");
    }
}

