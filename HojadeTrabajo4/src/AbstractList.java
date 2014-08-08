
// TODO: Auto-generated Javadoc
/**
 * The Class AbstractList.
 *
 * @param <E> the element type
 */
public abstract class AbstractList<E> implements List<E> {
	
	/**
	 * Instantiates a new abstract list.
	 */
	public AbstractList(){
		
	}

	/* (non-Javadoc)
	 * @see List#isEmpty()
	 */
	public boolean isEmpty()
	   // post: returns true iff list has no elements
	   {
	      return size() == 0;
	   }
}
