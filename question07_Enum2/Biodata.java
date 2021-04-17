/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_Enum2;

/**
 *
 * @author Shabnam Shaik
 */
public enum Biodata {

    HEIGHT(5.4, "shabnam"),
    WEIGHT(68, "shaik"),
    AGE(22, "shabnam shaik");

    private double value;
    private final String name;

    private Biodata(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public double metabolismRate() {

        value = 447.593 + (9.247 * WEIGHT.getValue()) + (3.098 * HEIGHT.getValue()) - (4.330 * AGE.getValue());

        return value;
    }
}
