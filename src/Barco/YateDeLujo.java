package Barco;

public class YateDeLujo extends EmbarcacionDeportiva {
	private int numeroCamarotes;

	public YateDeLujo(String matricula, Double eslora, int anoFabricacion, int cv, int numeroCamarotes) {
		super(matricula, eslora, anoFabricacion, cv);
		this.numeroCamarotes = numeroCamarotes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numeroCamarotes;
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
		YateDeLujo other = (YateDeLujo) obj;
		if (numeroCamarotes != other.numeroCamarotes)
			return false;
		return true;
	}
	
	@Override
	public double getPrecio() {
		return eslora * 10 * PRECIO_ACTUAL + cv + numeroCamarotes;
	}
	
	@Override
	public String toString() {
		return "YateDeLujo con matr�cula: " + matricula + ", numero de camarotes: " + numeroCamarotes + ", eslora: " + eslora
				+ ", a�o de fabricacion: " + anoFabricacion + ", y precio: " + this.getPrecio() + "�";
	}
	
	
}
