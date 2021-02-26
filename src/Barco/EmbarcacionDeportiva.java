package Barco;

public class EmbarcacionDeportiva extends Barco {
	protected int cv;
	
	public EmbarcacionDeportiva(String matricula, Double eslora, int anoFabricacion, int cv) {
		super(matricula, eslora, anoFabricacion);
		this.cv = cv;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cv;
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
		EmbarcacionDeportiva other = (EmbarcacionDeportiva) obj;
		if (cv != other.cv)
			return false;
		return true;
	}
	
	@Override
	public double getPrecio() {
		return eslora * 10 * PRECIO_ACTUAL + cv;
	}

	@Override
	public String toString() {
		return "Embarcacion Deportiva con matrícula: " + super.matricula + ", eslora: " + super.eslora + ", año de fabricación: " + super.anoFabricacion + " y con " + cv + " caballos de potencia." + " Precio: " + this.getPrecio();
	}
}
