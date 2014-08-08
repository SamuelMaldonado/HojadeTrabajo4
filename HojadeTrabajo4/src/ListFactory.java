import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating List objects.
 *
 * @param <E> the element type
 */
public class ListFactory<E> {
	
	/** The implementa. */
	private List<E> implementa;
	
	/**
	 * Gets the list.
	 *
	 * @return the list
	 */
	public List<E> getList(){
		System.out.println("Ingrese si quiere lista: simple, doble o circular");
		Scanner scan = new Scanner(System.in);
		String implementacion = scan.next();
		
		switch(implementacion){
		case "simple":
			implementa = new SinglyLinkedList<E>();
			break;
		case "doble":
			implementa = new DoubleLinkedList<E>();
			break;
		case "circular":
			implementa = new CircularLinkedList<E>();
			break;
		}
		return implementa;
	}
}