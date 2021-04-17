/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_3LateBindingPolymorphism;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class StationaryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the cost of tape: ");
        int costOfTape = scan.nextInt();
        System.out.print("Enter the cost of each item: ");
        double costOfEachItem = scan.nextDouble();
        System.out.print("Enter the number of items: ");
        double noOfItems = scan.nextDouble();
        System.out.print("Enter working: ");
        String isWorking = scan.next();
        Stationary st = new Tape(costOfTape, "Shabnam", costOfEachItem, noOfItems);
        System.out.println(st.toString());

        Stationary str = new DoubleTape(isWorking, costOfTape, "shaik", costOfEachItem, noOfItems);
        System.out.println(str.toString());

    }

}
