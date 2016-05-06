package andycpp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
    private static Triangle triangle=new Triangle();
	@Before
	public void setUp() throws Exception {
	}

	@Test
    public void testEquilateral() {
        assertEquals("equilateral", triangle.triangle(6,6,6));
    }
	
	@Test
    public void testIsosceles() {
        assertEquals("isosceles", triangle.triangle(5,5,6));
    }
	
	@Test
    public void testScalene() {
        assertEquals("scalene", triangle.triangle(3,4,6));
    }
	



}
