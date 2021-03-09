package AlquilerVehiculos;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	private final static int NUMERO_DE_COCHES_MAXIMO = 200;
	private final static int NUMERO_DE_ALQUILERES_MAXIMO = 200;
	
	// Vocabulario
	private final static String INSERTAR = "Inserte ";
	private final static String FORMATO_FECHA = "(Formato: YYYY-MM-DD)";
	private final static String SELECTOR = " >>> ";
	
	static Vehiculo[] vehiculos = new Vehiculo[NUMERO_DE_COCHES_MAXIMO];
	static Alquiler[] alquileres = new Alquiler[NUMERO_DE_ALQUILERES_MAXIMO];
	
	public static void main(String[] args) {		
		Integer numeroVehiculos = 0;
		Integer numeroAlquileres = 0;
		
		String[] Datos = new String[6];
		String opcion = "";
		Scanner entradaUsuario = new Scanner(System.in); 
		
		while (!opcion.equals("S")) {
			try {
				System.out.println(
						   "\n 1. Alta de un vehículo"
				         + "\n 2. Alquilar vehículo"
						 + "\n 3. Consultar alquiler"
						 + "\n 4. Salir"
				         );
				System.out.print("Seleccione opción" + SELECTOR);
				opcion = entradaUsuario.nextLine();
				switch(Integer.parseInt(opcion)) {
					case 1: {
						do {
							System.out.println(INSERTAR + "tipo de vehículo: "
									 + "\n	1.Coche"
									 + "\n	2.Microbus"
									 + "\n	3.Furgoneta");
							System.out.print("Seleccione opción" + SELECTOR);
							opcion = entradaUsuario.nextLine();
						} 
						while(Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 3);
						System.out.print(INSERTAR + "matrícula" + SELECTOR);
						Datos[0] = entradaUsuario.nextLine();
						do {
							System.out.print(INSERTAR + "gama (baja,media o alta)" + SELECTOR);
							Datos[1] = entradaUsuario.nextLine().toUpperCase();
						}
						while (!(Datos[1].equals("BAJA") || Datos[1].equals("MEDIA") || Datos[1].equals("ALTA")));
						do {
							System.out.print(INSERTAR + "tipo carburante (Gasolina o Gasoil)" + SELECTOR);
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
								System.out.print(INSERTAR + "número de plazas" + SELECTOR);
								Datos[3] = entradaUsuario.nextLine();
								vehiculos[numeroVehiculos] = new Microbus(Datos[0], Datos[1], Datos[2], Integer.parseInt(Datos[3]));
								numeroVehiculos++;
								break;
							}
							case 3: {
								System.out.print(INSERTAR + "peso máximo autorizado" + SELECTOR);
								Datos[3] = entradaUsuario.nextLine();
								vehiculos[numeroVehiculos] = new Furgoneta(Datos[0], Datos[1], Datos[2], Double.parseDouble(Datos[3]));
								numeroVehiculos++;
								break;
							}
						}
						break;
					}
					case 2: {
						System.out.print(INSERTAR + "su nombre" + SELECTOR);
						Datos[0] = entradaUsuario.nextLine();
						System.out.print(INSERTAR + "sus apellidos" + SELECTOR);
						Datos[1] = entradaUsuario.nextLine();
						System.out.print(INSERTAR + "la fecha de inicio " + FORMATO_FECHA + SELECTOR);
						Datos[2] = entradaUsuario.nextLine();
						System.out.print(INSERTAR + "la fecha de fin " + FORMATO_FECHA + SELECTOR);
						Datos[3] = entradaUsuario.nextLine();
						System.out.print(INSERTAR + "su número de teléfono" + SELECTOR);
						Datos[4] = entradaUsuario.nextLine();
						System.out.print(INSERTAR + "la matrícula del vehículo" + SELECTOR);
						Datos[5] = entradaUsuario.nextLine();
						alquileres[numeroAlquileres] = new Alquiler(Datos[0], Datos[1], LocalDate.parse(Datos[2]), LocalDate.parse(Datos[3]), Datos[4], vehiculos[encontrarVehiculo(Datos[5])]);
						numeroAlquileres++;
						break;
					}
					case 3: {
						System.out.print(INSERTAR + "la matrícula del vehículo" + SELECTOR);
						Datos[0] = entradaUsuario.nextLine();
						System.out.println(alquileres[encontrarAlquiler(Datos[0])]);
						break;
					}
					case 4: {
						System.out.print("¿Está seguro? (S/N)" + SELECTOR);
						opcion = entradaUsuario.nextLine().toUpperCase();

						break;
					}
					default: {
						System.out.println("Opción incorrecta");
					}
				}
			}	
			catch(DateTimeParseException d) {
				System.out.println("Formato incorrecto de fecha");
			}
			catch(Exception e) {
				System.out.println("Error: " + e);
			}

		}
		
	}
	public static int encontrarVehiculo(String matricula) throws Exception {
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
			throw new Exception("El vehículo no existe");
		}
		return posicion;
	}
	public static int encontrarAlquiler(String matricula) throws Exception {
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
			throw new Exception("El vehículo proporcionado no pertenece a ningún alquiler");
		}
		return posicion;
	}
}