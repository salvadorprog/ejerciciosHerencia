package JuegoRol;

public class Mago extends Personaje {
	private static final Integer NUMERO_MAXIMO_HECHIZOS = 4;
	private static final Integer FUERZA_MAXIMA = 15;
	private static final Integer INTELIGENCIA_MINIMA = 17;
	private static final Integer VIDA_MAXIMA = 100;
	
	private String[] hechizos;

	public Mago(String nombre, Raza raza, Integer fuerza, Integer inteligencia, Integer puntosVida,
			Integer puntosActuales) throws Exception {
		super(nombre, raza, fuerza, inteligencia, puntosVida, puntosActuales);
		this.setInteligencia(inteligencia);
		this.setFuerza(fuerza);
		this.hechizos = new String[NUMERO_MAXIMO_HECHIZOS];
	}
	@Override
	public void setInteligencia(Integer inteligencia) throws Exception {
		if (inteligencia < 17) {
			throw new Exception("Un mago no puede tener una inteligencia inferior a 17");
		}
		super.setInteligencia(inteligencia);
	}
	
	@Override
	public void setFuerza(Integer fuerza) throws Exception {
		if (inteligencia < 17) {
			throw new Exception("Un mago no puede tener una inteligencia inferior a 17");
		}
		super.setFuerza(fuerza);
	}
	
	public void aprendeHechizo(String hechizo) throws Exception {
		Integer i = -1;
		do {
			i++;
		}
		while(hechizos[i] != null);
		if (i != NUMERO_MAXIMO_HECHIZOS) {
			hechizos[i] = hechizo;
		}
		else {
			throw new Exception("Este mago sólo puede tener " + NUMERO_MAXIMO_HECHIZOS + " hechizos");
		}
	}
}
