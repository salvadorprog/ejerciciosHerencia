package Barco;

public class Velero extends Barco {
	private int numero_mastiles;

	public Velero(String matricula, Double eslora, int año_fabricacion, int numero_mastiles) {
		super(matricula, eslora, año_fabricacion);
		this.numero_mastiles = numero_mastiles;
	}

	public int getNumero_mastiles() {
		return numero_mastiles;
	}

	@Override
	public String toString() {
		return "Velero [numero_mastiles=" + numero_mastiles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numero_mastiles;
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
		if (numero_mastiles != other.numero_mastiles)
			return false;
		return true;
	}
	
	
}
