package Cuenta;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CuentaJoven extends Cuenta {
	private String titular;
	private final double bonificacion = 0.20;
	private final String TITULARiNCORRECTO = "El titular es incorrecto";
	private LocalDate fechaNacimiento;
	
	public CuentaJoven(String numCuenta, double saldo, String titular, LocalDate fechaNacimiento) throws Exception {
		super(numCuenta, saldo);
		this.titular = titular;
		this.fechaNacimiento = fechaNacimiento;
		if (!esTitularValido()) {
			throw new Exception (TITULARiNCORRECTO);
		}
	}

	public CuentaJoven(String numCuenta, String titular, LocalDate fechaNacimiento) throws Exception {
		super(numCuenta);
		this.titular = titular;
		this.fechaNacimiento = fechaNacimiento;
		if (!esTitularValido()) {
			throw new Exception (TITULARiNCORRECTO);
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public boolean esTitularValido() {
		int años = (int) ChronoUnit.YEARS.between(this.fechaNacimiento, LocalDate.now());
		if (años >= 18 && años < 25) {
			return true;
		}
		else {
			return false;
		}
	}	
	public String toString() {
		return "Cuenta Joven con bonificación: " + bonificacion + ", número de cuenta: " + super.numCuenta + ", saldo: " + super.saldo;
	}
	
}