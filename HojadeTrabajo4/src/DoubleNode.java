public class DoubleNode<E>
{
	protected E data;
	protected DoubleNode<E> nextElement;
	protected DoubleNode<E> previousElement;
	
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
	
	public DoubleNode(E v)
	// post: constructs a single element
	{
	    this(v,null,null);
	}

   public DoubleNode<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }
   
   public E value()
   // post: returns value associated with this element
   {
      return data;
   }   
   
   
}