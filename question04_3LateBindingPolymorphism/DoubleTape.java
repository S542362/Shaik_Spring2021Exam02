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
public class DoubleTape extends Tape {

    private String isWorking;

    public DoubleTape(java.lang.String isWorking, int costOfTape, java.lang.String customerName, double costOfEachItem, double noOfItems) {
        super(costOfTape, customerName, costOfEachItem, noOfItems);
        this.isWorking = isWorking;
    }

    @Override
    public String String() {
        return super.getCustomerName().strip();
    }

    public String working() {
        String str = " ";
        if (isWorking.equals("0")) {
            str = "works";
        }
        if (isWorking.equals("1")) {
            str = "not working";
        }
        return str;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nis Working: " + working();
    }

}
