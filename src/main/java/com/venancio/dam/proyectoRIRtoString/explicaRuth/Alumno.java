package com.venancio.dam.proyectoRIRtoString.explicaRuth;

import java.util.Objects;

public class Alumno {

	public String nombre;
	public String asignatura;

	public Alumno(String nombre, String asignatura) {
		this.nombre = nombre;
		this.asignatura = asignatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\t Asignaturas: " + asignatura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asignatura, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(asignatura, other.asignatura) && Objects.equals(nombre, other.nombre);
	}

}
