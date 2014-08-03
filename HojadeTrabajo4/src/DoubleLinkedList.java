public class DoubleLinkedList<E> extends AbstractList<E>{
	
	protected int count;
	protected DoubleNode<E> head;
	protected DoubleNode<E> tail;
	
	public DoubleLinkedList()
	// post: constructs an empty list
	{
	   head = null;
	   tail = null;
	   count = 0;
	}
	
	public void addLast(E value)
	// pre: value is not null
	// post: adds new value to tail of list
	{
	   // construct new element
	   tail = new DoubleNode<E>(value, null, tail);
	   // fix up head
	   if (head == null) head = tail;
	   count++;
	}
	
	
	public E removeFirst()
	// pre: list is not empty
	// post: removes value from tail of list
	{
	   DoubleNode<E> temp = head;
	   head = head.next();
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