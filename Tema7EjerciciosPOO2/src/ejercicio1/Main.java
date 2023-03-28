package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int incrementoSegundos;// guardara cantidad de segundos a incrementar

		int valorSet;// guardara valor para el setter que se use a continuacion

		// creo escaner y lo llamo dogma
		Scanner dogma = new Scanner(System.in);

		// creo nuevo objeto tipo Hora y lo asigno a la variable reloj y le doy valor a sus atributos manualmente
		Hora reloj = new Hora(0, 0, 0);

		// consulto los valores de los atributos del objeto reloj usando los getters con
		// sus diferentes atributos
		System.out.println("Este es el valor para hora: " + reloj.getHora());

		System.out.println("Este es el valor para minuto: " + reloj.getMinuto());

		System.out.println("Este es el valor para segundo: " + reloj.getSegundo());

		// solicito a usuario valor para la hora
		System.out.println("Introduzca un valor para hora:");
		// recojo dicho valor por escaner y lo asigno a valorSet
		valorSet = dogma.nextInt();
		// llamo al setter de atributo hora con objeto reloj dandole como parametro de
		// entrada valorSet
		reloj.setHora(valorSet);
		// reinicio valorSet para siguiente uso
		valorSet = 0;

		// solicito a usuario valor para el minuto
		System.out.println("Introduzca un valor para minuto:");
		// recojo dicho valor por escaner y lo asigno a valorSet
		valorSet = dogma.nextInt();
		// llamo al setter de atributo minuto con objeto reloj dandole como parametro de
		// entrada valorSet
		reloj.setMinuto(valorSet);
		// reinicio valorSet para siguiente uso
		valorSet = 0;

		// solicito a usuario valor para el segundo
		System.out.println("Introduzca un valor para segundo:");
		// recojo dicho valor por escaner y lo asigno a valorSet
		valorSet = dogma.nextInt();
		// llamo al setter de atributo segundo con objeto reloj dandole como parametro
		// de entrada valorSet
		reloj.setSegundo(valorSet);
		// reinicio valorSet para siguiente uso
		valorSet = 0;
	
		// solicito a usuario valor para incrementoSegundos
		System.out.println("En cuantos segundos quiere incrementar la hora?");
		// recojo dicho valor por escaner y lo asigno a incrementoSegundos
		incrementoSegundos = dogma.nextInt();
		// llamo al funcion incrementaSegundos con objeto reloj dandole como parametro
		// de entrada incrementoSegundos
		reloj.incrementaSegundo(incrementoSegundos);

		// consulto los valores de los atributos del objeto reloj usando los getters con
		// sus diferentes atributos
		System.out.println("Este es el valor para hora: " + reloj.getHora());

		System.out.println("Este es el valor para minuto: " + reloj.getMinuto());

		System.out.println("Este es el valor para segundo: " + reloj.getSegundo());

		// llamo a funcion toString con objeto reloj para que me muestre la hora
		// completa
		System.out.println(reloj.toString());

		// cierro escaner
		dogma.close();
	}

}
