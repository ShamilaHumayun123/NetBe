/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab06task3;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Rent {
    private Video video;
    private ConcreteVideoStore store;

    public Rent(Video video, ConcreteVideoStore store) {
        this.video = video;
        this.store = store;
    }

    public void execute() {
        System.out.println("Renting video: " + video.getTitle());
    }
}