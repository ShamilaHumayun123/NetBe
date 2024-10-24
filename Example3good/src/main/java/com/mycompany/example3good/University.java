/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.example3good;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class University {
        private Program program;

    public University(Program program) {
        this.program = program;
    }

    public void showProgram() {
        System.out.println("The program offered is: " + program.getProgramName());
    }

}
