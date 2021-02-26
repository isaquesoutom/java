import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
  
    Scanner teclado = new Scanner(System.in);

        int percentual;
        float salario, novosalar, reajuste;              
        
        // Entrada

        salario = teclado.nextFloat();
        
        
        // processamento

        if (salario <=400.00f){
            percentual = 15;
            reajuste = salario * percentual / 100;
            novosalar = salario + reajuste;
        }
        else
        if  (salario <=800.00){
            percentual = 12;
            reajuste =  salario * percentual / 100;
            novosalar = salario + reajuste;
        }
        else
        if (salario <= 1200.00){
            percentual = 10;
            reajuste = salario * percentual / 100;
            novosalar = salario + reajuste;
        }   
        else 
        if (salario < 2000.00){
            percentual = 7;
            reajuste = salario * percentual / 100;
            novosalar = salario + reajuste;
        }
                
        else{
            percentual = 4;
            reajuste = salario * percentual / 100;
            novosalar = salario + reajuste;     
        }
        // saida

       System.out.printf("Novo salario: %.2f\n",novosalar);
       System.out.printf("Reajuste ganho: %.2f\n",reajuste);
       System.out.printf("Em percentual: %d %%\n",percentual);

       
    }
} 