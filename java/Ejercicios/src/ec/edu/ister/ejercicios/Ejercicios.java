
package ec.edu.ister.ejercicios;

public class Ejercicios {
    private int vector[]=new int[10];
    
    public Ejercicios(int []vector){
        this.vector=vector;
    }
    public int[] getVector() {
        return vector;
    }
    public void setVector(int[] vector) {
        this.vector = vector;
    }
    public void imprimir(int vector[]){
        for(int i=0;i<10;i++){
            System.out.print(vector[i]+" -- ");
        }
    }
    
}
