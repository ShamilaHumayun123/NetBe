/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.singleinheritanceexp;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class SingleInheritanceExp {

    public static void main(String[] args) {
         Dog dog = new Dog();
        dog.eat();  // Inherited from Animal class
        dog.bark(); // Dog's own method
    }
}
