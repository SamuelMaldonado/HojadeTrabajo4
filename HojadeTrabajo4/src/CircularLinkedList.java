
/**
 * The Class CircularLinkedList.
 *
 * @param <E> the element type
 */
public class CircularLinkedList<E> extends AbstractList<E>{
	
	/** The tail. */
	protected Node<E> tail; 
	
	/** The count. */
	protected int count;
	
	/** The head. */
	protected Node<E> head;
	
	/**
	 * Instantiates a new circular linked list.
	 */
	public CircularLinkedList()
	// pre: constructs a new circular list
	{
	   tail = null;
	   count = 0;
	}
	
	/* (non-Javadoc)
	 * @see List#addFirst(java.lang.Object)
	 */
	public void addFirst(E value)		//es necesario para el addLast
	// pre: value non-null
	// post: adds element to head of list
	{
	   Node<E> temp = new Node<E>(value);
	   if (tail == null) { // first value added
	       tail = temp;
	       tail.setNext(tail);
	   } else { // element exists in list
	       temp.setNext(tail.next());
	       tail.setNext(temp);
	   }
	   count++;
	}
	
	
	/**
	 * Adds the last.
	 *
	 * @param value the value
	 */
	public void addLast(E value)
	// pre: value non-null
	// post: adds element to tail of list
	{
	   // new entry:
	   addFirst(value);
	   tail = tail.next();
	}
	
	
	/* (non-Javadoc)
	 * @see List#removeFirst()
	 */
	public E removeFirst()
	// pre: !isEmpty()
	// post: returns and removes value from tail of list
	{
	    Node<E> temp = head;
	    head = head.next(); // move head down list
	    count--;
	    return temp.value();
	}
	
	/* (non-Javadoc)
	 * @see List#getFirst()
	 */
	public E getFirst()
	// pre: list is not empty
	// post: returns first value in list
	{
	    return head.value();
	}
	
	/* (non-Javadoc)
	 * @see List#size()
	 */
	public int size()
	// post: returns number of elements in list
	{
	 return count;
	}
}