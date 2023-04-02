package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int valorSet;// guardara valor para setter de contador

		// creo nuevo objeto tipo Fecha y lo asigno a la variable fecha
		Fecha fecha = new Fecha();

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// empiezo solicitando valor para año, mes y luego dia porque setter de dia usa
		// mes para hacer diferentes operaciones segun el valor de mes en switch

		// solicito a usuario valor para mes
		System.out.println("Introduzca valor para mes: ");
		// recojo dicho valor por escaner y lo asigno a valorSet
		valorSet = dogma.nextInt();
		// si el valor de valorSet es menor a 1 o mayor a 12
		if (valorSet < 1 || valorSet > 12) {
			// imprimo mensaje de error por pantalla
			System.out.println("Asegurese de introducir un valor para mes entre 1 y 12.");
		}
		// llamo al setter de atributo mes con objeto fecha dandole como parametro de
		// entrada valorSet
		fecha.setMes(valorSet);
		// reinicio valor de valorSet a 0 para siguiente uso
		valorSet = 0;

		// solicito a usuario valor para dia
		System.out.println("Introduzca valor para dia: ");
		// recojo dicho valor por escaner y lo asigno a valorSet
		valorSet = dogma.nextInt();
		// si el valor de valorSet es menor a 1 o mayor a 31
		if (valorSet < 1 || valorSet > 31) {
			// imprimo mensaje de error por pantalla
			System.out.println("Asegurese de introducir un valor para dia entre 1 y 31.");
		}
		// llamo al setter de atributo dia con objeto fecha dandole como parametro de
		// entrada valorSet
		fecha.setDia(valorSet);
		// reinicio valor de valorSet a 0 para siguiente uso
		valorSet = 0;

		// solicito a usuario valor para año
		System.out.println("Introduzca valor para año: ");
		// recojo dicho valor por escaner y lo asigno a valorSet
		valorSet = dogma.nextInt();
		// si el valor de valorSet es menor 0
		if (valorSet < 0) {
			// imprimo mensaje de error por pantalla
			System.out.println("Asegurese de introducir un valor para año mayor a 0.");
		}
		// llamo al setter de atributo año con objeto fecha dandole como parametro de
		// entrada valorSet
		fecha.setAño(valorSet);
		// reinicio valor de valorSet a 0 para siguiente uso
		valorSet = 0;

		// consulto el valor del atributo dia del objeto fecha usando el getter de dia
		System.out.println(fecha.getDia());

		// consulto el valor del atributo mes del objeto fecha usando el getter de mes
		System.out.println(fecha.getMes());

		// consulto el valor del atributo año del objeto fecha usando el getter de año
		System.out.println(fecha.getAño());

		// si el metodo fechaCorrecta llamado con objeto fecha devuelve true
		if (fecha.fechaCorrecta()) {
			// imprimo mensaje por pantalla para indicar que la fecha es correcta
			System.out.println("La fecha es correcta.");

			// de lo contrario
		} else {
			// imprimo mensaje por pantalla para indicar que la fecha no es correcta
			System.out.println("La fecha es incorrecta.");
		}

		// llamo al metodo diaSiguiente con el objeto fecha para avanzar un dia
		fecha.diaSiguiente();

		// muestro mensaje por pantalla devuelto al llamar al metodo toString con el
		// objeto fecha
		System.out.println(fecha.toString());

		// si el metodo fechaCorrecta llamado con objeto fecha devuelve true
		if (fecha.fechaCorrecta()) {
			// imprimo mensaje por pantalla para indicar que la fecha es correcta
			System.out.println("La fecha es correcta.");

			// de lo contrario
		} else {
			// imprimo mensaje por pantalla para indicar que la fecha no es correcta
			System.out.println("La fecha es incorrecta.");
		}

		// cierro escaner
		dogma.close();
	}

}
