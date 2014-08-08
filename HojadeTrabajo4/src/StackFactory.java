
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Stack objects.
 *
 * @param <E> the element type
 */
public class StackFactory<E> {
	
	/** The implementa. */
	private Stack<E> implementa;
	
	/**
	 * Gets the stack.
	 *
	 * @return the stack
	 */
	public Stack<E> getStack(){
		System.out.println("Ingrese si quiere pila implementando: vector, arraylist o list");
		Scanner scan = new Scanner(System.in);
		String implementacion = scan.next();
		
		switch(implementacion){
		case "vector":
			implementa = new StackVector<E>();
			break;
		case "arraylist":
			implementa = new StackArrayList<E>();
			break;
		case "list":
			implementa = new StackList<E>();
			break;
		}
		return implementa;
	}
}