/*Instituto Superior Tecnologico Rumiñahui
	Anderson Armijos
	Hacer un programa 
	23/07/2019
Ejercicio:(Comisión por ventas) Utilicele un arreglo unidimensional para resolver
 el siguiente problema: una compañía paga a sus vendedores por comisión. 
 Los vendedores reciben $200 por semana  más el 9% de sus ventas totales
 de esa semana. Por ejemplo, un vendedor que acumule $5000 en ventas en una
 semana recibirá $200 más el 9% de $5000, o un total de $650.00 Escriba
 una aplicación (utilizando un arreglo de contadores) que determine cuántos
 vendedores recibieron salarios en cada uno de los siguientes rangos. 
 (Suponga que el salario de cada vendedor su trunca a una cantidad entera)
  a) $200-299, b) $300-399, c) $400-499, d) $500-599, e) $600-699, f) $700-799,
  g) $800-899, h) $900-999, i) $1000*/

package ec.edu.ister.ejercicios.aplicativo;

import java.util.Scanner;

public class aplicativo {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int vendedores;
            System.out.print("ingrese la cantidad de vendores de la empresa: ");
            vendedores= leer.nextInt();
        double[] vendedoresVector= new double[vendedores];
        double[] valorAPagar= new double[vendedores];
        int[] frecuencia = new int[10];
        double x=0;
            for (int i = 0; i < vendedores; i++) {
            System.out.printf("Ingrese la cantidad acumulada de ventas por semana del "
                              + "vendedor %d: ",i+1);
            vendedoresVector[i]=leer.nextInt();
            }
            for (int i = 0; i < vendedores; i++) {
            valorAPagar[i]=(vendedoresVector[i]*0.09)+ 200;
            }
            System.out.printf("%n%n---------------------------------------%n");
            System.out.printf("%19s%22s","semanal","total");
            System.out.println(" ");
            for (int i = 0; i < valorAPagar.length; i++) {
            System.out.printf("Usuario %d : %.2f %20.2f%n", i,vendedoresVector[i],valorAPagar[i]);
            }
            System.out.println("");
            for (int i = 0; i < vendedores; i++) {
            x=valorAPagar[i] ;
            if(x>199 && x<300){
               ++frecuencia[0];
            }   
            if(x>299 && x<400){
                ++frecuencia[1];
            }
            if(x>399 && x<500){
                ++frecuencia[2];
            }
            if(x>499 && x<600){
            ++frecuencia[3];
            }
            if(x>599 && x<700){
            ++frecuencia[4];
            }
            if(x>699 && x<800){
            ++frecuencia[5];
            }
            if(x>799 && x<900){
            ++frecuencia[6];
            }
            if(x>899 && x<100){
            ++frecuencia[7];
            }
            if(x>=1000){
            ++frecuencia[8];
            }
        }
        for (int i = 0; i < frecuencia.length; i++) {
        if(i>=0 && i<=8){
        if (i==8) {
            System.out.printf("1000: ");
        }else
        System.out.printf("%d-%d: ", 100*i+200,100*i+299);
        }
        for (int j = 0; j < frecuencia[i]; j++) {
        System.out.printf("*");
        }
        System.out.println("");
}
        
    }
    
    
}
