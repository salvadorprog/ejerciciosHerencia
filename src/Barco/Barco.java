package Barco;

public class Barco {
	private String Matricula;
	private Double Eslora;
	private int A�o_fabricacion;
	
	public Barco(String matricula, Double eslora, int a�o_fabricacion) {
		super();
		Matricula = matricula;
		Eslora = eslora;
		A�o_fabricacion = a�o_fabricacion;
	}

	public String getMatricula() {
		return Matricula;
	}

	public Double getEslora() {
		return Eslora;
	}

	public int getA�o_fabricacion() {
		return A�o_fabricacion;
	}

	@Override
	public String toString() {
		return "Barco [Matricula=" + Matricula + ", Eslora=" + Eslora + ", A�o_fabricacion=" + A�o_fabricacion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + A�o_fabricacion;
		result = prime * result + ((Eslora == null) ? 0 : Eslora.hashCode());
		result = prime * result + ((Matricula == null) ? 0 : Matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barco other = (Barco) obj;
		if (A�o_fabricacion != other.A�o_fabricacion)
			return false;
		if (Eslora == null) {
			if (other.Eslora != null)
				return false;
		} else if (!Eslora.equals(other.Eslora))
			return false;
		if (Matricula == null) {
			if (other.Matricula != null)
				return false;
		} else if (!Matricula.equals(other.Matricula))
			return false;
		return true;
	}
	
	
}
