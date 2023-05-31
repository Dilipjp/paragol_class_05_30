package vehicleExample;

public class Bus extends Vehicle {
	
//	Attibute
	private int passengerCapacity;
	
	public Bus() {
		System.out.println("Creating bus from defalit con");
		passengerCapacity = 10;
	}
	
//	paramtized cons
	public Bus(int cap) {
		System.out.println("Creating bus from parameter con");
		passengerCapacity = cap;
	}
	
	// copy cons
	public Bus(Bus b) {
		System.out.println("Creating bus from parameter con");
		passengerCapacity = b.passengerCapacity;
	}

//	construct with price , numberofDoors and max speed
	
	public Bus(int nd, double pr, int ms, int pc) {
		super(nd,pr,ms);
		System.out.println("Creating the bus with using parameter of parents");
		passengerCapacity = pc;
	}
	
	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	
	public void setPrice(double pr) {
		if(pr < 50000) {
		super.setPrice(pr);	
		}else {
			System.out.println("Not possible to change the price to this");
		}
	}

	@Override
	public String toString() {
		return "this Bus has "+ getNumOfDoors()+ "Doors and the price is " + getPrice() + "$ and the passanegrCapacity is " + getPassengerCapacity();
	}

}
