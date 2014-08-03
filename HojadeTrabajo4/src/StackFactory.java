
public class StackFactory<E> {

	public Stack<E> getStack(String implementacion){
		
		if (implementacion.equals("vector"))
			return new StackVector<E>();
		
		if (implementacion.equals("arraylist"))
			return new StackArrayList<E>();
		
		//if (implementacion.equals("list"))
			return new StackList<E>();
	}
}
