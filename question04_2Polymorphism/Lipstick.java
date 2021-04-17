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
public class Lipstick extends Cosmetics {

    public Lipstick(String brand, int ounces, double cost) {
        super(brand, ounces, cost);
    }

    public double getCost() {
        double cost = super.getOunces() * 25;
        return cost;
    }

}
