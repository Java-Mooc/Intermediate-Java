
public class OrderAccount extends Account {
	//Variables
	
	//Cosntrutors
	
	public OrderAccount(){
		
	}
	
	public OrderAccount(String identificationNum, String creationDate, String name, int age, int IC, int NIF, double balance){
		super();
		
	}
	
	@Override
	public double deposit (double amount){
		super.balance += amount;
		return this.getBalance() + amount;
	}

	@Override
	public double draw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
