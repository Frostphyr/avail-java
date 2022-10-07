package com.frostphyr.avail.text;

/**
 * Indicates how to handle surrogate pairs during text operations when the 
 * operation would normally split the pair.
 * 
 * @since 1.5
 */
public enum SurrogatePairPolicy {
	
	/**
	 * Splits the surrogate pair, causing undefined or incorrect Unicode characters.
	 */
	SPLIT,
	
	/**
	 * The entire pair, including the low and high surrogate, will be kept.
	 */
	KEEP,
	
	/**
	 * The entire pair, including the low and high surrogate, will be discarded.
	 */
	DISCARD

}
