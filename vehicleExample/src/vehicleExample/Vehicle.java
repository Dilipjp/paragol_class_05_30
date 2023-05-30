package vehicleExample;

public class Vehicle {

	
	private int numOfDoors;
	private double price;
	private int  maxSpeed;
	private long serialNum;
	
	private static long serialNumCounter = 1000000;
	
	public Vehicle() {
		System.out.println("Create object with initialized cons");
		numOfDoors = 4;
		price = 10000;
		maxSpeed = 200;
		serialNum = serialNumCounter;
		serialNumCounter++;
		
	}
	
	// pramtized cons
	public Vehicle(int nd, double pr, int ms) {
		
		System.out.println("Create object with parametied cons");
		numOfDoors = nd;
		price = pr;
		maxSpeed = ms;
		serialNum = serialNumCounter;
		serialNumCounter++;
	}
	
	// copy cons
	public Vehicle(Vehicle v) {
		System.out.println("Create object with copy con");
		
		numOfDoors = v.numOfDoors;
		price  = v.price;
		maxSpeed = v.maxSpeed;
		serialNum = serialNumCounter;
		serialNumCounter++;
		
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void showInfo() {
		System.out.println("The vehicle has" + numOfDoors + "doors "+ " and serial number of"+ serialNum +" maximum speed of " + maxSpeed + "Km/h and the price is " + price);
	}
}
