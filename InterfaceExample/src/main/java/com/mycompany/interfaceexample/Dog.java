/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceexample;

/**
 *
 * @author SHAMILA HUMAYUN
 */
class Dog implements Animal {
    // Providing implementation for the abstract method
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}