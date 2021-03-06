package AlquilerVehiculos;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	private final static int NUMERO_DE_COCHES_MAXIMO = 200;
	private final static int NUMERO_DE_ALQUILERES_MAXIMO = 200; 
	
	public static void main(String[] args) {
		Vehiculo[] vehiculos = new Vehiculo[NUMERO_DE_COCHES_MAXIMO];
		Alquiler[] alquileres = new Alquiler[NUMERO_DE_ALQUILERES_MAXIMO];
		
		Integer numeroVehiculos = 0;
		Integer numeroAlquileres = 0;
		
		String[] Datos = new String[6];
		String opcion = "";
		Scanner entradaUsuario = new Scanner(System.in); 
		
		while (!opcion.equals("S")) {
			try {
				System.out.println(
						   "\n 1. Alta de un veh�culo"
				         + "\n 2. Alquilar veh�culo"
						 + "\n 3. Consultar alquiler"
						 + "\n 4. Salir"
				         );
				System.out.print("Seleccione opci�n >>> ");
				opcion = entradaUsuario.nextLine();
				switch(Integer.parseInt(opcion)) {
					case 1: {
						do {
							System.out.println("Seleccione tipo de veh�culo: "
									 + "\n	1.Coche"
									 + "\n	2.Microbus"
									 + "\n	3.Furgoneta");
							System.out.print("Seleccione opci�n >>> ");
							opcion = entradaUsuario.nextLine();
						} 
						while(Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 3);
						System.out.print("Indique matr�cula >>> ");
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
								System.out.print("Inserte n�mero de plazas >>> ");
								Datos[3] = entradaUsuario.nextLine();
								vehiculos[numeroVehiculos] = new Microbus(Datos[0], Datos[1], Datos[2], Integer.parseInt(Datos[3]));
								numeroVehiculos++;
								break;
							}
							case 3: {
								System.out.print("Inserte peso m�ximo autorizado >>> ");
								Datos[3] = entradaUsuario.nextLine();
								vehiculos[numeroVehiculos] = new Furgoneta(Datos[0], Datos[1], Datos[2], Double.parseDouble(Datos[3]));
								numeroVehiculos++;
								break;
							}
						}
						break;
					}
					case 2: {
						System.out.print("Inserte su nombre >>> ");
						Datos[0] = entradaUsuario.nextLine();
						System.out.print("Inserte sus apellidos >>> ");
						Datos[1] = entradaUsuario.nextLine();
						System.out.print("Inserte la fecha de inicio (Formato: YYYY-MM-DD) >>> ");
						Datos[2] = entradaUsuario.nextLine();
						System.out.print("Inserte la fecha de fin (Formato: YYYY-MM-DD) >>> ");
						Datos[3] = entradaUsuario.nextLine();
						System.out.print("Inserte su n�mero de tel�fono >>> ");
						Datos[4] = entradaUsuario.nextLine();
						System.out.print("Inserte la matr�cula del veh�culo >>> ");
						Datos[5] = entradaUsuario.nextLine();
						alquileres[numeroAlquileres] = new Alquiler(Datos[0], Datos[1], LocalDate.parse(Datos[2]), LocalDate.parse(Datos[3]), Datos[4], vehiculos[encontrarVehiculo(Datos[5],vehiculos)]);
						numeroAlquileres++;
						break;
					}
					case 3: {
						System.out.print("Indique la matr�cula del veh�culo >>> ");
						Datos[0] = entradaUsuario.nextLine();
						System.out.println(alquileres[encontrarAlquiler(Datos[0], alquileres)]);
						break;
					}
					case 4: {
						System.out.print("�Est� seguro? (S/N) >>> ");
						opcion = entradaUsuario.nextLine().toUpperCase();

						break;
					}
					default: {
						System.out.println("Opci�n incorrecta");
					}
				}
			}	
			catch(Exception e) {
				System.out.println("Error: " + e);
			}
		}
		
	}
	public static int encontrarVehiculo(String matricula, Vehiculo vehiculos[]) throws Exception {
		int posicion = 0;
		while (posicion < vehiculos.length) {
			if (!(vehiculos[posicion] == null) && vehiculos[posicion].getMatricula().equals(matricula)) {
				return posicion;
			}
			else {
				posicion++;
			}
		}
		if (posicion == vehiculos.length) {
			throw new Exception("El veh�culo no existe");
		}
		return posicion;
	}
	public static int encontrarAlquiler(String matricula, Alquiler alquileres[]) throws Exception {
		int posicion = 0;
		while (posicion < alquileres.length) {
			if (!(alquileres[posicion] == null) && alquileres[posicion].getVehiculo().getMatricula().equals(matricula)) {
				return posicion;
			}
			else {
				posicion++;
			}
		}
		if (posicion == alquileres.length) {
			throw new Exception("El veh�culo proporcionado no pertenece a ning�n alquiler");
		}
		return posicion;
	}
}
