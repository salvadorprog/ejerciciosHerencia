package JuegoJaca;

public class JuegoException extends Exception {
	public JuegoException(String mensaje) {
		super(mensaje);
	}
	public JuegoException() {
		super("Error del Juego");
	}
}
