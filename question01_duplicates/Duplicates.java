/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01_duplicates;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class Duplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        String numbers = scan.nextLine();
        String arr[] = numbers.split(" ", 10);
        ArrayList<Integer> list = new ArrayList<>();
        for (int dup = 0; dup < arr.length; dup++) {
            var b = Integer.parseInt(arr[dup]);
            list.add(b);
        }
        removeDuplicate(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> distinct = new ArrayList<>();
        for (int dup = 0; dup < list.size(); dup++) {
            if (distinct.contains(list.get(dup))) {

            } else {
                distinct.add(list.get(dup));
            }

        }
        System.out.println("The distinct integers are " + distinct.toString().replace("[", "").replace("]", "").replaceAll(",", ""));
    }
}
