package com.venancio.dam.proyectoRIRtoString.estudio;

public class Mas {

	private static final int DIM = 3;

	public static void main(String[] args) {

		int[][] cuadro = new int[DIM][DIM];
		
		int [] sumaFilas = new int [DIM];
		int [] sumaColumnas = new int [DIM];

		rellenarArray(cuadro);
		sumaFilas = sumaFila(cuadro);
		sumaColumnas = sumaColumna(cuadro);
		
		for (int[] i : cuadro) {
			for (int num : i) {
				System.out.print(num +" ");
			}
			System.out.println();
		}
		System.out.println("array de filas:");
		for (int i : sumaFilas) {
			System.out.println(i+" ");
		}
		System.out.println("array de columnas:");
		for (int i : sumaColumnas) {
			System.out.print(i+" ");
		}

	}

	public static int[][] rellenarArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}
		}

		return array;
	}
	public static int[] sumaFila(int[][] array) {

		int [] sumaFilas = new int [array.length];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sumaFilas[i] += array[i][j];
			}
		
		}

		return sumaFilas;
	}
	public static int[] sumaColumna(int[][] array) {

		int [] sumaColumnas = new int [array.length];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sumaColumnas[i] += array[j][i];
			}
		
		
		}

		return sumaColumnas;
	}
}
