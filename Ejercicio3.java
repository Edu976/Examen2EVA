package examen2EVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3 {
	private static void lectura(String nombre) {
		// para poder leer un archivo hay que crear un objeto de clase file con la ruta
		// del archivo
		File file = new File(nombre);
		try {
			Scanner f = new Scanner(file);
			f.nextLine();
			// bucle para recorrer el fichero de texto
			while (f.hasNextLine()) {
				// String linea = f.next(); // lee palabra por palabra
				String linea = f.nextLine(); // para leer linea por linea
				// limpieza de linea
				linea = linea.replaceAll("\\.", "");
				// linea = linea.replaceAll(",", "");
				linea = linea.replaceAll("�", "ny");
				linea = linea.replaceAll("�", "a");
				linea = linea.replaceAll("�", "e");
				linea = linea.replaceAll("�", "i");
				linea = linea.replaceAll("�", "o");
				linea = linea.replaceAll("�", "u");
				/*
				 * crea una tabla y en cada celda mete lo que haya entre espacio y espacio
				 */
				String[] linesep = linea.split(",");
				for (int i = 0; i < linesep.length; i++) {
					System.out.println(linesep[2]);
				}
			}
			f.close();

		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la ruta + nombre del fichero: ");
		// C:\Users\Gestor\Desktop\ventasVideojuegos.csv
		String fichero = entrada.nextLine();
		// pasamos la ruta al metodo de lectura
		lectura(fichero);
	}
}
