package ejercicio1;

/**
 * clase que contendra metodos para modificar y mostrar la hora
 * 
 * @author juanpesca19
 *
 */
public class Hora {

	private int hora;// atributo que guardara el valor de hora

	private int minuto;// atributo que guardara el valor de minuto

	private int segundo;// atributo que guardara el valor de segundo

	/**
	 * constructor sin parametros de entrada
	 */
	public Hora() {
		super();
	}

	/**
	 * constructor con 3 parametros de entrada
	 * 
	 * @param hora    guardara el valor a asignar a atributo hora
	 * @param minuto  guardara el valor a asignar a atributo hora
	 * @param segundo guardara el valor a asignar a atributo hora
	 */
	public Hora(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	/**
	 * getter que devolvera el valor del atributo hora
	 * 
	 * @return hora devolvera el valor del atributo hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * setter que asignara valor a atributo hora
	 * 
	 * @param hora guardara el valor a asignar a atributo hora
	 */
	public void setHora(int hora) {
		// si el parametro de entrada hora es un valor entre 0 y 23 ambos incluidos
		if (hora > -1 && hora < 24) {
			// asigno a atributo hora valor de parametro de entrada hora
			this.hora = hora;
		}
	}

	/**
	 * getter que devolvera el valor del atributo minuto
	 * 
	 * @return minuto devolvera el valor del atributo minuto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * setter que asignara valor a atributo minuto
	 * 
	 * @param minuto guardara el valor a asignar a atributo minuto
	 */
	public void setMinuto(int minuto) {
		// si el parametro de entrada minuto es un valor entre 0 y 59 ambos incluidos
		if (minuto > -1 && minuto < 60) {
			// asigno a atributo minuto valor de parametro de entrada minuto
			this.minuto = minuto;
		}
	}

	/**
	 * getter que devolvera valor de atributo segundo
	 * 
	 * @return segundo devolvera valor de atributo segundo
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * setter que asignara valor a atributo segundo
	 * 
	 * @param segundo guardara el valor a asignar a atributo segundo
	 */
	public void setSegundo(int segundo) {
		// si el parametro de entrada segundo es un valor entre 0 y 59 ambos incluidos
		if (segundo > -1 && segundo < 60) {
			// asigno a atributo segundo valor de parametro de entrada segundo
			this.segundo = segundo;
		}
	}

	/**
	 * metodo que incrementara un segundo a la hora modificando todos los atributos
	 * de forma pertinente
	 * 
	 * @param incremento
	 */
	public void incrementaSegundo(int incremento) {
		// bucle for que llevara la cuenta de los segundos incrementados desde 1 hasta
		// valor de incremento
		for (int i = 1; i <= incremento; i++) {

			// en cada iteracion incremento atributo segundo en +1
			segundo++;

			// si atributo segundo adquiere valor igual a 60
			if (segundo == 60) {
				// sumo +1 a atributo minuto
				minuto++;
				// e igualo valor de atributo segundo a 0
				segundo = 0;
			}

			// si atributo minuto adquiere valor igual a 60
			if (minuto == 60) {
				// sumo a atributo hora +1
				hora++;
				// e igualo valor atributo minuto a 0
				minuto = 0;
			}

			// si atributo hora adquiere valor igual a 24
			if (hora == 24) {
				// igualo valor de atributo hora a 0
				hora = 0;
			}
		}
	}

	/**
	 * metodo que devolvera los valores del atributo del objeto con el que se llama
	 * en un mensaje por consola personalizable
	 */
	@Override
	public String toString() {
		return "Hora [" + hora + ":" + minuto + ":" + segundo + "]";
	}

}
