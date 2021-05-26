package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Chico;
import view.VentanaEditarDatosChicos;


public class ManejaActualizarRegistroChico implements ActionListener {

	private VentanaEditarDatosChicos datos;
	private Chico chico;


	public ManejaActualizarRegistroChico(VentanaEditarDatosChicos datos) {

		this.datos = datos;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		chico = new Chico();
		chico.setDocumento(datos.getIngresoDni().getText());
		ICrudChicos operacionCrud = new CrudChicos();
		operacionCrud.actualizarRegistro(chico, datos);
		
		JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
		refreshFormulario();
		
		
		

	}

	
	private void refreshFormulario() {
		datos.setIngresoAnioLectivo("");
		datos.setIngresoNombre("");
		datos.setIngresoApellido("");
		datos.setIngresoDni("");
		datos.setIngresoDomicilio("");
		datos.setIngresoFechaNacimiento("");
		datos.setIngresoEdad("");
		datos.setIngresoEscuela("");
		datos.setIngresoCelular("");
		datos.setTextAreaObservaciones("");
	}
}
