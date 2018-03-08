public class Motorcycle extends Vehicle{
	int	engineCC;
	
	public int vehicleBill() {
		return 50;
	}
	
	public String toString() {
		return vehicleType + " " + vehicleID + " " +  motorised + " " + numberWheels + " " + colour + " " + brand + " " + engineCC;
	}
	
	public Motorcycle(int vehicleID, boolean motorised, int numberWheels, String vehicleType, String colour, String brand, int engineCC) {
		super(vehicleID,motorised,numberWheels,vehicleType,colour,brand);
		this.engineCC = engineCC;
	}
}
