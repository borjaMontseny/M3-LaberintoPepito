import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Laberinto fácil, 6 filas 4 columnas
		char[][] laberinto1 = { { '☺', '▒', '▒', ' ' }, { ' ', ' ', ' ', ' ' }, { '▒', ' ', '▒', '▒' },
				{ '▒', ' ', ' ', ' ' }, { '▒', ' ', '▒', '▒' }, { ' ', ' ', ' ', '♥' } };

		// Laberinto intermedio

		// Laberinto difícil

		Scanner sc = new Scanner(System.in);

		System.out.println("Laberinto de Pepito. Borja Montseny DAW 1M\n");

		mostrarLaberinto(laberinto1);

		// esto nos devuelve un char, con los prints de menu y escogerOpcion
		elegirOpcion(sc);

		sc.close();
	}

	public static void mostrarMenu() {
		System.out.println("Menú:");
		System.out.println("1. Jugar partida");
		System.out.println("2. Resultats partides");
		System.out.println("3. Sortir");
		System.out.print("Opció seleccionada: ");
	}

	// funció que mostra el menú y ens fa escollir una opció
	public static char elegirOpcion(Scanner sc) {

		// inicializo así la variable para sólo tener el bucle
		char opcioSeleccionada = 'Z';

		// mentres no escollim una opció disponible, mostrem de nou el menú i
		// l'opció per teclat
		while (opcioSeleccionada != '1' && opcioSeleccionada != '2' && opcioSeleccionada != '3') {
			mostrarMenu();
			opcioSeleccionada = sc.next().toUpperCase().charAt(0);
		}

		return opcioSeleccionada;
	}

	// esta función la usaremos en cada turno, pues muestra la matriz
	public static void mostrarLaberinto(char[][] laberinto) {

		// por cara iteracion de la fila de la matriz
		for (int fil = 0; fil < laberinto.length; fil++) {
			// recorremos cada columna de la fila "
			for (int col = 0; col < laberinto[fil].length; col++) {
				// imprimimos cada posicion fila [0], col [1-2-3-etc.] sin salto de linea LN
				System.out.print(laberinto[fil][col] + " ");
			}
			// al terminar de imprimir la fila,
			System.out.println();
		}

	}
}
