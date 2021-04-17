/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03_arraylist;

/**
 *
 * @author Shabnam Shaik
 */
public class Circle {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double area() {
        double area;
        return area = 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "\n area=" + area();

    }
}
