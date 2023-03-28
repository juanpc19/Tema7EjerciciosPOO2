package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int seleccionUsuario = 0;

		int contador = 0;

		int posicion = 0;

		String discoModificar = "";

		String autor = "";

		String titulo = "";

		String genero = "";

		int duracion;

		Disco disc[] = new Disco[10];

		Scanner dogma = new Scanner(System.in);

		for (int i = 0; i < disc.length; i++) {
			disc[i] = new Disco();
		}

		for (int i = 0; i < disc.length; i++) {
			System.out.println(disc[i]);
		}

		do {
			System.out.println(
					"COLECCION DE DISCOS \n--------------------\n--------------------\n1.Listado.\n2.Nuevo Disco.\n3.Modificar.\n4.Borrar.\n5.Salir");

			seleccionUsuario = dogma.nextInt();

			switch (seleccionUsuario) {

			case 1 -> {

				for (int i = 0; i < disc.length; i++) {

					if (!disc[i].getCodigo().equals("LIBRE")) {
						System.out.println(disc[i]);
					}
				}
			}

			case 2 -> {
				posicion = 0;
				while (posicion < disc.length) {

					if (disc[posicion].getCodigo().equals("LIBRE")) {

						contador++;
						disc[posicion].setCodigo(Integer.toString(contador));

						System.out.println("Introduzca autor del disco");
						autor = dogma.next();
						disc[posicion].setAutor(autor);

						System.out.println("Introduzca titulo del disco");
						titulo = dogma.next();
						disc[posicion].setTitulo(titulo);

						System.out.println("Introduzca genero del disco");
						genero = dogma.next();
						disc[posicion].setGenero(genero);

						System.out.println("Introduzca duracion del disco");
						duracion = dogma.nextInt();
						disc[posicion].setDuracion(duracion);
						break;
					}
					posicion++;
				}

			}

			case 3 -> {
				System.out.println("Introduzca el codigo del disco que desea modificar del 1 al 10: ");
				discoModificar = dogma.next();

				posicion = 0;
				while (posicion < disc.length) {

					if (disc[posicion].getCodigo().equals(discoModificar)) {

						System.out.println("Introduzca autor del disco");
						autor = dogma.next();
						disc[posicion].setAutor(autor);

						System.out.println("Introduzca titulo del disco");
						titulo = dogma.next();
						disc[posicion].setTitulo(titulo);

						System.out.println("Introduzca genero del disco");
						genero = dogma.next();
						disc[posicion].setGenero(genero);

						System.out.println("Introduzca duracion del disco");
						duracion = dogma.nextInt();
						disc[posicion].setDuracion(duracion);
						break;
					}
					posicion++;
				}
			}

			case 4 -> {
				System.out.println("Introduzca el codigo del disco que desea borrar del 1 al 10: ");
				discoModificar = dogma.next();

				posicion = 0;
				while (posicion < disc.length) {

					if (disc[posicion].getCodigo().equals(discoModificar)) {

						contador--;

						disc[posicion].setCodigo("LIBRE");
						break;
					}
					posicion++;
				}
			}

			case 5 -> {
				System.out.println("Cerrando programa...");
			}

			default -> {
				System.out.println("Asegurese de seleccionar una opcion entre el 1 y el 5 incluidos.");
				System.out.println();
			}

			}

		} while (seleccionUsuario != 5);

		dogma.close();
	}

}
