package Barco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// Mensajes y textos de la aplicación (Los más repetidos)
	private	static final String CREAR = "Cree antes un ";
	private static final String OPT_INCORR = "Opción incorrecta";
	private static final String INSERTE = "Inserte "; 
	private static final String ESTA_SEGURO = "¿Está seguro? (Y/N)>>"; 
			 
	public static void main(String[] args) {
		
		// Variables, entradas y formatos de fecha
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder opcion = new StringBuilder("");
		Scanner entradaUsuario = new Scanner(System.in);
		
		String data[] = new String[6];
		// Creamos el barco en null
		
		Barco barco1 = null;
		
		// Creamos el alquiler en null
		
		Alquiler alquiler1 = null;
		
		
		// Programa
		while(!opcion.toString().equals("exit")) {
			data = new String[6];
			System.out.println(
					"\n 1.Definir barco" +
					"\n 2.Definir alquiler" +
					"\n 3.Obtener información del barco" +
					"\n 4.Obtener información del alquiler" + 
					"\n 5.Obtener precio del barco" +
					"\n 6.Obtener precio del alquiler" +
					"\n 7.Salir de la aplicación"
					);
			System.out.print("Seleccione una función >> ");
			try {
				opcion = new StringBuilder(entradaUsuario.nextLine());
			
				switch (opcion.toString()) {
					case "1": {
						System.out.println( "Tipo de barco:" +
								"\n		1.Velero" +
								"\n		2.Embarcación deportiva" +
								"\n		3.Yate de lujo"
								);
						System.out.print("Seleccione una función >> ");
						opcion = new StringBuilder(entradaUsuario.nextLine());
						
						if (Integer.parseInt(opcion.toString()) < 1 && Integer.parseInt(opcion.toString()) > 3){
							throw new Exception(OPT_INCORR); 
						}
						
						System.out.print(INSERTE + "matricula: ");
						data[0] = entradaUsuario.nextLine();
						
						System.out.print(INSERTE + "medida de eslora: ");
						data[1] = entradaUsuario.nextLine();
						
						System.out.print(INSERTE + "año de fabricación: ");
						data[2] = entradaUsuario.nextLine();
						
						switch (Integer.parseInt(opcion.toString())) {
							case 1: {
								System.out.print(INSERTE + "número de mástiles: ");
								data[3] = entradaUsuario.nextLine();
								
								barco1 = new Velero(data[0],Double.parseDouble(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]));
								break;
							}
							case 2: {
								System.out.print(INSERTE + "cv: ");
								data[3] = entradaUsuario.nextLine();
								
								barco1 = new EmbarcacionDeportiva(data[0],Double.parseDouble(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]));
								break;
							}
							case 3: {
								System.out.print(INSERTE + "cv: ");
								data[3] = entradaUsuario.nextLine();
								
								System.out.print(INSERTE + "numero de camarotes: ");
								data[4] = entradaUsuario.nextLine();
								
								barco1 = new YateDeLujo(data[0],Double.parseDouble(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]),Integer.parseInt(data[4]));
								break;
							}
						}
						break;
					}
					case "2": {
						if (barco1 == null) {
							throw new Exception("Barco no definido, defina antes un barco");
						}
						System.out.print(INSERTE + "nombre: ");
						data[0] = entradaUsuario.nextLine();
						
						System.out.print(INSERTE + "dni: ");
						data[1] = entradaUsuario.nextLine();
						
						System.out.print(INSERTE + "fecha inicio, formato(DD/MM/YYYY): ");
						data[2] = entradaUsuario.nextLine();
						
						System.out.print(INSERTE + "fecha fin, formato(DD/MM/YYYY): ");
						data[3] = entradaUsuario.nextLine();
						
						System.out.print(INSERTE + "posición de amarre: ");
						data[4] = entradaUsuario.nextLine();
						
						alquiler1 = new Alquiler(data[0], data[1], LocalDate.parse(data[2],fecha),LocalDate.parse(data[3],fecha),
								Integer.parseInt(data[4]), barco1);
						break;
					}
					case "3": {
						if (barco1 == null) {
							throw new Exception(CREAR + "barco");
						}
						System.out.println(barco1.toString());
						break;
					}
					case "4": {
						if (alquiler1 == null) {
							throw new Exception(CREAR + "alquiler");
						}
						System.out.println(alquiler1.toString());
						break;
					}
					case "5": {
						if (barco1 == null) {
							throw new Exception(CREAR + "barco");
						}
						System.out.println(barco1.getPrecio() + "€");
						break;
					}
					case "6": {
						if (alquiler1 == null) {
							throw new Exception(CREAR + "alquiler");
						}
						System.out.println(alquiler1.precioAlquiler() + "€");
						break;
					}
					case "7": {
						System.out.print(ESTA_SEGURO);
						opcion = new StringBuilder(entradaUsuario.nextLine().toUpperCase());
						opcion = new StringBuilder(opcion.toString().equals("Y")?"exit":"continue");
						break;
					}
					default: {
						throw new Exception(OPT_INCORR); 
					}
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
