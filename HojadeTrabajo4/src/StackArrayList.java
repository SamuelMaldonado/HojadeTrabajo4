import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class StackArrayList.
 *
 * @param <E> the element type
 */
public class StackArrayList<E> extends AbstractStack<E>{
	
	/** The data. */
	protected ArrayList<E> data;


	/**
	 * Instantiates a new stack array list.
	 */
	public StackArrayList()
	// post: constructs a new, empty stack
	{
		StackFactory<E> factory = new StackFactory<E>();
		data = (ArrayList<E>) factory.getStack();
	}

	/* (non-Javadoc)
	 * @see Stack#push(java.lang.Object)
	 */
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	/* (non-Javadoc)
	 * @see Stack#pop()
	 */
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

	/* (non-Javadoc)
	 * @see Stack#peek()
	 */
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	/* (non-Javadoc)
	 * @see Stack#size()
	 */
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	
}