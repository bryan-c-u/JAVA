import java.util.Scanner;

public class ValidacionContraseña {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String contraseña = "bryan1234sena";

        Boolean acertado = true;

        while(acertado){
            System.out.println("Ingrese su contraseña");
            String contraseña2 = scanner.nextLine();
            if(contraseña2.equals(contraseña)){
                System.out.println("Contraseña valida Bienvenido");
                acertado = false;
            }else{
                System.out.println("contraseña invalida intente de nuevo");
            }
        }
        scanner.close();
    }
}
