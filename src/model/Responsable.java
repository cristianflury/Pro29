package model;

public abstract class Responsable {
	
	private String id;
	private String nombre;
	private String apellido;
	private String vinculo;
	private String dni;
	private String fechaNacimiento;
	private String edad;
	private String domicilio;
	private String celular;
	private String ocupacion;
	private String nivelEducativo;
	private String observaciones;
	private Chico chico;
	
	
	
	public Responsable(String nombre, String apellido, String vinculo, String dni, String fechaNacimiento, String edad,
			String domicilio, String celular, String ocupacion, String nivelEducativo, String observaciones) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.vinculo = vinculo;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.domicilio = domicilio;
		this.celular = celular;
		this.ocupacion = ocupacion;
		this.nivelEducativo = nivelEducativo;
		this.observaciones = observaciones;
		this.id = chico.getDocumento();
		
	}
	
	
	public Responsable() {}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public String getVinculo() {
		return vinculo;
	}


	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
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


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getOcupacion() {
		return ocupacion;
	}


	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}


	public String getNivelEducativo() {
		return nivelEducativo;
	}


	public void setNivelEducativo(String nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	@Override
	public String toString() {
		return "Responsable [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", vinculo=" + vinculo
				+ ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", domicilio="
				+ domicilio + ", celular=" + celular + ", ocupacion=" + ocupacion + ", nivelEducativo=" + nivelEducativo
				+ ", observaciones=" + observaciones + ", chico=" + chico + "]";
	}
	
	
	
	
	

}
