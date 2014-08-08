// TODO: Auto-generated Javadoc
/**
 * The Class DoubleNode.
 *
 * @param <E> the element type
 */
public class DoubleNode<E>
{
	
	/** The data. */
	protected E data;
	
	/** The next element. */
	protected DoubleNode<E> nextElement;
	
	/** The previous element. */
	protected DoubleNode<E> previousElement;
	
	/**
	 * Instantiates a new double node.
	 *
	 * @param v the v
	 * @param next the next
	 * @param previous the previous
	 */
	public DoubleNode(E v,DoubleNode<E> next,DoubleNode<E> previous)
	{
	    data = v;
	    nextElement = next;
	    if (nextElement != null)
	        nextElement.previousElement = this;
	    previousElement = previous;
	    if (previousElement != null)
	        previousElement.nextElement = this;
	}
	
	/**
	 * Instantiates a new double node.
	 *
	 * @param v the v
	 */
	public DoubleNode(E v)
	// post: constructs a single element
	{
	    this(v,null,null);
	}

   /**
    * Next.
    *
    * @return the double node
    */
   public DoubleNode<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }
   
   /**
    * Value.
    *
    * @return the e
    */
   public E value()
   // post: returns value associated with this element
   {
      return data;
   }   
   
   
}