import java.util.*;

public class Vehicle {
	
	int numberOfWheels;
	String regNo;
	int numberOfMilesTravelled;

	public Vehicle (int wheels, String reg, int miles) {
		numberOfWheels = wheels;
		regNo = reg;
		numberOfMilesTravelled = miles;
	}

	public String getRegNumber() {
		return regNo;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public int getMilesTravelled() {
		return numberOfMilesTravelled;
	}

	
}