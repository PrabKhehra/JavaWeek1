import java.util.ArrayList;
import java.util.Iterator;

public class Garage {
	private ArrayList<Vehicle> storedVehicles = new ArrayList<Vehicle>();

	public void showGarage() {
		for (Vehicle vehicle : storedVehicles) {
			System.out.println(vehicle);
		}
	}
	
	public void billGarage() {
		for (Vehicle vehicle : storedVehicles) {
			System.out.print("Bill for " + vehicle.vehicleType + " Of ID: " + vehicle.vehicleID + " is: £");
			System.out.println(((Vehicle) vehicle).vehicleBill());
		}
	}
	

	public void addVehicle(Vehicle v) {
		storedVehicles.add(v);
	}

	public void removeVehicle(int id) {
		Iterator<Vehicle> it = storedVehicles.iterator();
		while(it.hasNext()) {
			Vehicle vehicle = it.next();
		if(vehicle.vehicleID == id) {
			it.remove();
		}
		}
	}

	public void removeVehicle(String type) {
		Iterator<Vehicle> it = storedVehicles.iterator();
		while(it.hasNext()) {
			Vehicle vehicle = it.next();
		if(vehicle.vehicleType == type) {
			it.remove();
		}
		}
	}
	
	
	public void emptyGarage() {
		storedVehicles.clear();
		System.out.println("Garage emptied");
	}

}