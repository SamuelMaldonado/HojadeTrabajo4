  // TODO: Auto-generated Javadoc
/*
   * Universidad del Valle de Guatemala.
   * Seccion: 30 	HOJA DE TRABAJO 4
   * @author Max de Leon Carne: 13012
   * @author Samuel Maldonado Carne:13153
   * Principal: Programa principal de la calculadora
   * 
   *
   */    
/**
   * The Class Principal.
   */
  public class Principal {
	
    	/**
	     * The main method.
	     *
	     * @param args the arguments
	     */
	    public static void main(String[] args){    
    		
	    	Calculadora casio= Calculadora.getInstance(); //Nueva forma de instanciar, uso de Singleton: no podemos volver a instanciar
	    	casio.muestraResultado();    	
    	
    	}
    	
}

