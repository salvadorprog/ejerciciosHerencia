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
	
	public Juego(int alto, int ancho, int numJugadores) throws JuegoException {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.numJugadores = numJugadores;
		crearTablero();
	}

	public Juego(int numJugadores) throws JuegoException {
		super();
		this.numJugadores = numJugadores;
		this.alto = Constantes.ALTO;
		this.ancho = Constantes.ANCHO;
		crearTablero();
	}
	
	public void crearTablero() throws JuegoException {
		this.tablero = new Elemento[ancho][alto];
		for(int i = 0; i < Constantes.NUM_ROCAS; i++) {
			crearRocas();
		}
		for(int i = 0; i < Constantes.NUM_ARBOLES; i++) {
			crearArboles();
		}
		for(int i = 0; i < Constantes.NUM_GEMAS; i++) {
			crearGemas();
		}
		for(int i = 0; i < Constantes.NUM_POCIONES; i++) {
			crearPociones();
		}
		for(int i = 0; i < Constantes.NUM_DINERO; i++) {
			crearDinero();
		}
		for (int i = 0; i < numJugadores; i++) {
			crearJugador(Constantes.NOMBRE_JUGADORES[i]);
		}
	}
	
	public void crearJugador(char simbolo) throws JuegoException {
		int x;
		int y;
		do {
			x = (int) Math.random();
			y = (int) Math.random();
		} while (tablero[x][y] != null);
		Jugador JugadorNuevo = new Jugador(simbolo, x, y);
		tablero[x][y] = JugadorNuevo;
		int posicion = 0;
		boolean encontrado = false;
		
		while(Jugadores.length < posicion && !encontrado) {
			posicion++;
		}
		if (posicion == Jugadores.length) {
			throw new JuegoException("Lista de jugadores llena");
		}
		else {
			Jugadores[posicion] = JugadorNuevo;
		}
	}
	
	public void crearRocas() {
		asignarPosicion(new Roca());
	}
	
	public void crearArboles() {
		asignarPosicion(new Arbol());
	}
	
	public void crearGemas() {
		asignarPosicion(new Gema());
	}
	
	public void crearPociones() {
		asignarPosicion(new Pocion());
	}
	
	public void crearDinero() {
		asignarPosicion(new Dinero());
	}
	
	private void asignarPosicion(Elemento elemento) {
		int x;
		int y;
		do {
			x = (int) Math.random();
			y = (int) Math.random();
		} while (tablero[x][y] != null);
		tablero[x][y] = elemento;
	}

	@Override
	public String toString() {
		StringBuilder tablero = new StringBuilder();
		for (int y = 0; y < alto; y++) {
			tablero.append(barra());
			for (int x = 0; x < alto; x++) {
				tablero.append("|");
			} 
			tablero.append("\n");
		}
	}
	
	public boolean isTerminado() {
		return finished;
	}
	
	public String barra() {
		return "-----------------------------------------------------------";
	}
	
	public String imprimeNombreJugadores() {
		StringBuilder resultado = new StringBuilder();
		for(Jugador jugador: Jugadores) {
			resultado.append(jugador.simbolo + "\n");
		}
		return resultado.toString();
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
}
