package com.venancio.dam.proyectoRIRtoString.explicaRuth;

public class Replace {

	public static void main(String[] args) {
		
		String cadena = "Programación-1ºC-DAM-DUAL";
		
		System.out.println("Cadena original: \t" + cadena);
		System.out.println("Cadena modificada: \t" + cadena.replace('-', ' '));
		
		
		
		System.out.println("Cadena original: \t" + cadena);
		System.out.println("Cadena modificada: \t" + cadena.replace("Programación", "Lenguaje de Marcas"));
		
	}
}
