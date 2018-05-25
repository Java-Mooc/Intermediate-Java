package Ficha2_ex2_eng;

public class Administrator extends Employee{
	//Attributes
	protected double subsistenceAllowance;

	//Constructors
	public Administrator() {
		super();
		subsistenceAllowance = 200;
	}
	
	public Administrator(String name, String address, String phone, int sectorCode, double baseSalary, 
						double tax, double subsistenceAllowance) {
		super(name, address, phone, sectorCode, baseSalary, tax);
		this.subsistenceAllowance = subsistenceAllowance;
	}
	
	public Administrator(Administrator a) {
		this(a.getName(), a.getAddress(), a.getPhone(), a.getSectorCode(), a.getBaseSalary(), a.getTax(), 
			a.getSubsistenceAllowance());
	}	

	//Assessors
	public double getSubsistenceAllowance() {
		return subsistenceAllowance;
	}

	public void setAjudaDeCusto(double subsistenceAllowance) {
		this.subsistenceAllowance = subsistenceAllowance;
	}	

	//Methods
	@Override
	public double calculateSalary() {
		return super.calculateSalary() + subsistenceAllowance;
	}	

	//toString
	@Override
	public String toString() {
		return "Administrator: \n" + super.toString() + ", Subsistence Allowance: " + subsistenceAllowance + "€\n";
	}
	
}
