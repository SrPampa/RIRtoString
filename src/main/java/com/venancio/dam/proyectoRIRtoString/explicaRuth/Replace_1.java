package com.venancio.dam.proyectoRIRtoString.explicaRuth;

public class Replace_1 {

	public static void main(String[] args) {

		Alumno[] listado = { 
				new Alumno("Ruth", 	"Programación I"), 
				new Alumno("Raúl", 	"Bases de Datos"),
				new Alumno("Iván", 	"Programación II"), 
				new Alumno("Fu", 	"Sistemas Informáticos"),
				new Alumno("Carlos","Sistemas Informáticos"), 
				new Alumno("Miguel","Programación I"),
				new Alumno("Mario", "Programación II"), };

		for (int i = 0; i < listado.length; i++) {
			
			listado[i].setAsignatura(listado[i].asignatura.replace("Programación", "Lenguaje de Marcas"));
		}

		for (Alumno elem : listado) {
			System.out.println(elem);
		}
	}
}
