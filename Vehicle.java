import java.util.*;

public class Vehicle implements Movable {
	
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

	public void move(int miles) {
		numberOfMilesTravelled += miles;
	}

}