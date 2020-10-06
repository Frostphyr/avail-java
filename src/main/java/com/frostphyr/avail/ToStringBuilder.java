package com.frostphyr.avail;

import java.util.Collection;
import java.util.Iterator;

/**
 * A utility builder class to simplify the creation of a {@code String} for 
 * {@link Object#toString()}.
 * <p>
 * The builder uses a class name and any number of name-value pairs. The 
 * format of the output is:
 * <p>
 * {@code ClassName[name=value,arrayName=[value,value]]}
 * 
 * @since 1.0
 */
public class ToStringBuilder {
	
	private StringBuilder builder = new StringBuilder();
	private boolean first = true;
	
	/**
	 * Creates a new {@code ToStringBuilder} for the specified 
	 * {@code className}.
	 * 
	 * @param className the name of the {@code Class} whose {@code toString()} 
	 * is being built; cannot be {@code null}
	 */
	public static ToStringBuilder forClassName(String className) {
		ToStringBuilder builder = new ToStringBuilder();
		builder.builder.append(Argument.checkNotNull(className))
				.append('[');
		return builder;
	}
	
	/**
	 * Creates a new {@code ToStringBuilder} for the specified {@code Class}. 
	 * This creates a {@code ToStringBuilder} from 
	 * {@link Class#getSimpleName()}.
	 * 
	 * @param clazz the {@code Class} whose {@code toString()} is being built; 
	 * cannot be {@code null}
	 */
	public static ToStringBuilder forClass(Class<?> clazz) {
		return forClassName(Argument.checkNotNull(clazz).getSimpleName());
	}
	
	/**
	 * Appends the specified name-value pair. The {@code value}'s 
	 * {@code toString()} method is used for the textual representation. If 
	 * the {@code value} is {@code null}, {@code "null"} will be used.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, Object value) {
		appendName(name)
				.append(value);
		return this;
	}
	
	/**
	 * Appends the specified name-value pair.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, int value) {
		return append(name, Integer.toString(value));
	}
	
	/**
	 * Appends the specified name-value pair.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, long value) {
		return append(name, Long.toString(value));
	}
	
	/**
	 * Appends the specified name-value pair.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, float value) {
		return append(name, Float.toString(value));
	}
	
	/**
	 * Appends the specified name-value pair.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, double value) {
		return append(name, Double.toString(value));
	}
	
	/**
	 * Appends the specified name-value pair.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, char value) {
		return append(name, Character.toString(value));
	}
	
	/**
	 * Appends the specified name-value pair. If the {@code value} is 
	 * {@code null}, {@code "null"} will be used.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, Object[] value) {
		appendName(name);
		if (value == null) {
			builder.append("null");
		} else {
			builder.append('[');
			for (int i = 0; i < value.length; i++) {
				builder.append(value[i]);
				if (i != value.length - 1) {
					builder.append(',');
				}
			}
			builder.append(']');
		}
		return this;
	}
	
	/**
	 * Appends the specified name-value pair. If the {@code value} is 
	 * {@code null}, {@code "null"} will be used.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, byte[] value) {
		appendName(name);
		if (value == null) {
			builder.append("null");
		} else {
			builder.append('[');
			for (int i = 0; i < value.length; i++) {
				builder.append(value[i]);
				if (i != value.length - 1) {
					builder.append(',');
				}
			}
			builder.append(']');
		}
		return this;
	}
	
	/**
	 * Appends the specified name-value pair. If the {@code value} is 
	 * {@code null}, {@code "null"} will be used.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, short[] value) {
		appendName(name);
		if (value == null) {
			builder.append("null");
		} else {
			builder.append('[');
			for (int i = 0; i < value.length; i++) {
				builder.append(value[i]);
				if (i != value.length - 1) {
					builder.append(',');
				}
			}
			builder.append(']');
		}
		return this;
	}
	
	/**
	 * Appends the specified name-value pair. If the {@code value} is 
	 * {@code null}, {@code "null"} will be used.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, int[] value) {
		appendName(name);
		if (value == null) {
			builder.append("null");
		} else {
			builder.append('[');
			for (int i = 0; i < value.length; i++) {
				builder.append(value[i]);
				if (i != value.length - 1) {
					builder.append(',');
				}
			}
			builder.append(']');
		}
		return this;
	}
	
	/**
	 * Appends the specified name-value pair. If the {@code value} is 
	 * {@code null}, {@code "null"} will be used.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, long[] value) {
		appendName(name);
		if (value == null) {
			builder.append("null");
		} else {
			builder.append('[');
			for (int i = 0; i < value.length; i++) {
				builder.append(value[i]);
				if (i != value.length - 1) {
					builder.append(',');
				}
			}
			builder.append(']');
		}
		return this;
	}
	
	/**
	 * Appends the specified name-value pair. If the {@code value} is 
	 * {@code null}, {@code "null"} will be used.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, float[] value) {
		appendName(name);
		if (value == null) {
			builder.append("null");
		} else {
			builder.append('[');
			for (int i = 0; i < value.length; i++) {
				builder.append(value[i]);
				if (i != value.length - 1) {
					builder.append(',');
				}
			}
			builder.append(']');
		}
		return this;
	}
	
	/**
	 * Appends the specified name-value pair. If the {@code value} is 
	 * {@code null}, {@code "null"} will be used.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, double[] value) {
		appendName(name);
		if (value == null) {
			builder.append("null");
		} else {
			builder.append('[');
			for (int i = 0; i < value.length; i++) {
				builder.append(value[i]);
				if (i != value.length - 1) {
					builder.append(',');
				}
			}
			builder.append(']');
		}
		return this;
	}
	
	/**
	 * Appends the specified name-value pair. If the {@code value} is 
	 * {@code null}, {@code "null"} will be used.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, char[] value) {
		appendName(name);
		if (value == null) {
			builder.append("null");
		} else {
			builder.append('[');
			for (int i = 0; i < value.length; i++) {
				builder.append(value[i]);
				if (i != value.length - 1) {
					builder.append(',');
				}
			}
			builder.append(']');
		}
		return this;
	}
	
	/**
	 * Appends the specified name-value pair. If the {@code value} is 
	 * {@code null}, {@code "null"} will be used.
	 * 
	 * @param name the name of the value; cannot be {@code null}
	 * @param value the value to append
	 * @return this {@code ToStringBuilder} for chaining
	 */
	public ToStringBuilder append(String name, Collection<?> value) {
		appendName(name);
		if (value == null) {
			builder.append("null");
		} else {
			boolean first = true;
			builder.append('[');
			for (Iterator<?> it = value.iterator(); it.hasNext(); ) {
				if (first) {
					first = false;
				} else {
					builder.append(',');
				}
				builder.append(it.next());
			}
			builder.append(']');
		}
		return this;
	}
	
	private StringBuilder appendName(String name) {
		Argument.checkNotNull(name);
		if (!first) {
			builder.append(',');
		} else {
			first = false;
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
