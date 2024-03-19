package test;

import java.util.Random;

public class principal {

	public static void main(String[] args) {
		Random random = new Random();

		int filas = random.nextInt(1, 10);

		int[][] array = new int[filas][];

		for (int i = 0; i < filas; i++) {
			int columnas = random.nextInt(1, 10);
			array[i] = new int[columnas];

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10, 20);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("DIAGONAL");
		int contador=0;
		for(int i=0;i<array[i].length;i++) {
			
			
			
			int filaActual=array[i].length-i;
			int filaDeArriba=array[i].length-i-1;
			
			if(filaActual>filaDeArriba) {
				System.out.print(array[i][contador] +", ");
				
			}
			contador++;
		}
		
		
		

	}

}
