package com.venancio.dam.proyectoRIRtoString.explicaIvan;

import java.util.Scanner;

public class MetodoIndexOf {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu mail: ");
		String pass = sc.nextLine();
		
		int posicionarroba = 0;
		posicionarroba = pass.indexOf("@");
		
		
		if (pass.indexOf("@") != -1) {
			if((pass.startsWith("gmail.", (posicionarroba+1) ))==true) {
				System.out.println("Cuenta de Gmail aceptada. ");
			}
			else if(pass.startsWith("hotmail.", posicionarroba +1)== true) {			//Se puede mejorar metiendo el ".pais"
				System.out.println("Cuenta de Hotmail aceptada. ");
			}
			else if(pass.startsWith("outlook.", posicionarroba+1)==true) {
				System.out.println("Cuenta de Outlook aceptada. ");
			}else {
				System.out.println("No aceptamos tu proveedor de Email, pringao'.");
			}
			
		}else {
			System.err.println("Email no valido, vuelva a intentarlo.");
		}
		
		
		
		sc.close();
		
		
		
		
	}

}
