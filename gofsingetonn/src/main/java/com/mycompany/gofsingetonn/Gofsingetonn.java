/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gofsingetonn;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class Gofsingetonn {

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataBaseConnectionManager dbManager1 = DataBaseConnectionManager.getInstance();
        dbManager1.executeQuery("SELECT * FROM users");

       DataBaseConnectionManager dbManager2 = DataBaseConnectionManager.getInstance();
        dbManager2.executeQuery("SELECT * FROM products");

        if (dbManager1 == dbManager2) {
            System.out.println("dbManager1 and dbManager2 refer to the same instance.");
        } else {
            System.out.println("Different instances.");

    }
    }
}