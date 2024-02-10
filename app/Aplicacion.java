package app;

import leer.Leer;
import menu.Menu;

/**
 * Clase main de la aplicacion
 * @author Victor
 * @version v0.1
 * @since 06/02/24
*/
public class Aplicacion {

	/**
	 * Metodo que ejecuta una opcion de menu e imprime mensaje inicial y final
	 * @param args Argumentos del programa
	 */
	public static void main(String[] args) {

		Menu.Mensaje_Inicial(); 	/** Ejecuta metodo de clase Menu que imprime mensaje inicial */

		boolean continuar = true;

		do {

			Menu.Opciones_Menu(); 	/** Ejecuta metodo de clase Menu que muestra las opciones de menu */

			switch (Leer.datoInt()) {
			case 1:					/** Opcion 1: mostrar productos (Lista productos) */

				break;
			case 2:					/** Opcion 2: comprar productos */
				
				break;
			case 3:					/** Opcion 3: mostrar caja (Importe total de la compra actual) */

				break;
			default: 				/** Opcion salir del menu */
				continuar = false;
			}

		} while (continuar);

		Menu.Mensaje_Fin(); 		/** Ejecuta metodo de clase Menu que imprime mensaje fin */
	}
}