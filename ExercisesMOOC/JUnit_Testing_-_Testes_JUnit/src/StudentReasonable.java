
public class StudentReasonable extends BadStudent {
	//Attributes
	protected int hoursStudyTest;

	//Constructores
	public StudentReasonable() {
		this.hoursStudyTest = 0;
	}
	public StudentReasonable(int hoursFun, int hoursStudyTest){
		super(hoursFun);
		this.hoursStudyTest = hoursStudyTest;		
	}

	//Advisors
	public int getHoursStudyTest() {
		return hoursStudyTest;
	}

	public void setHoursStudyTest(int hoursStudyTest) {
		this.hoursStudyTest = hoursStudyTest;
	}

	//Methods
	@Override
	public double probabilityToPass() {
		return 0.3;
	}
	
	public void increaseStudyTest(int numHours) {
		this.setHoursStudyTest(Math.min(24*7, hoursStudyTest + numHours));
		
	}
	
	public void decreasesStudyTest(int numHours) {
		this.setHoursStudyTest(Math.max(0, hoursStudyTest - numHours));
	}

	@Override
	public String toString() {
		return "StudentReasonable: hoursStudyTest = " + getHoursStudyTest() + ", " + super.toString();
	}
}
