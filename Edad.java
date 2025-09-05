import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        Integer edad = scanner.nextInt();

        if (edad > 0 && edad < 12) {
            System.out.println("Eres un niño : ");
        } else if(edad >13 && edad <17){
            System.out.println("Eres un adolescente ");
        }else if(edad > 18 && edad < 59){
            System.out.println("Eres un adulto ");
        }else if(edad > 59){
               System.out.println("Eres un adulto mayor");
        }else{

        }

        scanner.close();
    }
}
