package AlquilerVehiculos;
public abstract class Vehiculo {
	protected static final Double PRECIO_GAMA_BAJA = 30.0;
	protected static final Double PRECIO_GAMA_MEDIA = 40.0;
	protected static final Double PRECIO_GAMA_ALTA = 50.0;
	
	protected String matricula;
	protected String gama;
	protected String tipoCarburante;
	
	public Vehiculo(String matricula, String gama, String tipoCarburante) {
		super();
		this.matricula = matricula;
		this.gama = gama;
		this.tipoCarburante = tipoCarburante;
	}
	public abstract Double precioDia();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Vehiculo other = (Vehiculo) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public Double precioGama() {
		switch(gama.toUpperCase()) {
			case "BAJA": {
				return PRECIO_GAMA_BAJA;
			}
			case "MEDIA": {
				return PRECIO_GAMA_MEDIA;
			}
			default: {
				return PRECIO_GAMA_ALTA;
			}
		}
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public String getTipoCarburante() {
		return tipoCarburante;
	}

	public void setTipoCarburante(String tipoCarburante) {
		this.tipoCarburante = tipoCarburante;
	}
}
