/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creator;

/**
 *
 * @author SHAMILA HUMAYUN
 */
abstract class FruitFactory {
    // Factory Method
    public Fruit getFruit(String type) {
        return createFruit(type); // Call to factory method
    }
    // Factory method to be implemented by subclasses
    protected abstract Fruit createFruit(String type);
}

