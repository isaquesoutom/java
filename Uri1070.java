import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
         
        Scanner teclado = new Scanner(System.in);

        int x, cont;

                    
        cont = 0;
    
           
        x = teclado.nextInt();
        x = x + 1;

        for (cont=1; cont <=10; cont++ ){
            
            x = x + 1;
            if (x % 2 ==1){  //impar        
               System.out.println(x);
            } 
        }    
    }   
   

}