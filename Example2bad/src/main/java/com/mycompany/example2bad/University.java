/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example2bad;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class University {
    public double getRouteFee(String routeName) {
        if (routeName.equals("Faizabad")) {
            return 7000;
        } else if (routeName.equals("Girja Road")) {
            return 10000;
        } else if (routeName.equals("Kacheri Chock")) {
            return 6000;
        } 
        // Adding a new route requires modifying this code
        else if (routeName.equals("Murree Road")) {
            return 7500;
        } else {
            return 0;  // Default case for unknown routes
        }

}}
