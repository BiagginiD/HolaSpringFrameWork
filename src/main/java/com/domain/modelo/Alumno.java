package com.domain.modelo;

import java.util.Objects;

public class Alumno implements Model, Vaciable {

	// Atributos
	private int codigo;
	private String nombre;
	private String apellido;
	private String email;
	private String estudios;
	private String linkArepositorio;
	private String observaciones;

	public Alumno() {
	}

	public Alumno(int codigo, String nombre, String apellido, String email, String estudios, String linkArepositorio,
			String observaciones) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.estudios = estudios;
		this.linkArepositorio = linkArepositorio;
		this.observaciones = observaciones;
	}

	// Accesos

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String getLinkArepositorio() {
		return linkArepositorio;
	}

	public void setLinkArepositorio(String linkArepositorio) {
		this.linkArepositorio = linkArepositorio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, codigo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Alumno))
			return false;
		Alumno other = (Alumno) obj;

		return Objects.equals(apellido, other.apellido) && codigo == other.codigo
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("codigo=");
		sb.append(codigo);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", apellido=");
		sb.append(apellido);
		sb.append(", email=");
		sb.append(email);
		sb.append(", estudios=");
		sb.append(estudios);
		sb.append(", linkArepositorio=");
		sb.append(linkArepositorio);
		sb.append(", observaciones=");
		sb.append(observaciones);
		return sb.toString();
	}

	@Override
	public boolean isEmpty() {
		return codigo == 0 && (nombre == null || nombre.isEmpty()) && (apellido == null || apellido.isEmpty())
				&& (estudios == null || estudios.isEmpty()) && (linkArepositorio == null || linkArepositorio.isEmpty())
				&& (email == null || email.isEmpty()) && (observaciones == null || observaciones.isEmpty());
	}

}
