import java.util.*;

public abstract class Vehicle {
	
	private int numberOfWheels;
	private String regNo;
	private int numberOfMilesTravelled;

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

	public abstract void move(int miles);

}