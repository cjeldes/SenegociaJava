package modelo;

public class Persona extends Base {

	// --------------- ATRIBUTOS ---------------
	private String Apellido;
	private String Direccion;
	private int idComuna;

	// --------------- CONSTRUCTOR ---------------
	public Persona(int identificador, String nombre, boolean activo, String apellido, String direccion, int idComuna) {
		super(identificador, nombre, activo);
		Apellido = apellido;
		Direccion = direccion;
		this.idComuna = idComuna;
	}

	// --------------- MUTADORES ---------------
	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public void setIdComuna(int idComuna) {
		this.idComuna = idComuna;
	}

	// --------------- ACCESADORES ---------------
	public String getApellido() {
		return Apellido;
	}

	public String getDireccion() {
		return Direccion;
	}

	public int getIdComuna() {
		return idComuna;
	}

}
