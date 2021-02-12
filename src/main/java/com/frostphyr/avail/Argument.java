package com.frostphyr.avail;

/**
 * Utility class containing methods to check for valid argument conditions.
 * 
 * @since 1.0
 */
public final class Argument {
	
	private Argument() {
	}
	
	/**
	 * Returns the specified {@code value} if it is not {@code null}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param <T> the type of the value
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static <T> T checkNotNull(T value, String message) {
		return check(value, value == null, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is not {@code null}, 
	 * otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param <T> the type of the value
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static <T> T checkNotNull(T value) {
		return checkNotNull(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkGreaterThan(byte value, byte number, String message) {
		return check(value, value <= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static byte checkGreaterThan(byte value, byte number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkGreaterThan(short value, short number, String message) {
		return check(value, value <= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static short checkGreaterThan(short value, short number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkGreaterThan(int value, int number, String message) {
		return check(value, value <= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static int checkGreaterThan(int value, int number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkGreaterThan(long value, long number, String message) {
		return check(value, value <= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static long checkGreaterThan(long value, long number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static float checkGreaterThan(float value, float number, String message) {
		return check(value, value <= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static float checkGreaterThan(float value, float number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static double checkGreaterThan(double value, double number, String message) {
		return check(value, value <= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static double checkGreaterThan(double value, double number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static char checkGreaterThan(char value, char number, String message) {
		return check(value, value <= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than
	 * @return the same {@code value}
	 */
	public static char checkGreaterThan(char value, char number) {
		return checkGreaterThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkGreaterThanOrEqual(byte value, byte number, String message) {
		return check(value, value < number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
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
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkGreaterThanOrEqual(short value, short number, String message) {
		return check(value, value < number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
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
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkGreaterThanOrEqual(int value, int number, String message) {
		return check(value, value < number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
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
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkGreaterThanOrEqual(long value, long number, String message) {
		return check(value, value < number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
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
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static float checkGreaterThanOrEqual(float value, float number, String message) {
		return check(value, value < number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static float checkGreaterThanOrEqual(float value, float number) {
		return checkGreaterThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static double checkGreaterThanOrEqual(double value, double number, String message) {
		return check(value, value < number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static double checkGreaterThanOrEqual(double value, double number) {
		return checkGreaterThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be greater than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static char checkGreaterThanOrEqual(char value, char number, String message) {
		return check(value, value < number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is greater than or equal to 
	 * the specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
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
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkLessThan(byte value, byte number, String message) {
		return check(value, value >= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static byte checkLessThan(byte value, byte number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkLessThan(short value, short number, String message) {
		return check(value, value >= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static short checkLessThan(short value, short number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkLessThan(int value, int number, String message) {
		return check(value, value >= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static int checkLessThan(int value, int number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkLessThan(long value, long number, String message) {
		return check(value, value >= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static long checkLessThan(long value, long number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static float checkLessThan(float value, float number, String message) {
		return check(value, value >= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static float checkLessThan(float value, float number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static double checkLessThan(double value, double number, String message) {
		return check(value, value >= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static double checkLessThan(double value, double number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static char checkLessThan(char value, char number, String message) {
		return check(value, value >= number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than the specified 
	 * {@code number}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than
	 * @return the same {@code value}
	 */
	public static char checkLessThan(char value, char number) {
		return checkLessThan(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkLessThanOrEqual(byte value, byte number, String message) {
		return check(value, value > number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
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
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkLessThanOrEqual(short value, short number, String message) {
		return check(value, value > number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
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
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkLessThanOrEqual(int value, int number, String message) {
		return check(value, value > number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
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
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkLessThanOrEqual(long value, long number, String message) {
		return check(value, value > number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
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
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static float checkLessThanOrEqual(float value, float number, String message) {
		return check(value, value > number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static float checkLessThanOrEqual(float value, float number) {
		return checkLessThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static double checkLessThanOrEqual(double value, double number, String message) {
		return check(value, value > number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @return the same {@code value}
	 */
	public static double checkLessThanOrEqual(double value, double number) {
		return checkLessThanOrEqual(value, number, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param number the number that {@code value} must be less than or 
	 * equal to
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static char checkLessThanOrEqual(char value, char number, String message) {
		return check(value, value > number, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is less than or equal to the 
	 * specified {@code number}, otherwise throws 
	 * {@link IllegalArgumentException}.
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
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkPositive(byte value, String message) {
		return checkGreaterThanOrEqual(value, (byte) 0, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static byte checkPositive(byte value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkPositive(short value, String message) {
		return checkGreaterThanOrEqual(value, (short) 0, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static short checkPositive(short value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkPositive(int value, String message) {
		return checkGreaterThanOrEqual(value, 0, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static int checkPositive(int value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkPositive(long value, String message) {
		return checkGreaterThanOrEqual(value, 0, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static long checkPositive(long value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static float checkPositive(float value, String message) {
		return checkGreaterThanOrEqual(value, 0f, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static float checkPositive(float value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static double checkPositive(double value, String message) {
		return checkGreaterThanOrEqual(value, 0d, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is positive, which means 
	 * greater than or equal to 0. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static double checkPositive(double value) {
		return checkPositive(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkNegative(byte value, String message) {
		return checkLessThan(value, (byte) 0, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static byte checkNegative(byte value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkNegative(short value, String message) {
		return checkLessThan(value, (short) 0, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static short checkNegative(short value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkNegative(int value, String message) {
		return checkLessThan(value, 0, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static int checkNegative(int value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkNegative(long value, String message) {
		return checkLessThan(value, 0, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static long checkNegative(long value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static float checkNegative(float value, String message) {
		return checkLessThan(value, 0, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static float checkNegative(float value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static double checkNegative(double value, String message) {
		return checkLessThan(value, 0, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static double checkNegative(double value) {
		return checkNegative(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkInsideRange(byte value, byte min, byte max, String message) {
		return check(value, value < min || value > max, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @return the same {@code value}
	 */
	public static byte checkInsideRange(byte value, byte min, byte max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkInsideRange(short value, short min, short max, String message) {
		return check(value, value < min || value > max, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @return the same {@code value}
	 */
	public static short checkInsideRange(short value, short min, short max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkInsideRange(int value, int min, int max, String message) {
		return check(value, value < min || value > max, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @return the same {@code value}
	 */
	public static int checkInsideRange(int value, int min, int max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkInsideRange(long value, long min, long max, String message) {
		return check(value, value < min || value > max, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @return the same {@code value}
	 */
	public static long checkInsideRange(long value, long min, long max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static float checkInsideRange(float value, float min, float max, String message) {
		return check(value, value < min || value > max, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @return the same {@code value}
	 */
	public static float checkInsideRange(float value, float min, float max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static double checkInsideRange(double value, double min, double max, String message) {
		return check(value, value < min || value > max, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @return the same {@code value}
	 */
	public static double checkInsideRange(double value, double min, double max) {
		return checkInsideRange(value, min, max, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param min the minimum that {@code value} can be
	 * @param max the maximum that {@code value} can be
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static char checkInsideRange(char value, char min, char max, String message) {
		return check(value, value < min || value > max, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is inside the specified 
	 * range, which means greater than or equal to {@code min} and less than 
	 * or equal to {@code max}. If not, throws 
	 * {@link IllegalArgumentException}.
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
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static byte checkPercent(byte value, String message) {
		return checkInsideRange(value, (byte) 0, (byte) 100, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static byte checkPercent(byte value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static short checkPercent(short value, String message) {
		return checkInsideRange(value, (short) 0, (short) 100, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static short checkPercent(short value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static int checkPercent(int value, String message) {
		return checkInsideRange(value, 0, 100, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static int checkPercent(int value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static long checkPercent(long value, String message) {
		return checkInsideRange(value, 0, 100, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static long checkPercent(long value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static float checkPercent(float value, String message) {
		return checkInsideRange(value, 0, 100, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static float checkPercent(float value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code value}
	 * @since 1.1
	 */
	public static double checkPercent(double value, String message) {
		return checkInsideRange(value, 0, 100, message);
	}
	
	/**
	 * Returns the specified {@code value} if it is a valid percent, which 
	 * means between 0 and 100. If not, throws 
	 * {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static double checkPercent(double value) {
		return checkPercent(value, null);
	}
	
	/**
	 * Returns the specified {@code array} if its length equals the specified 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static byte[] checkLength(byte[] array, int length, String message) {
		return check(array, array.length != length, message);
	}
	
	/**
	 * Returns the specified {@code array} if its length equals the specified 
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
	 * Returns the specified {@code array} if its length equals the specified 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static short[] checkLength(short[] array, int length, String message) {
		return check(array, array.length != length, message);
	}
	
	/**
	 * Returns the specified {@code array} if its length equals the specified 
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
	 * Returns the specified {@code array} if its length equals the specified 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static int[] checkLength(int[] array, int length, String message) {
		return check(array, array.length != length, message);
	}
	
	/**
	 * Returns the specified {@code array} if its length equals the specified 
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
	 * Returns the specified {@code array} if its length equals the specified 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static long[] checkLength(long[] array, int length, String message) {
		return check(array, array.length != length, message);
	}
	
	/**
	 * Returns the specified {@code array} if its length equals the specified 
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
	 * Returns the specified {@code array} if its length equals the specified 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static float[] checkLength(float[] array, int length, String message) {
		return check(array, array.length != length, message);
	}
	
	/**
	 * Returns the specified {@code array} if its length equals the specified 
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
	 * Returns the specified {@code array} if its length equals the specified 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static double[] checkLength(double[] array, int length, String message) {
		return check(array, array.length != length, message);
	}
	
	/**
	 * Returns the specified {@code array} if its length equals the specified 
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
	 * Returns the specified {@code array} if its length equals the specified 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static char[] checkLength(char[] array, int length, String message) {
		return check(array, array.length != length, message);
	}
	
	/**
	 * Returns the specified {@code array} if its length equals the specified 
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
	 * Returns the specified {@code array} if its length equals the specified 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static boolean[] checkLength(boolean[] array, int length, String message) {
		return check(array, array.length != length, message);
	}
	
	/**
	 * Returns the specified {@code array} if its length equals the specified 
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
	 * Returns the specified {@code array} if its length equals the specified 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @param message the detail message for the 
	 * {@code IllegalArgumentException} if it's thrown
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static Object[] checkLength(Object[] array, int length, String message) {
		return check(array, array.length != length, message);
	}
	
	/**
	 * Returns the specified {@code array} if its length equals the specified 
	 * {@code length}, otherwise throws {@link IllegalArgumentException}.
	 * 
	 * @param array the array to check
	 * @param length the length that {@code array}'s length must equal
	 * @return the same {@code array}
	 * @since 1.1
	 */
	public static Object[] checkLength(Object[] array, int length) {
		return checkLength(array, length, null);
	}
	
	private static <T> T check(T value, boolean condition, String message) {
		if (condition) {
			throw new IllegalArgumentException(message);
		}
		return value;
	}
	
	

}
