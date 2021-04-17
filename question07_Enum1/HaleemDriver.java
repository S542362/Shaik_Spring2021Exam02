/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_Enum1;

/**
 *
 * @author Shabnam Shaik
 */
public class HaleemDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Measuremnt of urad dal is: " + Haleem.URADDAL.getMeasurements());
        for (Haleem h : Haleem.values()) {
            System.out.println(h + "\n" + "quantity is: " + h.getQuantity()
                    + "\n" + "Measurement : " + h.getMeasurements());

        }
    }

}
