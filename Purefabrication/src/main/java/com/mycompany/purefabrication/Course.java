/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.purefabrication;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Course {
     private String title;

    public Course(String title) {
        this.title = title;
    }

    public void conductClass() {
        System.out.println("Conducting class for " + title + ".");
    }
}
