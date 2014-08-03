
public abstract class AbstractStack<E> implements Stack<E> {

	public AbstractStack(){
		
	}
	
    /* (non-Javadoc)
     * @see Stack#empty()
     */
    public boolean empty(){
    	
    	return size() == 0;
    	
    }    
}
