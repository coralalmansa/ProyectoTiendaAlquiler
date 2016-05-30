package tiendaDeAlquileres;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Alquiler {

	/**
	 * Fecha actual.
	 */
	private static Calendar fecha = Calendar.getInstance();
	
	/**
	 * Formato de la fecha: dd/mm/yyyy
	 */
	private static SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	
	/**
	 * Producto a alquilar.
	 */
	private Producto producto;
	
	/**
	 * Fecha alquiler.
	 */
	private Date fechaAlquiler;
	
	/**
	 * Fecha devoluci�n
	 */
	private Date fechaDevolucion;
	
	/**
	 * Construye un nuevo alquiler del producto es�cificado.
	 * 
	 * @param producto
	 * 				Nuevo producto a alquilar
	 */
	public Alquiler(Producto producto){
		setProducto(producto);
		setFechaAlquiler(fecha.getTime());
	}

	/**
	 * Devuelve el producto a alquilar.
	 * 
	 * @return	Producto a alquilar
	 */
	protected Producto getProducto() {
		return producto;
	}

	/**
	 * Modifica el producto a alquilar.
	 * 
	 * @param producto
	 * 				Nuevo producto a alquilar
	 */
	protected void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * Devuelve la fecha de alquiler.
	 * 
	 * @return Fecha de alquiler
	 */
	protected Date getFechaAlquiler() {
		return fechaAlquiler;
	}

	/**
	 * Modifica al fecha de alquiler del producto.
	 * 
	 * @param fechaAlquiler
	 * 				Nueva fecha de alquiler
	 */
	protected void setFechaAlquiler(Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	/**
	 * Devuelve la fecha de devoluci�n.
	 * 
	 * @return	Fecha de devoluci�n
	 */
	protected Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	/**
	 * Modifica la fecha de devoluci�n del producto.
	 * 
	 * @param fechaDevolucion
	 * 				Nueva fecha de devoluci�n
	 */
	protected void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	/**
	 * Alquila un producto.
	 * 
	 * @throws ProductoNoDisponibleException
	 * 				Excepci�n si el producto no est� disponible
	 */
	public void alquilar() throws ProductoNoDisponibleException{
		if(!producto.isDisponible())
			throw new ProductoNoDisponibleException("El producto no est� disponible!");
		producto.setDisponible(false);
	}
	
	/**
	 * Hace la devoluci�n de un producto.
	 * 
	 * @throws ProductoDisponibleException
	 * 				Excepci�n si el producto est� disponible
	 */
	public void devolver() throws ProductoDisponibleException{
		if(producto.isDisponible())
			throw new ProductoDisponibleException("El producto si est� disponible!");
		producto.setDisponible(true);
	}
	
	/**
	 * Crea la factura del alquiler de los productos.
	 * 
	 * @param alquileres
	 * 				Lista de los productos alquilados.
	 * @param dias
	 * 				N�mero de d�as de alquiler
	 * @param tipo
	 * 				Tipo de alquiler
	 * @return	Factura del alquiler
	 */
	public static String crearFactura(ArrayList<Alquiler> alquileres,
			int dias, TipoAlquiler tipo){
		String factura;
		float total = 0f;
		factura = "FACTURA del Alquiler:";
		
		for(Alquiler alquiler: alquileres){
			factura += "ID: " + alquiler.getProducto().getId() + 
				"T�tulo: " + alquiler.getProducto().getTitulo() +
				" ( " + alquiler.getProducto().getPrecio(dias, tipo) + " euros).";
			factura += "Fecha alquiler: " + alquiler.getFechaAlquiler();
			factura += "Fecha devoluci�n: " + alquiler.getFechaDevolucion();
			total += alquiler.getProducto().getPrecio(dias, tipo);
		}
		factura += "PRECIO: " + total + " euros.";
		return factura;
	}
	
	
}
