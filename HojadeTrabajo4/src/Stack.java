

// TODO: Auto-generated Javadoc
/**
 * The Interface Stack.
 *
 * @param <E> the element type
 */
public interface Stack<E> {
	
	/**
	 * Push.
	 *
	 * @param item the item
	 */
	public void push(E item);
	// pre: 
	// post: item is added to stack
	// will be popped next if no intervening push
	   
	/**
	 * Pop.
	 *
	 * @return the e
	 */
	public E pop();
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	   
	/**
	 * Peek.
	 *
	 * @return the e
	 */
	public E peek();
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	   
	/**
	 * Empty.
	 *
	 * @return true, if successful
	 */
	public boolean empty();
	// post: returns true if and only if the stack is empty
	   
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size();
	// post: returns the number of elements in the stack
}
