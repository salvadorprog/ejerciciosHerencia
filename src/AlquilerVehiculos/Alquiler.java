package AlquilerVehiculos;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Alquiler {
	private String nombre;
	private String apellidos;
	private LocalDate fechainicio;
	private LocalDate fechafin;
	private String numeroTelefono;
	private Vehiculo vehiculo;
	
	public Alquiler(String nombre, String apellidos, LocalDate fechainicio, LocalDate fechafin, String numeroTelefono,
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

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
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

	public int diasAlquiler() {
		return (int) ChronoUnit.DAYS.between(fechainicio,fechafin);
	}
	public double precioAlquiler() {
		return diasAlquiler() * vehiculo.precioDia();
	}
}
