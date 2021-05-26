package controller;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Chico;
import model.Responsable;
import model.Responsable_1;
import view.VentanaDatosFamiliares;

public class ManejaVerificaDniFamiliar implements ActionListener {

	private Frame ventana;
	private String id;

	public ManejaVerificaDniFamiliar(Frame ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pideDniNinio();
		if (verificaDni()) {
			if (verificaChico()) {
				if (!verificaResponsable()) {

					VentanaDatosFamiliares v = new VentanaDatosFamiliares(id);
					v.setVisible(true);
					ventana.setVisible(false);
					ventana.dispose();

				}

			}

		}

	}

	private void pideDniNinio() {

		id = JOptionPane.showInputDialog(null, "Por favor, ingrese el DNI del niño/a.");

	}

	private boolean verificaDni() {
		boolean tiene;

		if (this.id == null || this.id.equals("")) {

			JOptionPane.showMessageDialog(null, "Debe ingresar un DNI.");

			tiene = false;
		} else {

			tiene = true;
		}

		return tiene;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private boolean verificaChico() {
		boolean existe;
		Chico chicoTemp = new Chico();
		ICrudChicos crud = new CrudChicos();
		chicoTemp.setDocumento(id);
		chicoTemp = crud.obtenerRegistro(chicoTemp);

		if (chicoTemp == null) {

			existe = false;
			JOptionPane.showMessageDialog(null, "Debe registrar los datos del niño/a con DNI " + id + "\n"
					+ "antes de cargar los datos familiares.");

		} else {

			existe = true;
		}

		return existe;
	}

	private boolean verificaResponsable() {

		boolean existe;
		Responsable resp = new Responsable_1();
		ICrudResponsable crud = new CrudResponsable();
		resp.setId(id);
		resp = crud.obtenerRegistro(resp, "tablaResponsable_1.db4o");

		if (resp == null) {

			existe = false;
		} else {

			existe = true;
			JOptionPane.showMessageDialog(null, "Los datos familiares del niño/a \n con DNI " + id + " ya existen.");
		}

		return existe;

	}

}
