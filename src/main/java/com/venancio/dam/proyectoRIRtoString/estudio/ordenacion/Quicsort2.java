package com.venancio.dam.proyectoRIRtoString.estudio.ordenacion;

public class Quicsort2 {

	public static void main(String[] args) {

		Integer[] list = Algoritmos2.crearLista();
		quickSort(list, 0 , list.length - 1);
		System.out.println("\nOrdenada:");
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}

	private static void quickSort(Integer[] list, int i, int s) {
		if (i < s) {
			int indPivote = patition(list, i, s);
			quickSort(list, indPivote + 1, s);
			quickSort(list, i, indPivote - 1);

		}

	}

	private static int patition(Integer[] list, int i, int s) {

		int indPivote = i;
		while (i < s) {
			while (list[i] <= list[indPivote] && i < s) {
				i++;
			}
			while (list[s] > list[indPivote]) {
				s--;
			}
			if (i < s) {
				int aux = list[i];
				list[i] = list[s];
				list[s] = aux;
			}
		}
		int aux = list[indPivote];
		list[indPivote] = list[s];
		list[s] = aux;
		return s;
	}
}
