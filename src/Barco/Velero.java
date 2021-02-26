package Barco;

public class Velero extends Barco {
	private int numeroMastiles;

	public Velero(String matricula, Double eslora, int anoFabricacion, int numeroMastiles) {
		super(matricula, eslora, anoFabricacion);
		this.numeroMastiles = numeroMastiles;
	}

	public int getNumero_mastiles() {
		return numeroMastiles;
	}

	@Override
	public String toString() {
		return "Velero con matricula: " + super.matricula + ", eslora: " + super.eslora + ", año de fabricación: " + super.anoFabricacion + " y número de mástiles: " + numeroMastiles + " con precio: " + this.getPrecio();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numeroMastiles;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Velero other = (Velero) obj;
		if (numeroMastiles != other.numeroMastiles)
			return false;
		return true;
	}
	@Override
	public double getPrecio() {
		return eslora * 10 * PRECIO_ACTUAL + numeroMastiles;
	}
	
}
