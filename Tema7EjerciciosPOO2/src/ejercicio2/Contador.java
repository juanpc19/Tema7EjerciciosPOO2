package ejercicio2;

/**
 * clase que contendra metodos para crear y modificar contadores
 * 
 * @author jperez
 *
 */
public class Contador {

	private int contador;// atributo que guardara el valor del contador

	/**
	 * constructor sin parametros de entrada
	 */
	public Contador() {
		super();
	}

	/**
	 * constructor con parametros de entrada
	 * 
	 * @param valorContador valor usado para dar valor a atributo contador
	 */
	public Contador(int valorContador) {
		super();
		this.contador = valorContador;
	}

	/**
	 * constructor que copiara los atributos de un objeto en otro objeto
	 * 
	 * @param c objeto que contendra atributos a copiar
	 */
	public Contador(Contador c) {
		// doy al atributo del objeto con el que llamo al constructor valor del atributo
		// del objeto que paso como parametro de entrada
		this.contador = c.getContador();
		// lo anterior seria usando el get y esto el objeto, es lo mismo a efectos
		// practicos
		// this.contador = c.contador;
	}

	/**
	 * metodo que devolvera el valor del atributo del objeto con el que se le llame
	 * 
	 * @return this.contador devolvera el valor del atributo
	 */
	public int getContador() {
		return this.contador;
	}

	/**
	 * metodo que dara valor a atributo contador del objeto que llama al metodo
	 * 
	 * @param valorContador valor asignado al atributo contador del objeto con el
	 *                      que se ha llamado al metodo
	 */
	public void setContador(int valorContador) {
		// si el valorContador es mayor que 0
		if (valorContador > 0) {
			// doy al atributo del objeto el valor del parametro de entrada
			this.contador = valorContador;
		}
	}

	/**
	 * metodo que incrementara el valor del atributo contador del objeto con el que se ha
	 * llamado al metodo en +1
	 */
	public void incrementar() {
		this.contador += 1;
	}

	/**
	 * metodo que decrementara el valor del atributo contador del objeto con el que se ha
	 * llamado al metodo en -1 mientras este no pase a ser negativo
	 */
	public void decrementar() {
		// si el atributo contador del objeto que llama al metodo es mayor a 0
		if (this.contador > 0) {
			// le decremento por valor de -1
			this.contador -= 1;
		}
	}
}
