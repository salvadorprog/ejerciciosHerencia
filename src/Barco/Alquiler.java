package Barco;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
	private String nombre;
	private String dni;
	private LocalDate fecha_inicio_alquiler;
	private LocalDate fecha_fin_alquiler;
	private Integer posicion_amarre;
	private Barco barco;
	private final Double PRECIO = 20.0;
	
	public Alquiler(String nombre, String dni, LocalDate fecha_inicio_alquiler, LocalDate fecha_fin_alquiler,
			Integer posicion_amarre, Barco barco) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fecha_inicio_alquiler = fecha_inicio_alquiler;
		this.fecha_fin_alquiler = fecha_fin_alquiler;
		this.posicion_amarre = posicion_amarre;
		this.barco = barco;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public LocalDate getFecha_inicio_alquiler() {
		return fecha_inicio_alquiler;
	}

	public LocalDate getFecha_fin_alquiler() {
		return fecha_fin_alquiler;
	}

	public Integer getPosicion_amarre() {
		return posicion_amarre;
	}

	public Barco getBarco() {
		return barco;
	}

	@Override
	public String toString() {
		return "Alquiler [nombre=" + nombre + ", dni=" + dni + ", fecha_inicio_alquiler=" + fecha_inicio_alquiler
				+ ", fecha_fin_alquiler=" + fecha_fin_alquiler + ", posicion_amarre=" + posicion_amarre + ", barco="
				+ barco + ", PRECIO=" + PRECIO + "]";
	}
	
	public double precio() {
		double resultado = (ChronoUnit.DAYS.between(fecha_inicio_alquiler,fecha_fin_alquiler) + 1) * (barco.getEslora() * 10) * PRECIO;
		return resultado;
	}
}
