package com.venancio.dam.proyectoRIRtoString.explicaRuth;

public class Rombo {

	public static void main(String[] args) {

		
		int numFilasRombos = 9;
	
		int numFilas = numFilasRombos / 2 + 1;

		for (int altura = 1; altura <= numFilas; altura++) {
			// Blancos
			for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
				System.out.print(" ");
			}
			// Asteriscos
			for (int asteriscos = 1; asteriscos <= (2 * altura) - 1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		numFilas--;

		for (int altura = 1; altura <= numFilas; altura++) {
			// Blancos
			for (int blancos = 1; blancos <= altura; blancos++) {
				System.out.print(" ");
			}
			// Asteriscos
			for (int asteriscos = 1; asteriscos <= (numFilas - altura) * 2 + 1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
