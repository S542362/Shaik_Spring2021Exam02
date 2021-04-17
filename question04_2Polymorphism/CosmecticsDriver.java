/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_2Polymorphism;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class CosmecticsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the brand: ");
        String brand = scan.next();
        System.out.print("Enter the weight: ");
        int ounces = scan.nextInt();
        System.out.print("Enter the cost: ");
        double cost = scan.nextDouble();

        System.out.print("Enter the color: ");
        String color = scan.next();

        Cosmetics cos = new Lipstick(brand, ounces, cost);

        System.out.println(cos.toString());

        Cosmetics cosm = new MatteLipstick(color, "Matte", 20, 100);
        System.out.println(cosm.toString());
    }

}
