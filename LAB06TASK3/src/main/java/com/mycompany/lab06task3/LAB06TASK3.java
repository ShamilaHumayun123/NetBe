/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab06task3;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class LAB06TASK3 {

    public static void main(String[] args) {
        ConcreteVideoStore videoStore = new ConcreteVideoStore();
        videoStore.addVideo(new ConcreteVideo("Inception"));
        videoStore.addVideo(new ConcreteVideo("The Matrix"));

        // Step 2: Set Up the Controller
        RentalController rentalController = new RentalController(videoStore);

        // Rent some videos
        rentalController.rentVideo("Inception"); // Output: Renting video: Inception
        rentalController.rentVideo("The Matrix"); // Output: Renting video: The Matrix
        rentalController.rentVideo("Avatar"); // Output: Video not found: Avatar
    }
}
