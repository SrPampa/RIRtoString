package com.venancio.dam.proyectoRIRtoString.explicaRaul;

public class Matches {

	public static void main(String[] args) {
		
		String texto = new String("Los métodos de la clase String son muy útiles");
		
		String resultado = "La búsqueda ha sido efectiva: ";
		
		System.out.println(resultado + (texto.matches("(.*)clase String(.*)")?"SI":"NO"));
		
		System.out.println(resultado + (texto.matches("Los métodos(.*)")?"SI":"NO")); //comienzo 
		
		System.out.println(resultado + texto.matches("(.*) útiles")); // y final
		
		System.out.println(resultado + texto.matches("la clase")); //no nos olvidemos de los asteriscos
		
		System.out.println(resultado + (texto.matches("(.*) utiles")?"SI":"NO")); //detecta los acentos
	
		
	}
}
