public abstract class Vehicle {
	int vehicleID;
	boolean motorised;
	int numberWheels;
	String vehicleType;
	String colour;
	String brand;
	
	public abstract int vehicleBill();
	
	public Vehicle(int vehicleID, boolean motorised, int numberWheels, String vehicleType, String colour, String brand) {
		this.vehicleID = vehicleID;
		this.motorised = motorised;
		this.numberWheels = numberWheels;
		this.vehicleType = vehicleType;
		this.colour = colour;
		this.brand = brand;
	}
}