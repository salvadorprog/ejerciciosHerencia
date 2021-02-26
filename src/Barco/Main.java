package Barco;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.Option;

public class Main {

	public static void main(String[] args) {
		
		// Variables y entradas
		
		StringBuilder opcion = new StringBuilder();
		Scanner entradaUsuario = new Scanner(System.in);
		
		StringBuilder matricula; 
		Double eslora;
		int anoFabricacion, cv, numeroCamarotes, numeroMastiles;
		
		// Creamos el barco
		
		Barco barco1;
		
		// Creamos el alquiler
		
		Alquiler alquiler1;
		
		// Programa
		
		while(!opcion.equals("exit")) {
			System.out.println(
					"\n 1.Definir barco" +
					"\n 3.Definir alquiler" +
					"\n 4.Obtener informaci�n del barco" +
					"\n 5.Obtener informaci�n del alquiler" + 
					"\n 6.Obtener precio del barco" +
					"\n 7.Obtener precio del alquiler"
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
						if (Integer.parseInt(opcion.toString()) >= 1 && Integer.parseInt(opcion.toString()) <= 3){
							throw new Exception("Opci�n incorrecta"); 
						}
						System.out.print("Inserte matricula: ");
						matricula = new StringBuilder(entradaUsuario.nextLine());
						System.out.print("Inserte medida de eslora: ");
						eslora = Double.parseDouble(entradaUsuario.nextLine());
						System.out.print("Inserte a�o de fabricaci�n: ");
						anoFabricacion = Integer.parseInt(entradaUsuario.nextLine());
						switch (Integer.parseInt(opcion.toString())) {
							case 1: {
								System.out.print("Inserte n�mero de m�stiles: ");
								numeroMastiles = Integer.parseInt(entradaUsuario.nextLine());
								barco1 = new Velero(matricula.toString(),eslora,anoFabricacion,numeroMastiles);
								break;
							}
							case 2: {
								System.out.println("Inserte cv: ");
								cv = Integer.parseInt(entradaUsuario.nextLine());
								barco1 = new EmbarcacionDeportiva(matricula.toString(), eslora, anoFabricacion, cv);
								break;
							}
							case 3: {
								System.out.println("Inserte cv: ");
								cv = Integer.parseInt(entradaUsuario.nextLine());
								System.out.println("Inserte numero de camarotes: ");
								numeroCamarotes = Integer.parseInt(entradaUsuario.nextLine());
								barco1 = new YateDeLujo(matricula.toString(), eslora, anoFabricacion, cv, numeroCamarotes);
								break;
							}
						}
						break;
					}
					case "2": {
						break;
					}
					case "3": {
						break;
					}
					case "4": {
						break;
					}
					case "5": {
						break;
					}
					case "6": {
						break;
					}
					case "7": {
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
