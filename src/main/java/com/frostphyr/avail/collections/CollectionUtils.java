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
	 * Returns an immutable view of the specified {@link Iterator}. The 
	 * method that can modify the collection, {@link Iterator#remove()}, 
	 * will throw an {@link UnsupportedOperationException}. Otherwise, it will 
	 * defer to the specified {@link Iterator}.
	 * 
	 * @param <T> the type of the {@link Iterator}'s generic parameter
	 * @param iterator the {@link Iterator} to create an immutable view for
	 * @return an immutable view of the specified {@link Iterator}
	 */
	public static <T> Iterator<T> immutableIterator(final Iterator<T> iterator) {
		return new ImmutableIterator<T>(iterator);
	}
	
	private static class ImmutableIterator<T> implements Iterator<T> {
		
		private Iterator<T> iterator;
		
		private ImmutableIterator(Iterator<T> iterator) {
			this.iterator = Argument.checkNotNull(iterator);
		}
		
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
		
	}
	
	/**
	 * Returns an immutable view of the specified {@link ListIterator}. The 
	 * methods that can modify the collection will throw an 
	 * {@link UnsupportedOperationException}. Otherwise, it will 
	 * defer to the specified {@link ListIterator}.
	 * <p>
	 * The methods that can modify the collection and will throw an 
	 * {@link UnsupportedOperationException} are:
	 * <ul>
	 *     <li>{@link ListIterator#remove()}</li>
	 *     <li>{@link ListIterator#set(Object)}</li>
	 *     <li>{@link ListIterator#add(Object)}</li>
	 * </ul>
	 * 
	 * @param <T> the type of the {@link ListIterator}'s generic parameter
	 * @param iterator the {@link ListIterator} to create an immutable view for
	 * @return an immutable view of the specified {@link ListIterator}
	 */
	public static <T> ListIterator<T> immutableListIterator(final ListIterator<T> iterator) {
		return new ImmutableListIterator<T>(iterator);
	}
	
	private static class ImmutableListIterator<T> implements ListIterator<T> {
		
		private ListIterator<T> iterator;
		
		private ImmutableListIterator(ListIterator<T> iterator) {
			this.iterator = Argument.checkNotNull(iterator);
		}
		
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
		
	}

}
