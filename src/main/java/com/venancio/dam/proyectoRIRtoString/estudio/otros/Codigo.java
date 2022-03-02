package com.venancio.dam.proyectoRIRtoString.estudio.otros;

import java.util.Objects;

public class Codigo {

	private int codigo;
	private String letras;
	
	
	public Codigo(int codigo, String letras) {
		this.codigo = codigo;
		this.letras = letras;
	}
	public Codigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getLetras() {
		return letras;
	}
	public void setLetras(String letras) {
		this.letras = letras;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo, letras);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Codigo other = (Codigo) obj;
		return codigo == other.codigo && Objects.equals(letras, other.letras);
	}
	@Override
	public String toString() {
		return "Codigo: " + codigo + "-" + letras;
	}
	
	
}
