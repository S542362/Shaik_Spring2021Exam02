/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02_2dimensionalarray;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class TwoDimensionalarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int space = scan.nextInt();
                m1[i][j] = space;
            }
        }
        System.out.print("Enter list2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int space = scan.nextInt();
                m2[i][j] = space;
            }
        }
        boolean flag = equals(m1, m2);
        if (flag == true) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] == m2[i][j]) {
                    flag = true;
                } else {
                    flag = false;
                    return flag;
                }
            }
        }
        return flag;
    }
}
