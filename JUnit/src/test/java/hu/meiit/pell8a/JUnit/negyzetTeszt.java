package hu.meiit.pell8a.JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class negyzetTeszt {
	JuniTeszteEset teszt = null;

	@Before
	public void init(){ 
		teszt = new JuniTeszteEset();
	}
	
	@Test
	public void teszt1() {
		JuniTeszteEset teszt = new JuniTeszteEset();
		int output = teszt.negyzet(5); //kimenet
		assertEquals(25, output);
	}
	// Megadásra került a teszt argumentumában, az elvárt eredmény:
	//hogy megbukik a teszt, így a teszt lefutaása sikeres lesz.
	
	@Test (expected = java.lang.AssertionError.class)
	public void teszt2() {	
		int output = teszt.negyzet(3); //kimenet
		assertEquals(25, output);
	}		
}
