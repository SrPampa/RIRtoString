package com.venancio.dam.proyectoRIRtoString.estudio.ordenacion;

import java.util.Random;

public class Algoritmos {

	public static void main(String[] args) {

		// Integer[] lista = { 12, 32, 43, 95, 10, 3, 6, 67, 82 };
		Random r = new Random();
		int dim = (int) (r.nextInt(100) + 10);
		Integer[] lista2 = new Integer[dim];
		for (int i = 0; i < lista2.length; i++) {
			lista2[i] = r.nextInt(1000);
		}

		System.out.println("Lista de números aleatorios (longitud " + lista2.length + "):");
		for (int i : lista2) {
			System.out.print(i + " ");
		}

		System.out.println("\nBurbuja:");
		bubble(lista2);
		for (Integer num : lista2) {
			System.out.print(num + " ");
		}

		System.out.println("\nInserción:");
		insertion(lista2);
		for (Integer num : lista2) {
			System.out.print(num + " ");
		}

		System.out.println("\nSelección:");
		selection(lista2);
		for (Integer num : lista2) {
			System.out.print(num + " ");
		}

		System.out.println("\nPivote:");
		quicksortLigth(lista2);
		for (Integer num : lista2) {
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
			int aux = listado[i];
			int j = i - 1;
			while (j >= 0 && listado[j] > aux) {
				listado[j + 1] = listado[j];
				j--;
			}
			listado[j + 1] = aux;
		}

	}

	public static void selection(Integer[] listado) {

		for (int i = 0; i < listado.length; i++) {
			int posMenor = i;
			for (int j = i + 1; j < listado.length; j++) {
				if (listado[j] < listado[posMenor]) {
					posMenor = j;
				}
			}
			int aux = listado[i];
			listado[i] = listado[posMenor];
			listado[posMenor] = aux;
		}
	}


	private static void quicksortLigth(Integer[] list) {

		int i = 0;
		int s = list.length-1;
		int indice_pivote = i;
		while (i < s) {
			while (list[i] <= list[indice_pivote] && i < s) {
				i++;
			}
			while (list[s] > list[indice_pivote]) {
				s--;
			}
			if (i < s) {
				int aux = list[i];
				list[i] = list[s];
				list[s] = aux;
			}
		}
		int aux = list[indice_pivote];
		list[indice_pivote] = list[s];
		list[s] = aux;
	}

}
