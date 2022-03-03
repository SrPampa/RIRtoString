package com.venancio.dam.proyectoRIRtoString.estudio.ordenacion;

import java.util.Random;

public class Algoritmos2 {

	public static void main(String[] args) {

		Integer[] list = crearLista();

		System.out.println("\nBurbuja:");
		bubble(list);
		for (Integer num : list) {
			System.out.print(num + " ");
		}
		list = crearLista();
		System.out.println("\nInserción:");
		insertion(list);
		for (Integer num : list) {
			System.out.print(num + " ");
		}
		list = crearLista();
		System.out.println("\nSelección:");
		selection(list);
		for (Integer num : list) {
			System.out.print(num + " ");
		}
		list = crearLista();
		System.out.println("\nPivote:");
		quicksort(list,0,list.length-1);
		for (Integer num : list) {
			System.out.print(num + " ");
		}
	}

	private static void quicksort(Integer[] list, int i, int s) {
		if (i < s) {
			int indPivote = partition(list, i, s);
			quicksort(list, i, indPivote-1);
			quicksort(list, indPivote+1, s);
		}

	}

	private static int partition(Integer[] list, int i, int s) {
		int indPivote = i;
		while (i<s) {
			while (list[i]<= list[indPivote]&& i<s) {
				i++;
			}
			while (list[s]> list[indPivote]) {
				s--;
			}
			if (i<s) {
				int aux = list[i];
				list[i]=list[s];
				list[s]=aux;
			}
		}
		int aux = list[indPivote];
		list[indPivote]=list[s];
		list[s]= aux;
		return s;
	}

	private static void selection(Integer[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int posMenor = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[posMenor]) {
					posMenor = j;
				}
			}
			int aux = list[i];
			list[i] = list[posMenor];
			list[posMenor] = aux;
		}

	}

	private static void insertion(Integer[] list) {

		for (int i = 1; i < list.length; i++) {
			int aux = list[i];
			int j = i - 1;
			while (j >= 0 && list[j] > aux) {
				list[j + 1] = list[j];
				j--;
			}
			list[j + 1] = aux;
		}

	}

	private static void bubble(Integer[] list) {
		for (int i = 1; i < list.length; i++) {
			boolean cambios = false;
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] > list[j + 1]) {
					int aux = list[j];
					list[j] = list[j + 1];
					list[j + 1] = aux;
					cambios = true;
				}
			}
			if (!cambios)
				break;
		}

	}

	public static Integer[] crearLista() {

		Random r = new Random();
		int dim = (int) (r.nextInt(20) + 10);
		Integer[] list = new Integer[dim];
		for (int i = 0; i < dim; i++) {
			list[i] = r.nextInt(100);
		}

		System.out.println("\nLista de números aleatorios (longitud " + list.length + "):");
		for (int i : list) {
			System.out.print(i + " ");
		}
		return list;
	}

}
