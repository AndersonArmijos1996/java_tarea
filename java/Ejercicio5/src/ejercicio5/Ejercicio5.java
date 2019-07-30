/* Instituto Superior Tecnologico Rumiñahui
	Anderson Armijos
	Hacer un programa 
	26/07/2019
   Modifique la figura 7.2, de manera que el tamaño del arreglo se especifique
   mediante el primer argumento de línea de comandos. Si no se suministra un 
   argumento de línea de comandos, use 10 como el valor predeterminado del arreglo
 */
package ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
        int[] arreglo = new int[10];
        
        for(int contador = 0; contador < arreglo.length; contador++)
            arreglo[contador]=2+1*contador;
        
        System.out.printf("%s%8s%n","Indice","Valor");
   
        for(int contador = 0; contador < arreglo.length; contador++)
        System.out.printf("%5d%8d%n", contador, arreglo[contador]); 
    }
    
}