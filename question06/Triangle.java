/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

/**
 *
 * @author Shabnam Shaik
 */
public class Triangle extends GeometricObject {

    private double s1;
    private double s2;
    private double s3;

    public Triangle(String color, boolean isFilled, double s1, double s2, double s3) {
        super(color, isFilled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double getArea() {
        double semiarea = (s1 + s2 + s3) * 0.5;
        double area;
        area = Math.sqrt(semiarea * (semiarea - s1) * (semiarea - s2) * (semiarea - s3));
        return area;
    }

    @Override
    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    @Override
    public String toString() {
        return "area = " + getArea() + ", perimeter = " + getPerimeter() + ", color = " + getColor() + ", isFilled = " + isFilled()
                + ", side1 =" + s1 + ", side2=" + s2 + ", side3=" + s3;

    }

}
