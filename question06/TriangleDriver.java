/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Side 1: ");
        double side1 = scan.nextInt();

        System.out.println("Enter side 2: ");
        double side2 = scan.nextInt();

        System.out.println("Enter side 3: ");
        double side3 = scan.nextInt();

        System.out.println("Enter the color");
        String color = scan.next();

        System.out.println("Is Area filled? (True/False): ");
        boolean isFilled = scan.nextBoolean();

        Triangle tri = new Triangle(color, isFilled, side1, side2, side3);

        System.out.println("Area: " + tri.getArea());
        System.out.println("Permiter: " + tri.getPerimeter());
        System.out.println("Color: " + tri.getColor());
        System.out.println("isFilled: " + tri.isFilled());

        System.out.println(tri.toString());
    }
}
