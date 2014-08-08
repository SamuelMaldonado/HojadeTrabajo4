// TODO: Auto-generated Javadoc
/**
 * The Class SinglyLinkedList.
 *
 * @param <E> the element type
 */
public class SinglyLinkedList<E> extends AbstractList<E>{

	/** The count. */
	protected int count; // list size
	
	/** The head. */
	protected Node<E> head; // ref. to first element
	
   /**
    * Instantiates a new singly linked list.
    */
   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }	
   
   /* (non-Javadoc)
    * @see List#addFirst(java.lang.Object)
    */
   public void addFirst(E value)
   // post: value is added to beginning of list
   {
      // note order that things happen:
      // head is parameter, then assigned
      head = new Node<E>(value, head);
      count++;
   }

  /* (non-Javadoc)
   * @see List#removeFirst()
   */
  public E removeFirst(){
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 
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