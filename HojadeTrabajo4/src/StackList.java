

// TODO: Auto-generated Javadoc
/**
 * The Class StackList.
 *
 * @param <E> the element type
 */
public class StackList<E> extends AbstractStack<E> {

	/** The data. */
	private List<E> data;
	
	/**
	 * Instantiates a new stack list.
	 */
	public StackList(){
		ListFactory<E> factory = new ListFactory<E>();
		data = factory.getList();
	}
	
	/* (non-Javadoc)
	 * @see Stack#push(java.lang.Object)
	 */
	public void push(E item){
		data.addFirst(item);
	}
	
	/* (non-Javadoc)
	 * @see Stack#pop()
	 */
	public E pop(){
		return data.removeFirst();
	}
	
	/* (non-Javadoc)
	 * @see Stack#peek()
	 */
	public E peek(){
		return data.getFirst();
	}
	
	/* (non-Javadoc)
	 * @see Stack#size()
	 */
	public int size(){
		return data.size();
	}

}
