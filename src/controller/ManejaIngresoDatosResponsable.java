package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Responsable;
import model.Responsable_1;
import model.Responsable_2;
import model.Responsable_3;
import view.VentanaDatosFamiliares;

public class ManejaIngresoDatosResponsable implements ActionListener {

	private VentanaDatosFamiliares datos;
	private Responsable resp;

	public ManejaIngresoDatosResponsable(VentanaDatosFamiliares ventanaDatosFamiliares) {

		this.datos = ventanaDatosFamiliares;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		ICrudResponsable agrega = new CrudResponsable();
		agrega.agregarRegistro(crearResponsable_1(), "tablaResponsable_1.db4o");
		agrega.agregarRegistro(crearResponsable_2(), "tablaResponsable_2.db4o");
		agrega.agregarRegistro(crearResponsable_3(), "tablaResponsable_3.db4o");
		
		JOptionPane.showMessageDialog(null, "Registro insertado correctamente.");

		refreshFormulario();
		refreshFormulario_2();
		refreshFormulario_3();

	}

	private Responsable crearResponsable_1() {

		resp = new Responsable_1();

		resp.setId(datos.getIngresoID().getText());
		resp.setNombre(datos.getIngresoNombre().getText());
		resp.setApellido(datos.getIngresoApellido().getText());
		resp.setVinculo(datos.getIngresoVinculo().getText());
		resp.setDni(datos.getIngresoDni().getText());
		resp.setFechaNacimiento(datos.getIngresoFechaNacimiento().getText());
		resp.setEdad(datos.getIngresoEdad().getText());
		resp.setDomicilio(datos.getIngresoDomicilio().getText());
		resp.setCelular(datos.getIngresoCelular().getText());
		resp.setOcupacion(datos.getIngresoOcupacion().getText());
		resp.setNivelEducativo(datos.getIngresoNivelEducativo().getText());
		resp.setObservaciones(datos.getTextAreaObservaciones().getText());

		return resp;

	}

	private Responsable crearResponsable_2() {

		resp = new Responsable_2();

		resp.setId(datos.getIngresoID().getText());
		resp.setNombre(datos.getIngresoNombre_2().getText());
		resp.setApellido(datos.getIngresoApellido_2().getText());
		resp.setVinculo(datos.getIngresoVinculo_2().getText());
		resp.setDni(datos.getIngresoDni_2().getText());
		resp.setFechaNacimiento(datos.getIngresoFechaNacimiento_2().getText());
		resp.setEdad(datos.getIngresoEdad_2().getText());
		resp.setDomicilio(datos.getIngresoDomicilio_2().getText());
		resp.setCelular(datos.getIngresoCelular_2().getText());
		resp.setOcupacion(datos.getIngresoOcupacion_2().getText());
		resp.setNivelEducativo(datos.getIngresoNivelEducativo_2().getText());

		return resp;

	}

	private Responsable crearResponsable_3() {

		resp = new Responsable_3();

		resp.setId(datos.getIngresoID().getText());
		resp.setNombre(datos.getIngresoNombre_3().getText());
		resp.setApellido(datos.getIngresoApellido_3().getText());
		resp.setVinculo(datos.getIngresoVinculo_3().getText());
		resp.setDni(datos.getIngresoDni_3().getText());
		resp.setFechaNacimiento(datos.getIngresoFechaNacimiento_3().getText());
		resp.setEdad(datos.getIngresoEdad_3().getText());
		resp.setDomicilio(datos.getIngresoDomicilio_3().getText());
		resp.setCelular(datos.getIngresoCelular_3().getText());
		resp.setOcupacion(datos.getIngresoOcupacion_3().getText());
		resp.setNivelEducativo(datos.getIngresoNivelEducativo_3().getText());

		return resp;

	}

	private void refreshFormulario() {

		datos.setIngresoID("");
		datos.setIngresoNombre("");
		datos.setIngresoApellido("");
		datos.setIngresoVinculo("");
		datos.setIngresoDni("");
		datos.setIngresoFechaNacimiento("");
		datos.setIngresoEdad("");
		datos.setIngresoDomicilio("");
		datos.setIngresoCelular("");
		datos.setIngresoOcupacion("");
		datos.setIngresoNivelEducativo("");
		datos.setTextAreaObservaciones("");
	}

	private void refreshFormulario_2() {

		datos.setIngresoNombre_2("");
		datos.setIngresoApellido_2("");
		datos.setIngresoVinculo_2("");
		datos.setIngresoDni_2("");
		datos.setIngresoFechaNacimiento_2("");
		datos.setIngresoEdad_2("");
		datos.setIngresoDomicilio_2("");
		datos.setIngresoCelular_2("");
		datos.setIngresoOcupacion_2("");
		datos.setIngresoNivelEducativo_2("");

	}

	private void refreshFormulario_3() {

		datos.setIngresoNombre_3("");
		datos.setIngresoApellido_3("");
		datos.setIngresoVinculo_3("");
		datos.setIngresoDni_3("");
		datos.setIngresoFechaNacimiento_3("");
		datos.setIngresoEdad_3("");
		datos.setIngresoDomicilio_3("");
		datos.setIngresoCelular_3("");
		datos.setIngresoOcupacion_3("");
		datos.setIngresoNivelEducativo_3("");

	}

}
