/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaceexample;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public interface Animal {
    void sound(); // Abstract method

    // Default method (introduced in Java 8)
    default void sleep() {
        System.out.println("This animal is sleeping.");
    }
}
