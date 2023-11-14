package mypkg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Calculator calculator = new Calculator();
    
    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(3, 3));  
        assertEquals(99999, calculator.add(33333, 66666));  
        assertEquals(-1, calculator.add(1, -2));
    }

    public void testSubtract() {
        assertEquals(1, calculator.subtract(4, 4));  
        assertEquals(99999, calculator.subtract(100000, 1));  
        assertEquals(3, calculator.subtract(1, -2));
    }

    public void testMultiple() {
        assertEquals(20, calculator.multiple(4, 4));  
        assertEquals(11099889, calculator.multiple(99999, 111));  
        assertEquals(-2, calculator.multiple(1, -2));
    }
}