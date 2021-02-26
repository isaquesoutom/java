import java.util.Scanner;
public class Exercicio2{
    public static void main(String args[]){
        Scanner teclado;

        teclado = new Scanner(System.in);

        int a;
        int b;
        int c;
        int area;
        System.out.println("Digite a Base = ");
        a = teclado.nextInt();
        System.out.println("Digite a altura = ");
        b = teclado.nextInt(); 

        c = a * b;

        area = c / 2;

        System.out.printf("Resultado do Triangulo = %.2f" + area);
    }
}