package test;

import java.util.Random;

public class ejercicio3 {

	public static void main(String[] args) {

		Random random = new Random();

		// Creamos una variable filas que sea un numero aleatorio entre 1 y 10
		int filas = random.nextInt(1, 10);

		// Creamos el array con la longitud de las filas de numeros aleatorios
		int[][] array = new int[filas][];

		// Hacemos un bucle que recorra cada una de las filas
		for (int i = 0; i < filas; i++) {
			// Creamos una variable columnas con valores aleatorios entre el 1 y el 10
			// RECORDAR: Cada vez que se ejecute el bucle va a tener un numero aleatorio
			// distino
			int columnas = random.nextInt(1, 10);
			// X cada fila que tenga el array se le asigna la longitud de columna
			array[i] = new int[columnas];

		}

		// Creamos unos bucles anidados que recorra todo el array y le vaya asignando
		// valores aleatorios entre 10 y
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				// Aqui es donde se le asignas los valores al array
				array[i][j] = random.nextInt(10, 20);

				// Aqui aparte lo imprimimos
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		int NUM = 0;
		//Se le asigna a la variable MAX el valor minimo de un integer, para que luego las comprobaciones sean correctas.
		int MAX= Integer.MIN_VALUE;
		//Se le asigna a la variable MIN el valor maximo de un integer, para que luego las comprobaciones sean correctas.
		int MIN= Integer.MAX_VALUE;
		int AVG = 0;

		// IMPRIMIR DIAGONAL
		System.out.println("Diagonal");
		// Variable que va ir incrementando
		int contador = 0;
		// Hacemos un bucle que recorra por todas las filas que tiene el array
		for (int i = array.length - 1; i >= 0; i--) {
			// Hacemos un comprobante para saber si la longitud de la fila de arriba
			// Es mayor que el contador para sacar la diagonal
			if (array[i].length > contador) {
				// Imprimimos la posicion i (que es desde la ultima hasta la primera posicion)
				// Y la posicion contador (que va a ir incrementando desde 0 a ultima pos)
				System.out.print(array[i][contador] + " ");
				
				
				
				//LE SUMAMOS A LA MEDIA TODOS LOS NUMEROS PARA LUEGO DIVIDIRLO
				AVG += array[i][contador];
				
                // Actualizamos el mínimo y el máximo, para ello compararemos el minimo con la variable que estamos comparando
				// Para que asi compruebe el anterior y el de ahora
 
				
				//VARIABLE QUE VA A DECIR TODOS LOS NUMEROS QUE EXISTEN
				NUM++;

				//Aqui aun que parezca lioso, sacaremos el minimo que este entre el valor maximo de un integer y el array que
				//estamos comparando, de esa manera suponiendo que sea el numero en la primera vez del bucle
				//14, es menor que Integer.MAX_VALUE asi que se le asignara y a continuacion seguira comprobando, si el 
				//siguiente numero es 7, (7<14) por lo cual se le asignara a la variable MIN el numero 7
				MIN=Math.min(MIN, array[i][contador]);
				
				//Aqui es exactamente igual que el MIN pero al reves
				MAX=Math.max(MAX, array[i][contador]);
				
				
				// Si la condicion no se cumple, se para el bucle para que no coja los
				// espacios vacios.
			} else {
				break;
			}
			// La variable de contador que va a ir sumando
			contador++;
		}
		
		//IMPRIMIMOS TODOS LOS DATOS
		System.out.println();
		System.out.println("===DATOS===");
		System.out.println("Cantidad de numeros: " + NUM);
		System.out.println("Media: " + AVG / NUM);
		System.out.println("Numero minimo: " + MIN);
		System.out.println("Numero maximo: " + MAX);
	}
}