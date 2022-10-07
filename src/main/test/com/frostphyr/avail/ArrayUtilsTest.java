package com.frostphyr.avail;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class ArrayUtilsTest {
	
	@Test
	public void testBoxByte() {
		assertArrayEquals(new Byte[] {1, 2, 3}, ArrayUtils.box(new byte[] {1, 2, 3}));
		assertArrayEquals(new Byte[0], ArrayUtils.box(new byte[0]));
		assertThrows(IllegalArgumentException.class, () -> ArrayUtils.box((byte[]) null));
	}
	
	@Test
	public void testBoxShort() {
		assertArrayEquals(new Short[] {1, 2, 3}, ArrayUtils.box(new short[] {1, 2, 3}));
		assertArrayEquals(new Short[0], ArrayUtils.box(new short[0]));
		assertThrows(IllegalArgumentException.class, () -> ArrayUtils.box((short[]) null));
	}
	
	@Test
	public void testBoxInteger() {
		assertArrayEquals(new Integer[] {1, 2, 3}, ArrayUtils.box(new int[] {1, 2, 3}));
		assertArrayEquals(new Integer[0], ArrayUtils.box(new int[0]));
		assertThrows(IllegalArgumentException.class, () -> ArrayUtils.box((int[]) null));
	}
	
	@Test
	public void testBoxLong() {
		assertArrayEquals(new Long[] {1L, 2L, 3L}, ArrayUtils.box(new long[] {1, 2, 3}));
		assertArrayEquals(new Long[0], ArrayUtils.box(new long[0]));
		assertThrows(IllegalArgumentException.class, () -> ArrayUtils.box((long[]) null));
	}
	
	@Test
	public void testBoxFloat() {
		assertArrayEquals(new Float[] {1.1f, 2.2f, 3.3f}, ArrayUtils.box(new float[] {1.1f, 2.2f, 3.3f}));
		assertArrayEquals(new Float[0], ArrayUtils.box(new float[0]));
		assertThrows(IllegalArgumentException.class, () -> ArrayUtils.box((float[]) null));
	}
	
	@Test
	public void testBoxDouble() {
		assertArrayEquals(new Double[] {1.1, 2.2, 3.3}, ArrayUtils.box(new double[] {1.1, 2.2, 3.3}));
		assertArrayEquals(new Double[0], ArrayUtils.box(new double[0]));
		assertThrows(IllegalArgumentException.class, () -> ArrayUtils.box((double[]) null));
	}
	
	@Test
	public void testBoxCharacter() {
		assertArrayEquals(new Character[] {'a', 'b', 'c'}, ArrayUtils.box(new char[] {'a', 'b', 'c'}));
		assertArrayEquals(new Character[0], ArrayUtils.box(new char[0]));
		assertThrows(IllegalArgumentException.class, () -> ArrayUtils.box((char[]) null));
	}
	
	@Test
	public void testBoxBoolean() {
		assertArrayEquals(new Boolean[] {true, false, true}, ArrayUtils.box(new boolean[] {true, false, true}));
		assertArrayEquals(new Boolean[0], ArrayUtils.box(new boolean[0]));
		assertThrows(IllegalArgumentException.class, () -> ArrayUtils.box((boolean[]) null));
	}
	
	@Test
	public void testUnboxByte() {
		assertArrayEquals(new byte[] {1, 2, 3}, ArrayUtils.unbox(new Byte[] {1, 2, 3}));
		assertArrayEquals(new byte[0], ArrayUtils.unbox(new Byte[0]));
		//assertArrayEquals(new byte[] {1, 2, 3}, ArrayUtils.unbox(new Byte[] {1, null, 3}));
		assertThrows(IllegalArgumentException.class, () -> ArrayUtils.unbox((Byte[]) null));
	}

}
