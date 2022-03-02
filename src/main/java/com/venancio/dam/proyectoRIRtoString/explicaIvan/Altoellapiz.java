package com.venancio.dam.proyectoRIRtoString.explicaIvan;

import java.util.Random;
import java.util.Scanner;

public class Altoellapiz {

	public static void main(String[] args) {

		Random random = new Random();

		char letra = (char) (random.nextInt(26) + 'a');
		String letra2 = letra + "";
		System.out.println("La letra con la que tienes que jugar es la: " + letra);

		System.out.println("Introduce palabras que empiecen con la letra y pertenezcan a la categoria...");

		System.out.println();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombres propios: ");
		String nombre = sc.nextLine().toLowerCase();
		
		if (nombre.startsWith(letra2) == true) {
			System.out.println("Respuesta guardada.");
		} else {
			System.err.println("Respuesta no valida.");
		}

		System.out.print("Titulo de peliculas: ");
		String peli = sc.nextLine().toLowerCase();

		if (peli.startsWith(letra2) == true) {
			System.out.println("Respuesta guardada.");
		} else {
			System.err.println("Respuesta no valida.");
		}

		System.out.print("Marcas de coche: ");
		String coche = sc.nextLine().toLowerCase();

		if (coche.startsWith(letra2) == true) {
			System.out.println("Respuesta guardada.");
		} else {
			System.err.println("Respuesta no valida.");
		}

		System.out.print("Comida: ");
		String comida = sc.nextLine().toLowerCase();

		if (comida.startsWith(letra2) == true) {
			System.out.println("Respuesta guardada.");
		} else {
			System.err.println("Respuesta no valida.");
		}

		sc.close();

	}

}
