/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_Enum2;

import java.util.Scanner;

/**
 *
 * @author Shabnam Shaik
 */
public class BioDataDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        System.out.println(Biodata.HEIGHT.getName() + Biodata.HEIGHT.getValue());

        for (Biodata bd : Biodata.values()) {
            System.out.println("Metabolism rate is: " + bd.metabolismRate());
        }
    }

}
