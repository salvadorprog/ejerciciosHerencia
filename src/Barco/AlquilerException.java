package Barco;

public class AlquilerException extends Exception {

	public AlquilerException() {
		super("Ha ocurrido un error no especificado relacionado con el alquiler");
	}

	public AlquilerException(String message) {
		super(message);
	}
}
