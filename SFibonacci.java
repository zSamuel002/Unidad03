package sfibonacci;
import java.util.Scanner;
/**
 *
 * @author Samuel Arriaga
 */
public class SFibonacci {

    public static void main(String[] args) {
        int num, f, f1, f2;
        
        f = 0;        
        f1 = 0;
        f2 = 1;

        Scanner n = new Scanner(System.in);
        
        System.out.println("Serie de Fibonacci.");
        System.out.print("Ingrese la cantidad de numeros que desea ver: ");    
        
        num = n.nextInt();
        n.close();
            
        for (int i = 0; i <= num; i++) {           
            System.out.println(f);
            f = f1 + f2;
            f2 = f1;
            f1 = f;

        }
        
       
    }
    
}
