package com.frostphyr.avail;

/**
 * Utility class containing methods for floating point types {@code float} and 
 * {@code double}.
 * 
 * @since 1.4
 */
public final class FloatingPoint {
	
	/**
	 * The default epsilon used for {@code float}s which has a value of 1E-5.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 */
	public static final float EPSILON_DEFAULT_FLOAT = 1e-5f;
	
	/**
	 * The default epsilon used for {@code double}s which has a value of 1E-9.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 */
	public static final double EPSILON_DEFAULT_DOUBLE = 1e-9f;
	
	private FloatingPoint() {
	}
	
	/**
	 * Returns whether {@code value1} and {@code value2} are equal given the 
	 * specified {@code epsilon}.
	 * 
	 * @param value1 the first value to compare
	 * @param value2 the second value to compare
	 * @param epsilon the acceptable margin of error between both values where 
	 * they will be considered equal
	 * @return {@code true} if {@code value1} and {@code value2} are within 
	 * the specified {@code epsilon} of each other; {@code false} otherwise
	 */
	public static boolean equals(float value1, float value2, float epsilon) {
		return Math.abs(value1 - value2) <= epsilon;
	}
	
	/**
	 * Returns whether {@code value1} and {@code value2} are equal using the 
	 * default epsilon {@link #EPSILON_DEFAULT_FLOAT}.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 * 
	 * @param value1 the first value to compare
	 * @param value2 the second value to compare
	 * @return {@code true} if {@code value1} and {@code value2} are within 
	 * the default epsilon of each other; {@code false} otherwise
	 */
	public static boolean equals(float value1, float value2) {
		return equals(value1, value2, EPSILON_DEFAULT_FLOAT);
	}
	
	/**
	 * Returns whether {@code value1} and {@code value2} are equal given the 
	 * specified {@code epsilon}.
	 * 
	 * @param value1 the first value to compare
	 * @param value2 the second value to compare
	 * @param epsilon the acceptable margin of error between both values where 
	 * they will be considered equal
	 * @return {@code true} if {@code value1} and {@code value2} are within 
	 * the specified {@code epsilon} of each other; {@code false} otherwise
	 */
	public static boolean equals(double value1, double value2, double epsilon) {
		return Math.abs(value1 - value2) <= epsilon;
	}
	
	/**
	 * Returns whether {@code value1} and {@code value2} are equal using the 
	 * default epsilon {@link #EPSILON_DEFAULT_DOUBLE}.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 * 
	 * @param value1 the first value to compare
	 * @param value2 the second value to compare
	 * @return {@code true} if {@code value1} and {@code value2} are within 
	 * the default epsilon of each other; {@code false} otherwise
	 */
	public static boolean equals(double value1, double value2) {
		return equals(value1, value2, EPSILON_DEFAULT_DOUBLE);
	}
	
	/**
	 * Returns whether {@code value1} is less than {@code value2}. The 
	 * {@code epsilon} is used to determine if the values are equal, in which 
	 * case it will return {@code false}.
	 * 
	 * @param value1 the value to check if it is less than {@code value2}
	 * @param value2 the value to check if {@code value1} is less than
	 * @param epsilon the acceptable margin of error between both values where 
	 * they will be considered equal
	 * @return {@code true} if {@code value1} is less than {@code value2}; 
	 * {@code false} otherwise
	 * @see #equals(float, float, float)
	 */
	public static boolean lessThan(float value1, float value2, float epsilon) {
		return value1 < value2 && !equals(value1, value2, epsilon);
	}
	
	/**
	 * Returns whether {@code value1} is less than {@code value2}. The 
	 * default epsilon {@link #EPSILON_DEFAULT_FLOAT} is used to determine if 
	 * the values are equal, in which case it will return {@code false}.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 * 
	 * @param value1 the value to check if it is less than {@code value2}
	 * @param value2 the value to check if {@code value1} is less than
	 * @return {@code true} if {@code value1} is less than {@code value2}; 
	 * {@code false} otherwise
	 * @see #equals(float, float)
	 */
	public static boolean lessThan(float value1, float value2) {
		return lessThan(value1, value2, EPSILON_DEFAULT_FLOAT);
	}
	
	/**
	 * Returns whether {@code value1} is less than {@code value2}. The 
	 * {@code epsilon} is used to determine if the values are equal, in which 
	 * case it will return {@code false}.
	 * 
	 * @param value1 the value to check if it is less than {@code value2}
	 * @param value2 the value to check if {@code value1} is less than
	 * @param epsilon the acceptable margin of error between both values where 
	 * they will be considered equal
	 * @return {@code true} if {@code value1} is less than {@code value2}; 
	 * {@code false} otherwise
	 * @see #equals(double, double, double)
	 */
	public static boolean lessThan(double value1, double value2, double epsilon) {
		return value1 < value2 && !equals(value1, value2, epsilon);
	}
	
	/**
	 * Returns whether {@code value1} is less than {@code value2}. The 
	 * default epsilon {@link #EPSILON_DEFAULT_DOUBLE} is used to determine if 
	 * the values are equal, in which case it will return {@code false}.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 * 
	 * @param value1 the value to check if it is less than {@code value2}
	 * @param value2 the value to check if {@code value1} is less than
	 * @return {@code true} if {@code value1} is less than {@code value2}; 
	 * {@code false} otherwise
	 * @see #equals(double, double)
	 */
	public static boolean lessThan(double value1, double value2) {
		return lessThan(value1, value2, EPSILON_DEFAULT_DOUBLE);
	}
	
	/**
	 * Returns whether {@code value1} is greater than {@code value2}. The 
	 * {@code epsilon} is used to determine if the values are equal, in which 
	 * case it will return {@code false}.
	 * 
	 * @param value1 the value to check if it is greater than {@code value2}
	 * @param value2 the value to check if {@code value1} is greater than
	 * @param epsilon the acceptable margin of error between both values where 
	 * they will be considered equal
	 * @return {@code true} if {@code value1} is greater than {@code value2}; 
	 * {@code false} otherwise
	 * @see #equals(float, float, float)
	 */
	public static boolean greaterThan(float value1, float value2, float epsilon) {
		return value1 > value2 && !equals(value1, value2, epsilon);
	}
	
	/**
	 * Returns whether {@code value1} is greater than {@code value2}. The 
	 * default epsilon {@link #EPSILON_DEFAULT_FLOAT} is used to determine if 
	 * the values are equal, in which case it will return {@code false}.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 * 
	 * @param value1 the value to check if it is greater than {@code value2}
	 * @param value2 the value to check if {@code value1} is greater than
	 * @return {@code true} if {@code value1} is greater than {@code value2}; 
	 * {@code false} otherwise
	 * @see #equals(float, float)
	 */
	public static boolean greaterThan(float value1, float value2) {
		return greaterThan(value1, value2, EPSILON_DEFAULT_FLOAT);
	}
	
	/**
	 * Returns whether {@code value1} is greater than {@code value2}. The 
	 * {@code epsilon} is used to determine if the values are equal, in which 
	 * case it will return {@code false}.
	 * 
	 * @param value1 the value to check if it is greater than {@code value2}
	 * @param value2 the value to check if {@code value1} is greater than
	 * @param epsilon the acceptable margin of error between both values where 
	 * they will be considered equal
	 * @return {@code true} if {@code value1} is greater than {@code value2}; 
	 * {@code false} otherwise
	 * @see #equals(double, double, double)
	 */
	public static boolean greaterThan(double value1, double value2, double epsilon) {
		return value1 > value2 && !equals(value1, value2, epsilon);
	}
	
	/**
	 * Returns whether {@code value1} is greater than {@code value2}. The 
	 * default epsilon {@link #EPSILON_DEFAULT_DOUBLE} is used to determine if 
	 * the values are equal, in which case it will return {@code false}.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 * 
	 * @param value1 the value to check if it is greater than {@code value2}
	 * @param value2 the value to check if {@code value1} is greater than
	 * @return {@code true} if {@code value1} is greater than {@code value2}; 
	 * {@code false} otherwise
	 * @see #equals(double, double)
	 */
	public static boolean greaterThan(double value1, double value2) {
		return greaterThan(value1, value2, EPSILON_DEFAULT_DOUBLE);
	}
	
	/**
	 * Returns whether {@code value1} is less than or equal to {@code value2}. 
	 * The {@code epsilon} is used to determine if the values are equal, in 
	 * which case it will return {@code true}.
	 * 
	 * @param value1 the value to check if it is less than or equal to 
	 * {@code value2}
	 * @param value2 the value to check if {@code value1} is less than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between both values where 
	 * they will be considered equal
	 * @return {@code true} if {@code value1} is less than or equal to 
	 * {@code value2}; {@code false} otherwise
	 * @see #equals(float, float, float)
	 */
	public static boolean lessThanOrEqual(float value1, float value2, float epsilon) {
		return value1 < value2 || equals(value1, value2, epsilon);
	}
	
	/**
	 * Returns whether {@code value1} is less than or equal to {@code value2}. 
	 * The default epsilon {@link #EPSILON_DEFAULT_FLOAT} is used to determine 
	 * if the values are equal, in which case it will return {@code true}.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 * 
	 * @param value1 the value to check if it is less than or equal to 
	 * {@code value2}
	 * @param value2 the value to check if {@code value1} is less than or 
	 * equal to
	 * @return {@code true} if {@code value1} is less than or equal to 
	 * {@code value2}; {@code false} otherwise
	 * @see #equals(float, float)
	 */
	public static boolean lessThanOrEqual(float value1, float value2) {
		return lessThanOrEqual(value1, value2, EPSILON_DEFAULT_FLOAT);
	}
	
	/**
	 * Returns whether {@code value1} is less than or equal to {@code value2}. 
	 * The {@code epsilon} is used to determine if the values are equal, in 
	 * which case it will return {@code true}.
	 * 
	 * @param value1 the value to check if it is less than or equal to 
	 * {@code value2}
	 * @param value2 the value to check if {@code value1} is less than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between both values where 
	 * they will be considered equal
	 * @return {@code true} if {@code value1} is less than or equal to 
	 * {@code value2}; {@code false} otherwise
	 * @see #equals(double, double, double)
	 */
	public static boolean lessThanOrEqual(double value1, double value2, double epsilon) {
		return value1 < value2 || equals(value1, value2, epsilon);
	}
	
	/**
	 * Returns whether {@code value1} is less than or equal to {@code value2}. 
	 * The default epsilon {@link #EPSILON_DEFAULT_DOUBLE} is used to 
	 * determine if the values are equal, in which case it will return 
	 * {@code true}.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 * 
	 * @param value1 the value to check if it is less than or equal to 
	 * {@code value2}
	 * @param value2 the value to check if {@code value1} is less than or 
	 * equal to
	 * @return {@code true} if {@code value1} is less than or equal to 
	 * {@code value2}; {@code false} otherwise
	 * @see #equals(double, double)
	 */
	public static boolean lessThanOrEqual(double value1, double value2) {
		return lessThanOrEqual(value1, value2, EPSILON_DEFAULT_DOUBLE);
	}
	
	/**
	 * Returns whether {@code value1} is greater than or equal to 
	 * {@code value2}. The {@code epsilon} is used to determine if the values 
	 * are equal, in which case it will return {@code true}.
	 * 
	 * @param value1 the value to check if it is greater than or equal to 
	 * {@code value2}
	 * @param value2 the value to check if {@code value1} is greater than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between both values where 
	 * they will be considered equal
	 * @return {@code true} if {@code value1} is greater than or equal to 
	 * {@code value2}; {@code false} otherwise
	 * @see #equals(float, float, float)
	 */
	public static boolean greaterThanOrEqual(float value1, float value2, float epsilon) {
		return value1 > value2 || equals(value1, value2, epsilon);
	}
	
	/**
	 * Returns whether {@code value1} is greater than or equal to 
	 * {@code value2}. The default epsilon {@link #EPSILON_DEFAULT_FLOAT} is 
	 * used to determine if the values are equal, in which case it will return 
	 * {@code true}.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 * 
	 * @param value1 the value to check if it is greater than or equal to 
	 * {@code value2}
	 * @param value2 the value to check if {@code value1} is greater than or 
	 * equal to
	 * @return {@code true} if {@code value1} is greater than or equal to 
	 * {@code value2}; {@code false} otherwise
	 * @see #equals(float, float)
	 */
	public static boolean greaterThanOrEqual(float value1, float value2) {
		return greaterThanOrEqual(value1, value2, EPSILON_DEFAULT_FLOAT);
	}
	
	/**
	 * Returns whether {@code value1} is greater than or equal to 
	 * {@code value2}. The {@code epsilon} is used to determine if the values 
	 * are equal, in which case it will return {@code true}.
	 * 
	 * @param value1 the value to check if it is greater than or equal to 
	 * {@code value2}
	 * @param value2 the value to check if {@code value1} is greater than or 
	 * equal to
	 * @param epsilon the acceptable margin of error between both values where 
	 * they will be considered equal
	 * @return {@code true} if {@code value1} is greater than or equal to 
	 * {@code value2}; {@code false} otherwise
	 * @see #equals(double, double, double)
	 */
	public static boolean greaterThanOrEqual(double value1, double value2, double epsilon) {
		return value1 > value2 || equals(value1, value2, epsilon);
	}
	
	/**
	 * Returns whether {@code value1} is greater than or equal to 
	 * {@code value2}. The default epsilon {@link #EPSILON_DEFAULT_DOUBLE} is 
	 * used to determine if the values are equal, in which case it will return 
	 * {@code true}.
	 * <p>
	 * Care should be taken when using default epsilons as it may produce 
	 * unexpected results depending on the values used.
	 * 
	 * @param value1 the value to check if it is greater than or equal to 
	 * {@code value2}
	 * @param value2 the value to check if {@code value1} is greater than or 
	 * equal to
	 * @return {@code true} if {@code value1} is greater than or equal to 
	 * {@code value2}; {@code false} otherwise
	 * @see #equals(double, double)
	 */
	public static boolean greaterThanOrEqual(double value1, double value2) {
		return greaterThanOrEqual(value1, value2, EPSILON_DEFAULT_DOUBLE);
	}

}
