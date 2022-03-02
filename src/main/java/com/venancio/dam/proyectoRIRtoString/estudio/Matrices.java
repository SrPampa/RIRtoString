package com.venancio.dam.proyectoRIRtoString.estudio;

public class Matrices {

	private final static int DIM = 5;

	public static void main(String[] args) {

		int matriz[][] = new int[DIM][DIM];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j)
					matriz[i][i] = 1;
			}

		}
		for (int[] is : matriz) {
			for (int num : is) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	

	}
}
