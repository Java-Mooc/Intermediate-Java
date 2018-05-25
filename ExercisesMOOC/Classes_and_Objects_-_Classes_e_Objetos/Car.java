package Ficha_de_Demonstração_n1_Ex3_eng;

public class Car {

	// Attributes 
	private String registration;
	private String state; 

	// Constructors
	
	public Car(){
		registration = "-";
		state = "AVAILABLE";
	}

	public Car(String registration, String state){
		this.registration = registration;
		this.state = state;
	}

	public Car(Car car){
		this(car.registration,car.state);
	}

	// Assessors


	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	// Methods
	public boolean free(){
		
		return this.getState().toUpperCase().equals("AVAILABLE");
	}

	public void changeState(){
		if (this.free()) 
			this.setState("Rented");
		else
			this.setState("Available");
	}
	
	public Car clone(){
		return new Car(this);
	}

	@Override
	public String toString() {
		return registration + "(" + state + ")";
	}
}
