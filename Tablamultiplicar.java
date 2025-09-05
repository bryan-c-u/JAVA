import java.util.Scanner;

public class Tablamultiplicar {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);

       System.out.println("Ingrese cual tabla de multiplicar quiere ver");
       Integer tabla = scanner.nextInt();

       System.out.println("Ingrese la cantidad de digitos que quiere ver");

       int resultadoTabla = 0;
;       String textoTabla = "";
       Integer cantidad = scanner.nextInt();
       for(int i = 0 ; i <= cantidad; i++){
        resultadoTabla = tabla * i ;
        textoTabla += tabla + " * " + i + " = " + resultadoTabla + "\n";
        
       }
       System.out.println("Su tabla es \n" + textoTabla);
       scanner.close();
    }
    
}
