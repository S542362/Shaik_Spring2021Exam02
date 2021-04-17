/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_3LateBindingPolymorphism;

/**
 *
 * @author Shabnam Shaik
 */
public class Tape extends Stationary {

    private final int costOfTape;

    public Tape(int costOfTape, java.lang.String customerName, double costOfEachItem, double noOfItems) {
        super(customerName, costOfEachItem, noOfItems);
        this.costOfTape = costOfTape;
    }

    public int getCostOfTape() {
        return costOfTape;
    }

    public String item() {
        String str = " ";
        if (costOfTape == 10) {
            str = "You get only tape";
        }
        if (costOfTape == 15) {
            str = "you get tape along with holder";
        }
        return str;
    }

    /**
     *
     * @return
     */
    @Override
    public String String() {
        return super.getCustomerName().substring(0, 1);
    }

    @Override
    public double price() {
        return super.getNoOfItems() * costOfTape;
    }

    @Override
    public String toString() {
        return "cost Of Tape: " + costOfTape
                + "\nwhat you get: " + item()
                + "\nget String: " + String()
                + "\nPrice of tapes: " + price();
    }

}
