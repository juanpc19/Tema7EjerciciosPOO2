package ejercicio4;

/**
 * clase Disco que contendra informacion sobre discos modificable mediante
 * setters y que se podra consultar mediante getters y toString
 * 
 * @author juanpesca19
 *
 */
public class Disco {

	private String codigo;// atributo que guardara un codigo unico asociado a un disco

	private String autor;// atributo que guardara el autor de cada disco

	private String titulo;// atributo que guardara el titulo de cada disco

	private String genero;// atributo que guardara el genero de cada disco

	private int duracion;// atributo que guardara la duracion de cada disco

	/**
	 * constructor sin parametros
	 */
	public Disco() {
		super();
		// doy a atributo codigo valor por defecto igual a "LIBRE"
		codigo = "LIBRE";
	}

	/**
	 * constructor con parametros
	 * 
	 * @param codigo   guardara un valor a asignar a atributo codigo
	 * @param autor    guardara un valor a asignar a atributo autor
	 * @param titulo   guardara un valor a asignar a atributo titulo
	 * @param genero   guardara un valor a asignar a atributo genero
	 * @param duracion guardara un valor a asignar a atributo duracion
	 */
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}

	/**
	 * constructor copia que copiara un objeto tipo Disco pasado como parametro de
	 * entrada en otro objeto que sera el que llame al constructor
	 * 
	 * @param disc contendra los valores de los atributos a copiar en el otro objeto
	 */
	public Disco(Disco disc) {
		this.codigo = disc.getCodigo();
		this.autor = disc.getAutor();
		this.titulo = disc.getTitulo();
		this.genero = disc.getGenero();
		this.duracion = disc.getDuracion();
	}

	/**
	 * getter de atributo codigo
	 * 
	 * @return codigo devolvera valor actual de atributo codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * setter de atributo codigo
	 * 
	 * @param codigo contendra valor a asignar a atributo codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * getter de atributo autor
	 * 
	 * @return autor devolvera valor actual de atributo autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * setter de atributo autor
	 * 
	 * @param autor contendra valor a asignar a atributo autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * getter de atributo titulo
	 * 
	 * @return titulo devolvera valor actual de atributo titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * setter de atributo titulo
	 * 
	 * @param titulo contendra valor a asignar a atributo titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * getter de atributo genero
	 * 
	 * @return genero devolvera valor actual de atributo genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * setter de atributo genero
	 * 
	 * @param genero contendra valor a asignar a atributo genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * getter de atributo duracion
	 * 
	 * @return duracion devolvera valor actual de atributo duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * setter de atributo duracion
	 * 
	 * @param duracion contendra valor a asignar a atributo duracion
	 */
	public void setDuracion(int duracion) {
		if (duracion >= 0) {
			this.duracion = duracion;
		}
	}

	/**
	 * metodo que devolvera una cadena en mensaje por pantalla con los valores de
	 * los atributos del objeto que lo llame
	 */
	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}

}
