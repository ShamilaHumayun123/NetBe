/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hierarchicalexp;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class HierarchicalExp {

    public static void main(String[] args) {
         Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.eat();  // Inherited from Animal
        dog.bark(); // Dog-specific method
        
        cat.eat();  // Inherited from Animal
        cat.meow(); // Cat-specific method
    }
}
