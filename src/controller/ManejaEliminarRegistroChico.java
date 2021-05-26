package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Chico;
import model.Entrevista;
import model.Responsable;
import model.Responsable_1;
import model.Responsable_2;
import model.Responsable_3;

public class ManejaEliminarRegistroChico implements ActionListener {

	private String id;


	@Override
	public void actionPerformed(ActionEvent arg0) {
		Chico chico = new Chico();
		Responsable resp_1 = new Responsable_1();
		Responsable resp_2 = new Responsable_2();
		Responsable resp_3 = new Responsable_3();
		Entrevista entre = new Entrevista();
		ICrudChicos eliminarChico = new CrudChicos();
		ICrudResponsable eliminaResponsable = new CrudResponsable();
		ICrudEntrevista eliminaEntrevista = new CrudEntrevista();
		
		id = JOptionPane.showInputDialog(null, "Por favor, ingrese el DNI del niño/a.");

		if (verificaRegistro()) {
			
			int confirmacion = JOptionPane.showConfirmDialog(null,
					"¿Esta seguro que quiere eliminar el registro" + " con DNI: " + id + " ?");

			if (confirmacion == 0) {
				chico.setDocumento(id);
				resp_1.setId(id);
				resp_2.setId(id);
				resp_3.setId(id);
				entre.setId(id);

				if (chico.getDocumento() != null) {

					eliminarChico.eliminarRegistro(chico);
					eliminaResponsable.eliminarRegistro(resp_1, "tablaResponsable_1.db4o");
					eliminaResponsable.eliminarRegistro(resp_2, "tablaResponsable_2.db4o");
					eliminaResponsable.eliminarRegistro(resp_3, "tablaResponsable_3.db4o");
					eliminaEntrevista.eliminarRegistro(entre);
					
					JOptionPane.showMessageDialog(null, "Se eliminó el registro con DNI: " + id + ",\n"
							+ "y todos sus elementos relacionados.");

				} else {
					
					JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro.");
				}

			}

		}
	}

	private boolean verificaRegistro() {
		boolean existe;
		Chico chico = new Chico();
		ICrudChicos crud = new CrudChicos();
		chico.setDocumento(id);
		chico = crud.obtenerRegistro(chico);

		if (chico == null || id.equals("")) {

			existe = false;
			
			JOptionPane.showMessageDialog(null, "El registro con DNI: " + id + " no existe");

		} else {

			existe = true;

		}

		return existe;
	}
}
