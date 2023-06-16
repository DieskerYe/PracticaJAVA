package entidades;

public class Vendedor extends Persona{
	private int porcenComision;
	private int totalVentas;
	
	public Vendedor(int porcenComision, int totalVentas) {
		super();
		this.porcenComision = porcenComision;
		this.totalVentas = totalVentas;
	}
	
	@Override
	public float getSueldo() {
		return sueldoBase;
	}
}
