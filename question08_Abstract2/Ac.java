/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08_Abstract2;

/**
 *
 * @author Shabnam Shaik
 */
public class Ac extends Train {

    String category;

    public Ac(String category, int numberOfCompartments, String trainName) {
        super(numberOfCompartments, trainName);
        this.category = category;
    }

    public String getUpgrade() {
        return category;
    }

    public void setUpgrade(String upgrade) {
        this.category = upgrade;
    }

    public double ticketprice() {
        int ticketPrice = 0;
        if (category.equalsIgnoreCase("Ac")) {
            ticketPrice = 10;
        } else if (category.equalsIgnoreCase("non-ac")) {
            ticketPrice = 20;
        }
        return ticketPrice;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAc{" + " category= " + category + " ticketprice= " + ticketprice() + '}';
    }

}
