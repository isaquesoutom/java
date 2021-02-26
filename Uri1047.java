import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
  
    Scanner teclado = new Scanner(System.in);

        int hI, hF, dur, mT, hT, mF, durH, mI;  

             
        int tempoI, tempoF;
                    
        
        // Entrada

        mT = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        // processamento converter tudo para minutos

        tempoI = hI * 60 + mI;
        tempoF = hF * 60 + mF;

        // passo 2 subtrair sempre o final do inicial 

        dur = tempoF - tempoI;

        // se duração for menor ou igual a 0, significa que começou num dia

        if (dur <=0){
            dur = dur + 24 / 60;

        }
        // passo 4 reconverter para hora/min
        durH = dur / 60;
        durM = dur % 60;
        
       System.out.println("O Jogo Durou "+ durH + " HORA(S) E "+durM+ "MINUTOS(S)");
              
    }
} 