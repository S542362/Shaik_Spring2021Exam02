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
public class Room {

    private int RoomLength;
    private int RoomBreadth;

    public Room(int RoomLength, int RoomBreadth) {
        this.RoomLength = RoomLength;
        this.RoomBreadth = RoomBreadth;

    }

    public int getRoomLength() {
        return RoomLength;
    }

    public void setRoomLength(int homeLength) {
        this.RoomLength = homeLength;
    }

    public int getRoomBreadth() {
        return RoomBreadth;
    }

    public void setHomeBreadth(int RoomBreadth) {
        this.RoomBreadth = RoomBreadth;
    }

    public double getarea() {

        double area = RoomLength * RoomBreadth;
        return area;
    }

    @Override
    public String toString() {
        return "Length of the room is: " + RoomLength + "\n" + "Breadth of the room is: " + RoomBreadth;
    }

}
