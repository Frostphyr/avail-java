package com.frostphyr.avail;

import java.util.Iterator;
import java.util.Map;

import com.frostphyr.avail.text.StringConstants;

/**
 * A utility builder class to simplify the creation of a {@link String} for 
 * {@link Object#toString()}.
 * <p>
 * The builder uses a class name and any number of name-value pairs. The 
 * format of the output is:
 * <p>
 * {@code ClassName[name=value,arrayName=[value,value],mapName=[key>value]}
 * 
 * @since 1.0
 */
public class ToStringBuilder {
	
	private StringBuilder builder = new StringBuilder();
	
	/**
	 * Creates a new {@link ToStringBuilder} for {@code className}.
	 * 
	 * @param className the name of the {@link Class} whose string is being 
	 * built
	 * @return the created builder
	 * @throws IllegalArgumentException if {@code className} is {@code null}
	 */
	public static ToStringBuilder forClassName(String className) {
		Argument.checkNotNull(className, "className");
		ToStringBuilder builder = new ToStringBuilder();
		builder.builder.append(className)
				.append('[');
		return builder;
	}
	
	/**
	 * Creates a new {@link ToStringBuilder} for {@code clazz}. This is 
	 * equivalent to calling {@link #forClassName(String)} with 
	 * {@link Class#getSimpleName()}.
	 * 
	 * @param clazz the {@link Class} whose string is being built
	 * @return the created builder
	 * @throws IllegalArgumentException if {@code clazz} is {@code null}
	 */
	public static ToStringBuilder forClass(Class<?> clazz) {
		return forClassName(Argument.checkNotNull(clazz, "clazz").getSimpleName());
	}
	
	/**
	 * Creates a new {@link ToStringBuilder} for {@code object}. This is 
	 * equivalent to calling {@link #forClass(Class)} with 
	 * {@link Object#getClass()}.
	 * 
	 * @param object the {@link Object} whose string is being built
	 * @return the created builder
	 * @throws IllegalArgumentException if {@code object} is {@code null}
	 * @since 1.5
	 */
	public static ToStringBuilder forObject(Object object) {
		return forClass(Argument.checkNotNull(object, "object").getClass());
	}
	
	/**
	 * Empty constructor; use one of the static methods for creation.
	 * 
	 * @since 1.5
	 */
	protected ToStringBuilder() {
	}
	
	/**
	 * Appends the {@code name}-{@code value} pair. This will use the format 
	 * {@code name=value}. The value will use its respective 
	 * {@link Object#toString()}, or {@code "null"} will be used if it is 
	 * {@code null}.
	 * 
	 * @param name the name of {@code value}
	 * @param value the value to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, Object value) {
		appendName(name).append(value);
		return this;
	}
	
	/**
	 * Appends the {@code name}-{@code value} pair. This will use the format 
	 * {@code name=value}.
	 * 
	 * @param name the name of {@code value}
	 * @param value the value to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, int value) {
		return append(name, Integer.toString(value));
	}
	
	/**
	 * Appends the {@code name}-{@code value} pair. This will use the format 
	 * {@code name=value}.
	 * 
	 * @param name the name of {@code value}
	 * @param value the value to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, long value) {
		return append(name, Long.toString(value));
	}
	
	/**
	 * Appends the {@code name}-{@code value} pair. This will use the format 
	 * {@code name=value}.
	 * 
	 * @param name the name of {@code value}
	 * @param value the value to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, float value) {
		return append(name, Float.toString(value));
	}
	
	/**
	 * Appends the {@code name}-{@code value} pair. This will use the format 
	 * {@code name=value}.
	 * 
	 * @param name the name of {@code value}
	 * @param value the value to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, double value) {
		return append(name, Double.toString(value));
	}
	
	/**
	 * Appends the {@code name}-{@code value} pair. This will use the format 
	 * {@code name=value}.
	 * 
	 * @param name the name of {@code value}
	 * @param value the value to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, char value) {
		return append(name, Character.toString(value));
	}
	
	/**
	 * Appends the {@code name}-{@code value} pair. This will use the format 
	 * {@code name=value}.
	 * 
	 * @param name the name of {@code value}
	 * @param value the value to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 * @since 1.5
	 */
	public ToStringBuilder append(String name, boolean value) {
		return append(name, Boolean.toString(value));
	}
	
	/**
	 * Appends the {@code name}-{@code map} pair. This will use the format 
	 * {@code name=[key>value,key>value]}. The key and value of {@code map} 
	 * will use its respective {@link Object#toString()}, or {@code "null"} 
	 * will be used if it is {@code null}.
	 * 
	 * @param <K> the type of key
	 * @param <V> the type of value
	 * @param name the name of {@code map}
	 * @param map the {@link Map} to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 * @since 1.5
	 */
	public <K, V> ToStringBuilder append(String name, Map<K, V> map) {
		appendName(name);
		if (map == null) {
			builder.append(StringConstants.NULL);
		} else {
			builder.append('[');
			for (Iterator<Map.Entry<K, V>> it = map.entrySet().iterator(); it.hasNext(); ) {
				Map.Entry<K, V> entry = it.next();
				builder.append(entry.getKey())
						.append('>')
						.append(entry.getValue());
				if (it.hasNext()) {
					builder.append(',');
				}
			}
			builder.append(']');
		}
		return this;
	}
	
	/**
	 * Appends the {@code name}-{@code iterable} pair. This will use the 
	 * format {@code name=[value,value]}. The elements of {@code iterable} 
	 * will use its {@link Object#toString()}, or {@code "null"} will be used 
	 * if it is {@code null}.
	 * 
	 * @param name the name of {@code iterable}
	 * @param map the {@link Iterable} to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 * @since 1.5
	 */
	public ToStringBuilder append(String name, Iterable<?> iterable) {
		appendName(name);
		if (iterable == null) {
			builder.append(StringConstants.NULL);
		} else {
			builder.append('[');
			for (Iterator<?> it = iterable.iterator(); it.hasNext(); ) {
				builder.append(it.next());
				if (it.hasNext()) {
					builder.append(',');
				}
			}
			builder.append(']');
		}
		return this;
	}
	
	/**
	 * Appends the {@code name}-{@code values} pair. This will use the format 
	 * {@code name=[value,value]}. Each value of {@code values} will use its 
	 * {@link Object#toString()}, or {@code "null"} will be used if 
	 * {@code values} or a value is {@code null}.
	 * 
	 * @param name the name of {@code values}
	 * @param values the values to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, Object[] values) {
		return append(name, ArrayUtils.asList(values));
	}
	
	/**
	 * Appends the {@code name}-{@code values} pair. This will use the format 
	 * {@code name=[value,value]}. Each value of {@code values} will use its 
	 * {@link Object#toString()}, or {@code "null"} will be used if 
	 * {@code values} is {@code null}.
	 * 
	 * @param name the name of {@code values}
	 * @param values the values to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, byte[] values) {
		return append(name, ArrayUtils.asList(values));
	}
	
	/**
	 * Appends the {@code name}-{@code values} pair. This will use the format 
	 * {@code name=[value,value]}. Each value of {@code values} will use its 
	 * {@link Object#toString()}, or {@code "null"} will be used if 
	 * {@code values} is {@code null}.
	 * 
	 * @param name the name of {@code values}
	 * @param values the values to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, short[] values) {
		return append(name, ArrayUtils.asList(values));
	}
	
	/**
	 * Appends the {@code name}-{@code values} pair. This will use the format 
	 * {@code name=[value,value]}. Each value of {@code values} will use its 
	 * {@link Object#toString()}, or {@code "null"} will be used if 
	 * {@code values} is {@code null}.
	 * 
	 * @param name the name of {@code values}
	 * @param values the values to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, int[] values) {
		return append(name, ArrayUtils.asList(values));
	}
	
	/**
	 * Appends the {@code name}-{@code values} pair. This will use the format 
	 * {@code name=[value,value]}. Each value of {@code values} will use its 
	 * {@link Object#toString()}, or {@code "null"} will be used if 
	 * {@code values} is {@code null}.
	 * 
	 * @param name the name of {@code values}
	 * @param values the values to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, long[] values) {
		return append(name, ArrayUtils.asList(values));
	}
	
	/**
	 * Appends the {@code name}-{@code values} pair. This will use the format 
	 * {@code name=[value,value]}. Each value of {@code values} will use its 
	 * {@link Object#toString()}, or {@code "null"} will be used if 
	 * {@code values} is {@code null}.
	 * 
	 * @param name the name of {@code values}
	 * @param values the values to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, float[] values) {
		return append(name, ArrayUtils.asList(values));
	}
	
	/**
	 * Appends the {@code name}-{@code values} pair. This will use the format 
	 * {@code name=[value,value]}. Each value of {@code values} will use its 
	 * {@link Object#toString()}, or {@code "null"} will be used if 
	 * {@code values} is {@code null}.
	 * 
	 * @param name the name of {@code values}
	 * @param values the values to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, double[] values) {
		return append(name, ArrayUtils.asList(values));
	}
	
	/**
	 * Appends the {@code name}-{@code values} pair. This will use the format 
	 * {@code name=[value,value]}. Each value of {@code values} will use its 
	 * {@link Object#toString()}, or {@code "null"} will be used if 
	 * {@code values} is {@code null}.
	 * 
	 * @param name the name of {@code values}
	 * @param values the values to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 */
	public ToStringBuilder append(String name, char[] values) {
		return append(name, ArrayUtils.asList(values));
	}
	
	/**
	 * Appends the {@code name}-{@code values} pair. This will use the format 
	 * {@code name=[value,value]}. Each value of {@code values} will use its 
	 * {@link Object#toString()}, or {@code "null"} will be used if 
	 * {@code values} is {@code null}.
	 * 
	 * @param name the name of {@code values}
	 * @param values the values to append
	 * @return this builder for chaining
	 * @throws IllegalArgumentException if {@code name} is {@code null}
	 * @since 1.5
	 */
	public ToStringBuilder append(String name, boolean[] values) {
		return append(name, ArrayUtils.asList(values));
	}
	
	private StringBuilder appendName(String name) {
		Argument.checkNotNull(name, "name");
		if (builder.charAt(builder.length() - 1) != '[') {
			builder.append(',');
		}
		return builder.append(name)
				.append('=');
	}
	
	@Override
	public String toString() {
		String s = builder.append(']')
				.toString();
		builder.setLength(builder.length() - 1);
		return s;
	}

}
