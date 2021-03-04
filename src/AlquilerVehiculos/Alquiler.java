package AlquilerVehiculos;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Alquiler {
	private String nombre;
	private String apellidos;
	private LocalDate fechainicio;
	private LocalDate fechafin;
	private int numeroTelefono;
	private Vehiculo vehiculo;
	
	public Alquiler(String nombre, String apellidos, LocalDate fechainicio, LocalDate fechafin, int numeroTelefono,
			Vehiculo vehiculo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.numeroTelefono = numeroTelefono;
		this.vehiculo = vehiculo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}

	public LocalDate getFechafin() {
		return fechafin;
	}

	public void setFechafin(LocalDate fechafin) {
		this.fechafin = fechafin;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((fechafin == null) ? 0 : fechafin.hashCode());
		result = prime * result + ((fechainicio == null) ? 0 : fechainicio.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numeroTelefono;
		result = prime * result + ((vehiculo == null) ? 0 : vehiculo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (fechafin == null) {
			if (other.fechafin != null)
				return false;
		} else if (!fechafin.equals(other.fechafin))
			return false;
		if (fechainicio == null) {
			if (other.fechainicio != null)
				return false;
		} else if (!fechainicio.equals(other.fechainicio))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroTelefono != other.numeroTelefono)
			return false;
		if (vehiculo == null) {
			if (other.vehiculo != null)
				return false;
		} else if (!vehiculo.equals(other.vehiculo))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Alquiler Matrícula: " + getVehiculo().getMatricula() + ", dias de alquiler: " + diasAlquiler() + ", precio alquiler: "
				+ precioAlquiler() + "€";
	}

	public double diasAlquiler() {
		return (int) ChronoUnit.DAYS.between(fechainicio,fechafin);
	}
	public double precioAlquiler() {
		return diasAlquiler() * vehiculo.precioDia();
	}
}
