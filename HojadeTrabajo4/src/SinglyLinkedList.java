public class SinglyLinkedList<E> extends AbstractList<E>{

	protected int count; // list size
	protected Node<E> head; // ref. to first element
	
   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }	
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<E>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   }

  public E removeFirst(){
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 
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