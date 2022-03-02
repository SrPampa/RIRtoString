package com.venancio.dam.proyectoRIRtoString.estudio.otros;

public class InitPcodigo {

	public static void main(String[] args) {

		PilaEstudio pila = new PilaEstudio();

		for (int i = 0; i < 10; i++) {
			pila.push(crearCodigo());
		}
		pila.print();

	}

	public static String letrasAleatorias(int x) {
		String letras;
		StringBuilder constructor;

		letras = "QWERTYUIOPASDFGHJKLZXCVBNNMqwertyuiopasdfghjklzxcvbnm";
		constructor = new StringBuilder(x);

		for (int i = 0; i < x; i++) {
			int index = (int) (letras.length() * Math.random());
			constructor.append(letras.charAt(index));
		}
		return constructor.toString();
	}

	public static Codigo crearCodigo() {

		int x = (int) (Math.random() * 10000);
		String letras = letrasAleatorias(5);
		Codigo cod = new Codigo(x, letras);
		return cod;
	}
}
