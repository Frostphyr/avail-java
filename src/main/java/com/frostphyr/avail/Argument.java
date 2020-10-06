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
	 * @return the same {@code value}
	 */
	public static <T> T checkNotNull(T value) {
		return check(value, value == null);
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
		return check(value, value <= number);
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
		return check(value, value <= number);
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
		return check(value, value <= number);
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
		return check(value, value <= number);
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
		return check(value, value <= number);
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
		return check(value, value <= number);
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
		return check(value, value <= number);
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
		return check(value, value < number);
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
		return check(value, value < number);
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
		return check(value, value < number);
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
		return check(value, value < number);
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
		return check(value, value < number);
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
		return check(value, value < number);
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
		return check(value, value < number);
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
		return check(value, value >= number);
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
		return check(value, value >= number);
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
		return check(value, value >= number);
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
		return check(value, value >= number);
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
		return check(value, value >= number);
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
		return check(value, value >= number);
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
		return check(value, value >= number);
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
		return check(value, value > number);
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
		return check(value, value > number);
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
		return check(value, value > number);
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
		return check(value, value > number);
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
		return check(value, value > number);
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
		return check(value, value > number);
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
		return check(value, value > number);
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
		return checkGreaterThanOrEqual(value, (byte) 0);
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
		return checkGreaterThanOrEqual(value, (short) 0);
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
		return checkGreaterThanOrEqual(value, 0);
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
		return checkGreaterThanOrEqual(value, 0);
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
		return checkGreaterThanOrEqual(value, 0f);
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
		return checkGreaterThanOrEqual(value, 0d);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static byte checkNegative(byte value) {
		return checkLessThan(value, (byte) 0);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static short checkNegative(short value) {
		return checkLessThan(value, (short) 0);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static int checkNegative(int value) {
		return checkLessThan(value, 0);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static long checkNegative(long value) {
		return checkLessThan(value, 0);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static float checkNegative(float value) {
		return checkLessThan(value, 0);
	}
	
	/**
	 * Returns the specified {@code value} if it is negative, which means less 
	 * than 0. If not, throws {@link IllegalArgumentException}.
	 * 
	 * @param value the value to check
	 * @return the same {@code value}
	 */
	public static double checkNegative(double value) {
		return checkLessThan(value, 0);
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
		return check(value, value < min || value > max);
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
		return check(value, value < min || value > max);
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
		return check(value, value < min || value > max);
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
		return check(value, value < min || value > max);
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
		return check(value, value < min || value > max);
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
		return check(value, value < min || value > max);
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
		return check(value, value < min || value > max);
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
		return checkInsideRange(value, (byte) 0, (byte) 100);
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
		return checkInsideRange(value, (short) 0, (short) 100);
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
		return checkInsideRange(value, 0, 100);
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
		return checkInsideRange(value, 0, 100);
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
		return checkInsideRange(value, 0, 100);
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
		return checkInsideRange(value, 0, 100);
	}
	
	private static <T> T check(T value, boolean condition) {
		if (condition) {
			throw new IllegalArgumentException();
		}
		return value;
	}

}
