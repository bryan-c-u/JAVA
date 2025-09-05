import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un nunnmero y te mostrare su factorial");
        Integer numero = scanner.nextInt();

        int resultado = 1;
        for(int i = 1 ; i <= numero ; i++){
            resultado *= i;
        }
        System.err.println("El factorial de su numero es " + resultado);
        scanner.close();
    }
}
