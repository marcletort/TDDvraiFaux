package model;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		VraiFaux vf = new VraiFaux();
		assertTrue(vf.retournerVrai(6));
		assertFalse(vf.retournerVrai(2));
	}

}
