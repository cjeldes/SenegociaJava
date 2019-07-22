package vista;

import java.util.Scanner;

import controlador.Ctrl;
import modelo.Comuna;
import modelo.Persona;
import modelo.Region;

public class Menu {

	private Ctrl ctrl;

	public Menu() {
		this.ctrl = new Ctrl();
	}

	// Metodo que se desplegará en la clase Main como menu.
	public void mostrarMenu() {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("MENU");
			System.out.println("1.- Listar Personas");
			System.out.println("2.- Listar Comunas");
			System.out.println("3.- Listar Regiones");
			System.out.println("0.- SALIR");
			op = sc.nextInt();
			switch (op) {
			case 1:
				listarPersonas();
				break;
			case 2:
				listarComunas();
				break;
			case 3:
				listarRegiones();
				break;
			default:
				break;
			}
		} while (op != 0);
		sc.close();
	}

	// Metodo que retorna una lista de personas y sus atributos
	private void listarPersonas() {
		System.out.println("******************************************");
		for (Persona tmp : ctrl.listarPersonas()) {
			System.out.println("[ID: " + tmp.getIdentificador() + ", Nombre: " + tmp.getNombre() + ", Apellido: "
					+ tmp.getApellido() + ", Direccion: " + tmp.getDireccion() + ", Comuna: "
					+ buscaComuna(tmp.getIdComuna()) + ", Region: " + buscaRegion(buscaIDRegion(tmp.getIdComuna()))
					+ ", ¿Activo?: " + tmp.isActivo() + "]");
		}
		System.out.println("******************************************");
	}

	// Metodo que retorna una lista de comunas y sus atributos
	private void listarComunas() {
		System.out.println("******************************************");
		for (Comuna tmp : ctrl.listarComunas()) {
			System.out.println("[ID: " + tmp.getIdentificador() + ", Nombre: " + tmp.getNombre() + ", Region: "
					+ buscaRegion(tmp.getIdRegion()) + ", ¿Activo?: " + tmp.isActivo() + "]");
		}
		System.out.println("******************************************");
	}

	// Metodo que retorna nombre de una comuna al ingresar el identificador de la
	// comuna
	private String buscaComuna(int idComuna) {
		return ctrl.buscarComuna(idComuna).getNombre();
	}

	// Metodo que retorna un listado de regiones y sus atributos
	private void listarRegiones() {
		System.out.println("******************************************");
		for (Region tmp : ctrl.listarRegiones()) {
			System.out.println("[ID: " + tmp.getIdentificador() + ", Nombre: " + tmp.getNombre() + ", ¿Activo?: "
					+ tmp.isActivo() + "]");
		}
		System.out.println("******************************************");
	}

	// Metodo que retorna identificador de una region al ingresar el identicador de
	// una comuna
	private int buscaIDRegion(int idComuna) {
		return ctrl.buscarComuna(idComuna).getIdRegion();
	}

	// Metodo que retorna nombre de region al ingresar identificador de la region
	private String buscaRegion(int idRegion) {
		return ctrl.buscarRegion(idRegion).getNombre();
	}

}
