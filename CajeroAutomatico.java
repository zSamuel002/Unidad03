package cajeroautomatico;
import java.util.Scanner;
/**
 *
 * @author Samuel ++ Juan Pablo Rios Trujillo(ThePabkiXD)
 */
public class CajeroAutomatico {

    public static void main(String[] args) {
        /*
        Cajero automatico que realice:
        Consultar Saldo
        Depositar Dinero
        Retirar dinero
        case default
        */
        double saldoA, deposito, retiro;
        int Op;
        saldoA = 5000;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Bienvenido.");
        System.out.println("1.- Consultar saldo.");
        System.out.println("2.- Depositar dinero.");
        System.out.println("3.- Retirar dinero.");
        System.out.print("Selecciona una opcion: ");
        
       Op = x.nextInt();
        
        switch(Op){
            case 1 -> {
                System.out.println("Consultar saldo.");         
                System.out.println("Su saldo actual es de: $" + saldoA);
            }
            case 2 -> {
                System.out.println("Depositar dinero.");
                System.out.print("Ingrese la cantidad de dinero a depositar: $");
                deposito = x.nextDouble();
                saldoA += deposito ;
                System.out.println("Los $" + deposito + " se han depositado correctamente.");
                System.out.println("Su saldo actual es de: $" + saldoA);
            }
            case 3 -> {
                System.out.println("Retirar dinero.");
                System.out.println("Su saldo actual es de: $" + saldoA);
                System.out.print("Escriba la cantidad que deseea retirar: $");
                retiro = x.nextDouble();
                if(saldoA >= retiro){
                    System.out.println("Retiro realizado con exito");   
                    saldoA -= retiro; 
                    System.out.println("Su saldo actual es de: $" + saldoA);}
                else{
                    System.out.println("Fondos insuficientes.");
                }
            }
            default -> {
                System.out.println("Opcion no valida. Por favor seleccione una opcion valida.");
                break;
            }
                
        }
        
    }
    
}
