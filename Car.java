import java.util.*;

public class Car extends Vehicle{
	
	int numberOfSeats;

	public Car(int wheels, String reg, int miles, int seats) {
		super(wheels, reg, miles);
		numberOfSeats = seats;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void move(int miles) {
		super.move(miles);
		System.out.println("Car is moving, feel the breeze");
	}
}