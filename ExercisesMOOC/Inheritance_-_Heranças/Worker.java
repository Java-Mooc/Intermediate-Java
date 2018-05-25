package Ficha2_ex2_eng;

public class Worker extends Employee{
	//Attributes
	protected double productionValue;
	protected double commission;

	//Constructors
	public Worker() {
		super();
		productionValue = 50;
		commission = 50;
	}
	
	public Worker(String name, String address, String phone, int sectorCode, double baseSalary, 
					double tax, double productionValue, double commission) {
		
		super(name, address, phone, sectorCode, baseSalary, tax);
		this.productionValue = productionValue;
		this.commission = commission;		
	}
	
	public Worker(Worker o) {
		this(o.getName(), o.getAddress(), o.getPhone(), o.getSectorCode(), o.getBaseSalary(), o.getTax(),
			 o.getProductionValue(), o.getCommission());
	}

	//Assessors
	public double getProductionValue() {
		return productionValue;
	}

	public void setProductionValue(double productionValue) {
		this.productionValue = productionValue;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	//Methods
	@Override
	public double calculateSalary() {
		return (baseSalary + (productionValue * commission / 100)) * (1 - (tax / 100));
	}		

	//toString
	@Override
	public String toString() {
		return "Worker:\n" + super.toString() +  ", Production Value: " + productionValue + ", Commission: " + commission + "\n";
	}
	
	
}
