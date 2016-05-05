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
    public void testTriangle() {
       
        assertEquals("equilateral", triangle.triangle(6,6,6));
        assertEquals("isosceles", triangle.triangle(5,5,6));
        assertEquals("scalene", triangle.triangle(3,4,6));
    }




}
