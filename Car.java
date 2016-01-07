import java.util.*;

public class Car {
	
	int numberOfSeats;

	public Car(int wheels, String reg, int miles, int seats) {
		super(wheels, reg, miles);
		numberOfSeats = seats;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void move(int miles) {
		super.move();
		System.out.println("Car is moving, feel the breeze");
	}
}