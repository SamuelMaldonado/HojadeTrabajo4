
import java.util.Vector;

public class StackVector<E> extends AbstractStack<E> {
    /**
     * Atributos de la pila
     */
    protected Vector<E> data;
    
    /**
     * Constructor
     */
    public StackVector(){
    	StackFactory<E> factory = new StackFactory<E>();
        data = (Vector<E>) factory.getStack();
    }
    
    /* (non-Javadoc)
     * @see Stack#push(java.lang.Object)
     */
    public void push(E item){
        data.addElement(item);
    }
    
    /* (non-Javadoc)
     * @see Stack#pop()
     */
    public E pop(){
    	E e;
    	e=data.get(size()-1);
    	data.removeElementAt(size()-1);
    	
        return e;
    }
    
    /* (non-Javadoc)
     * @see Stack#peek()
     */
    public E peek(){
        return data.get(size()-1);
    }
    
    /* (non-Javadoc)
     * @see Stack#size()
     */
    public int size(){
        return data.size();
    }
    
}