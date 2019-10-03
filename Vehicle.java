package vehicle;

public abstract class Vehicle {
	//Attributs
	private String brand;
	private int kilometers;

	public Vehicle() {
		
	}
		// Constructeurs
		public Vehicle (String brand, int kilometers) {
			this.brand = brand;
			this.kilometers = kilometers;
		}
	//getters and setters
		public String getBrand() {
			
			return this.brand;
		}
		
		public int getKilometers() {
			
			return this.kilometers;
		}
		
		public void setBrand(String brand) {
			
		
			this.brand = brand;
		}
			
		public void setKilometers(int kilometers) {
				this.kilometers = kilometers;
		}
		public abstract String doStuff();

}
