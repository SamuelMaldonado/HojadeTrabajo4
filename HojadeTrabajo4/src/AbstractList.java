
public abstract class AbstractList<E> implements List<E> {
	public AbstractList(){
		
	}

	public boolean isEmpty()
	   // post: returns true iff list has no elements
	   {
	      return size() == 0;
	   }
}
