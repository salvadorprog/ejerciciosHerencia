package JuegoJaca;

public class Arbol extends Elemento {
	public Arbol() {
		super(Constantes.ARBOL);
	}
	@Override
	public String toString() {
		return "Arbol con símbolo: " + simbolo;
	}
}
