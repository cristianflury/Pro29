package controller;

import java.awt.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Entrevista;
import view.VentanaEditarEntrevista;



public class ManejaLecturaEditarEntrevista implements ActionListener {
	
	private String id;
	private Entrevista entre;
	private Frame ventana;
	private ICrudEntrevista crud = new CrudEntrevista();
	
	public ManejaLecturaEditarEntrevista(Frame ventana) {
		
		this.ventana = ventana;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		pideDniNinio();
		if(verificaDocumento()) {
			
			if(verificaEntrevista()) {
				
				this.entre = new Entrevista();
				
				entre.setId(id);
				entre = crud.obtenerRegistro(entre);
				
				VentanaEditarEntrevista v = new VentanaEditarEntrevista(entre);
				v.setVisible(true);
				ventana.setVisible(false);
				ventana.dispose();
			}
			
			
		}
		
		
	}
	
	private void pideDniNinio() {
		
		id = JOptionPane.showInputDialog(null, "Por favor, ingrese el DNI del niño/a.");

	}
	
	private boolean verificaDocumento() {
		boolean tieneDni;
       
        if(id == null || id.equals("")){
            
        	tieneDni = false;
        	
        	JOptionPane.showMessageDialog(null, "Debe ingresar un DNI.");
           
        }
        else {
           tieneDni = true;
        }
        
        return tieneDni;


}
	
	private boolean verificaEntrevista() {
		boolean existe;
		Entrevista entre = new Entrevista();
		
		entre.setId(id);
		entre = crud.obtenerRegistro(entre);

		if (entre == null) {
			existe = false;
			
			JOptionPane.showMessageDialog(null,
					"Los datos de la entrevista del niño con DNI " + id + " no existen.");
			
		}else {
			
			existe = true;
		}

		return existe;
	}
	
}
