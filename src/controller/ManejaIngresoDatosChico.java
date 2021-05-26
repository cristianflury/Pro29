package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Chico;

import view.VentanaDatosChicos;

public class ManejaIngresoDatosChico implements ActionListener {

	private VentanaDatosChicos datos;
	private Chico chicoNuevo;
	ICrudChicos crud = new CrudChicos();

	public ManejaIngresoDatosChico(VentanaDatosChicos ventanaDatosChicos) {

		this.datos = ventanaDatosChicos;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		Chico chicoNuevo = crearChico();
		if (verificaDocumento()) {
			
			if (!verificaChico(chicoNuevo)) {

				crud.agregarRegistro(chicoNuevo);
			
				JOptionPane.showMessageDialog(null, "Registro insertado correctamente.");
				refreshFormulario();

			} else {
				
				JOptionPane.showMessageDialog(null, "El registro con DNI " + chicoNuevo.getDocumento() + " ya existe.");
			}

		} else {
			
			JOptionPane.showMessageDialog(null, "Debe ingresar un DNI.");
		}

	}

	private Chico crearChico() {

		chicoNuevo = new Chico(datos.getIngresoNombre().getText(), datos.getIngresoApellido().getText(),
				datos.getIngresoDni().getText(), datos.getIngresoDomicilio().getText(),
				datos.getIngresoFechaNacimiento().getText(), datos.getIngresoEdad().getText(),
				datos.getIngresoEscuela().getText(), datos.getIngresoCelular().getText(),
				datos.getIngresoAnioLectivo().getText(), datos.getTextAreaObservaciones().getText());

		return chicoNuevo;

	}

	private void refreshFormulario() {

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

	private boolean verificaDocumento() {
		boolean tieneDni;

		String texto=datos.getIngresoDni().getText();
        texto=texto.replaceAll(" ", "");
        if(texto.length()==0){
            
        	tieneDni = false;
           
        }
        else {
           tieneDni = true;
        }
        
        return tieneDni;


	}
	
	private boolean verificaChico(Chico chico) {
		boolean existe;
		Chico chicoTemp = new Chico();
		
		chicoTemp.setDocumento(chico.getDocumento());
		chicoTemp = crud.obtenerRegistro(chicoTemp);

		if (chicoTemp == null)
			existe = false;
		else
			existe = true;

		return existe;
	}
	
	

}
