package ejercicio3;

/**
 * clase que contendra metodos para establecer y modificar fechas, comprobar si
 * la fecha es correcta y mostrar la fecha por pantalla
 * 
 * @author juanpesca19
 *
 */
public class Fecha {

	private int dia;// atributo que guardara el dia de la fecha

	private int mes;// atributo que guardara el mes de la fecha

	private int año;// atributo que guardara el año de la fecha

	/**
	 * constructor sin paramentros
	 */
	public Fecha() {
		super();
	}

	/**
	 * constructor con 3 parametros
	 * 
	 * @param dia guardara valor para asignar a el atributo dia
	 * @param mes guardara valor para asignar a el atributo mes
	 * @param año guardara valor para asignar a el atributo año
	 */
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	/**
	 * getter de atributo dia
	 * 
	 * @return dia devolvera valor de atributo dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * setter de atributo dia
	 * 
	 * @param dia contendra valor a asignar a atributo dia
	 */
	public void setDia(int dia) {

		// hago switch de mes
		switch (mes) {

		// si mes es uno de los listados en el case (de los que tienen 31 dias)
		case 1, 3, 5, 7, 8, 10, 12 -> {
			// dia debera tener como minimo valor 1 y como maximo valor 31
			if (dia > 0 && dia < 32) {
				// de cumplirse la condicion modifico atributo dia con parametro de entrada dia
				this.dia = dia;
			}
		}
		// si mes es 2
		case 2 -> {

			// compruebo si el año es bisiesto y dia tiene valor entre 1 y 29
			if ((esBisiesto()) && (dia > 0 && dia < 30)) {
				// de cumplirse la condicion modifico atributo dia con parametro de entrada dia
				this.dia = dia;

				// si el año no es bisiesto compruebo si dia tiene valor entre 1 y 28
			} else if (dia > 0 && dia < 29) {
				// de cumplirse la condicion modifico atributo dia con parametro de entrada dia
				this.dia = dia;
			}

		}

		// si mes es uno de los listados en el case (de los que tienen 30 dias)
		case 4, 6, 9, 11 -> {
			// compruebo si el año es bisiesto y dia tiene valor entre 1 y 30
			if (dia > 0 && dia < 31) {
				// de cumplirse la condicion modifico atributo dia con parametro de entrada dia
				this.dia = dia;
			}
		}
		}
	}

	/**
	 * getter de atributo mes
	 * 
	 * @return mes devolvera valor de atributo mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * setter de atributo mes
	 * 
	 * @param mes contendra valor a asignar a atributo mes
	 */
	public void setMes(int mes) {
		// si valor de parametro de entrada mes es mayor a 0 y menor a 13
		if (mes > 0 && mes < 13) {
			// le doy su valor a atributo mes
			this.mes = mes;
		}
	}

	/**
	 * getter de atributo año
	 * 
	 * @return año devolvera valor de atributo año
	 */
	public int getAño() {
		return año;
	}

	/**
	 * setter de atributo año
	 * 
	 * @param año contendra valor a asignar a atributo año
	 */
	public void setAño(int año) {
		// si parametro de entrada año es mayor o igual a 0
		if (año >= 0) {
			// le doy su valor a atributo año
			this.año = año;
		}
	}

	/**
	 * metodo que comprobara si el año es bisiesto
	 * 
	 * @return resultado devolvera true o false segun sea año bisisesto o no
	 */
	private boolean esBisiesto() {
		boolean resultado = false;

		// si el atributo año el objeto con el que se llama al metodo dividido entre 4
		// tiene por resto 0
		if (this.año % 4 == 0) {
			// resultado pasa a ser true
			resultado = true;
		}
		return resultado;
	}

	/**
	 * metodo que comprobara que la fecha es correcta comprobando los valores de
	 * ciertos atributos
	 * 
	 * @return resultado devolvera true si la fecha es valida y false en caso
	 *         contrario
	 */
	public boolean fechaCorrecta() {
		boolean resultado = false;

		// si el año es bisiesto el mes es febrero (2) y el dia ser menor o igual a 29
		if (esBisiesto() && this.mes == 2 && this.dia <= 29) {
			// resultado toma valor true
			resultado = true;

			// de no ser bisiesto pero el mes ser febrero (2) y el dia ser menor o igual a
			// 28
		} else if (this.mes == 2 && this.dia <= 28) {
			// resultado toma valor true
			resultado = true;

			// de no cumplirse lo anterior ser el mes cualquiera menos el 2 y el dia ser
			// menor o igual a 31
		} else if (this.mes != 2 && this.dia < 32) {
			resultado = true;
		}
		return resultado;
	}

	/**
	 * metodo que aumenta dia en +1 modificando la fecha para que quede correcta
	 */
	public void diaSiguiente() {

		// hago switch de mes
		switch (mes) {

		// si mes es uno de los listados en el case (de los que tienen 31 dias)
		case 1, 3, 5, 7, 8, 10, 12 -> {
			// compruebo si estoy en el ultimo dia del mes
			if (dia == 31) {
				// de estarlo cambio valor de dia a 1
				dia = 1;
				// y sumo a valor de mes +1
				mes++;
				// y luego compruebo si el mes ha pasado a ser 13
				if (mes == 13) {
					// de serlo cambio valor de mes a 1
					mes = 1;
					// cambio valor de dia a 1
					dia = 1;
					// y sumo+1 a año
					año++;
				}

				// si no estoy en el ultimo dia del mes
			} else {
				// sumo a dia +1
				dia++;
			}
		}

		// si mes es febrero (2)
		case 2 -> {
			// compruebo si año es bisiesto
			if (esBisiesto()) {
				// de serlo compruebo si estoy en el ultimo dia del mes
				if (dia == 29) {
					// estarlo doy a dia valor igual a 1
					dia = 1;
					// y sumo +1 a mes
					mes++;
				}

				// de no estar en el ultimo dia del mes
				else {
					// sumo +1 a dia
					dia++;
				}
				//de no ser año bisiesto compruebo si estoy en el ultimo dia
			} else if (dia == 28) {
				// de estarlo doy a dia valor igual a 1
				dia = 1;
				// y sumo +1 a mes
				mes++;

				// si no estoy en el ultimo dia del mes
			} else {
				// sumo +1 a dia
				dia++;
			}
		}

		// si mes es uno de los listados en el case (de los que tienen 30 dias)
		case 4, 6, 9, 11 -> {
			// compruebo si estoy en el ultimo dia del mes
			if (dia == 30) {
				// de estarlo cambio valor de dia a 1
				dia = 1;
				// y sumo a valor de mes +1
				mes++;

				// si no estoy en el ultimo dia del mes
			} else {
				// sumo a dia +1
				dia++;
			}
		}
		}
	}

	/**
	 * metodo que devolvera una cadena en mensaje personalizado por pantalla con los
	 * valores delos atributos del objeto que lo llame
	 */
	@Override
	public String toString() {
		String cadena = "";

		// si dia tiene valor menor a 10 le añado 0 delante, valor dia y barra a la
		// cadena
		if (this.dia < 10) {
			cadena += "0" + dia + "/";
			// de lo contrario solo valor dia y barra
		} else {
			cadena += dia + "/";
		}

		// si mes tiene valor menor a 10 le añado 0 delante, valor mes y barra a la
		// cadena
		if (this.mes < 10) {
			cadena += "0" + mes + "/";
			// de lo contrario solo valor mes y barra
		} else {
			cadena += mes + "/";
		}

		// añado valor año a la cadena
		cadena += año;

		return cadena;
	}

}
