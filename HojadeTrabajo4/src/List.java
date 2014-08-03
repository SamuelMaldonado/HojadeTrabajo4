public interface List<E> {
	
	   public void addLast(E value);	//equivalente al push de un stack
	   // post: value is added to end of list
	
	   public E removeFirst();			//equivalente al pop de un stack pero del primer elemento en la lista
	   // pre: list is not empty
	   // post: removes and returns value from beginning of list
		  
	   public E getFirst();				//equivalente al peek de un stack pero del primer elemento en la lista
	   // pre: list is not empty
	   // post: returns first value in list
	   
	   public boolean isEmpty();		//equivalente al empty de un stack
	   // post: returns true iff list has no elements
	   
	   public int size();				//equivalente al size de un stack
	   // post: returns number of elements in list
	   
}