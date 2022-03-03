package com.venancio.dam.proyectoRIRtoString.estudio;

public class Ej10matriz {

	private static final int DIM = 5;

	public static void main(String[] args) {

		int[][] mat = new int[DIM][DIM];

		rellenarMatriz(mat);
		mostrarMatriz(mat, "Matriz rellena:");

	}
	
	private static int [][] rellenarMatriz(int [][] mat) {
		
		//relleno de numeros ascendente
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i+j < mat.length)
				mat[i][j]=i+j;
				else 
				mat[i][j]= (mat.length-1-i) + (mat.length-1-j);
			}
		}
		
		return mat;
	}

	public static void mostrarMatriz(int [][] mat, String mensaje) {
		
		System.out.println(mensaje);
		for (int[] i : mat) {
			for (int num : i) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
	}
}
