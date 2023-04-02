package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int seleccionUsuario = 0;// guardara seleecion del usuario para el CRUD

		int contador = 0;// guardara valor de codigo de disco, lo inicializo a 0 para uso en bucle

		int posicion = 0;// guardara valor de posicion en el arry tipo objeto disc, lo inicializo a 0
							// para uso en bucle

		String discoModificar = "";// guardara valor de codigo de disco proporcionado por usuario, se usara para
									// saber que disco modificar

		String autor = "";// guardara nombre de autor del disco

		String titulo = "";// guardara titulo del disco

		String genero = "";// guardara genero del disco

		int duracion;// guardara duracion del disco

		Disco disc[] = new Disco[10];// array tipo Disco de nombre disc que guardara 10 discos (10 objetos)

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// bucle que creara 10 variables tipo Disco con el contructor por defecto (que
		// dara valor igual a "LIBRE" en atributo codigo) y las ira guardando en las
		// posiciones del array disc
		for (int i = 0; i < disc.length; i++) {
			disc[i] = new Disco();
		}

		// bucle para ver valores iniciales de los disco del array disc (no lo pide el
		// ej lo pongo yo)
		for (int i = 0; i < disc.length; i++) {
			System.out.println(disc[i]);
		}

		// bloque de instrucciones de bucle do while para menu del programa que
		// ejecutara una accion u otra acorde
		// a la selecion del usuario mientras el usuario no introduzca 5
		do {
			// mensaje de menu por pantalla en el que solicito seleccion de usuario
			System.out.println(
					"COLECCION DE DISCOS \n--------------------\n--------------------\n1.Listado.\n2.Nuevo Disco.\n3.Modificar.\n4.Borrar.\n5.Salir");

			// recojo valor de usuario con escaner y lo asigno a seleccionUsuario
			seleccionUsuario = dogma.nextInt();

			// hago switch de seleccionUsuario
			switch (seleccionUsuario) {
			// si seleccionUsuario es 1 muestro el listado de discos con informacion en
			// ellos
			case 1 -> {

				// recorro el array disc
				for (int i = 0; i < disc.length; i++) {

					// imprimiendo por pantalla los objetos del array que contengan un codigo
					// diferente a "LIBRE", compruebo cuales comparando el getter de codigo con la
					// cadena "LIBRE" y le indico al equals que sea un no equals con la exclamacion
					// antes de disc
					if (!disc[i].getCodigo().equals("LIBRE")) {
						System.out.println(disc[i]);
					}
				}
			}

			// si seleccionUsuario es 2 creo un nuevo disco
			case 2 -> {
				// doy a posicion valor 0 para reiniciarla por si ya ha sido usada
				posicion = 0;

				// bucle que recorrera el array disc mientras posicion sea menor a la longitud
				// del array
				while (posicion < disc.length) {

					// si la posicion actual contiene un codigo con valor igual a "LIBRE" procedo
					// solicitar datos para "crear" el disco
					if (disc[posicion].getCodigo().equals("LIBRE")) {
						// aumento contador en +1
						contador++;
						// le doy al setter de codigo del objeto en posicion actual el valor de
						// contador, uso Integer.toString para pasar contador de int a String
						disc[posicion].setCodigo(Integer.toString(contador));

						// solicito valor para autor al usuario
						System.out.println("Introduzca autor del disco");
						// recojo valor con escaner y lo asigno a autor
						autor = dogma.next();
						// le doy al setter de autor del objeto en posicion actual el valor de autor
						disc[posicion].setAutor(autor);

						// solicito valor para titulo al usuario
						System.out.println("Introduzca titulo del disco");
						// recojo valor con escaner y lo asigno a titulo
						titulo = dogma.next();
						// le doy al setter de titulo del objeto en posicion actual el valor de titulo
						disc[posicion].setTitulo(titulo);

						// solicito valor para genero al usuario
						System.out.println("Introduzca genero del disco");
						// recojo valor con escaner y lo asigno a genero
						genero = dogma.next();
						// le doy al setter de genero del objeto en posicion actual el valor de genero
						disc[posicion].setGenero(genero);

						// solicito valor para duracion al usuario
						System.out.println("Introduzca duracion del disco");
						// recojo valor con escaner y lo asigno a duracion
						duracion = dogma.nextInt();
						// le doy al setter de duracion del objeto en posicion actual el valor de
						// duracion
						disc[posicion].setDuracion(duracion);

						// una vez creado el disco hago break para forzar salida del bucle
						break;
					}
					// mientras no encuentre un disco libre avanzare una posicion en el array cada
					// iteracion
					posicion++;
				}
			}

			// si seleccionUsuario es 3 modifico un disco ya existente
			case 3 -> {
				// solicito al usuario el codigo del disco a modificar
				System.out.println("Introduzca el codigo del disco que desea modificar del 1 al 10: ");
				// recojo valor con escaner y lo asigno a discoModificar
				discoModificar = dogma.next();

				// doy a posicion valor 0 para reiniciarla por si ya ha sido usada
				posicion = 0;

				// bucle que recorrera el array disc mientras posicion sea menor a la longitud
				// del array
				while (posicion < disc.length) {

					// si la posicion actual contiene un codigo con valor igual discoModificar
					// procedo a solicitar datos para modificar el disco
					if (disc[posicion].getCodigo().equals(discoModificar)) {

						// solicito valor para autor al usuario
						System.out.println("Introduzca autor del disco");
						// recojo valor con escaner y lo asigno a autor
						autor = dogma.next();
						// le doy al setter de autor del objeto en posicion actual el valor de autor
						disc[posicion].setAutor(autor);

						// solicito valor para titulo al usuario
						System.out.println("Introduzca titulo del disco");
						// recojo valor con escaner y lo asigno a titulo
						titulo = dogma.next();
						// le doy al setter de titulo del objeto en posicion actual el valor de titulo
						disc[posicion].setTitulo(titulo);

						// solicito valor para genero al usuario
						System.out.println("Introduzca genero del disco");
						// recojo valor con escaner y lo asigno a genero
						genero = dogma.next();
						// le doy al setter de genero del objeto en posicion actual el valor de genero
						disc[posicion].setGenero(genero);

						// solicito valor para duracion al usuario
						System.out.println("Introduzca duracion del disco");
						// recojo valor con escaner y lo asigno a duracion
						duracion = dogma.nextInt();
						// le doy al setter de duracion del objeto en posicion actual el valor de
						// duracion
						disc[posicion].setDuracion(duracion);

						// una vez modificado el disco hago break para forzar salida del bucle
						break;
					}
					// mientras no encuentre un disco con codigo igual a discoModificar avanzare una
					// posicion en el array cada
					// iteracion
					posicion++;
				}
			}

			// si seleccionUsuario es 4 borro un disco ya existente
			case 4 -> {
				// solicito al usuario el codigo del disco a modificar
				System.out.println("Introduzca el codigo del disco que desea borrar del 1 al 10: ");
				// recojo valor con escaner y lo asigno a discoModificar
				discoModificar = dogma.next();

				// doy a posicion valor 0 para reiniciarla por si ya ha sido usada
				posicion = 0;

				// bucle que recorrera el array disc mientras posicion sea menor a la longitud
				// del array
				while (posicion < disc.length) {

					// si la posicion actual contiene un codigo con valor igual discoModificar
					if (disc[posicion].getCodigo().equals(discoModificar)) {
						// reduzco valor de contador en -1
						contador--;

						// le doy al setter de codigo del objeto en posicion actual valor igual a
						// "LIBRE"
						disc[posicion].setCodigo("LIBRE");

						// una vez borrado el disco hago break para forzar salida del bucle
						break;
					}
					// mientras no encuentre un disco libre avanzare una posicion en el array cada
					// iteracion
					posicion++;
				}
			}
			// si seleccionUsuario es 5 cierro el programa
			case 5 -> {
				// comunico cierre de pregaram con mensaje por pantalla
				System.out.println("Cerrando programa...");
			}

			// si el usuario introduce un valor no esperado en los case
			default -> {
				// muestro mensaje de error por pantalla indicando opciones correctas
				System.out.println("Asegurese de seleccionar una opcion entre el 1 y el 5 incluidos.");
				System.out.println();
			}

			}

			// el bucle seguira en ejecucion mientras la selecion del usuario sea diferente
			// a 5
		} while (seleccionUsuario != 5);

		// cierro escaner
		dogma.close();
	}

}
