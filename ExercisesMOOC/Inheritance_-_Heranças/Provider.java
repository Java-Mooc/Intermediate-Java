package Ficha2_ex2_eng;

public class Provider extends Person {
	//Attributes
	protected double creditValue;
	protected double debtValue;

	//Constructors
	public Provider() {
		super();	
		creditValue = 0;
		debtValue = 0;
	}
	
	public Provider(String name, String address, String phone, double creditValue, double debtValue) {
		super(name, address, phone);
		this.creditValue = creditValue;
		this.debtValue = debtValue;		
	}
	
	public Provider(Provider f) {
		this(f.getName(), f.getAddress(), f.getPhone(), f.getCreditValue(), f.getDebtValue());
	}

	//Assessors
	public double getCreditValue() {
		return creditValue;
	}

	public void setCreditValue(double creditValue) {
		this.creditValue = creditValue;
	}

	public double getDebtValue() {
		return debtValue;
	}

	public void setDebtValue(double debtValue) {
		this.debtValue = debtValue;
	}	

	//Methods
	public double obtainBalance() {
		return creditValue - debtValue;
	}

	//toString
	@Override
	public String toString() {
		return "Provider: \n" + super.toString() + "Credit Value: " + creditValue + "€, Debt Value: " + debtValue + "€\n";
	}
	
}
