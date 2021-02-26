import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
         
        Scanner teclado = new Scanner(System.in);

        int qtdpar, qtdimp, qtdneg, qtdpos, cont;

        int x;

        qtdpar = 0;
        qtdimp = 0;
        
        cont = 0;
    
    
        x = teclado.nextInt();

        for (cont=1; cont < x; cont++ ){
            if (x % 2 ==1){  //impar        
               System.out.println(cont);
             } 
        }    
    }   
   
}