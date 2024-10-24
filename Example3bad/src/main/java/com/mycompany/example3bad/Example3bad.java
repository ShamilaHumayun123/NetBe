/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.example3bad;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Example3bad {

    public static void main(String[] args) {
        // Existing programs
        University u1 = new University("Software Engineering");
        u1.showProgram();  // Outputs: The program offered is: Software Engineering

        University u2 = new University("Computer Arts");
        u2.showProgram();  // Outputs: The program offered is: Computer Arts

        University u3 = new University("Computer Science");
        u3.showProgram();  // Outputs: The program offered is: Computer Science

        // New program (Cyber Security) requires modifying the switch statement
        University u4 = new University("Cyber Security");
        u4.showProgram();  // Outputs: The program offered is: Cyber Security

    }
}
