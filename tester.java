import java.util.*;

public class tester {
	
	public static void main(String[] args) {
		Vehicle v = new Car(3, "KL 70", 0, 4);
		v.move(2);
		System.out.println(v.getMilesTravelled());
	}
}