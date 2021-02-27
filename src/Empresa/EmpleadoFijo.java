package Empresa;

import java.time.LocalDate;

public class EmpleadoFijo extends Empleado {

	
	private static final Double COMPLEMENTO_ANUAL = 20.0;
	
	private Integer a�oAlta;
	
	public EmpleadoFijo(String nombre, Integer edad, String nif, Double sueldo, Integer a�oAlta) {
		super(nombre, edad, nif, sueldo);
		this.a�oAlta = a�oAlta;
	}
	
	@Override
	public Double calcularSueldo() {
		int a�osEnEmpresa = LocalDate.now().getYear() - a�oAlta;
		return sueldo + COMPLEMENTO_ANUAL * a�osEnEmpresa;
	}

	public Integer getA�oAlta() {
		return a�oAlta;
	}

	public void setA�oAlta(Integer a�oAlta) {
		this.a�oAlta = a�oAlta;
	}

	public static Double getComplementoAnual() {
		return COMPLEMENTO_ANUAL;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((a�oAlta == null) ? 0 : a�oAlta.hashCode());
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
		if (a�oAlta == null) {
			if (other.a�oAlta != null)
				return false;
		} else if (!a�oAlta.equals(other.a�oAlta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empleado Fijo con nombre: " + nombre + ", dni: " + nif + ", a�o de alta: " + a�oAlta + ", sueldo: " + calcularSueldo() + "�";
	}
	
}
