package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutoGumaTest {

	AutoGuma a;
	
	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetMarkaModel1() {
		a.setMarkaModel("Guma");
		assertEquals(a.getMarkaModel(),"Guma");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModel2() {
		a.setMarkaModel("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModel3() {
		a.setMarkaModel(null);
	}

	@Test
	public void testSetPrecnik1() {
		a.setPrecnik(18);
		assertEquals(a.getPrecnik(),18);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnik2() {
		a.setPrecnik(67);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnik3() {
		a.setPrecnik(10);
	}

	@Test 
	public void testSetSirina1() {
		a.setSirina(200);
		assertEquals(a.getSirina(),200);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirina2() {
		a.setSirina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirina3() {
		a.setSirina(900);
	}

	@Test
	public void testSetVisina1() {
		a.setVisina(50);
		assertEquals(a.getVisina(),50);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisina2() {
		a.setVisina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisina3() {
		a.setVisina(100);
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Guma");
		a.setVisina(50);
		a.setSirina(200);
		a.setPrecnik(20);
		
		assertEquals("AutoGuma [markaModel=Guma, precnik=20, sirina=200, visina=50]" , a.toString());
	}

	@Test
	public void testEqualsObject() {
		a.setMarkaModel("Guma");
		a.setVisina(50);
		a.setSirina(200);
		a.setPrecnik(20);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Guma");
		a2.setVisina(50);
		a2.setSirina(200);
		a2.setPrecnik(20);
		
		assertEquals(a.equals(a2),true);
		
	}
	
	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Guma");
		a.setVisina(50);
		a.setSirina(200);
		a.setPrecnik(20);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Guma");
		a2.setVisina(60);
		a2.setSirina(200);
		a2.setPrecnik(20);
		
		assertEquals(a.equals(a2),false);
		
	}

}
