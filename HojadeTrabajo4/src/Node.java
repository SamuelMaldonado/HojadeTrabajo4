// TODO: Auto-generated Javadoc
/**
 * The Class Node.
 *
 * @param <E> the element type
 */
public class Node<E>
{
   
   /** The data. */
   protected E data; // value stored in this element
   
   /** The next element. */
   protected Node<E> nextElement; // ref to next

   /**
    * Instantiates a new node.
    *
    * @param v the v
    * @param next the next
    */
   public Node(E v, Node<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   /**
    * Instantiates a new node.
    *
    * @param v the v
    */
   public Node(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   /**
    * Next.
    *
    * @return the node
    */
   public Node<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

   /**
    * Sets the next.
    *
    * @param next the new next
    */
   public void setNext(Node<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   /**
    * Value.
    *
    * @return the e
    */
   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   /**
    * Sets the value.
    *
    * @param value the new value
    */
   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}