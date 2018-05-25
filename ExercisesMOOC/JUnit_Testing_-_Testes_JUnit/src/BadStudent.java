
public class BadStudent {
	//Attributes
	protected int hoursFun;

	//Constructores
	public BadStudent() {
		hoursFun = 0;
	}
	
	public BadStudent(int hoursFun) {
		this.hoursFun = hoursFun;
	}

	//Advisors
	public int getHoursFun() {
		return hoursFun;
	}

	public void setHoursFun(int hoursFun) {
		this.hoursFun = hoursFun;
	}

	//Methods
	public double probabilityToPass() {
		return 0.1;
	}
	
	public void increaseFun(int numHours) {
		this.setHoursFun(Math.min(24*7, hoursFun + numHours));
		
	}
	
	public void decreaseFun(int numHours) {
		this.setHoursFun(Math.max(0, hoursFun - numHours));
	}
	
	public boolean justHaveFun() {
		return this.getHoursFun() == 168;
	}
	
	@Override
	public String toString() {
		return "BadStudent: hoursFun = " + getHoursFun();
	}
	
}
