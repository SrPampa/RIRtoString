package com.venancio.dam.proyectoRIRtoString.estudio.otros;

import com.venancio.dam.proyectoRIRtoString.estudio.PilaInterface;
import com.venancio.dam.proyectoRIRtoString.estudio.nodos.NodoP;


public class PilaEstudio implements PilaInterface<Codigo> {

	private int size;
	private NodoP cima;

	public PilaEstudio() {
		this.cima = null;
		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		return cima == null;
	}

	@Override
	public void push(Codigo info) {
		NodoP nuevo = new NodoP(info);
		if (!isEmpty()) {
			nuevo.setSig(cima);
		}
		cima = nuevo;
		size++;
	}

	@Override
	public Codigo pop() {

		if (!isEmpty()) {
			NodoP borrar = cima;
			cima = cima.getSig();
			borrar.setSig(null);
			size--;
			return borrar.getInfo();
		}
		return null;
	}

	@Override
	public Codigo peek() {
		if (!isEmpty()) {
			return cima.getInfo();
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void print() {
		System.out.println("\nLa pila contiene: ");
		if (!isEmpty()) {
			NodoP aux = cima;
			System.out.println("\"cima\"");
			System.out.println("-----");
			while (aux.getSig() != null) {
				System.out.println("| " + aux.getInfo() + " |");
				aux = aux.getSig();
			}
			System.out.println("| " + aux.getInfo() + " |");
			System.out.println("-----\n");
		} else {
			System.out.println("La pila está vacía!!");
		}
		
	}
	
	

}
