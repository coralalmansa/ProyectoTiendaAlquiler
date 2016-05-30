package tiendaDeAlquileres;

import java.io.File;

public class GestionAlquileres {

	/**
	 * Tienda de alquileres
	 */
	private static TiendaDeAlquiler tiendaDeAlquiler = new TiendaDeAlquiler();
	
	/**
	 * Fichero
	 */
	private static File file;
	
	/**
	 * Estado de la tienda
	 */
	private static boolean modificado;

	/**
	 * Devuelve la tienda.
	 * 
	 * @return	tienda de alquiler
	 */
	protected static TiendaDeAlquiler getTiendaDeAlquiler() {
		return tiendaDeAlquiler;
	}

	/**
	 * Modifica la tienda.
	 * 
	 * @param tiendaDeAlquiler
	 * 			Nueva tienda de alquiler
	 */
	protected static void setTiendaDeAlquiler(TiendaDeAlquiler tiendaDeAlquiler) {
		GestionAlquileres.tiendaDeAlquiler = tiendaDeAlquiler;
	}

	/**
	 * Devuelve el fichero.
	 * 
	 * @return Fichero
	 */
	protected static File getFile() {
		return file;
	}

	/**
	 * Modifica el fichero.
	 * 
	 * @param file
	 * 			Nuevo fichero
	 */
	protected static void setFile(File file) {
		GestionAlquileres.file = file;
	}

	/**
	 * Devuelve el estado de la tienda.
	 * 
	 * @return	Estado de la tienda
	 */
	protected static boolean isModificado() {
		return modificado;
	}

	/**
	 * Modifica el estado de la tienda.
	 * 
	 * @param modificado
	 * 			Nuevo estado de la tienda
	 */
	protected static void setModificado(boolean modificado) {
		GestionAlquileres.modificado = modificado;
	}
		
}
