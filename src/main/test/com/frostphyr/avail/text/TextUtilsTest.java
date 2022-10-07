package com.frostphyr.avail.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class TextUtilsTest {
	
	@Test
	public void testSubstring1() {
		assertEquals("A𝔼Ќ", TextUtils.substring("A𝔼Ќ", 0, SurrogatePairPolicy.SPLIT));
		assertEquals("𝔼Ќ", TextUtils.substring("A𝔼Ќ", 1, SurrogatePairPolicy.SPLIT));
		assertEquals('\uDD3C' + "Ќ", TextUtils.substring("A𝔼Ќ", 2, SurrogatePairPolicy.SPLIT));
		assertEquals("Ќ", TextUtils.substring("A𝔼Ќ", 3, SurrogatePairPolicy.SPLIT));
		assertEquals("", TextUtils.substring("A𝔼Ќ", 4, SurrogatePairPolicy.SPLIT));
		
		assertEquals("A𝔼Ќ", TextUtils.substring("A𝔼Ќ", 0, SurrogatePairPolicy.KEEP));
		assertEquals("𝔼Ќ", TextUtils.substring("A𝔼Ќ", 1, SurrogatePairPolicy.KEEP));
		assertEquals("𝔼Ќ", TextUtils.substring("A𝔼Ќ", 2, SurrogatePairPolicy.KEEP));
		assertEquals("Ќ", TextUtils.substring("A𝔼Ќ", 3, SurrogatePairPolicy.KEEP));
		assertEquals("", TextUtils.substring("A𝔼Ќ", 4, SurrogatePairPolicy.KEEP));
		
		assertEquals("A𝔼Ќ", TextUtils.substring("A𝔼Ќ", 0, SurrogatePairPolicy.DISCARD));
		assertEquals("𝔼Ќ", TextUtils.substring("A𝔼Ќ", 1, SurrogatePairPolicy.DISCARD));
		assertEquals("Ќ", TextUtils.substring("A𝔼Ќ", 2, SurrogatePairPolicy.DISCARD));
		assertEquals("Ќ", TextUtils.substring("A𝔼Ќ", 3, SurrogatePairPolicy.DISCARD));
		assertEquals("", TextUtils.substring("A𝔼Ќ", 4, SurrogatePairPolicy.DISCARD));
		
		assertThrows(IllegalArgumentException.class, () -> TextUtils.substring(null, 0, SurrogatePairPolicy.SPLIT));
		assertThrows(IllegalArgumentException.class, () -> TextUtils.substring("A𝔼Ќ", -1, SurrogatePairPolicy.SPLIT));
		assertThrows(IllegalArgumentException.class, () -> TextUtils.substring("A𝔼Ќ", 5, SurrogatePairPolicy.SPLIT));
		assertThrows(IllegalArgumentException.class, () -> TextUtils.substring("A𝔼Ќ", 0, null));
	}
	
	@Test
	public void testSubstring2() {
		assertEquals("", TextUtils.substring("A𝔼Ќ", 0, 0, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertEquals("A", TextUtils.substring("A𝔼Ќ", 0, 1, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertEquals("A" + '\uD835', TextUtils.substring("A𝔼Ќ", 0, 2, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertEquals("A𝔼", TextUtils.substring("A𝔼Ќ", 0, 3, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertEquals("A𝔼Ќ", TextUtils.substring("A𝔼Ќ", 0, 4, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertEquals("𝔼Ќ", TextUtils.substring("A𝔼Ќ", 1, 4, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertEquals('\uDD3C' + "Ќ", TextUtils.substring("A𝔼Ќ", 2, 4, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertEquals("Ќ", TextUtils.substring("A𝔼Ќ", 3, 4, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertEquals("", TextUtils.substring("A𝔼Ќ", 4, 4, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		
		assertEquals("", TextUtils.substring("A𝔼Ќ", 0, 0, SurrogatePairPolicy.KEEP, SurrogatePairPolicy.KEEP));
		assertEquals("A", TextUtils.substring("A𝔼Ќ", 0, 1, SurrogatePairPolicy.KEEP, SurrogatePairPolicy.KEEP));
		assertEquals("A𝔼", TextUtils.substring("A𝔼Ќ", 0, 2, SurrogatePairPolicy.KEEP, SurrogatePairPolicy.KEEP));
		assertEquals("A𝔼", TextUtils.substring("A𝔼Ќ", 0, 3, SurrogatePairPolicy.KEEP, SurrogatePairPolicy.KEEP));
		assertEquals("A𝔼Ќ", TextUtils.substring("A𝔼Ќ", 0, 4, SurrogatePairPolicy.KEEP, SurrogatePairPolicy.KEEP));
		assertEquals("𝔼Ќ", TextUtils.substring("A𝔼Ќ", 1, 4, SurrogatePairPolicy.KEEP, SurrogatePairPolicy.KEEP));
		assertEquals("𝔼Ќ", TextUtils.substring("A𝔼Ќ", 2, 4, SurrogatePairPolicy.KEEP, SurrogatePairPolicy.KEEP));
		assertEquals("Ќ", TextUtils.substring("A𝔼Ќ", 3, 4, SurrogatePairPolicy.KEEP, SurrogatePairPolicy.KEEP));
		assertEquals("", TextUtils.substring("A𝔼Ќ", 4, 4, SurrogatePairPolicy.KEEP, SurrogatePairPolicy.KEEP));
		
		assertEquals("", TextUtils.substring("A𝔼Ќ", 0, 0, SurrogatePairPolicy.DISCARD, SurrogatePairPolicy.DISCARD));
		assertEquals("A", TextUtils.substring("A𝔼Ќ", 0, 1, SurrogatePairPolicy.DISCARD, SurrogatePairPolicy.DISCARD));
		assertEquals("A", TextUtils.substring("A𝔼Ќ", 0, 2, SurrogatePairPolicy.DISCARD, SurrogatePairPolicy.DISCARD));
		assertEquals("A𝔼", TextUtils.substring("A𝔼Ќ", 0, 3, SurrogatePairPolicy.DISCARD, SurrogatePairPolicy.DISCARD));
		assertEquals("A𝔼Ќ", TextUtils.substring("A𝔼Ќ", 0, 4, SurrogatePairPolicy.DISCARD, SurrogatePairPolicy.DISCARD));
		assertEquals("𝔼Ќ", TextUtils.substring("A𝔼Ќ", 1, 4, SurrogatePairPolicy.DISCARD, SurrogatePairPolicy.DISCARD));
		assertEquals("Ќ", TextUtils.substring("A𝔼Ќ", 2, 4, SurrogatePairPolicy.DISCARD, SurrogatePairPolicy.DISCARD));
		assertEquals("Ќ", TextUtils.substring("A𝔼Ќ", 3, 4, SurrogatePairPolicy.DISCARD, SurrogatePairPolicy.DISCARD));
		assertEquals("", TextUtils.substring("A𝔼Ќ", 4, 4, SurrogatePairPolicy.DISCARD, SurrogatePairPolicy.DISCARD));
		
		assertThrows(IllegalArgumentException.class, () -> TextUtils.substring(null, 0, 0, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertThrows(IllegalArgumentException.class, () -> TextUtils.substring("A𝔼Ќ", -1, 0, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertThrows(IllegalArgumentException.class, () -> TextUtils.substring("A𝔼Ќ", 0, 5, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertThrows(IllegalArgumentException.class, () -> TextUtils.substring("A𝔼Ќ", 3, 2, SurrogatePairPolicy.SPLIT, SurrogatePairPolicy.SPLIT));
		assertThrows(IllegalArgumentException.class, () -> TextUtils.substring("A𝔼Ќ", 0, 0, null, SurrogatePairPolicy.SPLIT));
		assertThrows(IllegalArgumentException.class, () -> TextUtils.substring("A𝔼Ќ", 0, 0, SurrogatePairPolicy.SPLIT, null));
	}
	
	@Test
	public void testJoin() {
		assertEquals("a,b,c", TextUtils.join(new String[] {"a", "b", "c"}, ','));
		assertEquals("a--b--c", TextUtils.join(new String[] {"a", "b", "c"}, "--"));
		assertEquals("a0b0c", TextUtils.join(new String[] {"a", "b", "c"}, 0));
		assertEquals("abc", TextUtils.join(new String[] {"a", "b", "c"}, null));
		assertEquals("a,null,c", TextUtils.join(new String[] {"a", null, "c"}, ','));
		assertEquals("1,2,3", TextUtils.join(new byte[] {1, 2, 3}, ','));
		assertEquals("1,2,3", TextUtils.join(new short[] {1, 2, 3}, ','));
		assertEquals("1,2,3", TextUtils.join(new int[] {1, 2, 3}, ','));
		assertEquals("1,2,3", TextUtils.join(new long[] {1, 2, 3}, ','));
		assertEquals("1.1,2.2,3.3", TextUtils.join(new float[] {1.1f, 2.2f, 3.3f}, ','));
		assertEquals("1.1,2.2,3.3", TextUtils.join(new double[] {1.1, 2.2, 3.3}, ','));
		assertEquals("a,b,c", TextUtils.join(new char[] {'a', 'b', 'c'}, ','));
		assertEquals("true,false,true", TextUtils.join(new boolean[] {true, false, true}, ','));
		assertThrows(IllegalArgumentException.class, () -> TextUtils.join((Object[]) null, ','));
	}

}
