package src.peliculas;



public class Pelicula{
	private int idpeli;
	private String nombrepeli;
	private int aniopeli;
	private String categoria;

	public Pelicula(int idpeli, String nombrepeli, int aniopeli, String categoria){
		this.idpeli = idpeli;
		this.nombrepeli = nombrepeli;
		this.aniopeli = aniopeli;
		this.categoria = categoria;
	}

	public Pelicula(int idpeli, String nombrepeli){
		this(idpeli, nombrepeli, 0);
	}

	public int getIdpeli(){
		return idpeli;
	}

	public int getAnio(){
		return aniopeli;
	}

	public String getNombrepeli(){
		return nombrepeli;
	}

	public String getcategoria(){
		return categoria;
	}
	public void setNombrepeli(){
		this.nombrepeli = nombrepeli;
	}
	public void setAnio(){
		this.aniopeli = aniopeli;
	}
	public void setCategoria(){
		this.categoria = categoria;
	}

	public String getinformacion(){
		String muestra = "Id: "+idpeli+" Nombre de la pelicula: "+nombrepeli+" año de la pelicula: "+aniopeli+" y su categoria es: "+categoria;
		return muestra;
	}
}