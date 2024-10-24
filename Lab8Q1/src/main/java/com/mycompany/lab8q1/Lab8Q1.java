/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab8q1;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Lab8Q1 {

    public static void main(String[] args) {
        Shapemaker shapeMaker = new Shapemaker();

        // Drawing shapes using the facade
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}