/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gofsingleton;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class RemoteTV {
    private static RemoteTV remoteInstance;
    
    private RemoteTV(){}
    
    public static RemoteTV getInstance(){
        if(remoteInstance==null){
            remoteInstance= new RemoteTV();
        }
        return remoteInstance;
    }

public void changeVolume(int level){
    System.out.println("Volume changed to: "+level);
}

public void changeChannel(int channel){
    System.out.println("Channel changed to: "+channel);
}

public void powerToggle(){
    System.out.println("TV power toggled: ");
}


}
    

