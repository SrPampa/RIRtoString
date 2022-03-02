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
	public Codigo push(Codigo info) {
		if (cima != null) {
			NodoP aux = cima;
			aux.getSig();
			cima.setInfo(info);
			return info;
		}
		return null;
	}
	@Override
	public Codigo pop() {
		if (cima != null) {
			NodoP aux = cima;
			aux.setSig(cima.getSig());
			cima.setInfo(info);
			return info;
		}
		return null;
	}
	@Override
	public Codigo peek() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
