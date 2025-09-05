import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cuantos dijitos desea ver de la serie");
        Integer limite = scanner.nextInt();
        int numero1 = 0;

        int numero2 = 1;

        int serie = 0;
        String texto = "";


        for(int i = 0 ; i< limite ; i++){

            texto += numero1 + ",";
    
            serie = numero1+numero2;

            numero1 = numero2;
            numero2 = serie;
        }
        System.out.println("Serie : "+ texto);
        scanner.close();
    }
}
