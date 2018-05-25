import static org.junit.Assert.*;

import org.junit.Test;

public class TestBadStudent {

	@Test
	public void defaultConstructor1() {
		BadStudent m = new BadStudent();
		assertEquals(0, m.getHoursFun());
	}
	
	@Test
	public void defaultConstructor2() {
		BadStudent m = new BadStudent();
		assertTrue(m.getHoursFun() == 0);
	}
	
	@Test
	public void constructor1() {
		BadStudent m = new BadStudent(11);
		assertEquals(11, m.getHoursFun());		
	}
	
	@Test
	public void increaseFun1() {
		BadStudent m = new BadStudent(11);
		m.increaseFun(10);
		m.increaseFun(5);
		m.increaseFun(1);
		assertEquals(27, m.getHoursFun());
	}
	
	@Test
	public void increaseFun2() {
		BadStudent m = new BadStudent(11);
		m.increaseFun(10);
		m.increaseFun(500);
		m.increaseFun(1);
		assertEquals(168, m.getHoursFun());
	}
	
	@Test
	public void decreaseFun1() {
		BadStudent m = new BadStudent(11);
		m.decreaseFun(4);
		m.decreaseFun(5);
		m.decreaseFun(1);
		assertEquals(1, m.getHoursFun());
	}

}
