/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hybrid;

/**
 *
 * @author SHAMILA HUMAYUN
 */
class Duck extends Animal implements Flyable, Swimmable {
    public void quack() {
        System.out.println("Quacking...");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void swim() {
        System.out.println("Swimming...");
    }
}