package view;


import java.util.Collections;

import java.util.List;


import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import controller.ICrudChicos;
import controller.CrudChicos;
import model.Chico;

public class ModeloTablaChicos extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4678728713130196321L;

	private ICrudChicos operacionesChicos = new CrudChicos();

	private List<Chico> chico;
	

	public ModeloTablaChicos() {
		Chico chico1 = new Chico();
		
		String anioLectivo = JOptionPane.showInputDialog(null, "Por favor, ingrese el AÑO LECTIVO.\nSi deja VACÍO"
				+ " podrá ver todos los registros.");
		
		
		if(anioLectivo.equals("")) {
			
			chico = operacionesChicos.obtenerTodosLosRegistros(new Chico());;
		}else {
			
			chico1.setAnioLectivo(anioLectivo);
			chico = operacionesChicos.obtenerTodosLosRegistros(chico1);	
		}
		
		Collections.sort(chico);
		
		
		
	}

	@Override
	public int getColumnCount() {

		return 7;
	}

	@Override
	public int getRowCount() {

		return chico.size();
	}

	@Override
	public Object getValueAt(int col, int row) {
		
		Integer z=col+1;
		String cero = "";
		if(z<10)cero = "0" + z.toString();
		else cero = z.toString();
		
		

		String[] datos = {  cero, chico.get(col).getApellido(),chico.get(col).getNombre(), chico.get(col).getDocumento(),
				chico.get(col).getCelPrincipalResponsable(), chico.get(col).getFechaNacimiento(), chico.get(col).getAnioLectivo() };

		return datos[row];

	}
	
	@Override
	public String getColumnName(int c) {

		String[] nombreColumnas = {"N°", "APELLIDO", "NOMBRE", "DOCUMENTO", "CELULAR", "FECHA NACIMIENTO", "AÑO" };
		

		return nombreColumnas[c];
	}
	
	
}
