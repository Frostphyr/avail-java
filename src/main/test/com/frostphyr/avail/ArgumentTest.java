package com.frostphyr.avail;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class ArgumentTest {

	@Test
	public void testCheckNotNull() {
		Object o = new Object();
		assertEquals(o, Argument.checkNotNull(o));
		assertThrows(IllegalArgumentException.class, () -> Argument.checkNotNull(null));
	}
	
	@Test
	public void testCheckGreaterThan() {
		assertEquals(1, Argument.checkGreaterThan(1, 0));
		assertThrows(IllegalArgumentException.class, () -> Argument.checkGreaterThan(0, 0));
	}
	
	@Test
	public void testCheckGreaterThanOrEqual() {
		assertEquals(1, Argument.checkGreaterThanOrEqual(1, 0));
		assertEquals(0, Argument.checkGreaterThanOrEqual(0, 0));
		assertThrows(IllegalArgumentException.class, () -> Argument.checkGreaterThanOrEqual(-1, 0));
	}
	
	@Test
	public void testCheckLessThan() {
		assertEquals(-1, Argument.checkLessThan(-1, 0));
		assertThrows(IllegalArgumentException.class, () -> Argument.checkLessThan(0, 0));
	}
	
	@Test
	public void testCheckLessThanOrEqual() {
		assertEquals(-1, Argument.checkLessThanOrEqual(-1, 0));
		assertEquals(0, Argument.checkLessThanOrEqual(0, 0));
		assertThrows(IllegalArgumentException.class, () -> Argument.checkLessThanOrEqual(1, 0));
	}
	
	@Test
	public void testCheckPositive() {
		assertEquals(1, Argument.checkPositive(1));
		assertEquals(0, Argument.checkPositive(0));
		assertThrows(IllegalArgumentException.class, () -> Argument.checkPositive(-1));
	}
	
	@Test
	public void testCheckNegative() {
		assertEquals(-1, Argument.checkNegative(-1));
		assertThrows(IllegalArgumentException.class, () -> Argument.checkNegative(0));
	}
	
	@Test
	public void testCheckInsideRange() {
		assertEquals(1, Argument.checkInsideRange(1, 0, 2));
		assertEquals(0, Argument.checkInsideRange(0, 0, 2));
		assertEquals(2, Argument.checkInsideRange(2, 0, 2));
		assertThrows(IllegalArgumentException.class, () -> Argument.checkInsideRange(-1, 0, 2));
		assertThrows(IllegalArgumentException.class, () -> Argument.checkInsideRange(3, 0, 2));
	}
	
	@Test
	public void testCheckPercent() {
		for (int i = 0; i <= 100; i++) {
			assertEquals(i, Argument.checkPercent(i));
		}
		
		assertThrows(IllegalArgumentException.class, () -> Argument.checkPercent(-1));
		assertThrows(IllegalArgumentException.class, () -> Argument.checkPercent(101));
	}
	
	@Test
	public void testCheckLength() {
		int[] array = new int[] {1, 2, 3};
		assertArrayEquals(array, Argument.checkLength(array, 3));
		assertThrows(IllegalArgumentException.class, () -> Argument.checkLength(array, 2));
	}

}
