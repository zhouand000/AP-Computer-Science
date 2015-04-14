package examples.linkedlists;

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
	public LinkedList () {
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
	 * Adds all elements in a collection c starting from index
	 */
	public boolean addAll (int index, java.util.Collection<? extends E> c) {
		
		return super.addAll(index, c);
		
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
	
	/**
	 * Links an element to the end of the list
	 * 
	 * @param element
	 *            Element to link
	 */
	void linkLast (E element) {
		
		final Node<E> lastNode = last;
		final Node<E> newNode = new Node<E>(last, element, null);
		
		last = newNode;
		if (lastNode == null) {
			
			first = newNode;
			
		}
		else lastNode.next = newNode;
		
		size++;
		
	}
	
	/**
	 * Links an element
	 * 
	 * @param element
	 *            Element to link
	 * @param next
	 *            Next node
	 */
	void linkBefore (E element, Node<E> next) {
		
		final Node<E> nextNode = next;
		final Node<E> previousNode = next.previous;
		final Node<E> newNode = new Node<E>(previousNode, element, nextNode);
		nextNode.previous = newNode;
		if (previousNode == null) {
			
			first = newNode;
			
		}
        size++;
		
	}
	
	
	
	@Override
	public ListIterator<E> listIterator (int index) {
		
		return new LinkedListIterator(index);
		
	}
	
	/**
	 * @return a new DescendingIterator
	 */
	public ListIterator<E> descendingIterator () {
		
		return new DescendingIterator();
		
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
	public int size () {
		return size;
	}
	
	E unlink (Node<E> node) {
		
		final E element = node.value;
		final Node<E> next = node.next;
		final Node<E> previous = node.previous;
		if (node.previous == null) {
			
			first = next;
			
		}
		else {
			
			previous.next = next;
			node.previous = null;
			
		}
		
		if (next == null) {
			
			last = previous;
			
		}
		else {
			
			next.previous = previous;
			node.next = null;
			
		}
		
		node.value = null;
		
		size--;
		
		return element;
		
	}
	
	/**
	 * @return a String representation of the list
	 */
	public String getString () {
		
		StringBuilder sb = new StringBuilder("[");
		int counter = 0;
		
		for (E value : this) {
			
			sb.append(counter == 0 ? "" : ", " + value.toString());
			counter++;
			
		}
		
		sb.append("]");
		return sb.toString();
		
	}
	
	/**
	 * @author Andrew
	 * Descending iterator
	 */
	public class DescendingIterator implements ListIterator<E> {
		
		private LinkedListIterator iterator = new LinkedListIterator(size());
		
		public boolean hasNext() {
			
			return iterator.hasPrevious();
			
		}
		
		public E next () {
			
			return iterator.previous();
			
		}

		@Override
		public boolean hasPrevious () {
			
			return iterator.hasNext();
			
		}

		@Override
		public E previous () {
			
			return iterator.next();
			
		}

		@Override
		public int nextIndex () {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int previousIndex () {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void remove () {
			
			iterator.remove();
			
		}

		@Override
		public void set (E e) {
			
			iterator.set(e);
			
		}

		@Override
		public void add (E e) {
			
			iterator.add(e);
			
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
		public Node<E> next;
		
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
		/**
		 * Adds the element E to the linkedList at the current position
		 */
		public void add (E element) {
			
			
			// TODO UNFINISHED
			lastReturned = null;
			if (next == null) {
				
				linkLast(element);
				
			}
			else linkBefore(element, next);
			
			nextIndex++;
			
		}
		
		@Override
		public boolean hasNext () {
			
			return nextIndex < size;
			
		}
		
		@Override
		public boolean hasPrevious () {
			
			return nextIndex > 0;
		}
		
		@Override
		public E next () {
			
			
			if (!hasNext()) {
				
				throw new NoSuchElementException();
				
			}
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.value;
			
		}
		
		
		
		@Override
		public int nextIndex () {
			
			return nextIndex;
			
		}
		
		@Override
		public E previous () {
			
			if (!hasPrevious()) {
				
				throw new NoSuchElementException();
				
			}
			lastReturned = next = (next == null) ? last : next.previous;
			nextIndex--;
			return lastReturned.value;
			
		}
		
		@Override
		public int previousIndex () {
			
			return nextIndex - 1;
			
		}
		
		@Override
		public void remove () {
			
			if (lastReturned == null) {
				
				throw new IllegalStateException();
				
			}
			
			Node<E> lastNext = lastReturned.next;
			unlink(lastReturned);
			if (next == lastReturned) {
				next = lastNext;
			}
			else nextIndex--;
			lastReturned = null;
			
		}
		
		@Override
		public void set (E element) {
			
			lastReturned.value = element;
			
		}
		
	}
	
	/**
	 * Node inner class
	 * 
	 * @author Andrew
	 * 
	 */
	private static class Node<E> {
		
		/**
		 * Value of the node
		 */
		E value;
		
		/**
		 * Next node
		 */
		Node<E> next;
		
		/**
		 * Previous node
		 */
		Node<E> previous;
		
		/**
		 * Constructor
		 * @param previous Previous node
		 * @param element Value
		 * @param next Next node
		 */
		public Node (Node<E> previous, E element,
				Node<E> next) {
			
			this.value = element;
			this.next = next;
			this.previous = previous;
			
		}
		
	}
	
}
