package com.frostphyr.avail;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FloatingPointTest {
	
	private static final float VALUE_FLOAT1 = 2e-4f;
	private static final float VALUE_FLOAT_EQUAL1 = 2e-4f;
	private static final float VALUE_FLOAT_LESS1 = 1e-4f;
	private static final float VALUE_FLOAT_GREATER1 = 3e-4f;
	
	private static final float VALUE_FLOAT2 = 2e-6f;
	private static final float VALUE_FLOAT_EQUAL2 = 2e-6f;
	private static final float VALUE_FLOAT_LESS2 = 1e-6f;
	private static final float VALUE_FLOAT_GREATER2 = 3e-6f;
	
	private static final double VALUE_DOUBLE1 = 2e-8;
	private static final double VALUE_DOUBLE_EQUAL1 = 2e-8;
	private static final double VALUE_DOUBLE_LESS1 = 1e-8;
	private static final double VALUE_DOUBLE_GREATER1 = 3e-8;
	
	private static final double VALUE_DOUBLE2 = 2e-10;
	private static final double VALUE_DOUBLE_EQUAL2 = 2e-10;
	private static final double VALUE_DOUBLE_LESS2 = 1e-10;
	private static final double VALUE_DOUBLE_GREATER2 = 3e-10;
	
	@Test
	public void testEqualsFloat() {
		assertTrue(FloatingPoint.equals(VALUE_FLOAT_EQUAL1, VALUE_FLOAT1));
		assertFalse(FloatingPoint.equals(VALUE_FLOAT_LESS1, VALUE_FLOAT1));
		assertFalse(FloatingPoint.equals(VALUE_FLOAT_GREATER1, VALUE_FLOAT1));
		
		assertTrue(FloatingPoint.equals(VALUE_FLOAT_EQUAL2, VALUE_FLOAT2));
		assertTrue(FloatingPoint.equals(VALUE_FLOAT_LESS2, VALUE_FLOAT2));
		assertTrue(FloatingPoint.equals(VALUE_FLOAT_GREATER2, VALUE_FLOAT2));
	}
	
	@Test
	public void testLessThanFloat() {
		assertFalse(FloatingPoint.lessThan(VALUE_FLOAT_EQUAL1, VALUE_FLOAT1));
		assertTrue(FloatingPoint.lessThan(VALUE_FLOAT_LESS1, VALUE_FLOAT1));
		assertFalse(FloatingPoint.lessThan(VALUE_FLOAT_GREATER1, VALUE_FLOAT1));
		
		assertFalse(FloatingPoint.lessThan(VALUE_FLOAT_EQUAL2, VALUE_FLOAT2));
		assertFalse(FloatingPoint.lessThan(VALUE_FLOAT_LESS2, VALUE_FLOAT2));
		assertFalse(FloatingPoint.lessThan(VALUE_FLOAT_GREATER2, VALUE_FLOAT2));
	}
	
	@Test
	public void testGreaterThanFloat() {
		assertFalse(FloatingPoint.greaterThan(VALUE_FLOAT_EQUAL1, VALUE_FLOAT1));
		assertFalse(FloatingPoint.greaterThan(VALUE_FLOAT_LESS1, VALUE_FLOAT1));
		assertTrue(FloatingPoint.greaterThan(VALUE_FLOAT_GREATER1, VALUE_FLOAT1));
		
		assertFalse(FloatingPoint.greaterThan(VALUE_FLOAT_EQUAL2, VALUE_FLOAT2));
		assertFalse(FloatingPoint.greaterThan(VALUE_FLOAT_LESS2, VALUE_FLOAT2));
		assertFalse(FloatingPoint.greaterThan(VALUE_FLOAT_GREATER2, VALUE_FLOAT2));
	}
	
	@Test
	public void testLessThanOrEqualFloat() {
		assertTrue(FloatingPoint.lessThanOrEqual(VALUE_FLOAT_EQUAL1, VALUE_FLOAT1));
		assertTrue(FloatingPoint.lessThanOrEqual(VALUE_FLOAT_LESS1, VALUE_FLOAT1));
		assertFalse(FloatingPoint.lessThanOrEqual(VALUE_FLOAT_GREATER1, VALUE_FLOAT1));
		
		assertTrue(FloatingPoint.lessThanOrEqual(VALUE_FLOAT_EQUAL2, VALUE_FLOAT2));
		assertTrue(FloatingPoint.lessThanOrEqual(VALUE_FLOAT_LESS2, VALUE_FLOAT2));
		assertTrue(FloatingPoint.lessThanOrEqual(VALUE_FLOAT_GREATER2, VALUE_FLOAT2));
	}
	
	@Test
	public void testGreaterThanOrEqualFloat() {
		assertTrue(FloatingPoint.greaterThanOrEqual(VALUE_FLOAT_EQUAL1, VALUE_FLOAT1));
		assertFalse(FloatingPoint.greaterThanOrEqual(VALUE_FLOAT_LESS1, VALUE_FLOAT1));
		assertTrue(FloatingPoint.greaterThanOrEqual(VALUE_FLOAT_GREATER1, VALUE_FLOAT1));
		
		assertTrue(FloatingPoint.greaterThanOrEqual(VALUE_FLOAT_EQUAL2, VALUE_FLOAT2));
		assertTrue(FloatingPoint.greaterThanOrEqual(VALUE_FLOAT_LESS2, VALUE_FLOAT2));
		assertTrue(FloatingPoint.greaterThanOrEqual(VALUE_FLOAT_GREATER2, VALUE_FLOAT2));
	}
	
	@Test
	public void testEqualsDouble() {
		assertTrue(FloatingPoint.equals(VALUE_DOUBLE_EQUAL1, VALUE_DOUBLE1));
		assertFalse(FloatingPoint.equals(VALUE_DOUBLE_LESS1, VALUE_DOUBLE1));
		assertFalse(FloatingPoint.equals(VALUE_DOUBLE_GREATER1, VALUE_DOUBLE1));
		
		assertTrue(FloatingPoint.equals(VALUE_DOUBLE_EQUAL2, VALUE_DOUBLE2));
		assertTrue(FloatingPoint.equals(VALUE_DOUBLE_LESS2, VALUE_DOUBLE2));
		assertTrue(FloatingPoint.equals(VALUE_DOUBLE_GREATER2, VALUE_DOUBLE2));
	}
	
	@Test
	public void testLessThanDouble() {
		assertFalse(FloatingPoint.lessThan(VALUE_DOUBLE_EQUAL1, VALUE_DOUBLE1));
		assertTrue(FloatingPoint.lessThan(VALUE_DOUBLE_LESS1, VALUE_DOUBLE1));
		assertFalse(FloatingPoint.lessThan(VALUE_DOUBLE_GREATER1, VALUE_DOUBLE1));
		
		assertFalse(FloatingPoint.lessThan(VALUE_DOUBLE_EQUAL2, VALUE_DOUBLE2));
		assertFalse(FloatingPoint.lessThan(VALUE_DOUBLE_LESS2, VALUE_DOUBLE2));
		assertFalse(FloatingPoint.lessThan(VALUE_DOUBLE_GREATER2, VALUE_DOUBLE2));
	}
	
	@Test
	public void testGreaterThanDouble() {
		assertFalse(FloatingPoint.greaterThan(VALUE_DOUBLE_EQUAL1, VALUE_DOUBLE1));
		assertFalse(FloatingPoint.greaterThan(VALUE_DOUBLE_LESS1, VALUE_DOUBLE1));
		assertTrue(FloatingPoint.greaterThan(VALUE_DOUBLE_GREATER1, VALUE_DOUBLE1));
		
		assertFalse(FloatingPoint.greaterThan(VALUE_DOUBLE_EQUAL2, VALUE_DOUBLE2));
		assertFalse(FloatingPoint.greaterThan(VALUE_DOUBLE_LESS2, VALUE_DOUBLE2));
		assertFalse(FloatingPoint.greaterThan(VALUE_DOUBLE_GREATER2, VALUE_DOUBLE2));
	}
	
	@Test
	public void testLessThanOrEqualDouble() {
		assertTrue(FloatingPoint.lessThanOrEqual(VALUE_DOUBLE_EQUAL1, VALUE_DOUBLE1));
		assertTrue(FloatingPoint.lessThanOrEqual(VALUE_DOUBLE_LESS1, VALUE_DOUBLE1));
		assertFalse(FloatingPoint.lessThanOrEqual(VALUE_DOUBLE_GREATER1, VALUE_DOUBLE1));
		
		assertTrue(FloatingPoint.lessThanOrEqual(VALUE_DOUBLE_EQUAL2, VALUE_DOUBLE2));
		assertTrue(FloatingPoint.lessThanOrEqual(VALUE_DOUBLE_LESS2, VALUE_DOUBLE2));
		assertTrue(FloatingPoint.lessThanOrEqual(VALUE_DOUBLE_GREATER2, VALUE_DOUBLE2));
	}
	
	@Test
	public void testGreaterThanOrEqualDouble() {
		assertTrue(FloatingPoint.greaterThanOrEqual(VALUE_DOUBLE_EQUAL1, VALUE_DOUBLE1));
		assertFalse(FloatingPoint.greaterThanOrEqual(VALUE_DOUBLE_LESS1, VALUE_DOUBLE1));
		assertTrue(FloatingPoint.greaterThanOrEqual(VALUE_DOUBLE_GREATER1, VALUE_DOUBLE1));
		
		assertTrue(FloatingPoint.greaterThanOrEqual(VALUE_DOUBLE_EQUAL2, VALUE_DOUBLE2));
		assertTrue(FloatingPoint.greaterThanOrEqual(VALUE_DOUBLE_LESS2, VALUE_DOUBLE2));
		assertTrue(FloatingPoint.greaterThanOrEqual(VALUE_DOUBLE_GREATER2, VALUE_DOUBLE2));
	}

}
