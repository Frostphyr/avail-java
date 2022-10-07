package com.frostphyr.avail;

/**
 * Utility class containing methods to check for valid argument conditions.
 * 
 * @since 1.0
 */
public final class Argument {
	
	private static final String FORMAT_NOT_NULL = "%s cannot be null";
	private static final String FORMAT_GREATER_THAN = "%s must be greater than %s";
	private static final String FORMAT_GREATER_THAN_OR_EQUAL = "%s must be greater than or equal to %s";
	private static final String FORMAT_LESS_THAN = "%s must be less than %s";
	private static final String FORMAT_LESS_THAN_OR_EQUAL = "%s must be less than or equal to %s";
	private static final String FORMAT_INSIDE_RANGE = "%s must be between %s and %s";
	private static final String FORMAT_ARRAY_LENGTH = "%s must have a length of %s";
	
	private Argument() {
	}
	
	/**
	 * Returns {@code value} if it is not {@code null}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param <T> the type of the value
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static <T> T checkNotNull(T value, String name) {
		if (value == null) {
			throwException(FORMAT_NOT_NULL, name);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is not {@code null}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param <T> the type of the value
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static <T> T checkNotNull(T value) {
		return checkNotNull(value, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkGreaterThan(byte value, byte number, String name) {
		if (value <= number) {
			throwException(FORMAT_GREATER_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static byte checkGreaterThan(byte value, byte number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkGreaterThan(short value, short number, String name) {
		if (value <= number) {
			throwException(FORMAT_GREATER_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static short checkGreaterThan(short value, short number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkGreaterThan(int value, int number, String name) {
		if (value <= number) {
			throwException(FORMAT_GREATER_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static int checkGreaterThan(int value, int number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkGreaterThan(long value, long number, String name) {
		if (value <= number) {
			throwException(FORMAT_GREATER_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static long checkGreaterThan(long value, long number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. The {@code epsilon} is used to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThan(float, float, float)
	 * @since 1.5
	 */
	public static float checkGreaterThan(float value, float number, float epsilon, String name) {
		if (!FloatingPoint.greaterThan(value, number, epsilon)) {
			throwException(FORMAT_GREATER_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. The {@code epsilon} is used to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThan(float, float, float)
	 * @since 1.5
	 */
	public static float checkGreaterThan(float value, float number, float epsilon) {
		return checkGreaterThan(value, number, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to determine 
	 * if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThan(float, float)
	 * @since 1.1
	 */
	public static float checkGreaterThan(float value, float number, String name) {
		return checkGreaterThan(value, number, FloatingPoint.EPSILON_DEFAULT_FLOAT, name);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to determine 
	 * if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThan(float, float)
	 */
	public static float checkGreaterThan(float value, float number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. The {@code epsilon} is used to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThan(double, double, double)
	 * @since 1.5
	 */
	public static double checkGreaterThan(double value, double number, double epsilon, String name) {
		if (!FloatingPoint.greaterThan(value, number, epsilon)) {
			throwException(FORMAT_GREATER_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. The {@code epsilon} is used to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThan(double, double, double)
	 * @since 1.5
	 */
	public static double checkGreaterThan(double value, double number, double epsilon) {
		return checkGreaterThan(value, number, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThan(double, double)
	 * @since 1.1
	 */
	public static double checkGreaterThan(double value, double number, String name) {
		return checkGreaterThan(value, number, FloatingPoint.EPSILON_DEFAULT_DOUBLE, name);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThan(double, double)
	 */
	public static double checkGreaterThan(double value, double number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static char checkGreaterThan(char value, char number, String name) {
		if (value <= number) {
			throwException(FORMAT_GREATER_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static char checkGreaterThan(char value, char number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkGreaterThanOrEqual(byte value, byte number, String name) {
		if (value < number) {
			throwException(FORMAT_GREATER_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static byte checkGreaterThanOrEqual(byte value, byte number) {
		return checkGreaterThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkGreaterThanOrEqual(short value, short number, String name) {
		if (value < number) {
			throwException(FORMAT_GREATER_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static short checkGreaterThanOrEqual(short value, short number) {
		return checkGreaterThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkGreaterThanOrEqual(int value, int number, String name) {
		if (value < number) {
			throwException(FORMAT_GREATER_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static int checkGreaterThanOrEqual(int value, int number) {
		return checkGreaterThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkGreaterThanOrEqual(long value, long number, String name) {
		if (value < number) {
			throwException(FORMAT_GREATER_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static long checkGreaterThanOrEqual(long value, long number) {
		return checkGreaterThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. The {@code epsilon} 
	 * is used to determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float, float)
	 * @since 1.5
	 */
	public static float checkGreaterThanOrEqual(float value, float number, float epsilon, String name) {
		if (!FloatingPoint.greaterThanOrEqual(value, number, epsilon)) {
			throwException(FORMAT_GREATER_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. The {@code epsilon} 
	 * is used to determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float, float)
	 * @since 1.5
	 */
	public static float checkGreaterThanOrEqual(float value, float number, float epsilon) {
		return checkGreaterThanOrEqual(value, number, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to determine 
	 * if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float)
	 * @since 1.1
	 */
	public static float checkGreaterThanOrEqual(float value, float number, String name) {
		return checkGreaterThanOrEqual(value, number, FloatingPoint.EPSILON_DEFAULT_FLOAT, name);
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to determine 
	 * if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float)
	 */
	public static float checkGreaterThanOrEqual(float value, float number) {
		return checkGreaterThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. The {@code epsilon} 
	 * is used to determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double, double)
	 * @since 1.5
	 */
	public static double checkGreaterThanOrEqual(double value, double number, double epsilon, String name) {
		if (!FloatingPoint.greaterThanOrEqual(value, number, epsilon)) {
			throwException(FORMAT_GREATER_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. The {@code epsilon} 
	 * is used to determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double, double)
	 * @since 1.5
	 */
	public static double checkGreaterThanOrEqual(double value, double number, double epsilon) {
		return checkGreaterThanOrEqual(value, number, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double)
	 * @since 1.1
	 */
	public static double checkGreaterThanOrEqual(double value, double number, String name) {
		return checkGreaterThanOrEqual(value, number, FloatingPoint.EPSILON_DEFAULT_DOUBLE, name);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} and {@code number} are equal.
	 *
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double)
	 */
	public static double checkGreaterThanOrEqual(double value, double number) {
		return checkGreaterThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static char checkGreaterThanOrEqual(char value, char number, String name) {
		if (value < number) {
			throwException(FORMAT_GREATER_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is greater than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static char checkGreaterThanOrEqual(char value, char number) {
		return checkGreaterThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkLessThan(byte value, byte number, String name) {
		if (value >= number) {
			throwException(FORMAT_LESS_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static byte checkLessThan(byte value, byte number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkLessThan(short value, short number, String name) {
		if (value >= number) {
			throwException(FORMAT_LESS_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static short checkLessThan(short value, short number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkLessThan(int value, int number, String name) {
		if (value >= number) {
			throwException(FORMAT_LESS_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static int checkLessThan(int value, int number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkLessThan(long value, long number, String name) {
		if (value >= number) {
			throwException(FORMAT_LESS_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static long checkLessThan(long value, long number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. The {@code epsilon} is used to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(float, float, float)
	 * @since 1.5
	 */
	public static float checkLessThan(float value, float number, float epsilon, String name) {
		if (!FloatingPoint.lessThan(value, number, epsilon)) {
			throwException(FORMAT_LESS_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. The {@code epsilon} is used to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(float, float, float)
	 * @since 1.5
	 */
	public static float checkLessThan(float value, float number, float epsilon) {
		return checkLessThan(value, number, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to determine 
	 * if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(float, float)
	 * @since 1.1
	 */
	public static float checkLessThan(float value, float number, String name) {
		return checkLessThan(value, number, FloatingPoint.EPSILON_DEFAULT_FLOAT, name);
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to determine 
	 * if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @see FloatingPoint#lessThan(float, float)
	 * @return the same {@code value}
	 */
	public static float checkLessThan(float value, float number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. The {@code epsilon} is used to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(double, double, double)
	 * @since 1.5
	 */
	public static double checkLessThan(double value, double number, double epsilon, String name) {
		if (!FloatingPoint.lessThan(value, number, epsilon)) {
			throwException(FORMAT_LESS_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. The {@code epsilon} is used to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(double, double, double)
	 * @since 1.5
	 */
	public static double checkLessThan(double value, double number, double epsilon) {
		return checkLessThan(value, number, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(double, double)
	 * @since 1.1
	 */
	public static double checkLessThan(double value, double number, String name) {
		return checkLessThan(value, number, FloatingPoint.EPSILON_DEFAULT_DOUBLE, name);
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(double, double)
	 */
	public static double checkLessThan(double value, double number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static char checkLessThan(char value, char number, String name) {
		if (value >= number) {
			throwException(FORMAT_LESS_THAN, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than {@code number}, otherwise 
	 * throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static char checkLessThan(char value, char number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkLessThanOrEqual(byte value, byte number, String name) {
		if (value > number) {
			throwException(FORMAT_LESS_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static byte checkLessThanOrEqual(byte value, byte number) {
		return checkLessThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkLessThanOrEqual(short value, short number, String name) {
		if (value > number) {
			throwException(FORMAT_LESS_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static short checkLessThanOrEqual(short value, short number) {
		return checkLessThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkLessThanOrEqual(int value, int number, String name) {
		if (value > number) {
			throwException(FORMAT_LESS_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static int checkLessThanOrEqual(int value, int number) {
		return checkLessThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkLessThanOrEqual(long value, long number, String name) {
		if (value > number) {
			throwException(FORMAT_LESS_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static long checkLessThanOrEqual(long value, long number) {
		return checkLessThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. The {@code epsilon} 
	 * is used to determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThanOrEqual(float, float, float)
	 * @since 1.5
	 */
	public static float checkLessThanOrEqual(float value, float number, float epsilon, String name) {
		if (!FloatingPoint.lessThanOrEqual(value, number, epsilon)) {
			throwException(FORMAT_LESS_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. The {@code epsilon} 
	 * is used to determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThanOrEqual(float, float, float)
	 * @since 1.5
	 */
	public static float checkLessThanOrEqual(float value, float number, float epsilon) {
		return checkLessThanOrEqual(value, number, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to determine 
	 * if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThanOrEqual(float, float)
	 * @since 1.1
	 */
	public static float checkLessThanOrEqual(float value, float number, String name) {
		return checkLessThanOrEqual(value, number, FloatingPoint.EPSILON_DEFAULT_FLOAT, name);
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to determine 
	 * if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @see FloatingPoint#lessThanOrEqual(float, float)
	 * @return the same {@code value}
	 */
	public static float checkLessThanOrEqual(float value, float number) {
		return checkLessThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. The {@code epsilon} 
	 * is used to determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThanOrEqual(double, double, double)
	 * @since 1.5
	 */
	public static double checkLessThanOrEqual(double value, double number, double epsilon, String name) {
		if (!FloatingPoint.lessThanOrEqual(value, number, epsilon)) {
			throwException(FORMAT_LESS_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. The {@code epsilon} 
	 * is used to determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between {@code value} and 
	 * {@code number} where they will be considered equal
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThanOrEqual(double, double, double)
	 * @since 1.5
	 */
	public static double checkLessThanOrEqual(double value, double number, double epsilon) {
		return checkLessThanOrEqual(value, number, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThanOrEqual(double, double)
	 * @since 1.1
	 */
	public static double checkLessThanOrEqual(double value, double number, String name) {
		return checkLessThanOrEqual(value, number, FloatingPoint.EPSILON_DEFAULT_DOUBLE, name);
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} and {@code number} are equal.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThanOrEqual(double, double)
	 */
	public static double checkLessThanOrEqual(double value, double number) {
		return checkLessThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static char checkLessThanOrEqual(char value, char number, String name) {
		if (value > number) {
			throwException(FORMAT_LESS_THAN_OR_EQUAL, name, number);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is less than or equal to {@code number}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static char checkLessThanOrEqual(char value, char number) {
		return checkLessThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkPositive(byte value, String name) {
		return checkGreaterThanOrEqual(value, (byte) 0, name);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static byte checkPositive(byte value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkPositive(short value, String name) {
		return checkGreaterThanOrEqual(value, (short) 0, name);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static short checkPositive(short value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkPositive(int value, String name) {
		return checkGreaterThanOrEqual(value, 0, name);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static int checkPositive(int value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkPositive(long value, String name) {
		return checkGreaterThanOrEqual(value, 0, name);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static long checkPositive(long value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}. The 
	 * {@code epsilon} is used to determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float, float)
	 * @since 1.5
	 */
	public static float checkPositive(float value, float epsilon, String name) {
		return checkGreaterThanOrEqual(value, 0f, epsilon, name);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}. The 
	 * {@code epsilon} is used to determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float, float)
	 * @since 1.5
	 */
	public static float checkPositive(float value, float epsilon) {
		return checkPositive(value, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}. This will 
	 * use {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to 
	 * determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float)
	 * @since 1.1
	 */
	public static float checkPositive(float value, String name) {
		return checkPositive(value, FloatingPoint.EPSILON_DEFAULT_FLOAT, name);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}. This will 
	 * use {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to 
	 * determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float)
	 */
	public static float checkPositive(float value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}. The 
	 * {@code epsilon} is used to determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double, double)
	 * @since 1.5
	 */
	public static double checkPositive(double value, double epsilon, String name) {
		return checkGreaterThanOrEqual(value, 0d, epsilon, name);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}. The 
	 * {@code epsilon} is used to determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double, double)
	 * @since 1.5
	 */
	public static double checkPositive(double value, double epsilon) {
		return checkPositive(value, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}. This will 
	 * use {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double)
	 * @since 1.1
	 */
	public static double checkPositive(double value, String name) {
		return checkPositive(value, FloatingPoint.EPSILON_DEFAULT_DOUBLE, name);
	}
	
	/**
	 * Returns {@code value} if it is positive, which means greater than or 
	 * equal to 0. If not, throws {@link IllegalArgumentException}. This will 
	 * use {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double)
	 */
	public static double checkPositive(double value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkNegative(byte value, String name) {
		return checkLessThan(value, (byte) 0, name);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static byte checkNegative(byte value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkNegative(short value, String name) {
		return checkLessThan(value, (short) 0, name);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static short checkNegative(short value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkNegative(int value, String name) {
		return checkLessThan(value, 0, name);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static int checkNegative(int value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkNegative(long value, String name) {
		return checkLessThan(value, 0, name);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static long checkNegative(long value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}. The {@code epsilon} is 
	 * used to determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(float, float, float)
	 * @since 1.5
	 */
	public static float checkNegative(float value, float epsilon, String name) {
		return checkLessThan(value, 0, epsilon, name);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}. The {@code epsilon} is 
	 * used to determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(float, float, float)
	 * @since 1.5
	 */
	public static float checkNegative(float value, float epsilon) {
		return checkNegative(value, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to determine 
	 * if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(float, float)
	 * @since 1.1
	 */
	public static float checkNegative(float value, String name) {
		return checkNegative(value, FloatingPoint.EPSILON_DEFAULT_FLOAT, name);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to determine 
	 * if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(float, float)
	 */
	public static float checkNegative(float value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}. The {@code epsilon} is 
	 * used to determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(double, double, double)
	 * @since 1.5
	 */
	public static double checkNegative(double value, double epsilon, String name) {
		return checkLessThan(value, 0, name);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}. The {@code epsilon} is 
	 * used to determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(double, double, double)
	 * @since 1.5
	 */
	public static double checkNegative(double value, double epsilon) {
		return checkNegative(value, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(double, double)
	 * @since 1.1
	 */
	public static double checkNegative(double value, String name) {
		return checkNegative(value, FloatingPoint.EPSILON_DEFAULT_DOUBLE, name);
	}
	
	/**
	 * Returns {@code value} if it is negative, which means less than 0. If 
	 * not, throws {@link IllegalArgumentException}. This will use 
	 * {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} is equal to 0.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 * @see FloatingPoint#lessThan(double, double)
	 */
	public static double checkNegative(double value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkInsideRange(byte value, byte min, byte max, String name) {
		if (value < min || value > max) {
			throwException(FORMAT_INSIDE_RANGE, name, min, max);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @return the same {@code value}
	 */
	public static byte checkInsideRange(byte value, byte min, byte max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkInsideRange(short value, short min, short max, String name) {
		if (value < min || value > max) {
			throwException(FORMAT_INSIDE_RANGE, name, min, max);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @return the same {@code value}
	 */
	public static short checkInsideRange(short value, short min, short max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkInsideRange(int value, int min, int max, String name) {
		if (value < min || value > max) {
			throwException(FORMAT_INSIDE_RANGE, name, min, max);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @return the same {@code value}
	 */
	public static int checkInsideRange(int value, int min, int max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkInsideRange(long value, long min, long max, String name) {
		if (value < min || value > max) {
			throwException(FORMAT_INSIDE_RANGE, name, min, max);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @return the same {@code value}
	 */
	public static long checkInsideRange(long value, long min, long max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}. The 
	 * {@code epsilon} is used to determine if {@code value} is equal to 
	 * {@code min} or {@code max}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to {@code min} or {@code max}
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float, float)
	 * @see FloatingPoint#lessThanOrEqual(float, float, float)
	 * @since 1.5
	 */
	public static float checkInsideRange(float value, float min, float max, float epsilon, String name) {
		if (FloatingPoint.lessThan(value, min, epsilon) || FloatingPoint.greaterThan(value, max, epsilon)) {
			throwException(FORMAT_INSIDE_RANGE, name, min, max);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}. The 
	 * {@code epsilon} is used to determine if {@code value} is equal to 
	 * {@code min} or {@code max}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to {@code min} or {@code max}
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float, float)
	 * @see FloatingPoint#lessThanOrEqual(float, float, float)
	 * @since 1.5
	 */
	public static float checkInsideRange(float value, float min, float max, float epsilon) {
		return checkInsideRange(value, min, max, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}. This will 
	 * use {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to 
	 * determine if {@code value} is equal to {@code min} or {@code max}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float)
	 * @see FloatingPoint#lessThanOrEqual(float, float)
	 * @since 1.1
	 */
	public static float checkInsideRange(float value, float min, float max, String name) {
		return checkInsideRange(value, min, max, FloatingPoint.EPSILON_DEFAULT_FLOAT, name);
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}. This will 
	 * use {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the epsilon to 
	 * determine if {@code value} is equal to {@code min} or {@code max}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float)
	 * @see FloatingPoint#lessThanOrEqual(float, float)
	 */
	public static float checkInsideRange(float value, float min, float max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}. The 
	 * {@code epsilon} is used to determine if {@code value} is equal to 
	 * {@code min} or {@code max}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to {@code min} or {@code max}
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double, double)
	 * @see FloatingPoint#lessThanOrEqual(double, double, double)
	 * @since 1.5
	 */
	public static double checkInsideRange(double value, double min, double max, double epsilon, String name) {
		if (FloatingPoint.lessThan(value, min, epsilon) || FloatingPoint.greaterThan(value, max, epsilon)) {
			throwException(FORMAT_INSIDE_RANGE, name, min, max);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}. The 
	 * {@code epsilon} is used to determine if {@code value} is equal to 
	 * {@code min} or {@code max}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to {@code min} or {@code max}
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double, double)
	 * @see FloatingPoint#lessThanOrEqual(double, double, double)
	 * @since 1.5
	 */
	public static double checkInsideRange(double value, double min, double max, double epsilon) {
		return checkInsideRange(value, min, max, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}. This will 
	 * use {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} is equal to {@code min} or {@code max}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double)
	 * @see FloatingPoint#lessThanOrEqual(double, double)
	 * @since 1.1
	 */
	public static double checkInsideRange(double value, double min, double max, String name) {
		return checkInsideRange(value, min, max, FloatingPoint.EPSILON_DEFAULT_DOUBLE, null);
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}. This will 
	 * use {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the epsilon to 
	 * determine if {@code value} is equal to {@code min} or {@code max}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double)
	 * @see FloatingPoint#lessThanOrEqual(double, double)
	 */
	public static double checkInsideRange(double value, double min, double max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum (inclusive) that {@code value} can be
	 * @param max the maximum (inclusive) that {@code value} can be
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static char checkInsideRange(char value, char min, char max, String name) {
		if (value < min || value > max) {
			throwException(FORMAT_INSIDE_RANGE, name, min, max);
		}
		return value;
	}
	
	/**
	 * Returns {@code value} if it is inside the specified range, which means 
	 * greater than or equal to {@code min} and less than or equal to 
	 * {@code max}. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @return the same {@code value}
	 */
	public static char checkInsideRange(char value, char min, char max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkPercent(byte value, String name) {
		return checkInsideRange(value, (byte) 0, (byte) 100, name);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static byte checkPercent(byte value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkPercent(short value, String name) {
		return checkInsideRange(value, (short) 0, (short) 100, name);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static short checkPercent(short value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkPercent(int value, String name) {
		return checkInsideRange(value, 0, 100, name);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static int checkPercent(int value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkPercent(long value, String name) {
		return checkInsideRange(value, 0, 100, name);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static long checkPercent(long value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}. 
	 * The {@code epsilon} is used to determine if {@code value} is equal to 0 
	 * or 100.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0 or 100
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float, float)
	 * @see FloatingPoint#lessThanOrEqual(float, float, float)
	 * @since 1.5
	 */
	public static float checkPercent(float value, float epsilon, String name) {
		return checkInsideRange(value, 0, 100, epsilon, name);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}. 
	 * The {@code epsilon} is used to determine if {@code value} is equal to 0 
	 * or 100.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0 or 100
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float, float)
	 * @see FloatingPoint#lessThanOrEqual(float, float, float)
	 * @since 1.5
	 */
	public static float checkPercent(float value, float epsilon) {
		return checkPercent(value, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}. 
	 * This will use {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the 
	 * epsilon to determine if {@code value} is equal to 0 or 100.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float)
	 * @see FloatingPoint#lessThanOrEqual(float, float)
	 * @since 1.1
	 */
	public static float checkPercent(float value, String name) {
		return checkPercent(value, FloatingPoint.EPSILON_DEFAULT_FLOAT, name);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}. 
	 * This will use {@link FloatingPoint#EPSILON_DEFAULT_FLOAT} as the 
	 * epsilon to determine if {@code value} is equal to 0 or 100.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(float, float)
	 * @see FloatingPoint#lessThanOrEqual(float, float)
	 */
	public static float checkPercent(float value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}. 
	 * The {@code epsilon} is used to determine if {@code value} is equal to 0 
	 * or 100.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0 or 100
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double, double)
	 * @see FloatingPoint#lessThanOrEqual(double, double, double)
	 * @since 1.5
	 */
	public static double checkPercent(double value, double epsilon, String name) {
		return checkInsideRange(value, 0, 100, epsilon, name);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}. 
	 * The {@code epsilon} is used to determine if {@code value} is equal to 0 
	 * or 100.
	 * 
	 * @param value the value to check
	 * @param epsilon the acceptable margin of error when checking if 
	 * {@code value} is equal to 0 or 100
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double, double)
	 * @see FloatingPoint#lessThanOrEqual(double, double, double)
	 * @since 1.5
	 */
	public static double checkPercent(double value, double epsilon) {
		return checkPercent(value, epsilon, null);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}. 
	 * This will use {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the 
	 * epsilon to determine if {@code value} is equal to 0 or 100.
	 * 
	 * @param value the value to check
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double)
	 * @see FloatingPoint#lessThanOrEqual(double, double)
	 * @since 1.1
	 */
	public static double checkPercent(double value, String name) {
		return checkPercent(value, FloatingPoint.EPSILON_DEFAULT_DOUBLE, name);
	}
	
	/**
	 * Returns {@code value} if it is a valid percent, which means between 0 
	 * and 100 (inclusive). If not, throws {@link IllegalArgumentException}. 
	 * This will use {@link FloatingPoint#EPSILON_DEFAULT_DOUBLE} as the 
	 * epsilon to determine if {@code value} is equal to 0 or 100.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 * @see FloatingPoint#greaterThanOrEqual(double, double)
	 * @see FloatingPoint#lessThanOrEqual(double, double)
	 */
	public static double checkPercent(double value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static byte[] checkLength(byte[] array, int length, String name) {
		if (checkNotNull(array, name).length != length) {
			throwException(FORMAT_ARRAY_LENGTH, name, length);
		}
		return array;
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static byte[] checkLength(byte[] array, int length) {
		return checkLength(array, length, null);
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static short[] checkLength(short[] array, int length, String name) {
		if (checkNotNull(array, name).length != length) {
			throwException(FORMAT_ARRAY_LENGTH, name, length);
		}
		return array;
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static short[] checkLength(short[] array, int length) {
		return checkLength(array, length, null);
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static int[] checkLength(int[] array, int length, String name) {
		if (checkNotNull(array, name).length != length) {
			throwException(FORMAT_ARRAY_LENGTH, name, length);
		}
		return array;
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static int[] checkLength(int[] array, int length) {
		return checkLength(array, length, null);
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static long[] checkLength(long[] array, int length, String name) {
		if (checkNotNull(array, name).length != length) {
			throwException(FORMAT_ARRAY_LENGTH, name, length);
		}
		return array;
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static long[] checkLength(long[] array, int length) {
		return checkLength(array, length, null);
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static float[] checkLength(float[] array, int length, String name) {
		if (checkNotNull(array, name).length != length) {
			throwException(FORMAT_ARRAY_LENGTH, name, length);
		}
		return array;
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static float[] checkLength(float[] array, int length) {
		return checkLength(array, length, null);
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static double[] checkLength(double[] array, int length, String name) {
		if (checkNotNull(array, name).length != length) {
			throwException(FORMAT_ARRAY_LENGTH, name, length);
		}
		return array;
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static double[] checkLength(double[] array, int length) {
		return checkLength(array, length, null);
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static char[] checkLength(char[] array, int length, String name) {
		if (checkNotNull(array, name).length != length) {
			throwException(FORMAT_ARRAY_LENGTH, name, length);
		}
		return array;
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static char[] checkLength(char[] array, int length) {
		return checkLength(array, length, null);
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static boolean[] checkLength(boolean[] array, int length, String name) {
		if (checkNotNull(array, name).length != length) {
			throwException(FORMAT_ARRAY_LENGTH, name, length);
		}
		return array;
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static boolean[] checkLength(boolean[] array, int length) {
		return checkLength(array, length, null);
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param name the name of the argument to be included in the detail 
	 * message of the {@link IllegalArgumentException} if it is thrown, or 
	 * {@code null} for no detail message
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static <T> T[] checkLength(T[] array, int length, String name) {
		if (checkNotNull(array, name).length != length) {
			throwException(FORMAT_ARRAY_LENGTH, name, length);
		}
		return array;
	}
	
	/**
	 * Returns {@code array} if it's not {@code null} and its length equals 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static <T> T[] checkLength(T[] array, int length) {
		return checkLength(array, length, null);
	}
	
	private static void throwException(String format, Object... args) {
		throw new IllegalArgumentException(args == null || args[0] == null ? null : String.format(format, args));
	}

}
