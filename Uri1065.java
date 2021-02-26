import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
         
    Scanner teclado = new Scanner(System.in);

    int qtde;
    int n;
    qtde = 0;

    for (int count=1; count <= 5; count++ ){
             n = teclado.nextInt();
             if (n % 2 ==0){ 
               qtde = qtde + 1; 
             }
    }
       System.out.println(qtde+" valores pares"); 
             
  }
}