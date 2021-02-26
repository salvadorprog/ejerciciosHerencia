package Barco;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Antes de asignar barcos los creamos, por lo que creamos uno de cada como ejemplo
		
		Barco velero = new Velero("4190VGH", 47.3, 1978, 12);
		Barco embarcacion = new EmbarcacionDeportiva("5670GHJ", 62.2, 2003, 570);
		Barco yate = new YateDeLujo("7854XYZ", 890.9, 2021, 890, 230);
		
		// Ahora generamos algunos alquileres
		
		Alquiler alq0 = new Alquiler("Hercules", "8912309218f", LocalDate.of(2021, 5, 10), 19, velero);			// --> En estos casos no especificamos la fecha de inicio 
		Alquiler alq1 = new Alquiler("Javier", "874239dsdf", LocalDate.of(2021, 5, 13), 89, yate);					// por lo que captura la fecha actual del sistema <--
		Alquiler alq2 = new Alquiler("María", "8432948g", LocalDate.of(2021, 10, 8) ,LocalDate.of(2021, 12, 10), 179, embarcacion);			// A este si le pasamos la fecha de inicio
		
		// Obtener información de los alquileres
		boolean exit = false;
		Scanner entrada = new Scanner(System.in);
		StringBuilder option = new StringBuilder();
		while (!exit) {
			System.out.println(
					"\n 1. Obtener información del alquiler 1" +
					"\n 2. Obtener precio del alquiler 1" +
					"\n 3. Obtener información del alquiler 2" +
					"\n 4. Obtener precio del alquiler 2" + 
					"\n 5. Obtener información del alquiler 3" +
					"\n 6. Obtener precio del alquiler 3"
			);
			System.out.print("Indique selección >>> ");
			option = new StringBuilder(entrada.nextLine());
			switch (Integer.parseInt(option.toString())) {
				case 1: {
					System.out.println(alq0.toString());
					break;
				}
				case 2: {
					System.out.println(alq0.precioAlquiler() + "€");
					break;
				}
				case 3: {
					System.out.println(alq1.toString());
					break;
				}
				case 4: {
					System.out.println(alq1.precioAlquiler() + "€");
					break;
				}
				case 5: {
					System.out.println(alq2.toString());
					break;
				}
				case 6: {
					System.out.println(alq2.precioAlquiler() + "€");
					break;
				}
				default: {
					System.out.println("Opción incorrecta");
					break;
				}
			}
		}
	}
}
