package examen2EVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * pre: post: Dado el fichero “textoExamen.txt”, implementa un método
 * palabrasMasLargasQue(int longitud) el cual devuelve un entero indicando el
 * número de palabras del texto cuya longitud es mayor o igual que [longitud].
 */
public class Ejercicio2 {
	/*
	 * en este metodo leemos el fichero y comparamos la longitud cada palabra con la longitud 
	 * enviada por el usuario
	 */

	private static int palabrasMasLargasQue(String nombre, int longitudUsuario) {
		int iguales = 0;
		int mayores = 0;
		// para poder leer un archivo hay que crear un objeto de clase file con la ruta
		// del archivo
		File file = new File(nombre);
		try {
			Scanner f = new Scanner(file);
			// bucle para recorrer el fichero de texto
			while (f.hasNextLine()) {
				String linea = f.next(); // lee palabra por palabra
				// String linea = f.nextLine(); para leer linea por linea
				// limpieza de linea
				linea = linea.replaceAll("\\.", "");
				linea = linea.replaceAll(",", "");
				linea = linea.replaceAll("ñ", "ny");
				linea = linea.replaceAll("á", "a");
				linea = linea.replaceAll("é", "e");
				linea = linea.replaceAll("í", "i");
				linea = linea.replaceAll("ó", "o");
				linea = linea.replaceAll("ú", "u");
				linea = linea.replaceAll("\"", "");
				/*
				 * crea una tabla y en cada celda mete lo que haya entre espacio y espacio
				 */
				String[] linesep = linea.split(" ");
				for (int i = 0; i < linesep.length; i++) {
					/*
					 * comparamos la longitud y si es mayor
					 */
					if(linesep[i].length() == longitudUsuario) {
						iguales++;
					}
					else if(linesep[i].length() >= longitudUsuario) {
						mayores++;
					}
					//System.out.println(linesep[i].length());
				}
			}
			System.out.println("el numero de palabras que son iguales a la longitud dada son: " + iguales);
			System.out.println("el numero de palabras que son mayores a la longitud dada son: " + mayores);
			f.close();

		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
		return longitudUsuario;
	}

	public static void main(String[] args) {
		/*
		 * menu en el que pasamos la ruta y la longitud con la que vamos a comparar el tamaño de
		 * las palabras y lo mandamos al metodo de palabrasMasLargasQue
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la ruta + nombre del fichero: ");
		// C:\Users\Gestor\Desktop\textoExamen.txt
		String fichero = entrada.nextLine();
		System.out.println("Dime la longitud que quieres comparar");
		int longitudUsuario = entrada.nextInt();
		// pasamos la ruta al metodo de lectura
		palabrasMasLargasQue(fichero, longitudUsuario);
	}
}
