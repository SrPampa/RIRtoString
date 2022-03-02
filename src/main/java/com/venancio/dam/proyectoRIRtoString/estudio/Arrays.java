package com.venancio.dam.proyectoRIRtoString.estudio;

public class Arrays {
	
	private final static int DIM = 20;

	public static void main(String[] args) {
		
		int [] numeros = {1,2,3,4,5,6,7} ;
		int [] nums = new int [DIM];
		
		int sumatorio = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		for (int i = 2; i < nums.length; i++) {
			nums[0]=1;
			nums[1]=2;
			nums[i] = nums[i-1] + nums[i-2];
			sumatorio= nums[i];
			System.out.print("++"+sumatorio);
		}
		for (int i : nums) {
		System.out.print(i+" ");	
		}
	}
}
