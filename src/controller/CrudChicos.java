package controller;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import model.Chico;
import view.VentanaEditarDatosChicos;

public class CrudChicos implements ICrudChicos {

	private ObjectContainer db;
	private ConexionBBDD miConexion = new ConexionBBDD();
	private ObjectSet<Chico> result;
	private String nombreBBDD = "tablaChicos.db4o";

	@Override
	public void agregarRegistro(Chico chico) {
		

		try {

			miConexion.conectaBBDD(nombreBBDD);
			db = miConexion.getDb();

			db.store(chico);
			
			

		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "No se pudo insertar el registro.");

		} finally {

			miConexion.cerrarConexion();
		}
		

	}

	@Override
	public Chico obtenerRegistro(Chico chico) {

		try {
			miConexion.conectaBBDD(nombreBBDD);
			db = miConexion.getDb();

			result = db.queryByExample(chico);

			return result.next();

		} catch (Exception e) {
			return null;
		} finally {

			miConexion.cerrarConexion();
		}

	}

	@Override
	public List<Chico> obtenerTodosLosRegistros(Chico chico) {

		List<Chico> arrayChicos = new ArrayList<Chico>();
		try {

			miConexion.conectaBBDD(nombreBBDD);

			db = miConexion.getDb();

			result = db.queryByExample(chico);

			while (result.hasNext()) {

				arrayChicos.add(result.next());

			}

			return arrayChicos;

		} catch (Exception e) {

			return arrayChicos;

		} finally {

			miConexion.cerrarConexion();
		}

	}

	@Override
	public void actualizarRegistro(Chico chico, VentanaEditarDatosChicos datos) {

		try {

			miConexion.conectaBBDD(nombreBBDD);

			db = miConexion.getDb();

			result = db.queryByExample(chico);

			while (result.hasNext()) {

				Chico chiAct = result.next();
				chiAct.setNombre(datos.getIngresoNombre().getText());
				chiAct.setApellido(datos.getIngresoApellido().getText());
				chiAct.setDocumento(datos.getIngresoDni().getText());
				chiAct.setDomicilio(datos.getIngresoDomicilio().getText());
				chiAct.setFechaNacimiento(datos.getIngresoFechaNacimiento().getText());
				chiAct.setEdad(datos.getIngresoEdad().getText());
				chiAct.setEscuela(datos.getIngresoEscuela().getText());
				chiAct.setCelPrincipalResponsable(datos.getIngresoCelular().getText());
				chiAct.setAnioLectivo(datos.getIngresoAnioLectivo().getText());
				chiAct.setObservaciones(datos.getTextAreaObservaciones().getText());

				db.store(chiAct);
			}

		} catch (Exception e) {

		} finally {

			miConexion.cerrarConexion();
		}

	}

	@Override
	public void eliminarRegistro(Chico chico) {
		try {
			miConexion.conectaBBDD(nombreBBDD);

			db = miConexion.getDb();

			result = db.queryByExample(chico);

			while (result.hasNext()) {

				Chico chicoDelete = result.next();

				db.delete(chicoDelete);

			}

		} catch (Exception e) {

		} finally {

			miConexion.cerrarConexion();

		}

	}

	public ObjectSet<Chico> getResult() {
		return result;
	}

	public void setResult(ObjectSet<Chico> result) {
		this.result = result;
	}


}
