package com.venancio.dam.proyectoRIRtoString.estudio.nodos;

import java.util.Objects;

import com.venancio.dam.proyectoRIRtoString.estudio.otros.Codigo;

public class NodoP {

	private Codigo info;
	private NodoP sig;
	
	
	public NodoP(Codigo info) {
		this.info = info;
	}
	
	public Codigo getInfo() {
		return info;
	}
	public void setInfo(Codigo info) {
		this.info = info;
	}
	public NodoP getSig() {
		return sig;
	}
	public void setSig(NodoP sig) {
		this.sig = sig;
	}

	@Override
	public int hashCode() {
		return Objects.hash(info, sig);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodoP other = (NodoP) obj;
		return Objects.equals(info, other.info) && Objects.equals(sig, other.sig);
	}
	
	
	
	
	
	
}