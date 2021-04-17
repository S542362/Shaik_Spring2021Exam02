/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author Shabnam Shaik
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person sha1 = new Person("Shabnam Shaik", "Hyderabad", "8889992223",
                "sssrocks@gmail.com");
        System.out.println("\n" + sha1);

        Student sha2 = new Student(3.8, "Saajidah shaik", "Montvale", "9999966666",
                "banu@gmail.com");
        System.out.println("\n" + sha2);
        Employee sha3 = new Employee("wipro", 50000, "01/01/2020",
                "Syed Miravali",
                "New jersey", "7777777734", "miravali@gmail.com");
        System.out.println("\n" + sha3);

        Staff sha4 = new Staff("Junior lecturer", "Narayana college",
                50000, "02/01/2019",
                "Razia shaik", "Elluru", "900000001",
                "razia@gmail.com");
        System.out.println("\n" + sha4);

        Faculty sha5 = new Faculty("10:00AM - 2:00 PM", 1,
                "Sri chaitanya college", 50000, "03/01/2018",
                "Mastanvali Shaik", "Vijaywada", "9000000002", "mastanvali@gmail.com");
        System.out.println("\n" + sha5);

    }
}
