package com.frostphyr.avail;

/**
 * A basic callback interface with a single generic parameter.
 * 
 * @param <T> the type of parameter
 * @since 1.0
 */
public interface Callback<T> {
	
	/**
	 * Callback method with a single parameter.
	 * 
	 * @param param the parameter
	 */
	void call(T param);

}
