package hu.meiit.pell8a.JUnit;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class szamolATeszt { //osztálytörzs
	
	JuniTeszteEset teszt = null; //példányosítás és bojektum neve (majd ezeen objektumon akarok teesztet végezni)
	
	@Before
	public void init(){ //init metódusban adok neki értek
			teszt = new JuniTeszteEset();
	}
	@Test
	public void teszt1() {  //test case
		int output = teszt.szamolA("aaaaA");
		assertEquals(5, output);
// hány darab a  betű van		
	}
	
	@Test (expected = java.lang.AssertionError.class)
	public void teszt2() {  //test case
		int output = teszt.szamolA("aaaaA");
		assertEquals(6, output);
	
	}
}
