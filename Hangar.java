package vehicle;

public class Hangar {

	public static void main(String[] args) {
	Vehicle Bmw = new Car("X1", 100000);
	Vehicle Yamaha = new Boat("speedo", 2000);
	System.out.println(Bmw.doStuff());
	System.out.println(Yamaha.doStuff());
	}

}
