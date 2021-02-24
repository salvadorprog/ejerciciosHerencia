package Barco;

public class Barco {
	private String Matricula;
	private Double Eslora;
	private int Año_fabricacion;
	
	public Barco(String matricula, Double eslora, int año_fabricacion) {
		super();
		Matricula = matricula;
		Eslora = eslora;
		Año_fabricacion = año_fabricacion;
	}

	public String getMatricula() {
		return Matricula;
	}

	public Double getEslora() {
		return Eslora;
	}

	public int getAño_fabricacion() {
		return Año_fabricacion;
	}

	@Override
	public String toString() {
		return "Barco [Matricula=" + Matricula + ", Eslora=" + Eslora + ", Año_fabricacion=" + Año_fabricacion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Año_fabricacion;
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
		if (Año_fabricacion != other.Año_fabricacion)
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
