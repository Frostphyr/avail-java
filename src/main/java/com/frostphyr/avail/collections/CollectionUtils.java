package com.frostphyr.avail.collections;

import java.util.Iterator;
import java.util.ListIterator;

import com.frostphyr.avail.Argument;

/**
 * A class containing various utility methods relating to the Java collection 
 * framework.
 * 
 * @since 1.3
 */
public final class CollectionUtils {
	
	private CollectionUtils() {
	}
	
	/**
	 * Returns an immutable view of {@code iterator}. It will throw 
	 * {@link UnsupportedOperationException} if {@link Iterator#remove()} is 
	 * called. Otherwise, it will defer any call to the {@code iterator}.
	 * 
	 * @param <T> the parameter type of the specified and returned 
	 * {@link Iterator}
	 * @param iterator the {@link Iterator} to create an immutable view for
	 * @return an immutable view of {@code iterator}
	 * @throws IllegalArgumentException if {@code iterator} is {@code null}
	 */
	public static <T> Iterator<T> immutableIterator(Iterator<T> iterator) {
		Argument.checkNotNull(iterator, "iterator");
		
		return new Iterator<T>() {
			
			@Override
			public boolean hasNext() {
				return iterator.hasNext();
			}

			@Override
			public T next() {
				return iterator.next();
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}
	
	/**
	 * Returns an immutable view of {@code iterator}. The methods that can 
	 * modify the collection will throw an 
	 * {@link UnsupportedOperationException}. Otherwise, it will defer any 
	 * call to the {@code iterator}.
	 * <p>
	 * The methods that can modify the collection and will throw an 
	 * {@link UnsupportedOperationException} are:
	 * <ul>
	 *     <li>{@link ListIterator#remove()}</li>
	 *     <li>{@link ListIterator#set(Object)}</li>
	 *     <li>{@link ListIterator#add(Object)}</li>
	 * </ul>
	 * 
	 * @param <T> the parameter type of the specified and returned 
	 * {@link ListIterator}
	 * @param iterator the {@link ListIterator} to create an immutable view for
	 * @return an immutable view of {@code iterator}
	 * @throws IllegalArgumentException if {@code iterator} is {@code null}
	 */
	public static <T> ListIterator<T> immutableListIterator(final ListIterator<T> iterator) {
		Argument.checkNotNull(iterator, "iterator");
		
		return new ListIterator<T>() {
			
			@Override
			public boolean hasNext() {
				return iterator.hasNext();
			}

			@Override
			public T next() {
				return iterator.next();
			}

			@Override
			public boolean hasPrevious() {
				return iterator.hasPrevious();
			}

			@Override
			public T previous() {
				return iterator.previous();
			}

			@Override
			public int nextIndex() {
				return iterator.nextIndex();
			}

			@Override
			public int previousIndex() {
				return iterator.previousIndex();
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}

			@Override
			public void set(T e) {
				throw new UnsupportedOperationException();
			}

			@Override
			public void add(T e) {
				throw new UnsupportedOperationException();
			}
			
		};
	}

}
