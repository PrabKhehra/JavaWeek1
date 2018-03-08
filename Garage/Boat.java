public class Boat extends Vehicle{
	int	numberSails;
	
	public int vehicleBill() {
		return 200;
	}
	
	public String toString() {
		return vehicleType + " " + vehicleID + " " + motorised + " " + numberWheels + " " + colour + " " + brand + " " + numberSails;
	}
	
	public Boat(int vehicleID, boolean motorised, int numberWheels, String vehicleType, String colour, String brand, int numberSails) {
		super(vehicleID,motorised,numberWheels,vehicleType,colour,brand);
		this.numberSails = numberSails;
	}
}
