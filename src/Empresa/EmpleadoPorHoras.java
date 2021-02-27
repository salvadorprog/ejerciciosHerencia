package Empresa;

public class EmpleadoPorHoras extends Empleado {
	private static final Double PRECIO_HORA_TRABAJADA = 8.0;
	
	private Integer horasTrabajadas; 
	
	public EmpleadoPorHoras(String nombre, Integer edad, String nif, Double sueldo, Integer horasTrabajadas) {
		super(nombre, edad, nif, sueldo);
		this.horasTrabajadas = horasTrabajadas;
	}
	
	@Override
	public Double calcularSueldo() {
		return PRECIO_HORA_TRABAJADA * horasTrabajadas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((horasTrabajadas == null) ? 0 : horasTrabajadas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpleadoPorHoras other = (EmpleadoPorHoras) obj;
		if (horasTrabajadas == null) {
			if (other.horasTrabajadas != null)
				return false;
		} else if (!horasTrabajadas.equals(other.horasTrabajadas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empleado por horas con nombre: " + nombre + ", dni: " + nif + ", horas trabajadas: " + horasTrabajadas + ", sueldo: " + calcularSueldo() + "€";
	}

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public static Double getPrecioHoraTrabajada() {
		return PRECIO_HORA_TRABAJADA;
	}
}
