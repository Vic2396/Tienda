package leer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {
	
	public static String dato() {
		String sdato = " ";
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader flujoE = new BufferedReader(isr);
			sdato = flujoE.readLine();
			
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		
		return sdato;
	}
	
	// Leer un char por teclado
	public static char datoChar() {
		char c = ' ';
		try {
			java.io.BufferedInputStream b = new BufferedInputStream(System.in);
			c = (char) b.read();
			
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
		
		return c;
	}

	/**
	 * Metodo que convierte un valor en int
	 * @return el dato convertido en int
	 */
	public static int datoInt() {
		return Integer.parseInt(dato());
	}

	/**
	 * Metodo que convierte un valor en float
	 * @return el dato convertido en float
	 */
	public static float datoFloat() {
		return Float.parseFloat(dato());
	}

	/**
	 * Metodo que convierte un valor en long
	 * @return el dato convertido en long
	 */
	public static long datoLong() {
		return Long.parseLong(dato());
	}
}