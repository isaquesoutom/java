import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
  
    Scanner teclado = new Scanner(System.in);

        cont km;
        double consumo, kml;   
        
        
        // Entrada

        km = teclado.nextInt();
        consumo = teclado.nextDouble();
        
        // rocessamento

        if (Med>=6){
            kml = km / consumo;
        }

        // saida

       System.out.printf("%.3f km/l\n", kml);

       
    }
} 