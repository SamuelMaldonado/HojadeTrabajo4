

public class StackList<E> extends AbstractStack<E> {

	private List<E> data;
	
	public StackList(){
		ListFactory<E> factory = new ListFactory<E>();
		data = factory.getList();
	}
	
	public void push(E item){
		data.addFirst(item);
	}
	
	public E pop(){
		return data.removeFirst();
	}
	
	public E peek(){
		return data.getFirst();
	}
	
	public int size(){
		return data.size();
	}

}
