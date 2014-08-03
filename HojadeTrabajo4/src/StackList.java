import java.util.List;


public class StackList<E> extends AbstractStack<E> {

	protected List<E> data;
	
	public StackList(){
		data = new List<E>();
	}
	
	public void push(E item){
		data.add(item);
	}
	
	public E pop(){
		return data.remove(size()-1);
	}
	
	public E peek(){
		return data.get(size()-1);
	}
	
	public int size(){
		return data.size();
	}

}
