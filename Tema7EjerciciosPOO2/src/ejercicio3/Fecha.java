package ejercicio3;

/**
 * clase que contendra metodos para establecer y modificar fechas, compobrobar
 * si la fecha es correcta y mostrar la fecha por pantalla
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
		// si valor parametro de entrada dia es mayor a 0 y menor a 31
		if (dia > 0 && dia < 32) {
			// le doy su valor a atributo dia
			this.dia = dia;
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

		// si el año es bisiesto el mes es febrero (2) y el dia es menor o igual a 29
		if (esBisiesto() && this.mes == 2 && this.dia <= 29) {
			// resultado toma valor true
			resultado = true;

			// de no cumplirse lo anterior
		} else if (this.mes == 2 && this.dia <= 28) {
			// resultado toma valor true
			resultado = true;

		} else if (this.mes != 2 && this.dia > 0 && this.dia < 32) {
			resultado = true;
		}
		return resultado;
	}

	/**
	 * metodo que aumenta dia en +1 modificando la fecha para que quede correcta
	 */
	public void diaSiguiente() {

		// switch de mes

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {

			if (dia == 31) {
				dia = 1;
				mes++;
			}
		}

		case 2 -> {

			if (esBisiesto()) {
				if (dia == 29) {
					dia = 1;
					mes++;
					
				} else if (dia == 28) {
					dia = 1;
					mes++;
				}
			}
		}

		case 4, 6, 9, 11 -> {
			if (dia == 30) {
				dia = 1;
				mes++;
			}
		}

		case 13 -> {
			mes = 1;
			dia = 1;
		}
		}
		if (esBisiesto() && this.dia < 29) {
			this.dia++;

		} else if (this.dia < 28) {
			this.dia++;
		}
		// hacer algo mas para los dias si dia es 30 0 31 si no es febrero?

		// si atributo mes toma valor mayor a 13
		if (this.mes > 12) {
			// doy a atributo mes valor igual a 0
			this.mes = 1;
			// y sumo a atributo año valor +1
			this.año++;
		}
	}

	/**
	 * metodo que devolvera una cadena en mensaje por pantalla con los valores de
	 * los atributos del objeto que lo llame
	 */
	@Override
	public String toString() {
		String cadena = "";

		if (this.dia < 10 && mes < 10) {
			cadena += "0" + dia + "/" + "0" + mes + "/" + año;

		} else if (this.dia < 10) {
			cadena += "0" + dia + "/" + mes + "/" + año;

		} else if (this.mes < 10) {
			cadena += +dia + "/" + "0" + mes + "/" + año;
		} else {
			cadena += +dia + "/" + mes + "/" + año;
		}

		return cadena;
	}

}
