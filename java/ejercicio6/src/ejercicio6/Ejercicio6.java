/*Instituto Superior Tecnologico Rumiñahui
	Anderson Armijos
	Hacer un programa 
	27/07/2019
 * Instrucion del for mejorado Escriba una aplicación que utilice
   una instrucción for mejorada para sumar los valores double que se pasan
   mediante los argumentos de línea de comandos.
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        int numero;
        double Arreglo[];
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nintroduzca el tamanio del arreglo: ");
        numero = entrada.nextInt();
        Arreglo = new double[numero];
        for ( int i = 0; i < Arreglo.length; i++ ){
        System.out.printf("\ningresa el %d numero flotante: ", i + 1 );
        Arreglo[i] = entrada.nextDouble();
        }  
        System.out.printf("\nEl producto de los numeros es: %.2f\n", Multiplicar(Arreglo));
    } 
    
 public static double Multiplicar( double A[] ){
   
        double producto = 1;
            for ( int i = 0; i < A.length; i++ )
                producto *= A[i];

          return producto;
    } 
}
