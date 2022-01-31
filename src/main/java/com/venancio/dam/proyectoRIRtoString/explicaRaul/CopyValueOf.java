package com.venancio.dam.proyectoRIRtoString.explicaRaul;

public class CopyValueOf {

	public static void main(String[] args) {

		char[] textoChar = { 'L', 'o', 's', ' ', 'm', 'é', 't', 'o', 'd', 'o', 's', ' ', 'd', 'e', ' ', 'l', 'a', ' ',
				'c', 'l', 'a', 's', 'e', ' ', 'S', 't', 'r', 'i', 'n', 'g', ' ', 's', 'o', 'n', ' ', 'm', 'u', 'y', ' ',
				'ú', 't', 'i', 'l', 'e', 's' };

		String resultado1 = String.copyValueOf(textoChar);
		String resultado2 = String.copyValueOf(textoChar, 15, 15);

		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);

		System.out.println();

		String cadena = "QWERTYUIOPASDFGHJKZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		char[] array = cadena.toCharArray();

		String cadena1 = String.copyValueOf(array);
		String cadena2 = String.copyValueOf(array, 22, 7);

		System.out.println(cadena1);
		System.out.println(cadena2);

		System.out.println();

		char[] textoChar2 = { 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o' };
		String resultado3 = String.copyValueOf(textoChar2);
		String resultado4 = String.copyValueOf(textoChar2, 2, 5);

		System.out.println(resultado3);
		System.out.println(resultado4);
	}
}
