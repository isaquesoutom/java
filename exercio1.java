import java.util.Scanner;
public class exercio1{
    public static void main(String args[]){
    Scanner teclado;
    teclado = new Scanner(System.in);
    int a;
    int b;
    System.out.println("Digite o lado");
    a = teclado.nextInt();
    
    b = a * a;
    System.out.println("Resultado =" + b);
}    
}