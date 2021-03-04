package AlquilerVehiculos;

import java.util.Scanner;

public class Main {
	private final static int NUMERO_DE_ALQUILERES_MAXIMO = 200; 
	private final static int NUMERO_DE_COCHES_MAXIMO = 200; 
	public static void main(String[] args) {
		Vehiculo[] vehiculos = new Vehiculo[NUMERO_DE_ALQUILERES_MAXIMO];
		Alquiler[] alquileres = new Alquiler[NUMERO_DE_ALQUILERES_MAXIMO];
		String[] Datos = new String[5];
		String opcion = "";
		Scanner entradaUsuario = new Scanner(System.in); 
		
		while (opcion != "exit") {
			try {
				System.out.println("\n 1. Alta de un vehículo"
				         + "\n 2. Cálculo de precio de alquiler"
						 + "\n 3. Salir"
				         );
				System.out.println("Seleccione opción >>> ");
				opcion = entradaUsuario.nextLine();
				switch(Integer.parseInt(opcion)) {
					case 1: {
						System.out.println("Seleccione tipo de vehículo: "
								 + "	1.Coche"
								 + "	2.Microbus"
								 + "	3.Furgoneta");
						System.out.println("Seleccione opción >>> ");
						opcion = entradaUsuario.nextLine();
						System.out.println("Indique matrícula >>> ");
						Datos[0] = entradaUsuario.nextLine();
						do {
							System.out.println("Indique gama (baja,media o alta) >>> ");
							Datos[1] = entradaUsuario.nextLine().toUpperCase();
						}
						while (Datos[1] != "BAJA" && Datos[1] != "MEDIA" && Datos[1] != "ALTA");
						do {
							System.out.println("Indique tipo carburante >>> ");
							Datos[2] = entradaUsuario.nextLine().toUpperCase();
						}
						while (Datos[2] != "GASOLINA" && Datos[2] != "GASOIL");
					}
					switch(Integer.parseInt(opcion)) {
						case 1: {
							
						}
						case 2: {
							
						}
						case 3: {
						
						}
					}
					case 2: {
				
					}
					case 3: {
				
					}
					default: {
						System.out.println("Opción incorrecta");
					}
				}
			}	
			catch(Exception e) {
				System.out.println("Error: " + e);
			}
		}
		
	}

}
