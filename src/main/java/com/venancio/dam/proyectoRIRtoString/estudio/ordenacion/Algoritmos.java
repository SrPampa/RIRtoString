package com.venancio.dam.proyectoRIRtoString.estudio.ordenacion;

public class Algoritmos {

	public static void main(String[] args) {

		Integer[] lista = { 12, 32, 43, 95, 10, 3, 6, 67, 82 };

		bubble(lista);

		for (Integer num : lista) {
			System.out.print(num + " ");
		}
	}

	public static void bubble(Integer[] listado) {

		for (int i = 1; i < listado.length; i++) {
			boolean cambios = false;
			for (int j = 0; j < listado.length - 1; j++) {
				if (listado[j] > listado[j + 1]) {
					int aux = listado[j];
					listado[j] = listado[j + 1];
					listado[j + 1] = aux;
					cambios = true;
				}
			}
			if (!cambios)
				break;
		}
	}
	
	public static void insertion(Integer[] listado) {
		
		for (int i = 1; i < listado.length; i++) {
			
		}
		
	}

}
