package entidades;

public class Vendedor extends Empleado {
	private int porcenComision;
	private int totalVentas;
	
	public Vendedor(int dni, String nombre, String apellido, String email, float sueldoBase, int porcenComision, int totalVentas) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.porcenComision = porcenComision;
		this.totalVentas = totalVentas;
	}
	
	public float getSueldo() {
		float sueldobase = getSueldoBase();
		float sueldo = sueldobase + (porcenComision * totalVentas / 100);
		return sueldo;
	}

	public int getPorcenComision() {
		return porcenComision;
	}

	public int getTotalVentas() {
		return totalVentas;
	}
	
	
}
