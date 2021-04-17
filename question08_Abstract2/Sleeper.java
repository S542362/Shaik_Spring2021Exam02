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
public class Sleeper extends Train {

    int numberOfPassengers;

    public Sleeper(int numberOfPassengers, int numberOfCompartments, String trainName) {
        super(numberOfCompartments, trainName);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public double ticketprice() {
        int ticketcost = 10;
        int cost = numberOfPassengers * ticketcost;
        return cost;
    }

    //public  double ticketprice(){
    //}
    @Override
    public String toString() {
        return super.toString() + "\nSleeper{" + " numberOfPassengers= " + numberOfPassengers + " ticketprice= " + ticketprice() + '}';
    }
}
