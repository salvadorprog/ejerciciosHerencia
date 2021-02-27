package Empresa;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado {
	
	LocalDate fechaAlta;
	LocalDate fechaBaja;
	
	public EmpleadoTemporal(String nombre, Integer edad, String nif, Double sueldo,LocalDate fechaAlta, LocalDate fechaBaja) {
		super(nombre, edad, nif, sueldo);
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
	}
	
	@Override
	public Double calcularSueldo() {
		return sueldo;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fechaAlta == null) ? 0 : fechaAlta.hashCode());
		result = prime * result + ((fechaBaja == null) ? 0 : fechaBaja.hashCode());
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
		EmpleadoTemporal other = (EmpleadoTemporal) obj;
		if (fechaAlta == null) {
			if (other.fechaAlta != null)
				return false;
		} else if (!fechaAlta.equals(other.fechaAlta))
			return false;
		if (fechaBaja == null) {
			if (other.fechaBaja != null)
				return false;
		} else if (!fechaBaja.equals(other.fechaBaja))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empleado temporal con nombre: " + nombre + ", dni: " + nif + ", fecha de alta: " + fechaAlta + ", fecha de baja: " + fechaBaja + ", sueldo: " + calcularSueldo() + "€";
	}
	
}
