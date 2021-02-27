package Barco;

public abstract class Barco {
	protected String matricula;
	protected Double eslora;
	protected int anoFabricacion;
	protected final double PRECIO_ACTUAL = 20.0;
	
	public Barco(String matricula, Double eslora, int anoFabricacion) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anoFabricacion = anoFabricacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public Double getEslora() {
		return eslora;
	}

	public int getAnoFabricacion() {
		return anoFabricacion;
	}
	public abstract double getPrecio();

	@Override
	public abstract String toString();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoFabricacion;
		result = prime * result + ((eslora == null) ? 0 : eslora.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		if (anoFabricacion != other.anoFabricacion)
			return false;
		if (eslora == null) {
			if (other.eslora != null)
				return false;
		} else if (!eslora.equals(other.eslora))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	
	
}
