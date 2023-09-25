/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatement;
import java.util.Scanner;
/**
 *
 * @author Samuel
 */
public class IfStatement {

    public static void main(String[] args) {
        int Num, Npar;
        Scanner Numero = new Scanner(System.in);
  
        System.out.print("Ingrese un numero: ");
        Num = Numero.nextInt();
        
        Numero.close();
        
        Npar = Num % 2;
        
        if (Npar == 0) {
            System.out.println(Num + " Es un numero par."); }
        else { 
            System.out.println(Num + " Es un numero impar"); }
        
        
    }
    
}
