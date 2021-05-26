package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Responsable;
import model.Responsable_1;
import model.Responsable_2;
import model.Responsable_3;

import view.VentanaEditarDatosFamiliares;

public class ManejaActualizarRegistroResponsable implements ActionListener {

	private VentanaEditarDatosFamiliares datos;
	private Responsable resp_1, resp_2, resp_3;

	public ManejaActualizarRegistroResponsable(VentanaEditarDatosFamiliares datos) {

		this.datos = datos;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		resp_1 = new Responsable_1();
		resp_2 = new Responsable_2();
		resp_3 = new Responsable_3();
		
		resp_1.setId(datos.getIngresoID().getText());
		resp_2.setId(datos.getIngresoID().getText());
		resp_3.setId(datos.getIngresoID().getText());
		ICrudResponsable operacionCrud = new CrudResponsable();
		operacionCrud.actualizarRegistroResponsable_1(resp_1, datos, "tablaResponsable_1.db4o");
		operacionCrud.actualizarRegistroResponsable_2(resp_2, datos, "tablaResponsable_2.db4o");
		operacionCrud.actualizarRegistroResponsable_3(resp_3, datos, "tablaResponsable_3.db4o");
		
		JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
		refreshFormulario_1();
		refreshFormulario_2();
		refreshFormulario_3();

	}

	private void refreshFormulario_1() {

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
