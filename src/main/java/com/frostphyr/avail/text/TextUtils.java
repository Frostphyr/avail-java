package com.frostphyr.avail.text;

import com.frostphyr.avail.Argument;
import com.frostphyr.avail.ArrayUtils;

/**
 * A class containing various utility methods relating to text; most notably 
 * {@link String} and {@link CharSequence}.
 * 
 * @since 1.5
 */
public class TextUtils {
	
	private TextUtils() {
	}
	
	/**
	 * Returns a new {@link String} that is a substring of {@code string}, 
	 * from {@code beginIndex} (inclusive) to the end of {@code string}.
	 * <p>
	 * The difference between this method and {@link String#substring(int)} is 
	 * that this method allows you to specify a {@link SurrogatePairPolicy} to 
	 * determine how a surrogate pair should be handled if the pair would 
	 * normally be split.
	 * 
	 * @param string the {@link String} to create a substring from
	 * @param beginIndex the beginning index (inclusive)
	 * @param policy the {@link SurrogatePairPolicy} to use if a surrogate 
	 * pair would normally be split
	 * @return a substring of {@code string}, beginning at {@code beginIndex}, 
	 * unless changed by {@code policy}
	 * @throws IllegalArgumentException if {@code string} or {@code policy} is 
	 * {@code null}, or {@code beginIndex} is negative or greater than the 
	 * length of {@code string}
	 */
	public static String substring(String string, int beginIndex, SurrogatePairPolicy policy) {
		Argument.checkNotNull(string, "string");
		Argument.checkInsideRange(beginIndex, 0, string.length(), "beginIndex");
		Argument.checkNotNull(policy, "policy");
		
		if (beginIndex == 0) {
			return string;
		} else if (beginIndex == string.length()) {
			return StringConstants.EMPTY;
		}
		
		int adjustedBeginIndex = beginIndex;
		if (Character.isLowSurrogate(string.charAt(beginIndex))) {
			if (policy == SurrogatePairPolicy.KEEP) {
				adjustedBeginIndex--;
			} else if (policy == SurrogatePairPolicy.DISCARD) {
				adjustedBeginIndex++;
			}
		}
		return string.substring(adjustedBeginIndex);
	}
	
	/**
	 * Returns a new {@link String} that is a substring of {@code string}, 
	 * from {@code beginIndex} (inclusive) to {@code endIndex} (exclusive).
	 * <p>
	 * The difference between this method and 
	 * {@link String#substring(int, int)} is that this method allows you to 
	 * specify a {@link SurrogatePairPolicy} to determine how a surrogate pair 
	 * should be handled if the pair would normally be split at either the 
	 * {@code beginIndex} or {@code endIndex}.
	 * 
	 * @param string the {@link String} to create a substring from
	 * @param beginIndex the beginning index (inclusive)
	 * @param endIndex the ending index (exclusive)
	 * @param beginPolicy the {@link SurrogatePairPolicy} to use if a surrogate 
	 * pair would normally be split at the {@code beginIndex}
	 * @param endPolicy the {@link SurrogatePairPolicy} to use if a surrogate 
	 * pair would normally be split at the {@code endIndex}
	 * @return a substring of {@code string}, from {@code beginIndex} to 
	 * {@code endIndex}, unless changed by either {@code beginPolicy} or 
	 * {@code endPolicy}
	 * @throws IllegalArgumentException if {@code string}, 
	 * {@code beginPolicy}, or {@code endPolicy} is {@code null}, 
	 * {@code beginIndex} is negative, {@code endIndex} is greater than the 
	 * length of {@code string}, or {@code beginIndex} is greater than 
	 * {@code endIndex}
	 * 
	 */
	public static String substring(String string, int beginIndex, int endIndex,
			SurrogatePairPolicy beginPolicy, SurrogatePairPolicy endPolicy) {
		Argument.checkNotNull(string, "string");
		Argument.checkGreaterThanOrEqual(beginIndex, 0, "beginIndex");
		Argument.checkLessThanOrEqual(endIndex, string.length(), "endIndex");
		Argument.checkLessThanOrEqual(beginIndex, endIndex, "beginIndex");
		Argument.checkNotNull(beginPolicy, "beginPolicy");
		Argument.checkNotNull(endPolicy, "endPolicy");
		
		if (beginIndex == endIndex) {
			return StringConstants.EMPTY;
		} else if (beginIndex == 0 && endIndex == string.length()) {
			return string;
		}
		
		int adjustedBeginIndex = beginIndex;
		int adjustedEndIndex = endIndex;
		
		if (beginIndex != 0 && Character.isLowSurrogate(string.charAt(beginIndex))) {
			if (beginPolicy == SurrogatePairPolicy.KEEP) {
				adjustedBeginIndex--;
			} else if (beginPolicy == SurrogatePairPolicy.DISCARD) {
				adjustedBeginIndex++;
			}
		}
		
		if (endIndex != string.length() && Character.isLowSurrogate(string.charAt(endIndex))) {
			if (endPolicy == SurrogatePairPolicy.KEEP) {
				adjustedEndIndex++;
			} else if (endPolicy == SurrogatePairPolicy.DISCARD) {
				adjustedEndIndex--;
			}
		}
		
		return string.substring(adjustedBeginIndex, adjustedEndIndex);
	}
	
	/**
	 * Returns a new {@link String} that is a substring of the specified 
	 * {@link String}, from {@code beginIndex} (inclusive) to {@code endIndex} 
	 * (exclusive).
	 * <p>
	 * The difference between this method and 
	 * {@link String#substring(int, int)} is that this method allows you to 
	 * specify a {@link SurrogatePairPolicy} to determine how a surrogate pair 
	 * should be handled if the pair would normally be split.
	 * 
	 * @param string the {@link String} to create a substring from
	 * @param beginIndex the beginning index (inclusive)
	 * @param endIndex the ending index (exclusive)
	 * @param policy the {@link SurrogatePairPolicy} to use if a surrogate 
	 * pair would normally be split
	 * @return a substring of the specified {@link String}, from 
	 * {@code beginIndex} to {@code endIndex}, unless changed by the specified 
	 * {@link SurrogatePairPolicy}
	 * @throws IllegalArgumentException if {@code string} or {@code policy} is 
	 * {@code null}, {@code beginIndex} is negative, {@code endIndex} is 
	 * greater than the length of {@code string}, or {@code beginIndex} is 
	 * greater than {@code endIndex}
	 */
	public static String substring(String string, int beginIndex, int endIndex,
			SurrogatePairPolicy policy) {
		return substring(string, beginIndex, endIndex, policy, policy);
	}
	
	/**
	 * Returns a {@link String} of the elements of {@code iterable} joined 
	 * together by {@code separator}. The {@code separator} and each element 
	 * will use {@link Object#toString()} for its text. If {@code separator} 
	 * is {@code null}, the elements will be joined together with no 
	 * separator. If any element is {@code null}, {@code "null"} will be used.
	 * 
	 * @param iterable the elements to join
	 * @param separator the {@link Object} to join the elements with
	 * @return the joined {@link String}
	 * @throws IllegalArgumentException if {@code iterable} is {@code null}
	 */
	public static String join(Iterable<?> iterable, Object separator) {
		Argument.checkNotNull(iterable, "iterable");
		
		StringBuilder builder = new StringBuilder();
		for (Object o : iterable) {
			if (separator != null && builder.length() != 0) {
				builder.append(separator);
			}
			builder.append(o);
		}
		return builder.toString();
	}
	
	/**
	 * Returns a {@link String} of the elements of {@code elements} joined 
	 * together by {@code separator}. The {@code separator} and each element 
	 * will use {@link Object#toString()} for its text. If {@code separator} 
	 * is {@code null}, the elements will be joined together with no 
	 * separator. If any element is {@code null}, {@code "null"} will be used.
	 * 
	 * @param elements the elements to join
	 * @param separator the {@link Object} to join the elements with
	 * @return the joined {@link String}
	 * @throws IllegalArgumentException if {@code elements} is {@code null}
	 */
	public static String join(Object[] elements, Object separator) {
		return join(ArrayUtils.asList(elements), separator);
	}
	
	/**
	 * Returns a {@link String} of each element of {@code elements} joined 
	 * together by {@code separator}. The {@code separator} will use 
	 * {@link Object#toString()} for the separator text. If {@code separator} 
	 * is {@code null}, the elements will be joined together with no separator.
	 * 
	 * @param elements the elements to join
	 * @param separator the {@link Object} to join the elements with
	 * @return the joined {@link String}
	 * @throws IllegalArgumentException if {@code elements} is {@code null}
	 */
	public static String join(byte[] elements, Object separator) {
		return join(ArrayUtils.asList(elements), separator);
	}
	
	/**
	 * Returns a {@link String} of each element of {@code elements} joined 
	 * together by {@code separator}. The {@code separator} will use 
	 * {@link Object#toString()} for the separator text. If {@code separator} 
	 * is {@code null}, the elements will be joined together with no separator.
	 * 
	 * @param elements the elements to join
	 * @param separator the {@link Object} to join the elements with
	 * @return the joined {@link String}
	 * @throws IllegalArgumentException if {@code elements} is {@code null}
	 */
	public static String join(short[] elements, Object separator) {
		return join(ArrayUtils.asList(elements), separator);
	}
	
	/**
	 * Returns a {@link String} of each element of {@code elements} joined 
	 * together by {@code separator}. The {@code separator} will use 
	 * {@link Object#toString()} for the separator text. If {@code separator} 
	 * is {@code null}, the elements will be joined together with no separator.
	 * 
	 * @param elements the elements to join
	 * @param separator the {@link Object} to join the elements with
	 * @return the joined {@link String}
	 * @throws IllegalArgumentException if {@code elements} is {@code null}
	 */
	public static String join(int[] elements, Object separator) {
		return join(ArrayUtils.asList(elements), separator);
	}
	
	/**
	 * Returns a {@link String} of each element of {@code elements} joined 
	 * together by {@code separator}. The {@code separator} will use 
	 * {@link Object#toString()} for the separator text. If {@code separator} 
	 * is {@code null}, the elements will be joined together with no separator.
	 * 
	 * @param elements the elements to join
	 * @param separator the {@link Object} to join the elements with
	 * @return the joined {@link String}
	 * @throws IllegalArgumentException if {@code elements} is {@code null}
	 */
	public static String join(long[] elements, Object separator) {
		return join(ArrayUtils.asList(elements), separator);
	}
	
	/**
	 * Returns a {@link String} of each element of {@code elements} joined 
	 * together by {@code separator}. The {@code separator} will use 
	 * {@link Object#toString()} for the separator text. If {@code separator} 
	 * is {@code null}, the elements will be joined together with no separator.
	 * 
	 * @param elements the elements to join
	 * @param separator the {@link Object} to join the elements with
	 * @return the joined {@link String}
	 * @throws IllegalArgumentException if {@code elements} is {@code null}
	 */
	public static String join(float[] elements, Object separator) {
		return join(ArrayUtils.asList(elements), separator);
	}
	
	/**
	 * Returns a {@link String} of each element of {@code elements} joined 
	 * together by {@code separator}. The {@code separator} will use 
	 * {@link Object#toString()} for the separator text. If {@code separator} 
	 * is {@code null}, the elements will be joined together with no separator.
	 * 
	 * @param elements the elements to join
	 * @param separator the {@link Object} to join the elements with
	 * @return the joined {@link String}
	 * @throws IllegalArgumentException if {@code elements} is {@code null}
	 */
	public static String join(double[] elements, Object separator) {
		return join(ArrayUtils.asList(elements), separator);
	}
	
	/**
	 * Returns a {@link String} of each element of {@code elements} joined 
	 * together by {@code separator}. The {@code separator} will use 
	 * {@link Object#toString()} for the separator text. If {@code separator} 
	 * is {@code null}, the elements will be joined together with no separator.
	 * 
	 * @param elements the elements to join
	 * @param separator the {@link Object} to join the elements with
	 * @return the joined {@link String}
	 * @throws IllegalArgumentException if {@code elements} is {@code null}
	 */
	public static String join(char[] elements, Object separator) {
		return join(ArrayUtils.asList(elements), separator);
	}
	
	/**
	 * Returns a {@link String} of each element of {@code elements} joined 
	 * together by {@code separator}. The {@code separator} will use 
	 * {@link Object#toString()} for the separator text. If {@code separator} 
	 * is {@code null}, the elements will be joined together with no separator.
	 * 
	 * @param elements the elements to join
	 * @param separator the {@link Object} to join the elements with
	 * @return the joined {@link String}
	 * @throws IllegalArgumentException if {@code elements} is {@code null}
	 */
	public static String join(boolean[] elements, Object separator) {
		return join(ArrayUtils.asList(elements), separator);
	}

}
