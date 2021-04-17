/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_2Polymorphism;

/**
 *
 * @author Shabnam Shaik
 */
public class Cosmetics {

    private String brand;
    private int ounces;
    private double cost;

    public Cosmetics(String brand, int ounces, double cost) {
        this.brand = brand;
        this.ounces = ounces;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getOunces() {
        return ounces;
    }

    public void setOunces(int ounces) {
        this.ounces = ounces;
    }

    public double getCost() {
        cost = ounces * 24.3;
        return cost;
    }

    @Override
    public String toString() {
        return "brand=" + brand + ", ounces=" + ounces + ", cost=" + cost;
    }

}
