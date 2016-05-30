package tiendaDeAlquileres;

import java.util.regex.Pattern;

/**
 * Proyecto final - Programación.
 * 
 * @author Coral Almansa Dominguez
 * @version 1.0
 */
public class Pelicula extends Producto {

	private String director;
	private int duracion;
	private GeneroCinematografico genero;
	private boolean oscar;
	
	
	
	/**
	 * Patrón para un director válido
	 */
	private static final Pattern patternDirector = Pattern
			.compile("(?i)^[a-záéíóúÁÉÍÓÚñÑ]{2,}" + "(\\s+[a-záéíóúÁÉÍÓÚñÑ]{2,})*$");
	
	
	

	
	
	
	/**
	 * Construye una película con un id, un título, un año, una descripción, un director, una duración
	 *  y un género especificado y si tiene oscar.
	 *  
	 * @param id
	 * @param titulo
	 * @param anio
	 * @param descripcion
	 * @param director
	 * @param duracion
	 * @param genero
	 * @param oscar
	 * @throws IdNoValidoException 
	 * 					Excepción si el id no es válido
	 * @throws DuracionPeliculaNoValidaException 
	 * 					Excepción si la duración de la película no es válida
	 * @throws GeneroCinematograficoNoValidoException 
	 * 					Excepción si el género cinematográfico no es válido
	 * @throws DirectorNoValidoException 
	 * 					Excepción si el director no es válido
	 * @throws TituloNoValidoException 
	 * 					Excepción si el título del producto no es válido
	 * @throws AnioNoValidoException 
	 * 					Excepción si el año no es válido
	 * @throws DescripcionNoValidaException 
	 * 					Excepción si la descripción no es válida
	 */
	public Pelicula(String id, String titulo, int anio, String descripcion,
			String director, int duracion, GeneroCinematografico genero,
			boolean oscar) throws IdNoValidoException, DuracionPeliculaNoValidaException, 
			GeneroNoValidoException, DirectorNoValidoException, TituloNoValidoException, 
			AnioNoValidoException, DescripcionNoValidaException {
		super(id, titulo, anio, descripcion);
		setDirector(director);
		setDuracion(duracion);
		setGenero(genero);
		setOscar(oscar);
	}
	
	
	

	/**
	 * Comprueba si el director de la película es válido
	 * 
	 * @param director
	 *            Director a validar
	 * @return true si el director es válido, false si el director no es válido
	 */
	private boolean esValidoDirector(String director) {
		return patternDirector.matcher(director).matches();
	}
	
	

	/*** Setters and Getters ***/
	

	/**
	 * Devuelve el director de la película.
	 * 
	 * @return Director
	 */
	protected String getDirector() {
		return director;
	}


	/**
	 * Modifica el director de la película.
	 * 
	 * @param director
	 * 				Director de la película
	 * @throws DirectorNoValidoException
	 * 				Excepción si el director no es válido
	 */
	protected void setDirector(String director) throws DirectorNoValidoException{
		if(!esValidoDirector(director))
			throw new DirectorNoValidoException("El director no es válido!");
		this.director = director;
	}

	/**
	 * Devuelve la duración de la película.
	 * 
	 * @return Duración de la película
	 */
	protected int getDuracion() {
		return duracion;
	}

	/**
	 * Modifica la duración de la película.
	 * 
	 * @param duracion
	 * 					Duración de la película
	 * @throws DuracionPeliculaNoValidaException
	 * 					Excepción si la duración no es válida
	 */
	protected void setDuracion(int duracion) throws DuracionPeliculaNoValidaException{
		if(duracion <= 0)
			throw new DuracionPeliculaNoValidaException("La duración debe ser mayor de 0!");
		this.duracion = duracion;
	}

	/**
	 * Devuelve el género cinematográfico.
	 * 
	 * @return Género cinematográfico
	 */
	protected GeneroCinematografico getGenero() {
		return genero;
	}

	/**
	 * Modifica el género cinematográfico
	 * 
	 * @param genero
	 * 				Género cinematográfico
	 * @throws GeneroCinematograficoNoValidoException
	 * 				Excepción si el género no es válido
	 */
	protected void setGenero(GeneroCinematografico genero) throws GeneroNoValidoException{
		if(genero == null)
			throw new GeneroNoValidoException("El género cinematográfico no es válido!");
		this.genero = genero;
	}


	protected boolean isOscar() {
		return oscar;
	}


	protected void setOscar(boolean oscar) {
		this.oscar = oscar;
	}


	/**
	 * Calcula el precio de la película
	 * 
	 * @param dias
	 *            Número de días a alquilar
	 * @param tipo
	 *            Tipo de alquiler
	 * @return Precio del producto
	 */
	@Override
	public float getPrecio(int dias, TipoAlquiler tipo) {
		float total;
		if (tipo == TipoAlquiler.NORMAL) {
			total = tipo.getPrecio();
			if (dias > 2)
				total += tipo.getPrecio() * 0.2 * (dias - 2);
			return total;
		} else if (tipo == TipoAlquiler.ESTRENO) {
			total = tipo.getPrecio();
			if (dias > 2)
				total += tipo.getPrecio() * 0.2 * (dias - 2);
			return total;
		}
		return 0;
	}

}
