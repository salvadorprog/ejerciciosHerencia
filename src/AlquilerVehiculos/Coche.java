package AlquilerVehiculos;

public class Coche extends Vehiculo {
	private static final Double PRECIO_COCHE_GASOLINA = 3.5;
	private static final Double PRECIO_COCHE_GASOIL = 2.0;
	
	public Coche(String matricula, String gama, String tipoCarburante) {
		super(matricula, gama, tipoCarburante);
	}
	
	@Override
	public Double precioDia() {
		double precioFinal = 0;
		if (this.getTipoCarburante().toUpperCase() == "GASOLINA") {
			precioFinal += PRECIO_COCHE_GASOLINA;
		}
		else {
			precioFinal += PRECIO_COCHE_GASOIL;
		}
		precioFinal += precioGama(); 
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", gama=" + gama + ", tipoCarburante=" + tipoCarburante
				+ ", precioDia()=" + precioDia() + "]";
	}
	
}
