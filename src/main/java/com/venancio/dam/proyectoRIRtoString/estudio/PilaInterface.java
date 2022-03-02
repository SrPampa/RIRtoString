package com.venancio.dam.proyectoRIRtoString.estudio;

public interface PilaInterface <T>{

	/**
	 * Método para comprobar si la pila está vacía
	 * @return true si está vacía, false si no lo está
	 */
	public boolean isEmpty();
	
	/**
	 * Método para introducir un nuevo elemento a la pila (en la cima)
	 * @param info
	 * @return objeto que hemos introducido
	 */
	public void push(T info);
	
	/**
	 * Método para sacar el elemento de la cima
	 * @return objeto que hemos retirado
	 */
	public T pop();
	
	/**
	 * Método para ver el elemento de la cima (sin retirarlo) 
	 * @return objeto de la cima
	 */
	public T peek();
	
	/**
	 * Método para ver el tamaño de la pila
	 * @return número de elementos en la pila
	 */
	public int size();
	
}
