/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab06task2part2;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Pizza {
      private String type;
    private String size;

    public Pizza(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public void displayInfo() {
        System.out.println("Pizza Type: " + type + ", Size: " + size);
    }
}
