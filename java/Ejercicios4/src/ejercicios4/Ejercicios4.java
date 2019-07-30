/*Instituto Superior Tecnologico Rumiñahui
	Anderson Armijos
	Hacer un programa 
	25/07/2019*/
package ejercicios4;

import java.util.Scanner;

public class Ejercicios4 {

    public static void main(String[] args) {
    int matriz[][] = new int[3][3];
        Scanner entrada = new Scanner(System.in);
	for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
	    System.out.print("Ingrese el número en la fila " + (i) + " columna " + j + " :");
                matriz[i][j] = entrada.nextInt();
	}
            }
            for(int i = 0; i < matriz.length; i++){
		for(int j = 0; j < matriz[i].length; j++){
		    System.out.print(String.format(" %d ", matriz[i][j]));
		    }
		    System.out.println();
		}
        }
}
