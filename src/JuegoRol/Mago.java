package JuegoRol;

public class Mago extends Personaje {
	private static final Integer FUERZA_MAXIMA = 15;
	private static final Integer INTELIGENCIA_MINIMA = 17;
	private static final Integer VIDA_MAXIMA = 100;
	private String[] hechizos;

	public Mago(String nombre, Raza raza, Integer fuerza, Integer inteligencia, Integer puntosVida,
			Integer puntosActuales) throws Exception {
		super(nombre, raza, fuerza, inteligencia, puntosVida, puntosActuales);
//		if (){
//			
//		}
		this.hechizos = new String[4];
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
		super.setInteligencia(inteligencia);
	}
	
}
