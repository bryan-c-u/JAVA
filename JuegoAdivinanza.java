import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Boolean verdad = true;
        int numeroFijo = 35;

        

        while (verdad) {
            System.out.println("Ingrese un numero entre 1 y 50");
            Integer numero = scanner.nextInt();

            if (numero >= 1 && numero <= 50) {
                if (numero == numeroFijo) {
                    System.out.println("Felicidades a adivinado el numero");
                    verdad = false;
                } else if (numero > 40) {
                    System.out.println("Te pasaste un poco intenta de nuevo");

                } else if (numero > 30) {
                    System.out.println("ya casi lo logras tal vez tu numero se encuentra entre 31 y 39");
                } else if (numero < 25) {
                    System.out.println("Numero demasiado bajo intenta con uno mas grande ");
                }
            } else {
                System.out.println("Numero fuera del rango");
            }

        }
        scanner.close();
    }
}
