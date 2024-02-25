package entities;

//Clase Animal
public class Animal {
	private String nombre;
	private int edad;

	// Constructor
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
