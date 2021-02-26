package Cuenta;

import java.time.LocalDate;
import java.util.Scanner;

public class MainCuentas {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws Exception{		
		double cant;
		Cuenta c1 = new Cuenta("1",10);
		
		try {
			System.out.println(c1);
			System.out.println("Introduce la cantidad a reintegrar");
			cant = Double.parseDouble(teclado.nextLine());
			c1.reintegro(cant);
			System.out.println(c1);
			CuentaJoven cJoven = new CuentaJoven("23dfdsf3r", 3123.23, "Salvador", LocalDate.of(2012, 10, 8));
			System.out.println(cJoven);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		CuentaCredito c2 = new CuentaCredito(10,"1");
		
		try {
			System.out.println(c2);
			
			System.out.println("Introduce la cantidad a reintegrar");
			cant = Double.parseDouble(teclado.nextLine());
			c2.reintegro(cant);
			System.out.println(c2);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			CuentaJoven cJoven = new CuentaJoven("CaixaBank", 3000.00, "Salvador", LocalDate.of(2002, 10, 8));						// Cuenta Joven
			System.out.print("Introduce la cantidad a ingresar: ");
			cant = Double.parseDouble(teclado.nextLine());
			cJoven.ingreso(cant);
			System.out.print("Introduce la cantidad a reintegrar: ");
			cant = Double.parseDouble(teclado.nextLine());
			cJoven.reintegro(cant);
			System.out.println(cJoven.getSaldo());
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
