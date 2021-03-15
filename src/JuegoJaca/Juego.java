package JuegoJaca;

import java.util.Arrays;

public class Juego {
	Elemento tablero[][];
	Jugador Jugadores[];
	int alto;
	int ancho;
	int numJugadores;
	boolean finished;
	int jugadorJuega;
	
	public Juego(int alto, int ancho, int numJugadores) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.numJugadores = numJugadores;
	}

	public Juego(int numJugadores) {
		super();
		this.numJugadores = numJugadores;
	}
	
	public void crearTablero() {
		
	}
	
	public void crearJugador(char simbolo) {
		
	}
	
	public void crearRocas() {
		
	}
	
	public void crearArboles() {
		
	}
	
	public void crearGemas() {
		
	}
	
	public void crearPociones() {
		
	}
	
	public void crearDinero() {
		
	}

	@Override
	public String toString() {
		return "Juego [tablero=" + Arrays.toString(tablero) + ", Jugadores=" + Arrays.toString(Jugadores) + ", alto="
				+ alto + ", ancho=" + ancho + ", numJugadores=" + numJugadores + ", finished=" + finished
				+ ", jugadorJuega=" + jugadorJuega + "]";
	}
	
	public boolean isTerminado() {
		return true;
	}
	
	public String barra() {
		return "true";
	}
	
	public String imprimeNombreJugadores() {
		return "true";
	}
	
	public String imprimeValoreJugadores() {
		return "true";
	}
	
	public String getJugadorTurno() {
		return "true";
	}
	
	public String getMovimientoJugador() {
		return "true";
	}
	
	public void compruebaFinJuego() {
		
	}
	
	public void eliminarJugador(Jugador nombreJugador) {
		
	}
	
	public encuentraArbol(Jugador jugador, int )
	
}
