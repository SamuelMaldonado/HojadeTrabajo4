
import java.io.*;
import java.util.*;


// TODO: Auto-generated Javadoc
/**
 * The Class Calculadora.
 *
 * @param <E> the element type
 */
public class Calculadora<E>{
	/*Atributos de la clase*/
	/** The first instance. */
	private static Calculadora firstInstance = null; //para usar en el patron Singleton
	
	/** The Factory. */
	private StackFactory<Integer> Factory = new StackFactory<Integer>();
	
	/** The data. */
	private Stack<Integer> data;
	
	/** The car. */
	private String car;
	
	/** The resultado. */
	private int operando1,operando2,resultado;
	
	/** The a char. */
	private char aChar;						//Se guarda el caracter que se va a ir leyendo

	/**
	 * Constuctor de la clase.
	 */
	private Calculadora() {
		data = Factory.getStack();
		car="";
		operando1=0;
		operando2=0;
		resultado=0;
	}


	//uso del patron Singleton

    /**
	 * Gets the single instance of Calculadora.
	 *
	 * @return single instance of Calculadora
	 */
    	public static Calculadora getInstance(){
		if (firstInstance == null){
			firstInstance = new Calculadora();
		}
		return firstInstance;
	}


	/**
	 * Metodo que muestra el resultado de la operacion en el archivo .txt
	 */
	public void muestraResultado() {
	      File text = null;													//Objeto de tipo File
	      FileReader fr = null;												//Se crea objeto lector de objetos File
	      BufferedReader br = null;											//Objeto que me carga en el buffer

	      try {
	    	  String dir = System.getProperty("user.dir");
	    	  text = new File (dir+"\\Datos.txt");									//Se abre el fichero

	         fr = new FileReader (text);									//Lector del archivo
	         br = new BufferedReader(fr);									//Se carga el archivo

	         car=br.readLine();										//Se guarda lo leido en stringDatos
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{															//Se asegura que se cierre el fichero
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }

	  	//ciclo que compara cada caracter para saber si hacer push o pop y que operacion realizar
	      for (int x=0; x<car.length(); x++){
	    	  aChar=car.charAt(x);
	          if (aChar=='+'){					//suma los 2 ultimos valores si encuentra un "+"
	          	operando1 = data.pop();
	          	operando2 = data.pop();
	          	resultado = operando1 + operando2;
	          	data.push(resultado);
	          }

	          if (aChar=='-'){					//resta los 2 ultimos valores si encuentra un "-"
	          	operando1 = data.pop();
	          	operando2 = data.pop();
	          	resultado = operando1 - operando2;
	          	data.push(resultado);
	          }

	          if (aChar=='*'){					//multiplica los 2 ultimos valores si encuentra un "*"
	          	operando1 = data.pop();
	          	operando2 = data.pop();
	          	resultado = operando1 * operando2;
	          	data.push(resultado);	        	
	          }

	          if (aChar=='/'){					//divide los 2 ultimos valores si encuentra un "/"
	          	operando1 = data.pop();
	          	operando2 = data.pop();
	          	resultado = operando1 / operando2;
	          	data.push(resultado);	        	
	          }	        

	          if (aChar=='0' || aChar=='1' || aChar=='2' || aChar=='3' 			//si encuentra un numero lo guarda en la pila
	          		 || aChar=='4' || aChar=='5' || aChar=='6' || aChar=='7' 
	          		 || aChar=='8' || aChar=='9'){
	          	data.push((int)aChar-48);
	          }

	      }
	      System.out.println("\n/*************************/ " );
	      System.out.println("El resultado es: "+data.peek());
	      System.out.println("/*************************/ " );

	}
        
    /**
     * Gets the resultado.
     *
     * @return the resultado
     */
    public int getResultado(){		//devuelve el resultado final, se usa para la prueba unitaria
            return resultado;
        }
}