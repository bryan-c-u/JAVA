import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int saldo = 1000000;

        Boolean seguir = true;

        while(seguir){
            System.out.println("\n Bienvenido a tu cajero automatico seleccione que quiere realizar : \n"+ "1 - Consultar saldo \n"+ "2 - Retirar dinero \n"+ "3 - Depositar dinero \n"+ "4 - Salir");
            Integer decision = scanner.nextInt() ;

            switch (decision) {
                case 1:
                    System.out.println("Su saldo es : "+ saldo);
                    break;
            
                case 2:
                System.out.println("\nIngrese la cantidad que desea retirar \n" );
                Integer retiro = scanner.nextInt();

                saldo = saldo - retiro;
                System.out.println("\n Retiro realizado con exito : " + retiro + "\n Su saldo es : "+ saldo);
                break;

                case 3: 
                System.out.println("\n Ingrese el saldo que quiere depositar");
                Integer deposito = scanner.nextInt();
                saldo = saldo+ deposito;
                System.out.println("\nDeposito realizado con exito "+  deposito + "\n Su saldo es : "+ saldo);
                break;

                case 4:
                System.out.println("\n Esta saliendo del cajero automatico");
                seguir = false;
                break;
                default:
                System.out.println("Opcion invalida intente de nuevo");
                    break;
            }
        }
        scanner.close();
    }
}
