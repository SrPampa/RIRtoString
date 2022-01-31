package com.venancio.dam.proyectoRIRtoString.explicaRaul;

public class Intern {
	
	public static void main(String[] args) {

		String cadena1 = new String("Esto está dentro de un objeto String");
		String cadena2 = new String("Esto está dentro de un objeto String");
		
		System.out.println(cadena1.intern());
		System.out.println(cadena2.intern());
		System.out.println(cadena1==cadena2);
		System.out.println(cadena1.equals(cadena2));
		
		//si le añadimos .intern() al crear los objetos la cosa cambia
	}
}
