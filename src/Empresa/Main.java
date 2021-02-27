package Empresa;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Empleado empl1 = new EmpleadoFijo("Salvador", 18 ,"234342423K", 1200.0, 2002);
		Empleado empl2 = new EmpleadoPorHoras("Javi", 19 ,"942874927H", 3400.0, 24);
		Empleado empl3 = new EmpleadoTemporal("Xian", 27 ,"723442427H", 5600.0, LocalDate.of(2020, 10, 12), LocalDate.of(2021,1, 14));
		
		
		System.out.println(empl1.toString());
		System.out.println(empl2.toString());
		System.out.println(empl3.toString());
	}

}
