/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_1Inheritence;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class RoomDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the color: ");
        String color = scan.next();
        System.out.print("Enter the room length: ");
        int RoomLength = scan.nextInt();
        System.out.print("Enter the room breadth: ");
        int RoomBreadth = scan.nextInt();
        System.out.print("Enter the backyard length: ");
        int backyardLength = scan.nextInt();

        DinningRoom dinning = new DinningRoom(color, RoomLength, RoomBreadth);
        System.out.println(dinning.toString());
        LivingRoom lvRoom = new LivingRoom(backyardLength, 15, 12);
        System.out.println(lvRoom.toString());

    }

}
