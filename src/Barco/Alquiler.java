package Barco;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
	private String nombre;
	private String dni;
	private LocalDate fechaInicioAlquiler;
	private LocalDate fechaFinAlquiler;
	private Integer posicionAmarre;
	private Barco barco;
	
	public Alquiler(String nombre, String dni, LocalDate fechaInicioAlquiler, LocalDate fechaFinAlquiler,
			Integer posicionAmarre, Barco barco) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaInicioAlquiler = fechaInicioAlquiler;
		this.fechaFinAlquiler = fechaFinAlquiler;
		this.posicionAmarre = posicionAmarre;
		this.barco = barco;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public LocalDate getFechaInicioAlquiler() {
		return fechaInicioAlquiler;
	}

	public LocalDate getFechaFinAlquiler() {
		return fechaFinAlquiler;
	}

	public Integer getPosicionAmarre() {
		return posicionAmarre;
	}

	public Barco getBarco() {
		return barco;
	}

	@Override
	public String toString() {
		return "Alquiler [nombre=" + nombre + ", dni=" + dni + ", fecha_inicio_alquiler=" + fechaInicioAlquiler
				+ ", fecha_fin_alquiler=" + fechaFinAlquiler + ", posicion_amarre=" + posicionAmarre + ", barco="
				+ barco;
	}
	
	public double precio() {
		double resultado = (ChronoUnit.DAYS.between(fechaInicioAlquiler,fechaFinAlquiler) + 1) * barco.getPrecio();
		return resultado;
	}
}
