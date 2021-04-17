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
public class LivingRoom extends Room {

    private int backyardLength;

    public LivingRoom(int backyardLength, int RoomLength, int RoomBreadth) {
        super(RoomLength, RoomBreadth);
        this.backyardLength = backyardLength;
    }

    public int getBackyardLength() {
        return backyardLength;
    }

    @Override
    public double getarea() {
        double area = (super.getRoomLength() * super.getRoomBreadth()) + backyardLength;
        return area;
    }

}
