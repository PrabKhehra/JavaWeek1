public class Car extends Vehicle{
	int	numberDoors;
	
	public int vehicleBill() {
		return 100;
	}
	
	public String toString() {
		return vehicleType + " " + vehicleID + " " + motorised + " " + numberWheels + " " + colour + " " + brand + " " + numberDoors;
	}
	
	public Car(int vehicleID, boolean motorised, int numberWheels, String vehicleType,  String colour, String brand, int numberDoors) {
		super(vehicleID,motorised,numberWheels,vehicleType,colour,brand);
		this.numberDoors = numberDoors;
	}
	
}
