/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceexample2;

/**
 *
 * @author SHAMILA HUMAYUN
 */
class Boat implements Vehicle, Sailable {
    private String name;
    
    public Boat(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(name + " is starting its engine...");
    }

    @Override
    public void stop() {
        System.out.println(name + " is docking and stopping...");
    }

    @Override
    public void drive() {
        System.out.println(name + " is sailing through the water.");
    }

    @Override
    public void sail() {
        System.out.println(name + " is sailing on water.");
    }
}