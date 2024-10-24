/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gofsingleton;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class GOFSingleton {

    public static void main(String[] args) {
        RemoteTV remote1 = RemoteTV.getInstance();
        remote1.powerToggle();
           remote1.changeChannel(5);
              remote1.changeVolume(25);
              
        RemoteTV remote2 = RemoteTV.getInstance();
      
           remote2.changeChannel(10);
              remote2.changeVolume(15);
              
              System.out.println("Hello World!");
    }
}
