package model;




public class Chico implements Comparable<Chico> {
	

	
	private String nombre;

	private String apellido;
	
	private String documento;
	
	private String domicilio;
	
	private String fechaNacimiento;
	
	private String edad;
	
	private String escuela;
	
	private String celPrincipalResponsable;
	
	private String anioLectivo;
	
	private String observaciones;
	
	
	
	

	public Chico( String nombre, String apellido, String documento, String domicilio, String fechaNacimiento,
			String edad, String escuela, String celPrincipalResponsable,String anioLectivo, String observaciones) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.domicilio = domicilio;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.escuela = escuela;
		this.celPrincipalResponsable = celPrincipalResponsable;
		this.anioLectivo = anioLectivo;
		this.observaciones = observaciones;
	}


	public Chico() {
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


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	

	public String getEscuela() {
		return escuela;
	}


	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	
	


	public String getCelPrincipalResponsable() {
		return celPrincipalResponsable;
	}


	public void setCelPrincipalResponsable(String celPrincipalResponsable) {
		this.celPrincipalResponsable = celPrincipalResponsable;
	}
	
	


	public String getAnioLectivo() {
		return anioLectivo;
	}


	public void setAnioLectivo(String anioLectivo) {
		this.anioLectivo = anioLectivo;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	

	@Override
	public String toString() {
		return "Chico [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", domicilio="
				+ domicilio + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", escuela=" + escuela
				+ ", celPrincipalResponsable=" + celPrincipalResponsable + ", anioLectivo=" + anioLectivo
				+ ", observaciones=" + observaciones + "]";
	}


	@Override
	public int compareTo(Chico o) {
		
		return this.apellido.compareTo(o.apellido);
	}


	
	
	
	

}
