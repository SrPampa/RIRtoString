package com.venancio.dam.proyectoRIRtoString.explicaRuth;

public class Substring {

	public static void main(String[] args) {

		String apenom = "Ruth Hernández";
		String apellido;
		String nombre;

		apellido = apenom.substring(5);
		System.out.println("Apellido: " + apellido);

		nombre = apenom.substring(0, 4);
		System.out.println("Nombre: " + nombre);
	}
}
