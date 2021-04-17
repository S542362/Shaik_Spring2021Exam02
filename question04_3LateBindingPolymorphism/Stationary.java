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
public class Stationary {

    private String customerName;
    private final double costOfEachItem;
    private final double noOfItems;

    public Stationary(String customerName, double costOfEachItem, double noOfItems) {
        this.customerName = customerName;
        this.costOfEachItem = costOfEachItem;
        this.noOfItems = noOfItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCostOfEachItem() {
        return costOfEachItem;
    }

    public double getNoOfItems() {
        return noOfItems;
    }

    public String String() {
        return customerName + noOfItems;
    }

    public double price() {
        return costOfEachItem * noOfItems;
    }

    @Override
    public String toString() {
        return "customer Name: " + customerName + "\ncost Of Each Item: " + costOfEachItem + "\nno Of Items: " + noOfItems;
    }

}
