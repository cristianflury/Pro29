package controller;

import java.awt.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Responsable;
import model.Responsable_1;
import model.Responsable_2;
import model.Responsable_3;
import view.VentanaLecturaDatosFamiliares;

public class ManejoLecturaDatosFamiliares implements ActionListener {

	private String id;
	private Responsable resp_1, resp_2, resp_3;
	private Frame ventana;
	private ICrudResponsable crud = new CrudResponsable();

	public ManejoLecturaDatosFamiliares(Frame ventana) {

		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		pideDniNinio();
		if (verificaDni()) {
			if (verificaResponsable()) {
				resp_1 = new Responsable_1();
				resp_2 = new Responsable_2();
				resp_3 = new Responsable_3();
				resp_1.setId(id);
				resp_2.setId(id);
				resp_3.setId(id);

				resp_1 = crud.obtenerRegistro(resp_1, "tablaResponsable_1.db4o");
				resp_2 = crud.obtenerRegistro(resp_2, "tablaResponsable_2.db4o");
				resp_3 = crud.obtenerRegistro(resp_3, "tablaResponsable_3.db4o");
				VentanaLecturaDatosFamiliares v = new VentanaLecturaDatosFamiliares(resp_1, resp_2, resp_3);
				v.setVisible(true);
				ventana.setVisible(false);
				ventana.dispose();
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

	private boolean verificaResponsable() {
		boolean existe;
		Responsable respTemp = new Responsable_1();

		respTemp.setId(id);
		respTemp = crud.obtenerRegistro(respTemp, "tablaResponsable_1.db4o");

		if (respTemp == null) {

			existe = false;
						JOptionPane.showMessageDialog(null, "Los datos familiares del niño/a \n con DNI " + id + " no existen.");

		} else {

			existe = true;

		}

		return existe;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
