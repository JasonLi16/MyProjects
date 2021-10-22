/**
 * @author Jason Li
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	private GradeBook grbk1;
	private GradeBook grbk2;


	@Before
	public void setUp() throws Exception {
		grbk1 = new GradeBook(5);
		grbk2 = new GradeBook(5);
		
		grbk1.addScore(95.0);
		grbk1.addScore(40.0);
		
		grbk2.addScore(60.0);
		grbk2.addScore(20.0);
		grbk2.addScore(15.0);
	}

	@After
	public void tearDown() throws Exception {
		grbk1 = null;
		grbk2 = null;
		
	}

	@Test
	public void testAddScore() {
		assertTrue(grbk1.toString().equals("95.0 40.0 "));
		assertTrue(grbk2.toString().equals("60.0 20.0 15.0 "));
		assertEquals(2, grbk1.getScoreSize(), 0.001);
	    assertEquals(3, grbk2.getScoreSize(), 0.001);
	}
	@Test
	public void testSum() {
		assertEquals(135.0, grbk1.sum(), 0.0001);
		assertEquals(95.0, grbk2.sum(), 0.0001);
		
		
	}
	@Test
	public void testMinimum() {
		assertEquals(40.0, grbk1.minimum(), 0.001);
	    assertEquals(15.0, grbk2.minimum(), 0.001);
		
	}
	@Test
	public void testFinalScore() {
		assertEquals(95.0, grbk1.finalScore(), 0.001);
	    assertEquals(80.0, grbk2.finalScore(), 0.001);
		
	}
	
	

}
