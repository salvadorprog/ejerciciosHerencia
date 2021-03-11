package JuegoJaca;

public class Roca extends Elemento {
	public Roca() {
		super(Constantes.ROCA);
	}
	@Override
	public String toString() {
		return "Roca con símbolo: " + simbolo;
	}
}
