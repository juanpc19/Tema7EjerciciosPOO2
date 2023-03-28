package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int valorSet;// guardara valor para setter de contador

		// creo nuevo objeto tipo Contador y lo asigno a la variable con
		Contador con = new Contador();

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// solicito a usuario valor para contador
		System.out.println("Introduzca un valor para contador: ");

		// recojo dicho valor por escaner y lo asigno a valorSet
		valorSet = dogma.nextInt();

		// llamo a funcion setContador con objeto con y parametro de entrada valorSet
		con.setContador(valorSet);

		// consulto el valor del atributo contador del objeto con usando el getter de contador
		System.out.println("El valor del contador 1 es: " + con.getContador());

		// PARA USAR CONSTRUCTOR COPIA DE
		// llamo al metodo constructor copia [Contador(con)] con una nueva variable de
		// tipo Contador (con2) indicandole que cree un NUEVO objeto que se llamara con2
		// con valores de los atributos del objeto con
		Contador con2 = new Contador(con);

		//solicito a usuario valor para contador
		System.out.println("Introduzca un nuevo valor para contador: ");

		// recojo dicho valor por escaner y lo asigno a valorSet
		valorSet = dogma.nextInt();

		// llamo al setter de atributo contador con objeto con dandole como parametro de
		// entrada valorSet
		con.setContador(valorSet);

		
		// consulto el valor del atributo contador del objeto con usando el getter de contador
		System.out.println("El valor del contador 1 es: " + con.getContador());
		
		// consulto el valor del atributo contador del objeto con2 usando el getter de contador
		System.out.println("El valor del contador 2 es: " + con2.getContador());

		//llamo a funcion incrementar con objeto con
		con.incrementar();

		// consulto el valor del atributo contador del objeto con usando el getter de contador
		System.out.println("El valor del contador 1 es: " + con.getContador());

		//llamo a funcion decrementar con objeto con
		con.decrementar();

		// consulto el valor del atributo contador del objeto con usando el getter de contador
		System.out.println("El valor del contador 1 es: " + con.getContador());

		//llamo a funcion incrementar con objeto con2
		con2.incrementar();

		// consulto el valor del atributo contador del objeto con2 usando el getter de contador
		System.out.println("El valor del contador 2 es: " + con2.getContador());

		//llamo a funcion decrementar con objeto con2
		con2.decrementar();

		// consulto el valor del atributo contador del objeto con2 usando el getter de contador
		System.out.println("El valor del contador 2 es: " + con2.getContador());

		//cierro escaner
		dogma.close();
	}

}
