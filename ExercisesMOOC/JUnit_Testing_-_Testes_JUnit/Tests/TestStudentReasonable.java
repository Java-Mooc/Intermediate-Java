import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudentReasonable {

	@Test
	public void defaultConstructor1() {
		StudentReasonable r = new StudentReasonable();
		assertTrue(r.getHoursStudyTest() == 0 && r.getHoursFun() == 0);
	}
	
	@Test
	public void defaultConstructor2() {
		StudentReasonable r = new StudentReasonable();
		assertEquals(r.getHoursFun(), r.getHoursFun());
	}
}
