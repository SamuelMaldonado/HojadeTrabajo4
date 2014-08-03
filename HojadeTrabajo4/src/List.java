public interface List<E> {
	
	   public void addLast(E value);	//equivalente al push de un stack
	   // post: value is added to end of list
	
	   public E remove(int i);			//equivalente al pop de un stack
	   // pre: 0 <= i < size()
	   // post: removes and returns object found at that location
	   
	   public E get();					//equivalente al peek de un stack
	   // pre: list has at least one element
	   // post: returns last value found in list
	   
	   public boolean isEmpty();		//equivalente al empty de un stack
	   // post: returns true iff list has no elements
	   
	   public int size();				//equivalente al size de un stack
	   // post: returns number of elements in list
	   
}