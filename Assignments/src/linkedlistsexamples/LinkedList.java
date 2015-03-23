package linkedlistsexamples;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * @author Andrew
 *
 * @param <E>
 *            The
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements
		Iterable<E>, Collection<E> {
	
	/**
	 * First node
	 */
	public Node<E> first;
	
	/**
	 * Last node
	 */
	public Node<E> last;
	
	/**
	 * Size of the list
	 */
	public int size;
	
	/**
	 * Creates empty LinkedList
	 */
	public LinkedList() {}
	
	@Override
	/**
	 * Gets the node element at the given index
	 * @param index the index
	 */
	public E get (int index) {
		
		try {
			return listIterator(index).next();
		}
		catch (NoSuchElementException exc) {
			throw new IndexOutOfBoundsException("Index: " + index);
		}
	}
	
	@Override
	/**
	 * Sets the element to the node at the given index
	 */
	public E set (int index, E element) {
		try {
			ListIterator<E> iterator = listIterator(index);
			E nodeValue = iterator.next();
			iterator.set(element);
			return nodeValue;
		}
		catch (NoSuchElementException exc) {
			throw new IndexOutOfBoundsException("Index: " + index);
		}
	}
	
	@Override
	public void add (int index, E element) {
		
		try {
			listIterator(index).add(element);
		}
		catch (NoSuchElementException e) {
			
			throw new IndexOutOfBoundsException("Index: " + index);
			
		}
		
	}
	
	@Override
	/**
	 * Removes the element at the given index
	 */
	public E remove (int index) {
		
		try {
			
			ListIterator<E> iterator = listIterator(index);
			E nodeValue = iterator.next();
			iterator.remove();
			return nodeValue;
			
		}
		catch (NoSuchElementException e) {
			
			throw new IndexOutOfBoundsException("Index: " + index);
			
		}
		
	}
	
	@Override
	/**
	 * Adds all elements in a collection c
	 */
	public boolean addAll (java.util.Collection<? extends E> c) {
		
		return super.addAll(c);
		
	}
	
	@Override
	/**
	 * Adds all elements in a collection c starting from index
	 */
	public boolean addAll (int index, java.util.Collection<? extends E> c) {
		
		return super.addAll(index, c);
		
	}
	
	@Override
	public ListIterator<E> listIterator (int index) {
		
		return new LinkedListIterator(index);
		
	}
	
	/**
	 * @param index
	 *            index of the node to get
	 * @return the node at the given index
	 */
	public Node<E> node (int index) {
		
		if (index < (size >> 1)) {
			Node<E> x = first;
			for (int i = 0; i < index; i++)
				x = x.next;
			return x;
		}
		else {
			Node<E> x = last;
			for (int i = size - 1; i > index; i--)
				x = x.previous;
			return x;
		}
		
	}
	
	@Override
	public int size () {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Node inner class
	 * 
	 * @author Andrew
	 *
	 * @param <T>
	 *            Node type
	 */
	public class Node<T> {
		
		/**
		 * Value of the node
		 */
		public T element;
		
		/**
		 * Next node
		 */
		public Node<T> next;
		
		/**
		 * Previous node
		 */
		
		public Node<T> previous;
		
		/**
		 * 
		 */
		public Node () {
			
			this.element = null;
			this.next = this;
			this.previous = this;
			
		}
		
		/**
		 * 
		 * @param element
		 *            Value of node
		 */
		public Node (T element) {
			
			this.element = element;
			this.next = this;
			this.previous = this;
			
		}
		
	}
	
	/**
	 * Iterator
	 * 
	 * @author Andrew
	 */
	public class LinkedListIterator implements ListIterator<E> {
		
		/**
		 * Last returned node
		 */
		public Node<E> lastReturned = null;
		
		/**
		 * Current node
		 */
		public Node<E> current;
		
		/**
		 * Current node
		 */
		public LinkedList<E>.Node<E> next;
		
		/**
		 * Next index
		 */
		public int nextIndex;
		
		/**
		 * 
		 * Constructor
		 * 
		 * @param index
		 *            index of the first element to return
		 * 
		 */
		public LinkedListIterator (int index) {
			
			next = (index == size) ? null : node(index);
			
		}
		
		@Override
		public boolean hasNext () {
			
			return nextIndex < size;
			
		}
		
		@Override
		public E next () {
			
			if (!hasNext()) {
				
				throw new NoSuchElementException();
				
			}
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.element;
			
		}
		
		@Override
		public boolean hasPrevious () {
			
			return nextIndex > 0;
		}
		
		@Override
		public E previous () {
			
			if (!hasPrevious()) {
				
				throw new NoSuchElementException();
				
			}
			lastReturned = next = (next == null) ? last : next.previous;
			nextIndex--;
			return lastReturned.element;
			
		}
		
		@Override
		public int nextIndex () {
			
			return nextIndex;
			
		}
		
		@Override
		public int previousIndex () {
			
			return nextIndex - 1;
			
		}
		
		E unlink (Node<E> node) {
			
			// TODO Finish method
			
			return node.element;
			
		}
		
		@Override
		public void remove () {
			
			Node<E> lastNext = lastReturned.next;
			lastReturned.previous.next = next;
			lastNext.previous = lastReturned.previous;
			
		}
		
		@Override
		public void set (E e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void add (E e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
