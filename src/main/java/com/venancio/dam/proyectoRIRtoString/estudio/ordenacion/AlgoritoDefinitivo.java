package com.venancio.dam.proyectoRIRtoString.estudio.ordenacion;



public class AlgoritoDefinitivo {

	public static void main(String[] args) {

		Integer[] ger = Algoritmos2.crearLista();
		int[] arr = new int[ger.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ger[i];
		}
		selection(arr);
		System.out.println("\nOrdenado:");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void bubble(int[] list) {

		for (int i = 1; i < list.length; i++) {
			boolean cambios = false;
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] > list[j + 1]) {
					int aux = list[j];
					list[j] = list[j+1];
					list[j+1] = aux;
					cambios = true;
				}
			}
			if (!cambios)
				break;
		}
	}

	public static void insertion(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int aux = list[i];
			int j = i-1;
			while (j>=0 && list[j]>aux) {
				list[j+1]=list[j];
				j--;
			}
			list[j+1]= aux;
		}

	}

	public static void selection(int[] list) {

		for (int i = 0; i < list.length-1; i++) {
			int posM = i;
			for (int j = i+1; j < list.length; j++) {
				if (list[j]<list[posM]) {
					posM=j;
				}
				
			}
			int aux = list[i];
			list[i]= list[posM];
			list[posM]=aux;
			
		}
	}
}
