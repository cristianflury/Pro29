package controller;



import javax.swing.JOptionPane;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;


import model.Entrevista;

import view.VentanaEditarEntrevista;


public class CrudEntrevista implements ICrudEntrevista {

	private ObjectContainer db;
	private ConexionBBDD miConexion = new ConexionBBDD();
	private ObjectSet<Entrevista> result;
	private String nombreBBDD = "tablaEntrevista.db4o";
	
	
     
	@Override
	public void agregarRegistro(Entrevista entrevista) {

		try {

			miConexion.conectaBBDD(nombreBBDD);
			db = miConexion.getDb();
			db.store(entrevista);

			

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "No se pudo insertar el registro");

		} finally {

			miConexion.cerrarConexion();
		}

	}

	@Override
	public Entrevista obtenerRegistro(Entrevista entrevista) {
		
		
		try {
			miConexion.conectaBBDD(nombreBBDD);
			db = miConexion.getDb();

			result = db.queryByExample(entrevista);
			
			return result.next();
			
		} catch (Exception e) {
			return null;
		} finally {

			miConexion.cerrarConexion();
		}

	}

	

	@Override
	public void actualizarRegistro(Entrevista entrevista, VentanaEditarEntrevista datos) {
		
		
		try {

			miConexion.conectaBBDD(nombreBBDD);

			db = miConexion.getDb();

			result = db.queryByExample(entrevista);

			while (result.hasNext()) {

				Entrevista entre = result.next();
				
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

				db.store(entre);
			}

		} catch (Exception e) {

		} finally {

			miConexion.cerrarConexion();
		}

	}

	@Override
	public void eliminarRegistro(Entrevista entrevista) {
		try {
			miConexion.conectaBBDD(nombreBBDD);

			db = miConexion.getDb();

			result = db.queryByExample(entrevista);

			while (result.hasNext()) {

				Entrevista entreDelete = result.next();

				db.delete(entreDelete);


			}

		} catch (Exception e) {

		} finally {

			miConexion.cerrarConexion();

		}

	}

	public ObjectSet<Entrevista> getResult() {
		return result;
	}

	public void setResult(ObjectSet<Entrevista> result) {
		this.result = result;
	}

}
