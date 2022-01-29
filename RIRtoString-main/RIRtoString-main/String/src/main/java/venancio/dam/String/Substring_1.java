package venancio.dam.String;

import java.util.Scanner;

public class Substring_1 {

	public static void main(String[] args) {

		String apenom;
		String nombre;
		String apellido;

		System.out.println("Introduce tu nombre y apellido");
		Scanner sc = new Scanner(System.in);
		apenom = sc.nextLine();
		sc.close();

		apellido = apenom.substring(apenom.indexOf(" ") + 1);
		nombre = apenom.substring(0, apenom.indexOf(" "));

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);

	}

}
