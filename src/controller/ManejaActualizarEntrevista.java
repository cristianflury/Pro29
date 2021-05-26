package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Entrevista;
import view.VentanaEditarEntrevista;

public class ManejaActualizarEntrevista implements ActionListener {

	private VentanaEditarEntrevista datos;
	private Entrevista entre;

    //metodo
	public ManejaActualizarEntrevista(VentanaEditarEntrevista datos) {

		this.datos = datos;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		entre = new Entrevista();
		entre.setId(datos.getIngresoIdChico().getText());
		ICrudEntrevista operacionCrud = new CrudEntrevista();
		operacionCrud.actualizarRegistro(entre, datos);
		
		JOptionPane.showMessageDialog(null, "Registro actualizado correctamente.");
		refreshFormulario();

	}

	
	private void refreshFormulario() {

		datos.setIngresoIdChico("");
		datos.setIngresoPregunta_1("");
		datos.setIngresoPregunta_2("");
		datos.setIngresoPregunta_3("");
		datos.setIngresoPregunta_4("");
		datos.setIngresoPregunta_5("");
		datos.setIngresoPregunta_6("");
		datos.setIngresoPregunta_7("");
		datos.setIngresoPregunta_8("");
		datos.setIngresoPregunta_9("");
		datos.setIngresoPregunta_10("");
	}
}
