// TODO: Auto-generated Javadoc
/**
 * The Class DoubleLinkedList.
 *
 * @param <E> the element type
 */
public class DoubleLinkedList<E> extends AbstractList<E>{
	
	/** The count. */
	protected int count;
	
	/** The head. */
	protected DoubleNode<E> head;
	
	/** The tail. */
	protected DoubleNode<E> tail;
	
	/**
	 * Instantiates a new double linked list.
	 */
	public DoubleLinkedList()
	// post: constructs an empty list
	{
	   head = null;
	   tail = null;
	   count = 0;
	}
	
	/* (non-Javadoc)
	 * @see List#addFirst(java.lang.Object)
	 */
	public void addFirst(E value)
	// pre: value is not null
	// post: adds element to head of list
	{
	   // construct a new element, making it head
	   head = new DoubleNode<E>(value, head, null);
	   // fix tail, if necessary
	   if (tail == null) tail = head;
	   count++;
	}
	
	
	/* (non-Javadoc)
	 * @see List#removeFirst()
	 */
	public E removeFirst()
	// pre: list is not empty
	// post: removes value from tail of list
	{
	   DoubleNode<E> temp = head;
	   head = head.next();
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