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
public abstract class Train {

    int numberOfCompartments;
    String trainName;

    public Train(int numberOfCompartments, String trainName) {
        this.numberOfCompartments = numberOfCompartments;
        this.trainName = trainName;
    }

    public int getNumberOfCompartments() {
        return numberOfCompartments;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setNumberOfCompartments(int numberOfCompartments) {
        this.numberOfCompartments = numberOfCompartments;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    @Override
    public String toString() {
        return "Train{" + " numberOfCompartments= " + numberOfCompartments + ", trainName= " + trainName + '}';
    }

    public abstract double ticketprice();

}
