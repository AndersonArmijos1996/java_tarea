/* Instituto Superior Tecnologico Rumiñahui
	Anderson Armijos
	Hacer un programa 
	24/07/2019
Ejercicio:Use un arreglo unidimensional para resolver el siguiente problema: 
  escriba una aplicación que reciba como entrada cinco números, cada uno de los
  cuales debe estar entre 10 y 100, inclusive. A medida que se lea cada número,
  muéstrelo solamente si no es un duplicado de un número que ya se haya leído. 
  Prepárese para el “peor caso”, en el que los cinco números son diferentes. 
  Use el arreglo más pequeño que sea posible para resolver este problema. 
  Muestre el conjunto completo de valores únicos introducidos, después 
  de que el usuario introduzca cada nuevo valor.
 */
package ec.edu.ister.ejercicios2;

public class Ejercicios2 {
    public static void main(String[] args) {
        String arraycar[]={"10","11","22","67","7","22","22","55","59","67","26","45","100"};
	    for(int i=0;i<arraycar.length;i++){
		for(int j=0;j<arraycar.length-1;j++){
			if(i!=j){
			if(arraycar[i].equals(arraycar[j])){
			arraycar[i]="";
			}
		    }
	   }
	}
	int n=arraycar.length;
	    for (int k=0;k<=n-1;k++){
		if(!"".equals(arraycar[k])){
		System.out.println( arraycar[k]);
		}
	    }
	}
}
    
    

