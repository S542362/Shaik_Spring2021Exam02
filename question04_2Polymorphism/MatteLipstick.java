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
public class MatteLipstick extends Cosmetics {

    private String color;

    public MatteLipstick(String color, String brand, int ounces, double cost) {
        super(brand, ounces, cost);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String colorOfLipstick() {
        String str = " ";
        if (color.equals("red")) {
            str = "This is the red lipstick";
        }
        if (color.equals("pink")) {
            str = "This is the pink lipstick";
        }
        if (color.equals("black")) {
            str = "Don't buy the waste color lipstick";
        }

        return str;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncolor: " + color
                + "\ncolour of the lipstick is: " + colorOfLipstick();
    }

}
