import java.util.Scanner;
public class Uri2780{
    public static void main(String args[]){
  
    Scanner teclado = new Scanner(System.in);

        int distancia;
        int pontuacao;
                    
        
        // Entrada

        distancia = teclado.nextInt();
        
        
        // processamento

        if (distancia <=800){
            pontuacao = 1;
                    }
        else
        if  ((distancia > 800) && (distancia <=1400)){
            pontuacao = 2;
        }
        else
        if  ((distancia > 1400) && (distancia <=2000)){
            pontuacao = 3;
            
        }   
                        
        else{
            pontuacao = 3;
        }
                // saida

       System.out.printf("Pontuacao: " + pontuacao);
              
    }
} 