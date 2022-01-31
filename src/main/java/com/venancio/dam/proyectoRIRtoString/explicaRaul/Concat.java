package com.venancio.dam.proyectoRIRtoString.explicaRaul;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {

		String texto1 = "A un primer texto, ";
		String texto2 = "podemos agregarle un segundo texto";

		System.out.println(texto1.concat(texto2)); // Con esto podemos ahorrarnos una variable

		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe algo: ");
		String escrito = sc.nextLine().toString();
		String texto3 = "Has escrito: ";
		String textoFinal = texto3.concat(escrito); // O usar el método para definir la variable

		sc.close();

		System.out.println(textoFinal);

		System.out.println(40 +40 +
				" Curiosidad: cuando usas la concatenación, después de un texto todo se tomará como "
				+ "una agregación y no como una operación aritmética "+40+40);
	}
}
