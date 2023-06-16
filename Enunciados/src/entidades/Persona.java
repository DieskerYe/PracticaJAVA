package entidades;

public class Persona {
	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	private float sueldoBase;
	
	public Persona( ) {
		
	}
	
	public Persona(int dni, String nombre, String apellido, String email, float sueldoBase) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.sueldoBase = sueldoBase;
	}

	public float getSueldo() {
		return sueldoBase;
	}
	
}
