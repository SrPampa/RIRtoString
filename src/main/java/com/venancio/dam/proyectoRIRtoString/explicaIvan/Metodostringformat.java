package com.venancio.dam.proyectoRIRtoString.explicaIvan;

import java.util.Scanner;

public class Metodostringformat {
	
	public static void main(String [] args) {
		
		String pass = "Contrase�aSuperSecreta";
		
		//Modo no seguro
		
		System.out.println(pass);
		
		//Asi obtenemos el hash de nuestra contrase�a -> 4c191339
		
		System.out.println("Output of %h is " + String.format("%h", pass));
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu contrase�a: ");
		String pass2 = sc.nextLine();
		
		if (String.format("%h", pass).equals(String.format("%h", pass2))) {
			System.out.println("Contrase�a aceptada");
		}else {
			System.err.println("Contrase�a erronea");
		}
		
		sc.close();
	}

}
