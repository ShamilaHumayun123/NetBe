/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab8q2;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Lab8Q2 {

    public static void main(String[] args) {
        // Create a US plug (Adaptee)
        USPlug usPlug = new USPlug();

        // Create a SocketAdapter (Adapter)
        EuropeanSocket socketAdapter = new SocketAdapter(usPlug);

        // Use the adapter to plug in the US plug into the European socket
        socketAdapter.plugIn();
    }
}
