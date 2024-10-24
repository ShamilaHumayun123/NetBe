/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hybrid;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Hybrid {

    public static void main(String[] args) {
         Duck duck = new Duck();
        duck.eat();   // Inherited from Animal
        duck.quack(); // Duck-specific method
        duck.fly();   // Flyable method
        duck.swim();  // Swimmable method
    }
}
