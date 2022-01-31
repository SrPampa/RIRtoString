package com.venancio.dam.proyectoRIRtoString.explicaIvan;

import java.util.Random;
import java.util.Scanner;

public class Altoellapiz {
	
public static void main(String[] args) {
		
		
	Random random = new Random();

    char letra = (char)(random.nextInt(26) + 'a');
    String letra2 = letra + "";
    System.out.println("La letra con la que tienes que jugar es la: " + letra);
	
	
	System.out.println("Introduce palabras que empiecen con la letra y pertenezcan a la categoria...");
	
	System.out.println();
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombres propios: ");
		String nombre = sc.nextLine().toLowerCase();
		if(nombre.startsWith(letra2) == true) {
			System.out.println("Respuesta guardada.");
		}else {
			System.err.println("Respuesta no valida.");
		}
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Titulo de peliculas: ");
		String peli = sc2.nextLine().toLowerCase();
		
		if(peli.startsWith(letra2) == true) {
			System.out.println("Respuesta guardada.");
		}else {
			System.err.println("Respuesta no valida.");
		}
		
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Marcas de coche: ");
		String coche = sc3.nextLine().toLowerCase();
		
		if(coche.startsWith(letra2) == true) {
			System.out.println("Respuesta guardada.");
		}else {
			System.err.println("Respuesta no valida.");
		}
		
		Scanner sc4 = new Scanner(System.in);
		System.out.print("Comida: ");
		String comida = sc4.nextLine().toLowerCase();
		
		if(comida.startsWith(letra2) == true) {
			System.out.println("Respuesta guardada.");
		}else {
			System.err.println("Respuesta no valida.");
		}
		
		sc.close();
		sc2.close();
		sc3.close();
		sc4.close();
		
		
}
	

}
