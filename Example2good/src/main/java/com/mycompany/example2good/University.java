/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example2good;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class University {
        private Route route;

    public University(Route route) { 
        this.route = route;
    }

    public void showFee() {
        System.out.println("The fee for the "+route.getName()+" route is: " + route.getFee());
    }

}
