package Barco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Variables y entradas
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder opcion = new StringBuilder("");
		Scanner entradaUsuario = new Scanner(System.in);
		
		String data[] = new String[6];
		// Creamos el barco
		
		Barco barco1 = null;
		
		// Creamos el alquiler
		
		Alquiler alquiler1 = null;
		
		// Programa
		while(!opcion.toString().equals("exit")) {
			data = new String[6];
			System.out.println(
					"\n 1.Definir barco" +
					"\n 2.Definir alquiler" +
					"\n 3.Obtener informaci�n del barco" +
					"\n 4.Obtener informaci�n del alquiler" + 
					"\n 5.Obtener precio del barco" +
					"\n 6.Obtener precio del alquiler" +
					"\n 7.Salir de la aplicaci�n"
					);
			System.out.print("Seleccione una funci�n >> ");
			try {
				opcion = new StringBuilder(entradaUsuario.nextLine());
			
				switch (opcion.toString()) {
					case "1": {
						System.out.println( "Tipo de barco:" +
								"\n		1.Velero" +
								"\n		2.Embarcaci�n deportiva" +
								"\n		3.Yate de lujo"
								);
						System.out.print("Seleccione una funci�n >> ");
						opcion = new StringBuilder(entradaUsuario.nextLine());
						
						if (Integer.parseInt(opcion.toString()) < 1 && Integer.parseInt(opcion.toString()) > 3){
							throw new Exception("Opci�n incorrecta"); 
						}
						
						System.out.print("Inserte matricula: ");
						data[0] = entradaUsuario.nextLine();
						
						System.out.print("Inserte medida de eslora: ");
						data[1] = entradaUsuario.nextLine();
						
						System.out.print("Inserte a�o de fabricaci�n: ");
						data[2] = entradaUsuario.nextLine();
						
						switch (Integer.parseInt(opcion.toString())) {
							case 1: {
								System.out.print("Inserte n�mero de m�stiles: ");
								data[3] = entradaUsuario.nextLine();
								
								barco1 = new Velero(data[0],Double.parseDouble(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]));
								break;
							}
							case 2: {
								System.out.print("Inserte cv: ");
								data[3] = entradaUsuario.nextLine();
								
								barco1 = new EmbarcacionDeportiva(data[0],Double.parseDouble(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]));
								break;
							}
							case 3: {
								System.out.print("Inserte cv: ");
								data[3] = entradaUsuario.nextLine();
								
								System.out.print("Inserte numero de camarotes: ");
								data[4] = entradaUsuario.nextLine();
								
								barco1 = new YateDeLujo(data[0],Double.parseDouble(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]),Integer.parseInt(data[4]));
								break;
							}
						}
						break;
					}
					case "2": {
						System.out.print("Inserte nombre: ");
						data[0] = entradaUsuario.nextLine();
						
						System.out.print("Inserte dni: ");
						data[1] = entradaUsuario.nextLine();
						
						System.out.print("Inserte fecha inicio, formato(DD/MM/YYYY): ");
						data[2] = entradaUsuario.nextLine();
						
						System.out.print("Inserte fecha fin, formato(DD/MM/YYYY): ");
						data[3] = entradaUsuario.nextLine();
						
						System.out.print("Inserte posici�n de amarre: ");
						data[4] = entradaUsuario.nextLine();
						
						alquiler1 = new Alquiler(data[0], data[1], LocalDate.parse(data[2],fecha),LocalDate.parse(data[3],fecha),
								Integer.parseInt(data[4]), barco1);
						break;
					}
					case "3": {
						System.out.println(barco1.toString());
						break;
					}
					case "4": {
						System.out.println(alquiler1.toString());
						break;
					}
					case "5": {
						System.out.println(barco1.getPrecio());
						break;
					}
					case "6": {
						System.out.println(alquiler1.precioAlquiler());
						break;
					}
					case "7": {
						System.out.print("�Est� seguro? (Y/N)>> ");
						opcion = new StringBuilder(entradaUsuario.nextLine().toUpperCase());
						opcion = new StringBuilder(opcion.toString().equals("Y")?"exit":"continue");
						break;
					}
					default: {
						throw new Exception("Opci�n incorrecta"); 
					}
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
