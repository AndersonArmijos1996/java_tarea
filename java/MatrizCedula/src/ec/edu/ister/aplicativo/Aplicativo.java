
package ec.edu.ister.aplicativo;
import ec.edu.ister.ingreso.Ingreso;
import ec.edu.ister.verificacedula.VerificaCedula;
public class Aplicativo {
    public static void main(String []args){
        int matriz[][]=new int[1][10];
        Ingreso ingre=new Ingreso();
        for(int i=0;i<10;i++){
            matriz[0][i]=ingre.ingresarIntero("Ingrese el valor "+ (i+1));
        }
        ingre.imprimeMatriz(matriz);
        VerificaCedula verficaCedula=new VerificaCedula();
        System.out.println(verficaCedula.verificarCedula(matriz));
    }
    
}
