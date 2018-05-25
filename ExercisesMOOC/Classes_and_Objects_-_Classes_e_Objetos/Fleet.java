package Ficha_de_Demonstração_n1_Ex3_eng;

public class Fleet {
	// Atributes
	private Car[] fleet = new Car[2];

	// Constructors

	public Fleet(){

	}

	public Fleet(Car c1, Car c2){
		fleet[0] = c1; 
		fleet[1] = c2; 

	}

	public Fleet(Fleet receivedFleet){
		this(receivedFleet.fleet[0],receivedFleet.fleet[1]);
	}

	// Assessors

	public Car[] getFleet() {
		return fleet.clone(); 

	}

	public void setFleet(Car[] fleet) {
		this.fleet = fleet;
	}

	public Car get(int i){
		return fleet[i];
	}

	public void set(int i, Car car){
		fleet[i] = car;
	}
	
	// Methods
	public int howManyAvailable(){
		int counter = 0;
		for(int i=0; i < fleet.length; i++)
			if (fleet[i].free())
				counter++;
		return counter;
	}

	public boolean rent(int i){
		if (fleet[i].free()){
			fleet[i].setState("Rented");
			return true;
		}
		else
			return false;
	}

	public boolean returnCar(int i){
		if (! fleet[i].free()){
			fleet[i].setState("Available");
			return true;
		}
		else
			return false;
	}	
	
	public Fleet clone(){
		return new Fleet(this);
	}

	@Override
	public String toString() {
		String answer = "Fleet[ ";
		for (int i=0; i< fleet.length; i++)
			answer += fleet[i].toString()+ " ";
		answer += "]";
		return answer;
	}


}
