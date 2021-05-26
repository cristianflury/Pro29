package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Entrevista;
import view.VentanaEntrevista;

public class ManejaIngresoEntrevista implements ActionListener {

	private VentanaEntrevista datos;
	private Entrevista entre;

	public ManejaIngresoEntrevista(VentanaEntrevista datos) {

		this.datos = datos;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		
					ICrudEntrevista agrega = new CrudEntrevista();
					agrega.agregarRegistro(crearEntrevista());
					
					JOptionPane.showMessageDialog(null, "Registro insertado correctamente.");
					refreshFormulario();

		

	}

	private Entrevista crearEntrevista() {

		entre = new Entrevista();

		entre.setId(datos.getIngresoIdChico().getText());
		entre.setPregunta_1(datos.getIngresoPregunta_1().getText());
		entre.setPregunta_2(datos.getIngresoPregunta_2().getText());
		entre.setPregunta_3(datos.getIngresoPregunta_3().getText());
		entre.setPregunta_4(datos.getIngresoPregunta_4().getText());
		entre.setPregunta_5(datos.getIngresoPregunta_5().getText());
		entre.setPregunta_6(datos.getIngresoPregunta_6().getText());
		entre.setPregunta_7(datos.getIngresoPregunta_7().getText());
		entre.setPregunta_8(datos.getIngresoPregunta_8().getText());
		entre.setPregunta_9(datos.getIngresoPregunta_9().getText());
		entre.setPregunta_10(datos.getIngresoPregunta_10().getText());

		return entre;

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
