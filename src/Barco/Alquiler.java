package Barco;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler{
	private String nombre;
	private String dni;
	private LocalDate fechaInicioAlquiler;
	private LocalDate fechaFinAlquiler;
	private Integer posicionAmarre;
	private Barco barco;
	
	public Alquiler(String nombre, String dni, LocalDate fechaInicioAlquiler, LocalDate fechaFinAlquiler,
			Integer posicionAmarre, Barco barco) throws Exception{
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaInicioAlquiler = fechaInicioAlquiler;
		this.fechaFinAlquiler = fechaFinAlquiler;
		this.posicionAmarre = posicionAmarre;
		this.barco = barco;
		comprobarFecha(fechaInicioAlquiler,fechaFinAlquiler);
	}
	
	public Alquiler(String nombre, String dni, LocalDate fechaFinAlquiler,
			Integer posicionAmarre, Barco barco) throws Exception{
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaInicioAlquiler = LocalDate.now();
		this.fechaFinAlquiler = fechaFinAlquiler;
		this.posicionAmarre = posicionAmarre;
		this.barco = barco;
		comprobarFecha(fechaInicioAlquiler,fechaFinAlquiler);
	}

	public String getNombre() {
		return nombre;
	}
	private void comprobarFecha(LocalDate inicio, LocalDate fin) throws Exception {
		if (fin == null) {
			throw new AlquilerException("La fecha de fin es nula");
		}
		if (inicio == null) {
			throw new AlquilerException("La fecha de inicio es nula");
		}
		if (inicio.isAfter(fin)) {
			throw new AlquilerException("Las fecha de fin debe ser posterior a la de inicio del alquiler");
		}	
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
	public double precioAlquiler() {
		int dias = (int) (ChronoUnit.DAYS.between(fechaInicioAlquiler, fechaFinAlquiler) + 1);
		return dias * barco.getPrecio();
	}
	@Override
	public String toString() {
		return "Último Alquiler: Nombre: " + nombre + ", dni: " + dni + ", alquilado el: " + fechaInicioAlquiler
				+ ", y terminado el alquiler el " + fechaFinAlquiler + " con posición de amarre: " + posicionAmarre + " y barco: "
				+ barco;
	}
}
