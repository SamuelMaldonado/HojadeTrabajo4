import java.util.Scanner;

public class ListFactory<E> {
	private List<E> hola;
	public List<E> getList(){
		Scanner scan = new Scanner(System.in);
		String implementacion = scan.next();
		
		switch(implementacion){
		case "simple":
			hola = new SinglyLinkedList<E>();
			break;
		case "doble":
			hola = new DoubleLinkedList<E>();
			break;
		case "circular":
			hola = new CircularLinkedList<E>();
			break;
		}
		return hola;
	}
}