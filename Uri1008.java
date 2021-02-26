import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in)

        int num, qtdhoras;
        Float valorhora;
        Float salario;
        
        // Entrada

        num = teclado.nextInt();
        salario = teclado.nextInt();
        valorhora = teclado.nextFloat();

        // rocessamento


        salario = qtdhoras * salario;

        // saida

       System.out.println("NUMBER ="+num);

       System.out.printF ("SALARY u$ %.2f\n",salario); 

    }

}
