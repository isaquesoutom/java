import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
         
    Scanner teclado = new Scanner(System.in);

    int qtdpar, qtdimp, qtdneg, qtdpos;

    int n;

    qtdpar = 0;
    qtdimp = 0;
    qtdneg = 0;
    qtdpos = 0;

    for (int count=1; count <= 5; count++ ){
             n = teclado.nextInt();
             if (n < 0){
                 qtdneg = qtdneg + 1;
             }
             else
             if (n  > 0){
                 qtdpos = qtdpos +1;
             }
             if (n % 2 ==0){ 
                 qtdpar = qtdpar + 1; 
             }    
             else{
                 qtdimp = qtdimp + 1;
             }
    }
       System.out.println(qtdpar+" valor(es) par(es)"); 
       System.out.println(qtdimp+" valor(es) impar(es)");
       System.out.println(qtdpos+" valor(es) positivo(s)");
       System.out.println(qtdneg+" valor(es) negativo(s)");
  }
}