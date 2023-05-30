package vehicleExample;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
//		Create the objects
		Vehicle v1 = new Vehicle(5, 25000, 270), v2 = new Vehicle(3, 20000, 220), v3 = new Vehicle();
		
		System.out.println("V1 info:");
		v1.showInfo();
		
		System.out.println("V2 info:");
		v2.showInfo();
		
		System.out.println("V3 info:");
		v3.showInfo();
		
		// Creating obect with copy const
		Vehicle v4 = new Vehicle(v2);
		v4.showInfo();
		

	}

}
