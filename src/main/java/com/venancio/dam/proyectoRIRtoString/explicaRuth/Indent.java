package com.venancio.dam.proyectoRIRtoString.explicaRuth;

public class Indent {

	public static void main(String[] args) {

		String cadena = "Indentar un texto es muy fácil";
		System.out.println(cadena.indent(1));
		
	}

	public static void indentarTexto(String cadena) {
		int n=0;
		
		for (String division : cadena.split(" ")) {
			n++;
			System.out.println(division.indent(n));	
		}
	}
}
