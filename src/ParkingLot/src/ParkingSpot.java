package ParkingLot.src;

public class ParkingSpot {
    private Level level;
    private int SpotNumber;
    private boolean available;

    public ParkingSpot(Level lvl, int num ){
        this.level = lvl;
        this.SpotNumber=num;
        this.available=true;
    }

    public boolean isAvailable() {
        return available;
    }
    public void park(){
        available= false;
    }
}