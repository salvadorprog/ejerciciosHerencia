package AlquilerVehiculos;

import java.util.Scanner;

public class Main {
	private final static int NUMERO_DE_COCHES_MAXIMO = 200; 
	public static void main(String[] args) {
		Vehiculo[] vehiculos = new Vehiculo[NUMERO_DE_COCHES_MAXIMO];
		
		Integer numeroVehiculos = 0;
		
		String[] Datos = new String[5];
		String opcion = "";
		Scanner entradaUsuario = new Scanner(System.in); 
		
		while (!opcion.equals("S")) {
			try {
				System.out.println("\n 1. Alta de un vehículo"
				         + "\n 2. Cálculo de precio de alquiler"
						 + "\n 3. Salir"
				         );
				System.out.print("Seleccione opción >>> ");
				opcion = entradaUsuario.nextLine();
				switch(Integer.parseInt(opcion)) {
					case 1: {
						do {
							System.out.println("Seleccione tipo de vehículo: "
									 + "\n	1.Coche"
									 + "\n	2.Microbus"
									 + "\n	3.Furgoneta");
							System.out.print("Seleccione opción >>> ");
							opcion = entradaUsuario.nextLine();
						} 
						while(Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 3);
						System.out.print("Indique matrícula >>> ");
						Datos[0] = entradaUsuario.nextLine();
						do {
							System.out.print("Indique gama (baja,media o alta) >>> ");
							Datos[1] = entradaUsuario.nextLine().toUpperCase();
						}
						while (!(Datos[1].equals("BAJA") || Datos[1].equals("MEDIA") || Datos[1].equals("ALTA")));
						do {
							System.out.print("Indique tipo carburante (Gasolina o Gasoil)>>> ");
							Datos[2] = entradaUsuario.nextLine().toUpperCase();
						}
						while (!(Datos[2].equals("GASOLINA") || Datos[2].equals("GASOIL")));
						switch(Integer.parseInt(opcion)) {
							case 1: {
								vehiculos[numeroVehiculos] = new Coche(Datos[0], Datos[1], Datos[2]);
								numeroVehiculos++;
								break;
							}
							case 2: {
								System.out.print("Inserte número de plazas >>> ");
								Datos[3] = entradaUsuario.nextLine();
								vehiculos[numeroVehiculos] = new Microbus(Datos[0], Datos[1], Datos[2], Integer.parseInt(Datos[3]));
								numeroVehiculos++;
								break;
							}
							case 3: {
								System.out.print("Inserte peso máximo autorizado >>> ");
								Datos[3] = entradaUsuario.nextLine();
								vehiculos[numeroVehiculos] = new Furgoneta(Datos[0], Datos[1], Datos[2], Double.parseDouble(Datos[3]));
								numeroVehiculos++;
								break;
							}
						}
						break;
					}
					case 2: {
						System.out.print("Indique la matrícula del vehículo >>> ");
						Datos[0] = entradaUsuario.nextLine();
						System.out.print("Indique número de días de alquiler >>> ");
						Datos[1] = entradaUsuario.nextLine();
						System.out.println(precioVehiculo(Datos[0], vehiculos, Integer.parseInt(Datos[1])) + "€");
						break;
					}
					case 3: {
						System.out.print("¿Está seguro? (S/N) >>> ");
						opcion = entradaUsuario.nextLine().toUpperCase();

						break;
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
	public static double precioVehiculo(String matricula, Vehiculo vehiculos[], int dias) throws Exception {
		int posicion = 0;
		double resultado = 0.0;
		while (posicion < vehiculos.length && resultado == 0.0) {
			if (!(vehiculos[posicion] == null) && vehiculos[posicion].getMatricula().equals(matricula)) {
				resultado = vehiculos[posicion].precioDia() * dias;
			}
			else {
				posicion++;
			}
		}
		if (posicion == vehiculos.length) {
			throw new Exception("El vehículo no existe");
		}
		return resultado;
	}
}
