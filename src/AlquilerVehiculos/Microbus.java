package AlquilerVehiculos;

public class Microbus extends Vehiculo {
	private static final double PRECIO_PLAZA_MICROBUS = 5.0; 
	private int numeroPlazas;
	public Microbus(String matricula, String gama, String tipoCarburante, int numeroPlazas) {
		super(matricula, gama, tipoCarburante);
		this.numeroPlazas = numeroPlazas;
	}
	
	@Override
	public Double precioDia() {
		double precioFinal = numeroPlazas * PRECIO_PLAZA_MICROBUS;
		precioFinal += this.precioGama();
		return precioFinal;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public String toString() {
		return "Microbus [numeroPlazas=" + numeroPlazas + ", precioDia()=" + precioDia() + ", getNumeroPlazas()="
				+ getNumeroPlazas() + "]";
	}
}
