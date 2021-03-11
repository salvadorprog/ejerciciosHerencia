package JuegoJaca;

public class Jugador extends Elemento {
	private int fuerza;
	private int magia;
	private int velocidad;
	private int fil;
	private int col;
	private int dinero;
	private int pociones;
	private int gemas;
	
	public Jugador(char simbolo, int fil, int col) {
		super(simbolo);
		this.fil = fil;
		this.col = col;
	}
	
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFil() {
		return fil;
	}

	public void setFil(int fil) {
		this.fil = fil;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getPociones() {
		return pociones;
	}

	public void setPociones(int pociones) {
		this.pociones = pociones;
	}

	public int getGemas() {
		return gemas;
	}

	public void setGemas(int gemas) {
		this.gemas = gemas;
	}

	@Override
	public String toString() {
		return "Jugador con símbolo: " + simbolo;
	}
	public int nextCol(char elemento) {
		int posicion = 0;
		switch(elemento) {
			case 'N':{
				posicion = col;
				break;
			}
			case 'O':{
				if (col != 0) {
					posicion = col - 1;
				}
				else {
					posicion = Constantes.ANCHO - 1;
				}
				break;
			}
			case 'S':{
				posicion = col;
				break;
			}
			case 'E':{
				if (col + 1 == Constantes.ANCHO) {
					posicion = 0;
				}
				else {
					posicion = col + 1;
				}
				break;
			}
		}
		return posicion;
	}
	
	public int nextFil(char elemento) {			// Aun en proceso...
		int posicion = 0;
		switch(elemento) {
			case 'N':{
				if (fil + 1 == Constantes.ALTO) {
					posicion = 0;
				}
				else {
					posicion = fil + 1;
				}
				break;
			}
			case 'O':{
				if (col != 0) {
					posicion = col - 1;
				}
				else {
					posicion = Constantes.ANCHO - 1;
				}
				break;
			}
			case 'S':{
				posicion = col;
				break;
			}
			case 'E':{

			}
		}
		return posicion;
		
	}
}
