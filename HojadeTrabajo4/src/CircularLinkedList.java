public class CircularLinkedList<E> extends AbstractList<E>{
	
	protected Node<E> tail; 
	protected int count;
	protected Node<E> head;
	
	public CircularLinkedList()
	// pre: constructs a new circular list
	{
	   tail = null;
	   count = 0;
	}
	
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
	
	
	public void addLast(E value)
	// pre: value non-null
	// post: adds element to tail of list
	{
	   // new entry:
	   addFirst(value);
	   tail = tail.next();
	}
	
	
	public E removeFirst()
	// pre: !isEmpty()
	// post: returns and removes value from tail of list
	{
	    Node<E> temp = head;
	    head = head.next(); // move head down list
	    count--;
	    return temp.value();
	}
	
	public E getFirst()
	// pre: list is not empty
	// post: returns first value in list
	{
	    return head.value();
	}
	
	public int size()
	// post: returns number of elements in list
	{
	 return count;
	}
}