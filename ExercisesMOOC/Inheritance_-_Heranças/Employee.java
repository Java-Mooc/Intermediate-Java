package Ficha2_ex2_eng;

public class Employee extends Person{
	//Attributes
	protected int sectorCode;
	protected double baseSalary;
	protected double tax;

	//Constructors
	public Employee() {
		super();
		baseSalary = 600;
		tax = 10;
	}
	
	public Employee(String name, String address, String phone, int sectorCode, double baseSalary, double tax) {
		super(name, address, phone);
		this.sectorCode = sectorCode;
		this.baseSalary = baseSalary;
		this.tax = tax;
	}
	
	public Employee(Employee e) {
		this(e.getName(), e.getAddress(), e.getPhone(), e.getSectorCode(), e.getBaseSalary(), e.getTax());
	}

	//Assessors
	public int getSectorCode() {
		return sectorCode;
	}

	public void setSectorCode(int codigoSetor) {
		this.sectorCode = codigoSetor;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double salarioBase) {
		this.baseSalary = salarioBase;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double imposto) {
		this.tax = imposto;
	}	

	//Methods
	public double calculateSalary() {
		return baseSalary - baseSalary * (tax / 100);
	}		

	//toString
	@Override
	public String toString() {
		return super.toString() + "Sector Code: " + sectorCode + ",Base Salary= " + baseSalary + ", Tax= " + tax;
	}
	
}
