// TODO: Auto-generated Javadoc
/**
 * The Interface List.
 *
 * @param <E> the element type
 */
public interface List<E> {
	
	   /**
   	 * Adds the first.
   	 *
   	 * @param value the value
   	 */
   	public void addFirst(E value);	//equivalente al push de un stack
	   // post: value is added to end of list
	
	   /**
   	 * Removes the first.
   	 *
   	 * @return the e
   	 */
   	public E removeFirst();			//equivalente al pop de un stack pero del primer elemento en la lista
	   // pre: list is not empty
	   // post: removes and returns value from beginning of list
		  
	   /**
   	 * Gets the first.
   	 *
   	 * @return the first
   	 */
   	public E getFirst();				//equivalente al peek de un stack pero del primer elemento en la lista
	   // pre: list is not empty
	   // post: returns first value in list
	   
	   /**
   	 * Checks if is empty.
   	 *
   	 * @return true, if is empty
   	 */
   	public boolean isEmpty();		//equivalente al empty de un stack
	   // post: returns true iff list has no elements
	   
	   /**
   	 * Size.
   	 *
   	 * @return the int
   	 */
   	public int size();				//equivalente al size de un stack
	   // post: returns number of elements in list
	   
}