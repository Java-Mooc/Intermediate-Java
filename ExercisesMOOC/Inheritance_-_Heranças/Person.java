package Ficha2_ex2_eng;

public class Person {
	//Attributes
	protected String name; 
	protected String address; 
	protected String phone;	
	
	//Constructors
	public Person() {
		name = "null";
		address = "null";
		phone = "null";
	}
	
	public Person(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public Person(Person p) {
		this(p.getName(), p.getAddress(), p.getPhone());		
	}
	
	//Assessors
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	//Methods
	
	//toString
	@Override
	public String toString() {
		return "Name: " + name + ", Address: " + address + ", Phone: " + phone + "\n";
	}
	
}
