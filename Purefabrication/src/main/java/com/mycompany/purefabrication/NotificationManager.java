/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.purefabrication;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class NotificationManager {
    public static void sendNotification(Student student, String message) {
        System.out.println("Sending notification to " + student.getEmail() + ": " + message);
    }
}
