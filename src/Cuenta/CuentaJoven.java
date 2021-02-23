package Cuenta;

import java.time.LocalDate;

public class CuentaJoven extends Cuenta {
	private String titular;
	private final double bonificacion = 0.20;
	private final String TITULAR_INCORRECTO = "El titular es incorrecto";
	private LocalDate fechaNacimiento;
	
	public CuentaJoven(String numCuenta, double saldo, String titular, LocalDate fechaNacimiento) throws Exception {
		super(numCuenta, saldo);
		this.titular = titular;
		this.fechaNacimiento = fechaNacimiento;
	}

	public CuentaJoven(String numCuenta, String titular, LocalDate fechaNacimiento) throws Exception {
		super(numCuenta);
		this.titular = titular;
		this.fechaNacimiento = fechaNacimiento;
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
		if ((LocalDate.now().getYear() - fechaNacimiento.getYear()) > 18 && (LocalDate.now().getYear() - fechaNacimiento.getYear()) < 25) {
			return true;
		}
		else {
			return false;
		}
	}	
	public String toString() {
		return "Cuenta Joven " + bonificacion;
	}
	@Override
	public void reintegro(double cant) throws Exception {
		if (!esTitularValido()) {
			throw new Exception (TITULAR_INCORRECTO);
		}
		if (cant <= super.getSaldo() && cant > 0) {
			super.setSaldo(super.getSaldo() - cant);
		}
		else {
			throw new Exception (msg2);
		}
	}
	
}