package tiendaDeAlquileres;

import java.util.regex.Pattern;

/**
 * Proyecto final - Programación.
 * 
 * @author Coral Almansa Dominguez
 * @version 1.0
 */
public class Musica extends Producto {

	private String interprete;
	private int numeroCanciones;
	private GeneroMusical genero;
	private boolean grammy;
	
	/**
	 * Patrón para un intérprete válido
	 */
	private static final Pattern patternInterprete = Pattern
			.compile("(?i)^[a-záéíóúÁÉÍÓÚñÑ]{2,}" + "(\\s+[a-záéíóúÁÉÍÓÚñÑ]{2,})*$");

	
	/**
	 * Construye un nuevo objeto de tipo Musica con un id, un título, un año, una descripción, 
	 * un intérprete, un número de canciones y un género especificado y si tiene Grammys.
	 * 
	 * @param id
	 * @param titulo
	 * @param anio
	 * @param descripcion
	 * @param interprete
	 * @param numeroCanciones
	 * @param genero
	 * @param grammy
	 * @throws IdNoValidoException 
	 * 				Excepción si el id no es válido
	 * @throws NumeroCancionesNoValidoException 
	 * 				Excepción si el número de canciones no es válido
	 * @throws GeneroNoValidoException 
	 * 				Excepción si el género musical no es válido
	 * @throws InterpreteNoValidoException 
	 * 				Excepción si el intérprete no es válido
	 * @throws TituloNoValidoException 
	 * 				Excepción si el título del producto no es válido
	 * @throws AnioNoValidoException 
	 * 				Excepción si el año no es válido
	 * @throws DescripcionNoValidaException 
	 * 				Excepción si la descripción no es válida
	 */
	public Musica(String id, String titulo, int anio, String descripcion,
			String interprete, int numeroCanciones, GeneroMusical genero,
			boolean grammy) throws IdNoValidoException, NumeroCancionesNoValidoException, 
			GeneroNoValidoException, InterpreteNoValidoException, TituloNoValidoException, 
			AnioNoValidoException, DescripcionNoValidaException {
		super(id, titulo, anio, descripcion);
		setInterprete(interprete);
		setNumeroCanciones(numeroCanciones);
		setGenero(genero);
		setGrammy(grammy);
	}

	
	/**
	 * Comprueba si el intérprete es válido o no
	 * 
	 * @param interprete
	 *            Intérprete a validar
	 * @return true si el intérprete es válido, false si el intérprete no es válido
	 */
	private boolean esValidoInterprete(String interprete) {
		return patternInterprete.matcher(interprete).matches();
	}
	

	
	
	/*** Setters and Getters ***/
	
	/**
	 * Devuelve el intérprete de la música.
	 * 
	 * @return Intèrprete
	 */
	protected String getInterprete() {
		return interprete;
	}

	/**
	 * Modifica el intérprete de la música.
	 * 
	 * @param interprete
	 * 				Intérprete de la música
	 * @throws InterpreteNoValidoException
	 * 				Excepción si el intérprete no es válido
	 */
	protected void setInterprete(String interprete) throws InterpreteNoValidoException{
		if(!esValidoInterprete(interprete))
			throw new InterpreteNoValidoException("El intérprete no es válido!");
		this.interprete = interprete;
	}

	/**
	 * Devuelve el número de canciones.
	 * 
	 * @return Número de canciones
	 */
	protected int getNumeroCanciones() {
		return numeroCanciones;
	}

	/**
	 * Modifica el número de canciones.
	 * 
	 * @param numeroCanciones
	 * 				Número de canciones
	 * @throws NumeroCancionesNoValidoException
	 * 				Excepción si el número de canciones no es válido
	 */
	protected void setNumeroCanciones(int numeroCanciones) throws NumeroCancionesNoValidoException{
		if(numeroCanciones <=0)
			throw new NumeroCancionesNoValidoException ("El número de canciones debe ser mayor de 0!");
		this.numeroCanciones = numeroCanciones;
	}

	/**
	 * Devuelve el género musical.
	 * 
	 * @return Género musical
	 */
	protected GeneroMusical getGenero() {
		return genero;
	}

	/**
	 * Modifica el género musical.
	 * 
	 * @param genero
	 * 				Género musical
	 * @throws GeneroNoValidoException
	 * 				Excepción si el género musical no es válido
	 */
	protected void setGenero(GeneroMusical genero) throws GeneroNoValidoException{
		if(genero == null)
			throw new GeneroNoValidoException("El género no es válido!");
		this.genero = genero;
	}


	protected boolean isGrammy() {
		return grammy;
	}


	protected void setGrammy(boolean grammy) {
		this.grammy = grammy;
	}


	/**
	 * Calcula el precio de la música.
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
		} else if (tipo == TipoAlquiler.GRAMMY) {
			total = tipo.getPrecio();
			if (dias > 2)
				total += tipo.getPrecio() * 0.2 * (dias - 2);
			return total;
		}
		return 0;
	}
	
	
	

	
	
	
	
}
