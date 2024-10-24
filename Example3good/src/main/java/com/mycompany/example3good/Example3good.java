/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.example3good;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Example3good {

    public static void main(String[] args) {
       // Existing programs
        University u1 = new University(new SoftwareEngineering());
        u1.showProgram();  // Outputs: The program offered is: Software Engineering

        University u2 = new University(new ComputerArts());
        u2.showProgram();  // Outputs: The program offered is: Computer Arts

        University u3 = new University(new ComputerScience());
        u3.showProgram();  // Outputs: The program offered is: Computer Science

        // New program (Cyber Security) added without modifying existing classes
        University u4 = new University(new CyberSecurity());
        u4.showProgram();  // Outputs: The program offered is: Cyber Security

    }
}
