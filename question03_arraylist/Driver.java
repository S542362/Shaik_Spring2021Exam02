/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03_arraylist;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Shabnam Shaik
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> arrayList1 = new ArrayList<>();

        boolean add;
        add = arrayList1.add(new Loan("Shabnam", "securedloan"));
        System.out.println("\n");
        arrayList1.add(new Date());
        arrayList1.add("\nshabnam");
        arrayList1.add(new Circle(5));

        System.out.println("\n" + arrayList1 + "\n");

        System.out.println("Looping each element: ");
        for (Object element : arrayList1) {
            System.out.println(element.toString());
        }
    }

}
