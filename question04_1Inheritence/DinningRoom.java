/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04_1Inheritence;

/**
 *
 * @author Shabnam Shaik
 */
public class DinningRoom extends Room {

    private String color;

    public DinningRoom(String color, int RoomLength, int RoomBreadth) {
        super(RoomLength, RoomBreadth);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getarea() {
        double area = Math.pow(super.getRoomLength(), 2);
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "color: " + color + "\n" + "area: " + getarea();
    }

}
