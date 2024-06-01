package ParkingLot.src;

public abstract class Vehicle {
    protected String LicencePlate;
    protected VehicleType type;

    public Vehicle(String LicencePlate, VehicleType type){
        this.LicencePlate=LicencePlate;
        this.type=type;
    }
    
    public VehicleType getType(){
        return type;

    }


}
