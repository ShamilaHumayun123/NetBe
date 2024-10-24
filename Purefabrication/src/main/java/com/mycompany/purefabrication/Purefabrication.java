/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.purefabrication;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Purefabrication {

    public static void main(String[] args) {
        
        // Create a student and a course
        Student student1 = new Student("Alice", "alice@example.com");
        Course course1 = new Course("Mathematics");

        // Student studies and attends class
        student1.study();
        student1.attendClass();
        course1.conductClass();

        // Send a notification to the student
        NotificationManager.sendNotification(student1, "Don't forget about your math exam next week!");
    }
}