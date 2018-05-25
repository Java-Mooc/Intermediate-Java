package Ficha2_ex2_eng;

public class Seller extends Employee{
	//Attributes
	protected double sellsValue;
	protected double commission;

	//Constructors
	public Seller() {
		super();
		sellsValue = 60;
		commission = 40;
	}
	
	public Seller(String name, String address, String phone, int sectorCode, double baseSalary, double tax,
			double sellsValue, double commission) {
		
		super(name, address, phone, sectorCode, baseSalary, tax);
		this.sellsValue = sellsValue;
		this.commission = commission;
	}

	public Seller(Seller v) {
		this(v.getName(), v.getAddress(), v.getPhone(), v.getSectorCode(), v.getBaseSalary(), v.getTax(),
				 v.getSellsValue(), v.getCommission());
	}

	//Assessors
	public double getSellsValue() {
		return sellsValue;
	}

	public void setSellsValue(double sellsValue) {
		this.sellsValue = sellsValue;
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
		return (baseSalary + (sellsValue * commission / 100)) * (1 - (tax / 100));
	}	

	//toString
	@Override
	public String toString() {
		return "Seller:\n" + super.toString() +", Sells Value: " + sellsValue + ", Commission=" + commission + "\n";
	}	
}
