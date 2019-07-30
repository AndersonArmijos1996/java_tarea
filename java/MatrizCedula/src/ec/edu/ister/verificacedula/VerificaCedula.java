
package ec.edu.ister.verificacedula;

public class VerificaCedula {
    public String verificarCedula(int [][]matriz){
        int sep=0,sei=0,st=0,rm=0,i;
        for(i=0;i<10;i+=2){
            rm=matriz[0][i]*2;
            if(rm>9)
                rm-=9;
            sep=sep+rm;
        }
        for(i=1;i<9;i+=2){
            sei=sei+matriz[0][i];
        }
        st=10-(sep+sei)%10;
        if(st==10)
            st=0;
        if(st==matriz[0][9]){
            return "Cedula correcta";
        }
        else{
            return "Cedula incorrecta";
        }
    }
}
