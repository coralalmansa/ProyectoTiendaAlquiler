package tiendaDeAlquileres;

public interface Calculable {

	/**
	 * Calcula el precio del alquiler del producto.
	 * 
	 * @param dias
	 * 		Número de días de alquiler del producto
	 * @param tipo
	 * 		Tipo de alquiler
	 * @return	Precio de alquiler
	 */
	float getPrecio(int dias, TipoAlquiler tipo);
}
