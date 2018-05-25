package Ficha_de_Demonstração_n1_Ex3_eng;

public class Stand {
	// Atributes
	private String name;
	private Fleet fleet ;

	// Constructors
	public Stand(){

	}

	public Stand(String name, Fleet fleet){
		this.name = name;
		this.fleet = fleet; 
	}

	public Stand(Stand stand){
		this(stand.getName(), stand.getFleet());
	}

	// Assessors
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fleet getFleet() {
		return fleet;
	}

	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}

	// Methods
	public int howManyAvailable(){
		return fleet.howManyAvailable();
	}

	public boolean rent(int i){
		return fleet.rent(i);
	}

	public boolean returnCar(int i){
		return fleet.returnCar(i);
	}

	// OUTROS
	public Stand clone(){
		return new Stand(this);
	}

	@Override
	public String toString() {
		if (!(fleet == null))
			return name + ", " + fleet.toString();
		else
			return name;
	}
}
