/*Instituto Superior Tecnologico Rumiñahui
	Anderson Armijos
	Hacer un programa 
	24/07/2019
 Escriba una aplicación que calcule el producto de una serie de enteros
 que se pasan al método producto; use una lista de argumentos de longitud
 variable. Pruebe su método con varias llamadas, cada una con un número
 distinto de argumentos. 
 */
package ejercicios3;

public class Ejercicios3 {
    public static int sumatoria( int... numeros){
    int total = 0;
    for( int num : numeros)
       total += num;
    return total;
    }
    public static void main(String[] args){
    int num1 = 10;
    int num2 = 40;
    int num3 = 66;
    int num4 = 100;     
    System.out.printf("la sumatoria de num1 y num2 es: %d\n", sumatoria(num1, num2));
    System.out.printf("la sumatoria de num1, num2 y num3 es: %d\n",sumatoria(num1, num2, num3));
    System.out.printf("la sumatoria de num1, num2, num3 y num4 es: " + "%d\n", sumatoria(num1, num2, num3, num4));
    }
}
    

