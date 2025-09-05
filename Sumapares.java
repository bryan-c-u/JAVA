import java.util.Scanner;

public class Sumapares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo");
        Integer entero = scanner.nextInt();

        int sumaPares2 = 0;
        String texto = ""; 

        for (int i = 0 ; i <= entero; i++){
            if(i % 2 == 0){
                sumaPares2 =sumaPares2 + i;
                texto += i + " + ";
            }
        }
        System.out.println("La suma es : " + texto + " Y el resultado : "+ sumaPares2);
        scanner.close();
    }
}
