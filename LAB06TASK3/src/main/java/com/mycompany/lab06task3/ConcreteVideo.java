/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab06task3;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class ConcreteVideo implements Video {
    private String title;

    public ConcreteVideo(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
