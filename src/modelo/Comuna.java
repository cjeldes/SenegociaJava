package modelo;

public class Comuna extends Base {

	// --------------- ATRIBUTOS ---------------
	private int idRegion;

	// --------------- CONSTRUCTOR ---------------
	public Comuna(int identificador, String nombre, boolean activo, int idRegion) {
		super(identificador, nombre, activo);
		this.idRegion = idRegion;
	}

	// --------------- MUTADORES ---------------
	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}

	// --------------- ACCESADORES ---------------
	public int getIdRegion() {
		return idRegion;
	}

}