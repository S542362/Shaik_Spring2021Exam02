/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07_Enum1;

/**
 *
 * @author Shabnam Shaik
 */
public enum Haleem {
    MUTTON(1, "KILO"),
    URADDAL(1.5, "KILO"),
    WATER(1, "LITRE"),
    MASALA(1, "TBSP");

    private final double quantity;
    private final String measurements;

    private Haleem(double quantity, String measurements) {
        this.quantity = quantity;
        this.measurements = measurements;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getMeasurements() {
        return measurements;
    }

    public String measurements() {
        String str = " ";
        if (measurements.equals("k")) {
            str = "kilogram";
        }
        if (measurements.equals("l")) {
            str = "litres";
        }
        if (measurements.equals("t")) {
            str = "table spoon";
        }
        return str;

    }

}
