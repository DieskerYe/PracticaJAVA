package entidadesEJ5;

public class Empleado {
	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	private float sueldoBase;
	
	public Empleado( ) {
		
	}
	
	public Empleado(int dni, String nombre, String apellido, String email, float sueldoBase) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.sueldoBase = sueldoBase;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public void getSueldo() {
		
	}
	
	public void getPersona() {
		System.out.println("Nombre y Apellido: " + this.nombre + " " + this.apellido);
		System.out.println("DNI: " + this.dni);
		System.out.println("Email: " + this.email);
	}
	
}
