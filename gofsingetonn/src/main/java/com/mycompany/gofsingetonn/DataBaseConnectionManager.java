/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gofsingetonn;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class DataBaseConnectionManager {
    
    private static DataBaseConnectionManager ConnectionInstance;
    
    private DataBaseConnectionManager(){
        
    }
    public static DataBaseConnectionManager getInstance(){
        if (ConnectionInstance== null){
            ConnectionInstance =new DataBaseConnectionManager ();
        }
    return ConnectionInstance;
}
        public void executeQuery(String query) {

        System.out.println("Executing query: " + query);
    }
}

