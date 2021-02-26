import java.util.Scanner;
public class Uri1017{
    public static void main(String args[]){
  
    Scanner teclado = new Scanner(System.in);

        int tempo, velocidade;
        double qtdcomb, klmperc;   
        
        
        // Entrada

        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();
        
        // processamento
        klmperc = velocidade x tempo;
        Qtdcomb = klmperc  / 12;

        // saida

       System.out.printf("%.3f qtd.comb/l\n", qtdcomb);

       
    }
} 