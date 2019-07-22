package modelo;

//clase base que sirve para probar herencia en el proyecto
public class Base {

	// --------------- ATRIBUTOS ---------------
	protected int Identificador;
	protected String Nombre;
	protected boolean Activo;

	// --------------- CONSTRUCTOR ---------------
	public Base(int identificador, String nombre, boolean activo) {
		super();
		Identificador = identificador;
		Nombre = nombre;
		Activo = activo;
	}

	// --------------- MUTADORES ---------------
	public void setIdentificador(int identificador) {
		Identificador = identificador;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setActivo(boolean activo) {
		Activo = activo;
	}

	// --------------- ACCESADORES ---------------
	public int getIdentificador() {
		return Identificador;
	}

	public String getNombre() {
		return Nombre;
	}

	public boolean isActivo() {
		return Activo;
	}

}
