
public abstract class Account {

	//Variables
	protected String identificationNum;
	protected String creationDate;
	protected String name;
	protected int age;
	protected int IC;
	protected int NIF;
	protected double balance;
	
	//Constructors
	public Account(){	
	}
	
	public Account(String identificationNum, String name, int age, int IC, int NIF, double balance){
		this.identificationNum = identificationNum;
		this.creationDate = identificationNum;
		this.name = name;
		this.age = age;
		this.IC = IC;
		this.NIF = NIF;
		this.balance = balance;
	}

	
	//Assessors
	public String getIdentificationNum() {
		return identificationNum;
	}

	public void setIdentificationNum(String identificationNum) {
		this.identificationNum = identificationNum;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIC() {
		return IC;
	}

	public void setIC(int IC) {
		IC = IC;
	}

	public int getNIF() {
		return NIF;
	}

	public void setNIF(int nIF) {
		NIF = nIF;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	//Methods
	public abstract double deposit(double quantia);
		
	public abstract double draw(double quantia);
	
	public abstract double checkBalance();
}
