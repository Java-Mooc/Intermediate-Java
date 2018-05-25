
public abstract class NotOrderAccount extends Account {

	double interest;
	
	
	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		return 0;
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
	
	public abstract double creditInterest();
	}

