package com.frostphyr.avail;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * A class containing various utility methods relating to arrays.
 * 
 * @since 1.5
 */
public class ArrayUtils {
	
	private ArrayUtils() {
	}
	
	/**
	 * Returns a new array with the boxed values of {@code array}.
	 * 
	 * @param array the array to create a boxed array for
	 * @return the boxed array
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	public static Byte[] box(byte[] array) {
		Argument.checkNotNull(array, "array");
		
		Byte[] boxedArray = new Byte[array.length];
		for (int i = 0; i < array.length; i++) {
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the boxed values of {@code array}.
	 * 
	 * @param array the array to create a boxed array for
	 * @return the boxed array
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	public static Short[] box(short[] array) {
		Argument.checkNotNull(array, "array");
		
		Short[] boxedArray = new Short[array.length];
		for (int i = 0; i < array.length; i++) {
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the boxed values of {@code array}.
	 * 
	 * @param array the array to create a boxed array for
	 * @return the boxed array
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	public static Integer[] box(int[] array) {
		Argument.checkNotNull(array, "array");
		
		Integer[] boxedArray = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the boxed values of {@code array}.
	 * 
	 * @param array the array to create a boxed array for
	 * @return the boxed array
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	public static Long[] box(long[] array) {
		Argument.checkNotNull(array, "array");
		
		Long[] boxedArray = new Long[array.length];
		for (int i = 0; i < array.length; i++) {
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the boxed values of {@code array}.
	 * 
	 * @param array the array to create a boxed array for
	 * @return the boxed array
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	public static Float[] box(float[] array) {
		Argument.checkNotNull(array, "array");
		
		Float[] boxedArray = new Float[array.length];
		for (int i = 0; i < array.length; i++) {
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the boxed values of {@code array}.
	 * 
	 * @param array the array to create a boxed array for
	 * @return the boxed array
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	public static Double[] box(double[] array) {
		Argument.checkNotNull(array, "array");
		
		Double[] boxedArray = new Double[array.length];
		for (int i = 0; i < array.length; i++) {
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the boxed values of {@code array}.
	 * 
	 * @param array the array to create a boxed array for
	 * @return the boxed array
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	public static Character[] box(char[] array) {
		Argument.checkNotNull(array, "array");
		
		Character[] boxedArray = new Character[array.length];
		for (int i = 0; i < array.length; i++) {
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the boxed values of {@code array}.
	 * 
	 * @param array the array to create a boxed array for
	 * @return the boxed array
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	public static Boolean[] box(boolean[] array) {
		Argument.checkNotNull(array, "array");
		
		Boolean[] boxedArray = new Boolean[array.length];
		for (int i = 0; i < array.length; i++) {
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the unboxed values of {@code array}.
	 * 
	 * @param array the array to create an unboxed array for
	 * @return the unboxed array
	 * @throws IllegalArgumentException if {@code array} or any element is 
	 * {@code null}
	 */
	public static byte[] unbox(Byte[] array) {
		Argument.checkNotNull(array, "array");
		
		byte[] boxedArray = new byte[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				throw new IllegalArgumentException("index " + i + " is null");
			}
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the unboxed values of {@code array}.
	 * 
	 * @param array the array to create an unboxed array for
	 * @return the unboxed array
	 * @throws IllegalArgumentException if {@code array} or any element is 
	 * {@code null}
	 */
	public static short[] unbox(Short[] array) {
		Argument.checkNotNull(array, "array");
		
		short[] boxedArray = new short[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				throw new IllegalArgumentException("index " + i + " is null");
			}
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the unboxed values of {@code array}.
	 * 
	 * @param array the array to create an unboxed array for
	 * @return the unboxed array
	 * @throws IllegalArgumentException if {@code array} or any element is 
	 * {@code null}
	 */
	public static int[] unbox(Integer[] array) {
		Argument.checkNotNull(array, "array");
		
		int[] boxedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				throw new IllegalArgumentException("index " + i + " is null");
			}
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the unboxed values of {@code array}.
	 * 
	 * @param array the array to create an unboxed array for
	 * @return the unboxed array
	 * @throws IllegalArgumentException if {@code array} or any element is 
	 * {@code null}
	 */
	public static long[] unbox(Long[] array) {
		Argument.checkNotNull(array, "array");
		
		long[] boxedArray = new long[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				throw new IllegalArgumentException("index " + i + " is null");
			}
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the unboxed values of {@code array}.
	 * 
	 * @param array the array to create an unboxed array for
	 * @return the unboxed array
	 * @throws IllegalArgumentException if {@code array} or any element is 
	 * {@code null}
	 */
	public static float[] unbox(Float[] array) {
		Argument.checkNotNull(array, "array");
		
		float[] boxedArray = new float[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				throw new IllegalArgumentException("index " + i + " is null");
			}
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the unboxed values of {@code array}.
	 * 
	 * @param array the array to create an unboxed array for
	 * @return the unboxed array
	 * @throws IllegalArgumentException if {@code array} or any element is 
	 * {@code null}
	 */
	public static double[] unbox(Double[] array) {
		Argument.checkNotNull(array, "array");
		
		double[] boxedArray = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				throw new IllegalArgumentException("index " + i + " is null");
			}
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the unboxed values of {@code array}.
	 * 
	 * @param array the array to create an unboxed array for
	 * @return the unboxed array
	 * @throws IllegalArgumentException if {@code array} or any element is 
	 * {@code null}
	 */
	public static char[] unbox(Character[] array) {
		Argument.checkNotNull(array, "array");
		
		char[] boxedArray = new char[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				throw new IllegalArgumentException("index " + i + " is null");
			}
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a new array with the unboxed values of {@code array}.
	 * 
	 * @param array the array to create an unboxed array for
	 * @return the unboxed array
	 * @throws IllegalArgumentException if {@code array} or any element is 
	 * {@code null}
	 */
	public static boolean[] unbox(Boolean[] array) {
		Argument.checkNotNull(array, "array");
		
		boolean[] boxedArray = new boolean[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				throw new IllegalArgumentException("index " + i + " is null");
			}
			boxedArray[i] = array[i];
		}
		return boxedArray;
	}
	
	/**
	 * Returns a {@link List} backed by {@code array}. Any changes to the 
	 * {@link List} will be made to {@code array}. The {@link List} has a 
	 * fixed size, so any operations that modify the size will throw 
	 * {@link UnsupportedOperationException}.
	 * 
	 * @param <T> the type of {@code array} and the returned {@link List}
	 * @param array the array to create a {@link List} for
	 * @return a {@link List} backed by {@code array}
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	@SafeVarargs
	public static <T> List<T> asList(final T... array) {
		Argument.checkNotNull(array, "array");
		
		return new AbstractList<T>() {
			
			@Override
			public boolean contains(Object o) {
				return indexOf(o) != -1;
			}
			
			@Override
			public Object[] toArray() {
				return Arrays.copyOf(array, array.length);
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public <E> E[] toArray(E[] a) {
				if (a.length < array.length) {
					return (E[]) Arrays.copyOf(array, array.length, a.getClass());
				}
				
				System.arraycopy(array, 0, a, 0, array.length);
				if (a.length > array.length) {
					a[array.length] = null;
				}
				return a;
			}

			@Override
			public T get(int index) {
				return array[index];
			}
			
			@Override
			public T set(int index, T element) {
				T old = array[index];
				array[index] = element;
				return old;
			}
			
			@Override
			public int indexOf(Object o) {
				for (int i = 0; i < array.length; i++) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				for (int i = array.length - 1; i >= 0; i--) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}

			@Override
			public int size() {
				return array.length;
			}
			
		};
	}
	
	/**
	 * Returns a {@link List} backed by {@code array}. Any changes to the 
	 * {@link List} will be made to {@code array}. The {@link List} has a 
	 * fixed size, so any operations that modify the size will throw 
	 * {@link UnsupportedOperationException}.
	 * 
	 * @param array the array to create a {@link List} for
	 * @return a {@link List} backed by {@code array}
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	@SafeVarargs
	public static List<Byte> asList(final byte... array) {
		Argument.checkNotNull(array, "array");
		
		return new AbstractList<Byte>() {
			
			@Override
			public boolean contains(Object o) {
				return indexOf(o) != -1;
			}
			
			@Override
			public Object[] toArray() {
				return box(array);
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public <E> E[] toArray(E[] a) {
				if (a.length < array.length) {
					a = (E[]) Array.newInstance(a.getClass().getComponentType(), array.length);
				}
				
				System.arraycopy(array, 0, a, 0, array.length);
				if (a.length > array.length) {
					a[array.length] = null;
				}
				return a;
			}

			@Override
			public Byte get(int index) {
				return array[index];
			}
			
			@Override
			public Byte set(int index, Byte element) {
				byte old = array[index];
				array[index] = element;
				return old;
			}
			
			@Override
			public int indexOf(Object o) {
				for (int i = 0; i < array.length; i++) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				for (int i = array.length - 1; i >= 0; i--) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}

			@Override
			public int size() {
				return array.length;
			}
			
		};
	}
	
	/**
	 * Returns a {@link List} backed by {@code array}. Any changes to the 
	 * {@link List} will be made to {@code array}. The {@link List} has a 
	 * fixed size, so any operations that modify the size will throw 
	 * {@link UnsupportedOperationException}.
	 * 
	 * @param array the array to create a {@link List} for
	 * @return a {@link List} backed by {@code array}
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	@SafeVarargs
	public static List<Short> asList(final short... array) {
		Argument.checkNotNull(array, "array");
		
		return new AbstractList<Short>() {
			
			@Override
			public boolean contains(Object o) {
				return indexOf(o) != -1;
			}
			
			@Override
			public Object[] toArray() {
				return box(array);
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public <E> E[] toArray(E[] a) {
				if (a.length < array.length) {
					a = (E[]) Array.newInstance(a.getClass().getComponentType(), array.length);
				}
				
				System.arraycopy(array, 0, a, 0, array.length);
				if (a.length > array.length) {
					a[array.length] = null;
				}
				return a;
			}

			@Override
			public Short get(int index) {
				return array[index];
			}
			
			@Override
			public Short set(int index, Short element) {
				short old = array[index];
				array[index] = element;
				return old;
			}
			
			@Override
			public int indexOf(Object o) {
				for (int i = 0; i < array.length; i++) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				for (int i = array.length - 1; i >= 0; i--) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}

			@Override
			public int size() {
				return array.length;
			}
			
		};
	}
	
	/**
	 * Returns a {@link List} backed by {@code array}. Any changes to the 
	 * {@link List} will be made to {@code array}. The {@link List} has a 
	 * fixed size, so any operations that modify the size will throw 
	 * {@link UnsupportedOperationException}.
	 * 
	 * @param array the array to create a {@link List} for
	 * @return a {@link List} backed by {@code array}
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	@SafeVarargs
	public static List<Integer> asList(final int... array) {
		Argument.checkNotNull(array, "array");
		
		return new AbstractList<Integer>() {
			
			@Override
			public boolean contains(Object o) {
				return indexOf(o) != -1;
			}
			
			@Override
			public Object[] toArray() {
				return box(array);
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public <E> E[] toArray(E[] a) {
				if (a.length < array.length) {
					a = (E[]) Array.newInstance(a.getClass().getComponentType(), array.length);
				}
				
				System.arraycopy(array, 0, a, 0, array.length);
				if (a.length > array.length) {
					a[array.length] = null;
				}
				return a;
			}

			@Override
			public Integer get(int index) {
				return array[index];
			}
			
			@Override
			public Integer set(int index, Integer element) {
				int old = array[index];
				array[index] = element;
				return old;
			}
			
			@Override
			public int indexOf(Object o) {
				for (int i = 0; i < array.length; i++) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				for (int i = array.length - 1; i >= 0; i--) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}

			@Override
			public int size() {
				return array.length;
			}
			
		};
	}
	
	/**
	 * Returns a {@link List} backed by {@code array}. Any changes to the 
	 * {@link List} will be made to {@code array}. The {@link List} has a 
	 * fixed size, so any operations that modify the size will throw 
	 * {@link UnsupportedOperationException}.
	 * 
	 * @param array the array to create a {@link List} for
	 * @return a {@link List} backed by {@code array}
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	@SafeVarargs
	public static List<Long> asList(final long... array) {
		Argument.checkNotNull(array, "array");
		
		return new AbstractList<Long>() {
			
			@Override
			public boolean contains(Object o) {
				return indexOf(o) != -1;
			}
			
			@Override
			public Object[] toArray() {
				return box(array);
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public <E> E[] toArray(E[] a) {
				if (a.length < array.length) {
					a = (E[]) Array.newInstance(a.getClass().getComponentType(), array.length);
				}
				
				System.arraycopy(array, 0, a, 0, array.length);
				if (a.length > array.length) {
					a[array.length] = null;
				}
				return a;
			}

			@Override
			public Long get(int index) {
				return array[index];
			}
			
			@Override
			public Long set(int index, Long element) {
				long old = array[index];
				array[index] = element;
				return old;
			}
			
			@Override
			public int indexOf(Object o) {
				for (int i = 0; i < array.length; i++) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				for (int i = array.length - 1; i >= 0; i--) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}

			@Override
			public int size() {
				return array.length;
			}
			
		};
	}
	
	/**
	 * Returns a {@link List} backed by {@code array}. Any changes to the 
	 * {@link List} will be made to {@code array}. The {@link List} has a 
	 * fixed size, so any operations that modify the size will throw 
	 * {@link UnsupportedOperationException}.
	 * 
	 * @param array the array to create a {@link List} for
	 * @return a {@link List} backed by {@code array}
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	@SafeVarargs
	public static List<Float> asList(final float... array) {
		Argument.checkNotNull(array, "array");
		
		return new AbstractList<Float>() {
			
			@Override
			public boolean contains(Object o) {
				return indexOf(o) != -1;
			}
			
			@Override
			public Object[] toArray() {
				return box(array);
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public <E> E[] toArray(E[] a) {
				if (a.length < array.length) {
					a = (E[]) Array.newInstance(a.getClass().getComponentType(), array.length);
				}
				
				System.arraycopy(array, 0, a, 0, array.length);
				if (a.length > array.length) {
					a[array.length] = null;
				}
				return a;
			}

			@Override
			public Float get(int index) {
				return array[index];
			}
			
			@Override
			public Float set(int index, Float element) {
				float old = array[index];
				array[index] = element;
				return old;
			}
			
			@Override
			public int indexOf(Object o) {
				for (int i = 0; i < array.length; i++) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				for (int i = array.length - 1; i >= 0; i--) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}

			@Override
			public int size() {
				return array.length;
			}
			
		};
	}
	
	/**
	 * Returns a {@link List} backed by {@code array}. Any changes to the 
	 * {@link List} will be made to {@code array}. The {@link List} has a 
	 * fixed size, so any operations that modify the size will throw 
	 * {@link UnsupportedOperationException}.
	 * 
	 * @param array the array to create a {@link List} for
	 * @return a {@link List} backed by {@code array}
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	@SafeVarargs
	public static List<Double> asList(final double... array) {
		Argument.checkNotNull(array, "array");
		
		return new AbstractList<Double>() {
			
			@Override
			public boolean contains(Object o) {
				return indexOf(o) != -1;
			}
			
			@Override
			public Object[] toArray() {
				return box(array);
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public <E> E[] toArray(E[] a) {
				if (a.length < array.length) {
					a = (E[]) Array.newInstance(a.getClass().getComponentType(), array.length);
				}
				
				System.arraycopy(array, 0, a, 0, array.length);
				if (a.length > array.length) {
					a[array.length] = null;
				}
				return a;
			}

			@Override
			public Double get(int index) {
				return array[index];
			}
			
			@Override
			public Double set(int index, Double element) {
				double old = array[index];
				array[index] = element;
				return old;
			}
			
			@Override
			public int indexOf(Object o) {
				for (int i = 0; i < array.length; i++) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				for (int i = array.length - 1; i >= 0; i--) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}

			@Override
			public int size() {
				return array.length;
			}
			
		};
	}
	
	/**
	 * Returns a {@link List} backed by {@code array}. Any changes to the 
	 * {@link List} will be made to {@code array}. The {@link List} has a 
	 * fixed size, so any operations that modify the size will throw 
	 * {@link UnsupportedOperationException}.
	 * 
	 * @param array the array to create a {@link List} for
	 * @return a {@link List} backed by {@code array}
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	@SafeVarargs
	public static List<Character> asList(final char... array) {
		Argument.checkNotNull(array, "array");
		
		return new AbstractList<Character>() {
			
			@Override
			public boolean contains(Object o) {
				return indexOf(o) != -1;
			}
			
			@Override
			public Object[] toArray() {
				return box(array);
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public <E> E[] toArray(E[] a) {
				if (a.length < array.length) {
					a = (E[]) Array.newInstance(a.getClass().getComponentType(), array.length);
				}
				
				System.arraycopy(array, 0, a, 0, array.length);
				if (a.length > array.length) {
					a[array.length] = null;
				}
				return a;
			}

			@Override
			public Character get(int index) {
				return array[index];
			}
			
			@Override
			public Character set(int index, Character element) {
				char old = array[index];
				array[index] = element;
				return old;
			}
			
			@Override
			public int indexOf(Object o) {
				for (int i = 0; i < array.length; i++) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				for (int i = array.length - 1; i >= 0; i--) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}

			@Override
			public int size() {
				return array.length;
			}
			
		};
	}
	
	/**
	 * Returns a {@link List} backed by {@code array}. Any changes to the 
	 * {@link List} will be made to {@code array}. The {@link List} has a 
	 * fixed size, so any operations that modify the size will throw 
	 * {@link UnsupportedOperationException}.
	 * 
	 * @param array the array to create a {@link List} for
	 * @return a {@link List} backed by {@code array}
	 * @throws IllegalArgumentException if {@code array} is {@code null}
	 */
	@SafeVarargs
	public static List<Boolean> asList(final boolean... array) {
		Argument.checkNotNull(array, "array");
		
		return new AbstractList<Boolean>() {
			
			@Override
			public boolean contains(Object o) {
				return indexOf(o) != -1;
			}
			
			@Override
			public Object[] toArray() {
				return box(array);
			}
			
			@SuppressWarnings("unchecked")
			@Override
			public <E> E[] toArray(E[] a) {
				if (a.length < array.length) {
					a = (E[]) Array.newInstance(a.getClass().getComponentType(), array.length);
				}
				
				System.arraycopy(array, 0, a, 0, array.length);
				if (a.length > array.length) {
					a[array.length] = null;
				}
				return a;
			}

			@Override
			public Boolean get(int index) {
				return array[index];
			}
			
			@Override
			public Boolean set(int index, Boolean element) {
				boolean old = array[index];
				array[index] = element;
				return old;
			}
			
			@Override
			public int indexOf(Object o) {
				for (int i = 0; i < array.length; i++) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				for (int i = array.length - 1; i >= 0; i--) {
					if (Objects.equals(array[i], o)) {
						return i;
					}
				}
				return -1;
			}

			@Override
			public int size() {
				return array.length;
			}
			
		};
	}

}
