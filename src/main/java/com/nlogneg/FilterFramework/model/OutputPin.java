package com.nlogneg.FilterFramework.model;

/**
 * Represents a Pin that pushes data out.
 * @author Andrew
 *
 * @param <E>
 */
public interface OutputPin<E> extends Pin{
	/**
	 * Meant to be called by the InputPin whenever it wants to subscribe
	 * to updates.
	 * @param pin
	 */
	public void subscribe(InputPin<E, ?> pin);
}
