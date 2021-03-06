package AlquilerVehiculos;

public class Furgoneta extends Vehiculo {
	private static final double PRECIO_PMA = 0.5;
	
	private double pma;
	
	public Furgoneta(String matricula, String gama, String tipoCarburante, double pma) {
		super(matricula, gama, tipoCarburante);
		this.pma = pma;
	}
	
	@Override
	public Double precioDia() {
		  double precioFinal = 0.0;
		  precioFinal += this.precioGama();
		  precioFinal += PRECIO_PMA * pma;
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Furgoneta [pma=" + pma + ", matricula=" + matricula + ", gama=" + gama + ", tipoCarburante="
				+ tipoCarburante + ", precioDia()=" + precioDia() + "]";
	}
}
