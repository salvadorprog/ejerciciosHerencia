package JuegoRol;

public abstract class Personaje {
	protected static final Integer FUERZA = 20;
	protected static final Integer INTELIGENCIA = 20;
	protected static final Integer VIDA_MAXIMA = 100;
	
	protected String nombre;
	protected Raza raza;
	protected Integer fuerza;
	protected Integer inteligencia;
	protected Integer puntosVidaMaximo;
	protected Integer puntosActuales;
	
	public Personaje(String nombre, Raza raza, Integer fuerza, Integer inteligencia, Integer puntosVida,
			Integer puntosActuales) throws Exception {
		super();
		this.nombre = nombre;
		this.raza = raza;
		setFuerza(fuerza);
		this.inteligencia = inteligencia;
		this.puntosVidaMaximo = puntosVida;
		this.puntosActuales = puntosActuales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	public Integer getFuerza() {
		return fuerza;
	}
	public void setFuerza(Integer fuerza) throws Exception {
		if(fuerza < 0 || fuerza > FUERZA) {
			throw new Exception("La fuerza debe ser un entero entre 0 y 20");
		}
		this.fuerza = fuerza;
	}
	public Integer getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(Integer inteligencia) throws Exception {
		if (inteligencia < 0 || inteligencia > INTELIGENCIA) {
			throw new Exception("La inteligencia debe ser un entero entre 0 y 20");
		}
		this.inteligencia = inteligencia;
	}
	public Integer getPuntosVidaMaximo() {
		return puntosVidaMaximo;
	}
	public void setPuntosVidaMaximo(Integer puntosVidaMaximo) throws Exception {
		if (puntosVidaMaximo < 0 || puntosVidaMaximo > VIDA_MAXIMA) {
			throw new Exception("Los puntos de vida máximo deben de ser un entero entre 0 y 100");
		}
		this.puntosVidaMaximo = puntosVidaMaximo;
	}
	public Integer getPuntosActuales() {
		return puntosActuales;
	}
	public void setPuntosActuales(Integer puntosActuales) throws Exception {
		if (puntosActuales < 0 || puntosActuales > puntosVidaMaximo) {
			throw new Exception("Los puntos de vida actuales deben de ser un entero entre 0 y los puntos de vída maximo");
		}
		this.puntosActuales = puntosActuales;
	}
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", raza=" + raza + ", fuerza=" + fuerza + ", inteligencia="
				+ inteligencia + ", puntosVidaMaximo=" + puntosVidaMaximo + ", puntosActuales=" + puntosActuales + "]";
	}
}
