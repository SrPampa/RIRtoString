package com.venancio.dam.proyectoRIRtoString.explicaRuth;

public class Rombo2_0 {

	public static void main(String[] args) {

		int numFilas = 9;
		int indentar = numFilas / 2 + 1;
		int repetir = 1;
		String asterisco = "*";

		for (int i = 0; i <= numFilas / 2 + 1; i++) {
			System.out.print(asterisco.repeat(repetir).indent(indentar));
			repetir += 2;
			indentar--;
		}
		indentar = 1;
		repetir = numFilas;
		
		for (int i = 0; i <= numFilas / 2; i++) {
			System.out.print(asterisco.repeat(repetir).indent(indentar));
			indentar++;
			repetir -= 2;
		}
	}
}
