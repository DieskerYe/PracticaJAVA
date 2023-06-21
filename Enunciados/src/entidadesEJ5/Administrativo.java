package entidadesEJ5;

public class Administrativo extends Empleado {
	private int hsExtra;
	private int hsMes;
	
	public Administrativo(int dni, String nombre, String apellido, String email, float sueldoBase, int hsExtra, int hsMes) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.hsExtra = hsExtra;
		this.hsMes = hsMes;
	}
	
	@Override
	public void getSueldo() {
		float sueldobase = getSueldoBase();
		double sueldo = sueldobase * ((hsExtra * 1.5) + hsMes) / hsMes;
		System.out.println("El sueldo es: " + sueldo);
	}

	public int getHsExtra() {
		return hsExtra;
	}

	public int getHsMes() {
		return hsMes;
	}
	
	
	
}
