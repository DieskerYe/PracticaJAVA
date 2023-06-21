package entidadesEJ5;

public class Vendedor extends Empleado {
	private int porcenComision;
	private int totalVentas;
	
	public Vendedor(int dni, String nombre, String apellido, String email, float sueldoBase, int porcenComision, int totalVentas) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.porcenComision = porcenComision;
		this.totalVentas = totalVentas;
	}
	
	@Override
	public void getSueldo() {
		float sueldobase = getSueldoBase();
		float sueldo = sueldobase + (porcenComision * totalVentas / 100);
		System.out.println("El sueldo es: " + sueldo);
	}

	public int getPorcenComision() {
		return porcenComision;
	}

	public int getTotalVentas() {
		return totalVentas;
	}
	
	
}
