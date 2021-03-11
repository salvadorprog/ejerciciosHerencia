package JuegoJaca;

public class Dinero extends Elemento {
	public Dinero() {
		super(Constantes.DINERO);
	}
	@Override
	public String toString() {
		return "Dinero con símbolo: " + simbolo;
	}
}
