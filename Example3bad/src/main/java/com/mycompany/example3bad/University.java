/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example3bad;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class University {
    private String programName;

    // Constructor to initialize the program name
    public University(String programName) {
        this.programName = programName;
    }

    // Method to get the program name and show details
    public void showProgram() {
        // Determine the program details based on the program name
        String details;
        switch (programName) {
            case "Software Engineering":
                details = "Software Engineering";
                break;
            case "Computer Arts":
                details = "Computer Arts";
                break;
            case "Computer Science":
                details = "Computer Science";
                break;
            // Adding a new program requires modifying this switch statement
            case "Cyber Security":
                details = "Cyber Security";
                break;
            default:
                details = "Unknown Program";
                break;
        }
        System.out.println("The program offered is: " + details);
    }

}
