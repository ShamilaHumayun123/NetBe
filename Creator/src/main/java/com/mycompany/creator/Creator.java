/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.creator;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Creator {

    public static void main(String[] args) {
      
        FruitFactory fruitFactory = new SimpleFruitFactory();
        
        // Get different types of fruits
        Fruit apple = fruitFactory.getFruit("apple");
        apple.eat();  // Outputs: Eating an Apple!

        Fruit banana = fruitFactory.getFruit("banana");
        banana.eat();  // Outputs: Eating a Banana!
    }
}
    

