
public class RunnerClassGarage {
	
	public static void main(String[] args) {
		Garage g = new Garage();
		Car car1 = new Car(1, true, 4, "Car", "Papaya", "McLaren", 0);
		g.addVehicle(car1);
		Boat boat2 = new Boat(2, true, 0, "Boat", "Black", "Prestige Worldwide", 1);
		g.addVehicle(boat2);
		Motorcycle motorcycle3 = new Motorcycle(3, true, 2, "Motorcycle", "Green", "Yamaha", 250);
		g.addVehicle(motorcycle3);
		Car car4 = new Car(4, true, 3, "Car", "Red", "Reliant", 0);
		g.addVehicle(car4);
		
		g.showGarage();
		System.out.println("--------------------");
		g.billGarage();
		System.out.println("--------------------");
		g.removeVehicle(3);
		g.showGarage();
		System.out.println("--------------------");
		g.removeVehicle("Car");
		g.showGarage();
		System.out.println("--------------------");
		g.emptyGarage();
		
	}
}
