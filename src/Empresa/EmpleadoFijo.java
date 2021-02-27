package Empresa;

import java.time.LocalDate;

public class EmpleadoFijo extends Empleado {

	
	private static final Double COMPLEMENTO_ANUAL = 20.0;
	
	private Integer añoAlta;
	
	public EmpleadoFijo(String nombre, Integer edad, String nif, Double sueldo, Integer añoAlta) {
		super(nombre, edad, nif, sueldo);
		this.añoAlta = añoAlta;
	}
	
	@Override
	public Double calcularSueldo() {
		int añosEnEmpresa = LocalDate.now().getYear() - añoAlta;
		return sueldo + COMPLEMENTO_ANUAL * añosEnEmpresa;
	}

	public Integer getAñoAlta() {
		return añoAlta;
	}

	public void setAñoAlta(Integer añoAlta) {
		this.añoAlta = añoAlta;
	}

	public static Double getComplementoAnual() {
		return COMPLEMENTO_ANUAL;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((añoAlta == null) ? 0 : añoAlta.hashCode());
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
		EmpleadoFijo other = (EmpleadoFijo) obj;
		if (añoAlta == null) {
			if (other.añoAlta != null)
				return false;
		} else if (!añoAlta.equals(other.añoAlta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empleado Fijo con nombre: " + nombre + ", dni: " + nif + ", año de alta: " + añoAlta + ", sueldo: " + calcularSueldo() + "€";
	}
	
}
