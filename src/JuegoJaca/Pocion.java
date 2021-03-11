package JuegoJaca;

public class Pocion extends Elemento {
	public Pocion() {
		super(Constantes.POCION);
	}
	@Override
	public String toString() {
		return "Poción con símbolo: " + simbolo;
	}
}
