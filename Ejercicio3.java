package examen2EVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	/**
	 * pre: 
	 * post: Implementa un método informacionVideojuegos() que devuelve un ArrayList<String> que
	 * agrupe todas las plataformas para las que hay videojuegos en el fichero entregado. Es
     * decir, se debe almacenar UNA SOLA VEZ, cada una de las plataformas que aparecen en
     * el fichero .csv.
	 */
	private static void lectura(String nombre) {
		/*
		 * en este metodo leemos el fichero y mostramos por pantalla todas las consolas
		 * que existen dentro de este fichero
		 */
		boolean existe = false;
		ArrayList<String> consolas = new ArrayList<String>();
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
				linea = linea.replaceAll("ñ", "ny");
				linea = linea.replaceAll("á", "a");
				linea = linea.replaceAll("é", "e");
				linea = linea.replaceAll("í", "i");
				linea = linea.replaceAll("ó", "o");
				linea = linea.replaceAll("ú", "u");
				/*
				 * crea una tabla y en cada celda mete lo que haya entre espacio y espacio
				 */
				String[] linesep = linea.split(",");
				for (int i = 0; i < linesep.length; i++) {
					if(consolas.contains(linesep[2])) {
						existe = true;
					}
					else {
						consolas.add(linesep[2]);
					}
					consolas.add(linesep[2]);
				}
				
				for (int i = 0; i < consolas.size(); i++) {
					System.out.println(consolas.get(i));
				}

				// System.out.println(existe);
			}
			f.close();

		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}

	public static void main(String[] args) {
		/*
		 * menu en el que pasamos la ruta 
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la ruta + nombre del fichero: ");
		// C:\Users\Gestor\Desktop\ventasVideojuegos.csv
		String fichero = entrada.nextLine();
		// pasamos la ruta al metodo de lectura
		lectura(fichero);
	}
}
