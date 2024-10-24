/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab06task2part1;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class LAB06TASK2PART1 {

   public static void main(String[] args) {
        Guest guest1 = new Guest("Alice");
        Guest guest2 = new Guest("Bob");

        // Using InvitationManager to handle invitations (pure fabrication)
        InvitationManager invitationManager = new InvitationManager();
        invitationManager.sendInvitation(guest1);
        invitationManager.sendInvitation(guest2);
    }
}
