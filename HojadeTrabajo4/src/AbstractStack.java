
// TODO: Auto-generated Javadoc
/**
 * The Class AbstractStack.
 *
 * @param <E> the element type
 */
public abstract class AbstractStack<E> implements Stack<E> {

	/**
	 * Instantiates a new abstract stack.
	 */
	public AbstractStack(){
		
	}
	
    /* (non-Javadoc)
     * @see Stack#empty()
     */
    public boolean empty(){
    	
    	return size() == 0;
    	
    }    
}
