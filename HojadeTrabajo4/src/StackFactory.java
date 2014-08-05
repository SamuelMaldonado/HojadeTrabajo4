
import java.util.Scanner;

public class StackFactory<E> {
	private Stack<E> hola;
	public Stack<E> getStack(){
		Scanner scan = new Scanner(System.in);
		String implementacion = scan.next();
		
		switch(implementacion){
		case "vector":
			hola = new StackVector<E>();
			break;
		case "arraylist":
			hola = new StackArrayList<E>();
			break;
		case "list":
			hola = new StackList<E>();
			break;
		}
		return hola;
	}
}