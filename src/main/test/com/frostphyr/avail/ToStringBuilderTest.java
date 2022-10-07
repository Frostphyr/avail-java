package com.frostphyr.avail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ToStringBuilderTest {
	
	private ToStringBuilder builder;
	
	@Before
	public void initialize() {
		builder = ToStringBuilder.forClassName("ToStringBuilderTest");
	}
	
	@Test
	public void testForClassName() {
		assertEquals("ToStringBuilderTest[]", builder.toString());
		assertThrows(IllegalArgumentException.class, () -> ToStringBuilder.forClassName(null));
	}
	
	@Test
	public void testForClass() {
		assertEquals("ToStringBuilderTest[]", ToStringBuilder.forClass(ToStringBuilderTest.class).toString());
		assertThrows(IllegalArgumentException.class, () -> ToStringBuilder.forClass(null));
	}
	
	@Test
	public void testForObject() {
		assertEquals("ToStringBuilderTest[]", ToStringBuilder.forObject(this).toString());
		assertThrows(IllegalArgumentException.class, () -> ToStringBuilder.forObject(null));
	}
	
	@Test
	public void testAppend() {
		builder.append("name1", (Object) null);
		assertEquals("ToStringBuilderTest[name1=null]", builder.toString());
		builder.append("name2", "value2")
				.append("name3", 3)
				.append("name4", 4L)
				.append("name5", false)
				.append("name6", new String[] {"A", "B", "C"})
				.append("name7", Arrays.asList("C", "B", "A"));
		assertEquals("ToStringBuilderTest[name1=null,name2=value2,name3=3,name4=4,name5=false,name6=[A,B,C],name7=[C,B,A]]", builder.toString());
		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		builder.append("name8", map);
		assertEquals("ToStringBuilderTest[name1=null,name2=value2,name3=3,name4=4,name5=false,name6=[A,B,C],name7=[C,B,A],name8=[key1>value1]]", builder.toString());
		assertThrows(IllegalArgumentException.class, () -> builder.append(null, "String1"));
	}

}
