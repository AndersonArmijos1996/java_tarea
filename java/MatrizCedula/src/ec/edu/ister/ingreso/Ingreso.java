package ec.edu.ister.ingreso;
import java.util.Scanner;
public class Ingreso {
    public int ingresarIntero(String msg){
        Scanner lee=new Scanner(System.in);
        System.out.println(msg);
        int dato;
        dato=lee.nextInt();
        return dato;
    }
    public void imprimeMatriz(int [][]matriz){
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.print("   "+matriz[0][i]);
        }
        System.out.println();
    }   
}
