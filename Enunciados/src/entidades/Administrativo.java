package entidades;

public class Administrativo extends Empleado {
	private int hsExtra;
	private int hsMes;
	
	public Administrativo(int dni, String nombre, String apellido, String email, float sueldoBase, int hsExtra, int hsMes) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.hsExtra = hsExtra;
		this.hsMes = hsMes;
	}
	
	public double getSueldo() {
		float sueldobase = getSueldoBase();
		double sueldo = sueldobase * ((hsExtra * 1.5) + hsMes) / hsMes;
		return sueldo;
	}

	public int getHsExtra() {
		return hsExtra;
	}

	public int getHsMes() {
		return hsMes;
	}
	
	
	
}
