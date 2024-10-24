/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8q2;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class SocketAdapter implements EuropeanSocket {
    private USPlug usPlug;

    public SocketAdapter(USPlug usPlug) {
        this.usPlug = usPlug;
    }

    @Override
    public void plugIn() {
        usPlug.insertTwoProngPlug();
        System.out.println("Adapted US plug to fit European socket.");
    }
}
