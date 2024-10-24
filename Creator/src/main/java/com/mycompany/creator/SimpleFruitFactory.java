/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creator;

/**
 *
 * @author SHAMILA HUMAYUN
 */
class SimpleFruitFactory extends FruitFactory {
    @Override
    protected Fruit createFruit(String type) {
        switch (type.toLowerCase()) {
            case "apple":
                return new Apple();
            case "banana":
                return new Banana();
            default:
                return null;
        }
    }
}
