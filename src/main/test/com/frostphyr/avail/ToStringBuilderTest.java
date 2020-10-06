package com.frostphyr.avail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class ToStringBuilderTest {
	
	private ToStringBuilder builder;
	
	@Before
	public void initialize() {
		builder = ToStringBuilder.forClassName("ToStringBuilderTest");
	}
	
	@Test
	public void testForClassName() {
		assertEquals("ToStringBuilderTest[]", builder.toString());
		assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {

			@Override
			public void run() throws Throwable {
				ToStringBuilder.forClassName(null);
			}
			
		});
	}
	
	@Test
	public void testForClass() {
		assertEquals("ToStringBuilderTest[]", ToStringBuilder.forClass(ToStringBuilderTest.class).toString());
		assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {

			@Override
			public void run() throws Throwable {
				ToStringBuilder.forClass(null);
			}
			
		});
	}
	
	@Test
	public void testAppend() {
		builder.append("name1", (Object) null);
		assertEquals("ToStringBuilderTest[name1=null]", builder.toString());
		builder.append("name2", "value2")
				.append("name3", 3)
				.append("name4", 4L)
				.append("name5", new String[] {"A", "B", "C"})
				.append("name6", Arrays.asList("C", "B", "A"));
		assertEquals("ToStringBuilderTest[name1=null,name2=value2,name3=3,name4=4,name5=[A,B,C],name6=[C,B,A]]", builder.toString());
		assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {

			@Override
			public void run() throws Throwable {
				builder.append(null, "String1");
			}
			
		});
	}

}
