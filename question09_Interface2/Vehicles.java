/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09_Interface2;

/**
 *
 * @author Shabnam Shaik
 */
public class Vehicles implements Car, Bus {

    private double distance;
    private double time;
    private int totalNumberofseats;
    private int emptyseats;

    public Vehicles(double distance, double time, int totalNumberofseats, int emptyseats) {
        this.distance = distance;
        this.time = time;
        this.totalNumberofseats = totalNumberofseats;
        this.emptyseats = emptyseats;
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }

    public int getTotalNumberofseats() {
        return totalNumberofseats;
    }

    public int getEmptyseats() {
        return emptyseats;
    }

    @Override
    public String toString() {
        return "Vehicles{" + "distance=" + distance + ", time=" + time + ", totalNumberofseats=" + totalNumberofseats + ", emptyseats=" + emptyseats + '}';
    }

    @Override
    public double accelerationCalculation() {
        double acceleration = 0.0;
        acceleration = distance / time;
        return acceleration;
    }

    @Override
    public double seatsFilled() {
        int seatsFilled = 0;
        seatsFilled = totalNumberofseats - emptyseats;
        return seatsFilled;
    }

}
